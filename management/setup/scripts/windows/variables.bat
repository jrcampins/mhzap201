@echo off
rem on_properly_defined_variables=echo
set messages=
set variables=%~f0
set lower_case_project=mhzap201
set UPPER_CASE_PROJECT=MHZAP201
set HOMEDIR=%~dp0
set HOMEDIR=%HOMEDIR:~0,-1%
set DISTDIR=%HOMEDIR%\resources
set LOGSDIR=%HOMEDIR%\logs
call:check-dir DISTDIR
call:mkdir-dir LOGSDIR
call:xcall %HOMEDIR%\variables-home.bat
call:check-dir JAVA_HOME
call:xcall %HOMEDIR%\variables-conf.bat
call:check-eeas
call:check-dbms
call:check-eeaskey
call:check-dbmskey
set SQLBACKDIR=%HOMEDIR%\backup\%DBMSDIR%
set SQLLOGSDIR=%HOMEDIR%\logs\%DBMSDIR%
set SQLJOINDIR=%HOMEDIR%\resources\database\join\%DBMSDIR%
set SQLDDLXDIR=%HOMEDIR%\resources\database\ddl\%DBMSDIR%
set SQLXSQLDIR=%HOMEDIR%\resources\database\scripts\%DBMSDIR%
call:mkdir-dir SQLBACKDIR
call:mkdir-dir SQLLOGSDIR
call:mkdir-dir SQLJOINDIR
call:check-dir SQLDDLXDIR
call:check-dir SQLXSQLDIR
call:xcall %HOMEDIR%\variables-server.bat /q
call:xcall %HOMEDIR%\variables-dev.bat /q
call:checkout
goto:eof

:check-eeas
set EEASKEY=
if /i "%EEAS%" == "GlassFish"    set EEASKEY=GlassFish
if /i "%EEAS%" == "JBoss"        set EEASKEY=JBoss
if not defined EEASKEY (
    set EEASKEY=GlassFish
    call:xwarn el valor de la variable de entorno EEAS no esta correctamente definido. Si se necesita, se usara GlassFish
    call:xinfo el valor de la variable de entorno EEAS se debe definir en "%HOMEDIR%\variables-conf.bat"
) else (
    if defined on_properly_defined_variables call:xinfo EEAS=%EEAS%
)
goto:eof

:check-eeaskey
if /i "%EEASKEY%" == "GlassFish" call:check-glassfish
if /i "%EEASKEY%" == "JBoss"     call:check-jboss
goto:eof

:check-glassfish
set EEASDIR=glassfish
call:xcall %HOMEDIR%\variables-glassfish.bat
call:check-dir GLASSFISH_HOME
if defined on_properly_defined_variables (
    call:xinfo ashost=%ashost%
    call:xinfo asport=%asport%
    call:xinfo asuser=%asuser%
    call:xinfo aspass=********
)
call:check-file aspassfile
set ascst1=
rem ascst1=--user %asuser% --passwordfile %aspassfile%
set ascst2=--host %ashost% --port %asport% %ascst1%
if defined on_properly_defined_variables (
    call:xinfo domain=%domain%
)
set ASADMIN=%GLASSFISH_HOME%\bin\asadmin.bat
call:check-file ASADMIN
goto:eof

:check-jboss
set EEASDIR=jboss
call:xcall %HOMEDIR%\variables-jboss.bat
call:check-dir JBOSS_HOME
if defined on_properly_defined_variables (
    call:xinfo ashost=%ashost%
    call:xinfo asport=%asport%
)
set ascst1=
rem ascst1=--user %asuser% --password %aspass%
set ascst2=--connect controller=%ashost%:%asport% %ascst1%
if defined on_properly_defined_variables (
    call:xinfo offset=%offset%
)
goto:eof

:check-dbms
set DBMSKEY=
if /i "%DBMS%" == "Oracle"        set DBMSKEY=Oracle
if /i "%DBMS%" == "PostgreSQL"    set DBMSKEY=PostgreSQL
if /i "%DBMS%" == "SQLServer"     set DBMSKEY=SQLServer
if not defined DBMSKEY (
    set DBMSKEY=PostgreSQL
    call:xwarn el valor de la variable de entorno DBMS no esta correctamente definido. Si se necesita, se usara PostgreSQL
    call:xinfo el valor de la variable de entorno DBMS se debe definir en "%HOMEDIR%\variables-conf.bat"
) else (
    if defined on_properly_defined_variables call:xinfo DBMS=%DBMS%
)
goto:eof

:check-dbmskey
if /i "%DBMSKEY%" == "Oracle"     call:check-oracle
if /i "%DBMSKEY%" == "PostgreSQL" call:check-postgresql
if /i "%DBMSKEY%" == "SQLServer"  call:check-sqlserver
if defined on_properly_defined_variables (
    call:xinfo dbhost=%dbhost%
    call:xinfo dbport=%dbport%
    call:xinfo dbuser=%dbuser%
    call:xinfo dbpass=********
    call:xinfo dbname=%dbname%
    call:xinfo dbcurl=%dbcurl%
    call:xinfo driver=%driver%
)
goto:eof

:check-oracle
set DBMSDIR=oracle
call:xcall %HOMEDIR%\variables-oracle.bat
call:check-dir ORACLE_HOME
if defined on_properly_defined_variables (
    call:xinfo dbserv=%dbserv%
)
set ORABINDIR=%ORACLE_HOME%\bin
call:check-dir ORABINDIR
goto:eof

:check-postgresql
set DBMSDIR=postgresql
call:xcall %HOMEDIR%\variables-postgresql.bat
call:check-dir POSTGRESQL_HOME
set PGBINDIR=%POSTGRESQL_HOME%\bin
call:check-dir PGBINDIR
goto:eof

:check-sqlserver
set DBMSDIR=sqlserver
call:xcall %HOMEDIR%\variables-sqlserver.bat
call:check-dir SQLSERVER_HOME
call:check-dir SQLSERVER_MSSQL
call:check-dir SQLSERVER_TOOLS
set SSBINDIR=%SQLSERVER_TOOLS%\Binn
set SQLDATDIR=%SQLSERVER_MSSQL%\Data
call:check-dir SSBINDIR
call:check-dir SQLDATDIR
goto:eof

:check-dir
call:check-exist %1
if defined variables (
    if defined dirname (
        if defined on_properly_defined_variables call:xinfo %1="%winname%"
    ) else (
        call:xerror %1 "%winname%" no es un directorio
    )
)
goto:eof

:check-file
call:check-exist %1
if defined variables (
    if defined dirname (
        xerror %1 "%winname%" no es un archivo, es un directorio
    ) else (
        if defined on_properly_defined_variables call:xinfo %1="%winname%"
    )
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
    ) else (
        if /i not "%2" == "/q" call:xerror %1 "%winname%" no existe
    )
) else (
    call:xerror la variable de entorno %1 no esta definida
)
goto:eof

:set-dirname
for /D %%d in ("%~f1\..\*") do if /i "%%~nxd" == "%~nx1" set dirname=%~f1
goto:eof

:set-dosname
for /F "delims=*" %%s in ("%~f1") do set dosname=%%~ss
goto:eof

:mkdir-dir
call:check-exist %1 /q
if not defined dirname md "%winname%"
if defined on_properly_defined_variables call:xinfo %1="%winname%"
goto:eof

:xinfo
set messages=true
echo [Informacion] %*
goto:eof

:xwarn
set messages=true
echo [ADVERTENCIA] %*
goto:eof

:xerror
set messages=true
set variables=
echo [***ERROR***] %*
goto:eof

:xcall
if exist "%~f1" (
    call "%~f1"
) else (
    if /i "%2" == "/q" (
        if defined on_properly_defined_variables call:xinfo "%~f1" no existe
    ) else (
        call:xerror "%~f1" no existe
    )
)
goto:eof

:checkout
if defined messages echo.
goto:eof
