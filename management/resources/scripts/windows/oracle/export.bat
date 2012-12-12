@echo off
cd /d "%~dp0"

setlocal
set variables=
call variables
if not defined variables goto:eof

echo "%~n0" crea un archivo respaldo de la base de datos
call "%~dp0..\setsiono" ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof

:ask
set SUFIJO=%aaaammdd%%hh24mm%
set /p SUFIJO="sufijo del archivo de respaldo [%SUFIJO%] "
if not defined SUFIJO goto ask

set DUMPFILE=%ORADATABASE%_%SUFIJO%.DMP
set dmp="%SQLBACKDIR%\%DUMPFILE%"
if exist "%dmp%" del "%dmp%"

set LOGFILE=%DUMPFILE%.export.log
set log="%SQLBACKDIR%\%LOGFILE%"
if exist %log% del %log%

set logon=%dbuser%/%dbpass%@%dbhost%:%dbport%/%dbserv%

pushd "%ORACLE_HOME%\bin"
expdp %logon% SCHEMAS=%dbuser% DIRECTORY=%UPPER_CASE_PROJECT%_ARCHIVES DUMPFILE=%DUMPFILE% LOGFILE=%LOGFILE%
popd
call "%~dp0..\eoj" "%~f0"
goto:eof

echo.
call "%~dp0..\setsiono" desea ver el log de la ejecucion (%log%)
if /i "%siono%" == "S" start /d %SystemRoot% notepad %log%
echo.
goto:eof
