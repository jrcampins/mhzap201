set dbms=postgresql
set DBMS_OVERRIDE=PostgreSQL
set xs="%~dp0..\variables.bat"
if exist %xs% call %xs%
if not defined variables goto:eof

set xs="%~dp0..\variables-date-time.bat"
if exist %xs% call %xs%

set PGHOST=%dbhost%
set PGPORT=%dbport%
set PGUSER=%dbuser%
set PGPASSWORD=%dbpass%
set PGDATABASE=%dbname%
set PGBINDIR=%POSTGRESQL_HOME%\bin
set BACKUPDIR=%HOMEDIR%\backup
set SQLDDLDIR=%HOMEDIR%\resources\database\ddl

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
