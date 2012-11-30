@echo off
rem on_properly_defined_variables=echo
set variables=%~f0
set lower_case_project=mhzap201
set UPPER_CASE_PROJECT=MHZAP201
set HOMEDIR=%~dp0
set HOMEDIR=%HOMEDIR:~0,-1%
set DISTDIR=%HOMEDIR%\resources
set BACKUPDIR=%HOMEDIR%\backup
set LOGSDIR=%HOMEDIR%\logs
if not exist %BACKUPDIR% md %BACKUPDIR%
if not exist %LOGSDIR% md %LOGSDIR%
call:run %HOMEDIR%\variables-home.bat
call:check-dir JAVA_HOME
call:run %HOMEDIR%\variables-conf.bat
if defined on_properly_defined_variables (
    if defined EEAS (
        echo EEAS=%EEAS%
    ) else (
        echo Advertencia: el valor de la variable de entorno EEAS no esta definido. Si se necesita, se usara GlassFish
    )
    if defined DBMS (
        echo DBMS=%DBMS%
    ) else (
        echo Advertencia: el valor de la variable de entorno DBMS no esta definido. Si se necesita, se usara PostgreSQL
    )
)
call:checkEEAS
call:checkDBMS
call:run-quietly %HOMEDIR%\variables-server.bat
call:run-quietly %HOMEDIR%\variables-dev.bat
goto:eof

:checkEEAS
set EEASKEY=
if /i "%EEAS%" == "GlassFish"    set EEASKEY=GlassFish
if /i "%EEAS%" == "JBoss"        set EEASKEY=JBoss
if not defined EEASKEY           set EEASKEY=GlassFish
if /i "%EEASKEY%" == "GlassFish" call:check-glassfish
if /i "%EEASKEY%" == "JBoss"     call:check-jboss
goto:eof

:check-glassfish
set EEASDIR=glassfish
call:run %HOMEDIR%\variables-glassfish.bat
call:check-dir GLASSFISH_HOME
if defined on_properly_defined_variables (
    echo ashost=%ashost%
    echo asport=%asport%
    echo asuser=%asuser%
    echo aspass=********
)
call:check-file aspassfile
set ascst1=
rem ascst1=--user %asuser% --passwordfile %aspassfile%
set ascst2=--host %ashost% --port %asport% %ascst1%
if defined on_properly_defined_variables (
    echo domain=%domain%
)
goto:eof

:check-jboss
set EEASDIR=jboss
call:run %HOMEDIR%\variables-jboss.bat
call:check-dir JBOSS_HOME
if defined on_properly_defined_variables (
    echo ashost=%ashost%
    echo asport=%asport%
)
set ascst1=
rem ascst1=--user %asuser% --password %aspass%
set ascst2=--connect controller=%ashost%:%asport% %ascst1%
if defined on_properly_defined_variables (
    echo offset=%offset%
)
goto:eof

:checkDBMS
set DBMSKEY=
if /i "%DBMS%" == "Oracle"        set DBMSKEY=Oracle
if /i "%DBMS%" == "PostgreSQL"    set DBMSKEY=PostgreSQL
if /i "%DBMS%" == "SQLServer"     set DBMSKEY=SQLServer
if not defined DBMSKEY            set DBMSKEY=PostgreSQL
if /i "%DBMSKEY%" == "Oracle"     call:check-oracle
if /i "%DBMSKEY%" == "PostgreSQL" call:check-postgresql
if /i "%DBMSKEY%" == "SQLServer"  call:check-sqlserver
if defined on_properly_defined_variables (
    echo dbhost=%dbhost%
    echo dbport=%dbport%
    echo dbuser=%dbuser%
    echo dbpass=********
    echo dbname=%dbname%
    echo dbcurl=%dbcurl%
    echo driver=%driver%
)
goto:eof

:check-oracle
set DBMSDIR=oracle
call:run %HOMEDIR%\variables-oracle.bat
call:check-dir ORACLE_HOME
if defined on_properly_defined_variables (
    echo dbcoid=%dbcoid%
)
goto:eof

:check-postgresql
set DBMSDIR=postgresql
call:run %HOMEDIR%\variables-postgresql.bat
call:check-dir POSTGRESQL_HOME
goto:eof

:check-sqlserver
set DBMSDIR=sqlserver
call:run %HOMEDIR%\variables-sqlserver.bat
call:check-dir SQLSERVER_HOME
call:check-dir SQLSERVER_MSSQL
call:check-dir SQLSERVER_TOOLS
goto:eof

:run
if exist "%~f1" (
    call "%~f1"
) else (
    echo El archivo "%~f1" no existe
    set variables=
)
goto:eof

:run-quietly
if exist "%~f1" (
    call "%~f1"
)
goto:eof

:check-dir
call:check-exist %1
if not defined dirname (
    set variables=
    echo *** %1 "%winname%" no es un directorio
    echo.
)
goto:eof

:check-file
call:check-exist %1
if defined dirname (
    set variables=
    echo *** %1 "%winname%" no es un archivo, es un directorio
    echo.
)
goto:eof

:check-exist
set varname=%1
call set winname=%%%varname%%%
if defined winname set winname=%winname:"=%
set dirname=
set dosname=
if defined %1 (
    if exist "%winname%" (
        call:set-dirname "%winname%"
        call:set-dosname "%winname%"
        if defined on_properly_defined_variables echo %1="%winname%"
    ) else (
        set variables=
        echo.
        echo *** %1 "%winname%" no existe
        echo.
    )
) else (
    set variables=
    echo.
    echo *** la variable de entorno %1 no esta definida
    echo.
)
goto:eof
set varname
set winname
set dirname
set dosname
echo.
goto:eof

:set-dirname
for /D %%d in ("%~f1\..\*") do if /i "%%~nxd" == "%~nx1" set dirname=%~f1
goto:eof

:set-dosname
for /F "delims=*" %%s in ("%~f1") do set dosname=%%~ss
goto:eof
