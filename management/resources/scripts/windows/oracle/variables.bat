set xs="%~dp0..\variables.bat"
if exist %xs% call %xs%
if not defined variables goto:eof

set dbms=oracle
set DBMS_OVERRIDE=Oracle
set O9HOST=%dbhost%
set O9PORT=%dbport%
set O9USER=%dbuser%
set O9PASSWORD=%dbpass%
rem O9PASSFILE=%dbpassfile%
set O9DATABASE=%dbname%
set O9BINDIR=%ORACLE_HOME%\bin
set BACKUPDIR=%HOMEDIR%\backup
set SQLDDLDIR=%CRVLDIR%\resources\database\ddl

if not exist %BACKUPDIR% md %BACKUPDIR%

call:check-exist O9BINDIR
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
