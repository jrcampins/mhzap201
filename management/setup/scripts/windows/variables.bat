set variables=%~f0
set PROJKEY=mhzap201
set HOMEDIR=%~dp0
set HOMEDIR=%HOMEDIR:~0,-1%
set DISTDIR=%HOMEDIR%
call:run %HOMEDIR%\variables-home.bat
if defined JAVA_HOME (
    call:check-dir "%JAVA_HOME%"
) else (
    call:not-defined JAVA_HOME
)
call:run %HOMEDIR%\variables-conf.bat
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
if /i "%EEASKEY%" == "GlassFish" call:checkGlassFish
if /i "%EEASKEY%" == "JBoss"     call:checkJBoss
goto:eof

:checkGlassFish
set EEASDIR=glassfish
call:run %HOMEDIR%\variables-glassfish.bat
if defined GLASSFISH_HOME (
    call:check-dir "%GLASSFISH_HOME%"
) else (
    call:not-defined GLASSFISH_HOME
)
goto:eof

:checkJBoss
set EEASDIR=jboss
call:run %HOMEDIR%\variables-jboss.bat
if defined JBOSS_HOME (
    call:check-dir "%JBOSS_HOME%"
) else (
    call:not-defined JBOSS_HOME
)
goto:eof

:checkDBMS
set DBMSKEY=
if /i "%DBMS%" == "Oracle"        set DBMSKEY=Oracle
if /i "%DBMS%" == "PostgreSQL"    set DBMSKEY=PostgreSQL
if /i "%DBMS%" == "SQLServer"     set DBMSKEY=SQLServer
if not defined DBMSKEY            set DBMSKEY=PostgreSQL
if /i "%DBMSKEY%" == "Oracle"     call:checkOracle
if /i "%DBMSKEY%" == "PostgreSQL" call:checkPostgreSQL
if /i "%DBMSKEY%" == "SQLServer"  call:checkSQLServer
goto:eof

:checkOracle
set DBMSDIR=oracle
call:run %HOMEDIR%\variables-oracle.bat
if defined ORACLE_HOME (
    call:check-dir "%ORACLE_HOME%"
) else (
    call:not-defined ORACLE_HOME
)
goto:eof

:checkPostgreSQL
set DBMSDIR=postgresql
call:run %HOMEDIR%\variables-postgresql.bat
if defined POSTGRESQL_HOME (
    call:check-dir "%POSTGRESQL_HOME%"
) else (
    call:not-defined POSTGRESQL_HOME
)
goto:eof

:checkSQLServer
set DBMSDIR=sqlserver
call:run %HOMEDIR%\variables-sqlserver.bat
if defined SQLSERVER_HOME (
    call:check-dir "%SQLSERVER_HOME%"
) else (
    call:not-defined SQLSERVER_HOME
)
if defined SQLSERVER_MSSQL (
    call:check-dir "%SQLSERVER_MSSQL%"
) else (
    call:not-defined SQLSERVER_MSSQL
)
if defined SQLSERVER_TOOLS (
    call:check-dir "%SQLSERVER_TOOLS%"
) else (
    call:not-defined SQLSERVER_TOOLS
)
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
if not exist "%~f1" (
    echo el directorio "%~f1" no existe
    set variables=
)
goto:eof

:not-defined
set %1
set variables=
goto:eof
