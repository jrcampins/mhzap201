set variables=
set dbms=postgresql
set DBMS_OVERRIDE=PostgreSQL
call:set-home-dir
set xs=%MHZAP201_HOME%\variables.bat
if exist %xs% call %xs%
if not defined variables goto:eof

pushd "%~dp0"
cd ..
set xs=variables-date-time.bat
if exist %xs% call %xs%
popd

set PGHOST=%dbhost%
set PGPORT=%dbport%
set PGUSER=%dbuser%
set PGPASSWORD=%dbpass%
rem PGPASSFILE=%dbpassfile%
set PGDATABASE=%dbname%
set PGBINDIR=%POSTGRESQL_HOME%\bin
set BACKUPDIR=%HOMEDIR%\backup
set SQLDDLDIR=%CRVLDIR%\resources\database\ddl

if not exist %BACKUPDIR% md %BACKUPDIR%

call:check-exist PGBINDIR
call:check-exist BACKUPDIR
call:check-exist SQLDDLDIR

if not defined variables pause
goto:eof

:check-exist
set pdq=%1
call set pdq=%%%pdq%%%
rem remove double quotes
if defined pdq set pdq=%pdq:"=%
if defined %1 (
    if exist "%pdq%" (
        rem set %1
    ) else (
        call ..\unset-variables %1 "%pdq%" no existe
    )
) else (
    call ..\unset-variables la variable de entorno %1 no esta definida
)
goto:eof

:set-home-dir
pushd "%~dp0"
call:set-home-dir-loop
popd
goto:eof

:set-home-dir-loop
set currdir=%CD%
if exist HOME (
    if not exist HOME\nul (
        set MHZAP201_HOME=%currdir%
        goto:eof
    )
)
cd ..
if "%currdir%" == "%CD%" (
    set MHZAP201_HOME=%currdir%mhzap201\home
    goto:eof
)
call:set-home-dir-loop
goto:eof
