set variables=%~f0
set PROJKEY=
set PROJDIR=
set HOMEDIR=
set CRVLDIR=
set EEASKEY=
set EEASDIR=
set DBMSKEY=
set DBMSDIR=
call:checkHome
if not defined variables pause
if not defined variables goto:eof
set PROJKEY=mhzap201
set PROJDIR=mhzap201
set HOMEDIR=%MHZAP201_HOME%
set CRVLDIR=%MHZAP201_HOME%
call %HOMEDIR%\variables-home.bat
call:checkJava
call:checkJavaApplicationServer
call:checkDatabase
call %HOMEDIR%\variables-dbdc.bat
rem  %HOMEDIR%\variables-j2ee.bat
call:trace
goto:eof

:checkHome
if defined     MHZAP201_HOME call:checkDir  %MHZAP201_HOME%
if not defined MHZAP201_HOME call:notDefined MHZAP201_HOME
if not defined variables goto:eof
call:checkHomeFiles
goto:eof

:checkHomeFiles
call:checkFile %MHZAP201_HOME% variables.bat
call:checkFile %MHZAP201_HOME% variables-dbdc.bat
call:checkFile %MHZAP201_HOME% variables-home.bat
rem  checkFile %MHZAP201_HOME% variables-j2ee.bat
goto:eof

:setCurrentVersionDir1
set CRVLDIR=%HOMEDIR%
set tokens1=token-list-1
set tokens2=token-list-2
if exist %tokens1% del %tokens1% /q
if exist %tokens2% del %tokens2% /q
for /D %%d in (%HOMEDIR%\V??R??????*) do echo %%d>>%tokens1%
if exist %tokens1% sort %tokens1% /o %tokens2%
if exist %tokens2% for /f "tokens=1*" %%t in (%tokens2%) do set CRVLDIR=%%t
if exist %tokens1% del %tokens1% /q
if exist %tokens2% del %tokens2% /q
set tokens1=
set tokens2=
goto:eof

:setCurrentVersionDir2
if exist %HOMEDIR%\VnnRaammdd (
    set CRVLDIR=%HOMEDIR%\VnnRaammdd
) else (
    set CRVLDIR=%HOMEDIR%
)
goto:eof

:checkJava
if defined     JAVA_HOME call:checkDir "%JAVA_HOME%"
if not defined JAVA_HOME call:notDefined JAVA_HOME
goto:eof

:checkJavaApplicationServer
set default=GlassFish
if /i "%MHZAP201_EEAS%" == "GlassFish"  set EEASKEY=%MHZAP201_EEAS%
if /i "%MHZAP201_EEAS%" == "JBoss"      set EEASKEY=%MHZAP201_EEAS%
if /i "%EEAS_OVERRIDE%" == "GlassFish"  set EEASKEY=%EEAS_OVERRIDE%
if /i "%EEAS_OVERRIDE%" == "JBoss"      set EEASKEY=%EEAS_OVERRIDE%
if not defined EEASKEY set EEASKEY=%default%
set default=
if /i "%EEASKEY%" == "GlassFish"  call:checkGlassFish
if /i "%EEASKEY%" == "JBoss"      call:checkJBoss
goto:eof

:checkGlassFish
set EEASDIR=glassfish
if defined     GLASSFISH_HOME call:checkDir "%GLASSFISH_HOME%"
if not defined GLASSFISH_HOME call:notDefined GLASSFISH_HOME
goto:eof

:checkJBoss
set EEASDIR=jboss
if defined     JBOSS_HOME call:checkDir "%JBOSS_HOME%"
if not defined JBOSS_HOME call:notDefined JBOSS_HOME
goto:eof

:checkDatabase
set default=PostgreSQL
if /i "%MHZAP201_DBMS%" == "Oracle"     set DBMSKEY=%MHZAP201_DBMS%
if /i "%MHZAP201_DBMS%" == "PostgreSQL" set DBMSKEY=%MHZAP201_DBMS%
if /i "%MHZAP201_DBMS%" == "SQLServer"  set DBMSKEY=%MHZAP201_DBMS%
if /i "%DBMS_OVERRIDE%" == "Oracle"     set DBMSKEY=%DBMS_OVERRIDE%
if /i "%DBMS_OVERRIDE%" == "PostgreSQL" set DBMSKEY=%DBMS_OVERRIDE%
if /i "%DBMS_OVERRIDE%" == "SQLServer"  set DBMSKEY=%DBMS_OVERRIDE%
if not defined DBMSKEY set DBMSKEY=%default%
set default=
if /i "%DBMSKEY%" == "Oracle"     call:checkOracle
if /i "%DBMSKEY%" == "PostgreSQL" call:checkPostgreSQL
if /i "%DBMSKEY%" == "SQLServer"  call:checkSQLServer
goto:eof

:checkOracle
set DBMSDIR=oracle
if defined     ORACLE_HOME  call:checkDir "%ORACLE_HOME%"
if not defined ORACLE_HOME  call:notDefined ORACLE_HOME
goto:eof

:checkPostgreSQL
set DBMSDIR=postgresql
if defined     POSTGRESQL_HOME  call:checkDir "%POSTGRESQL_HOME%"
if not defined POSTGRESQL_HOME  call:notDefined POSTGRESQL_HOME
goto:eof

:checkSQLServer
set DBMSDIR=sqlserver
if defined     SQLSERVER_HOME   call:checkDir "%SQLSERVER_HOME%"
if not defined SQLSERVER_HOME   call:notDefined SQLSERVER_HOME
if defined     SQLSERVER_MSSQL  call:checkDir "%SQLSERVER_MSSQL%"
if not defined SQLSERVER_MSSQL  call:notDefined SQLSERVER_MSSQL
if defined     SQLSERVER_TOOLS  call:checkDir "%SQLSERVER_TOOLS%"
if not defined SQLSERVER_TOOLS  call:notDefined SQLSERVER_TOOLS
goto:eof

:checkDir
rem echo check "%~f1"
if exist "%~f1" goto:eof
echo el directorio "%~f1" no existe
set variables=
goto:eof

:checkFile
set carpeta="%~f1"
set archivo="%~f1"
if "%2" == "" set carpeta="%~dp1"
if not "%2" == "" set archivo="%~f1\%~nx2"
rem echo check %archivo%
if exist %archivo% goto:eof
echo el archivo %archivo% no existe
set variables=
goto:eof

:notDefined
set %1
set variables=
goto:eof

:trace
rem MHZAP201
rem PROJKEY
rem PROJDIR
rem HOMEDIR
rem CRVLDIR
rem EEASKEY
rem EEASDIR
rem DBMSKEY
rem DBMSDIR
rem variables
set>"%~dpn0.log"
if defined variables goto:eof
start /d %windir% notepad "%~dpn0.log"
pause
echo.
goto:eof
