set DBMS=sqlserver
set xs="%~dp0..\variables.bat"
if exist %xs% call %xs%
if not defined variables goto:eof

set xs="%~dp0..\variables-date-time.bat"
if exist %xs% call %xs%

set SSHOST=%dbhost%
set SSPORT=%dbport%
set SSUSER=%dbuser%
set SSPASS=%dbpass%
set SSDATABASE=%dbname%
set SSBINDIR=%SQLSERVER_TOOLS%\Binn
set BACKUPDIR=%HOMEDIR%\backup
set SQLDDLDIR=%HOMEDIR%\resources\database\ddl
set SQLDATDIR=%SQLSERVER_MSSQL%\Data

if not exist %BACKUPDIR% md %BACKUPDIR%

call:check-exist SSBINDIR
call:check-exist BACKUPDIR
call:check-exist SQLDDLDIR
call:check-exist SQLDATDIR

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
