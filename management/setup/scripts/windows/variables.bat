@echo off
rem on_properly_defined_variables=echo
set variables=%~f0
set lower_case_project=mhzap201
set UPPER_CASE_PROJECT=MHZAP201
set HOMEDIR=%~dp0
set HOMEDIR=%HOMEDIR:~0,-1%
set DISTDIR=%HOMEDIR%\resources
set LOGSDIR=%HOMEDIR%\logs
call:check-dir DISTDIR
call:mkdir-dir LOGSDIR
call:run %HOMEDIR%\variables-home.bat
call:check-dir JAVA_HOME
call:run %HOMEDIR%\variables-conf.bat
if defined on_properly_defined_variables (
    if defined EEAS (
        echo EEAS=%EEAS%
    ) else (
        call:echo-warn "el valor de la variable de entorno EEAS no esta definido. Si se necesita, se usara GlassFish"
    )
    if defined DBMS (
        echo DBMS=%DBMS%
    ) else (
        call:echo-warn "el valor de la variable de entorno DBMS no esta definido. Si se necesita, se usara PostgreSQL"
    )
)
call:check-eeas
call:check-dbms
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
call:run %HOMEDIR%\variables-server.bat /q
call:run %HOMEDIR%\variables-dev.bat /q
goto:eof

:check-eeas
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
set ASADMIN=%GLASSFISH_HOME%\bin\asadmin.bat
call:check-file ASADMIN
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

:check-dbms
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
set ORABINDIR=%ORACLE_HOME%\bin
call:check-dir ORABINDIR
goto:eof

:check-postgresql
set DBMSDIR=postgresql
call:run %HOMEDIR%\variables-postgresql.bat
call:check-dir POSTGRESQL_HOME
set PGBINDIR=%POSTGRESQL_HOME%\bin
call:check-dir PGBINDIR
goto:eof

:check-sqlserver
set DBMSDIR=sqlserver
call:run %HOMEDIR%\variables-sqlserver.bat
call:check-dir SQLSERVER_HOME
call:check-dir SQLSERVER_MSSQL
call:check-dir SQLSERVER_TOOLS
set SSBINDIR=%SQLSERVER_TOOLS%\Binn
set SQLDATDIR=%SQLSERVER_MSSQL%\Data
call:check-dir SSBINDIR
call:check-dir SQLDATDIR
goto:eof

:run
if exist "%~f1" (
    call "%~f1"
) else (
    if /i not "%2" == "/q" call:echo-error "'%~f1' no existe"
)
goto:eof

:check-dir
call:check-exist %1
if defined variables (
    if defined dirname (
        if defined on_properly_defined_variables echo %1="%winname%"
    ) else (
        call:echo-error "%1 '%winname%' no es un directorio"
    )
)
goto:eof

:check-file
call:check-exist %1
if defined variables (
    if defined dirname (
        echo-error "%1 '%winname%' no es un archivo, es un directorio"
    ) else (
        if defined on_properly_defined_variables echo %1="%winname%"
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
        if /i not "%2" == "/q" call:echo-error "%1 '%winname%' no existe"
    )
) else (
    if /i not "%2" == "/q" call:echo-error "la variable de entorno %1 no esta definida"
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
if defined on_properly_defined_variables echo %1="%winname%"
goto:eof

:echo-warn
echo Advertencia: %~1
goto:eof

:echo-error
set variables=
echo.
echo ERROR: %~1
echo.
goto:eof
