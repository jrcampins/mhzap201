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
set SUFIJO=%aaaammdd%
set /p SUFIJO="sufijo del archivo de respaldo [%SUFIJO%] "
if not defined SUFIJO goto ask

set EXE="%PGBINDIR%\pg_dump.exe"
set BAK="%BACKUPDIR%\%PGDATABASE%_%SUFIJO%.backup"
set CMD=%EXE% -b -f %BAK% -F c -i -v
if exist "%BAK%" del "%BAK%"

echo.
echo %CMD%
echo.
call:init-log
%CMD% 1>>%log% 2>&1
set /a xerrorlevel=%ERRORLEVEL%
echo.
echo %~n0: %xerrorlevel%
echo.
call:open-log
goto:eof

:init-log
set log="%homedir%\logs\%~nx0.log"
if exist %log% (del %log%) else (call:make-dir %log%)
echo %~f0 >> %log%
goto:eof

:make-dir
if not exist "%~dp1" md "%~dp1"
goto:eof

:open-log
echo.
call "%~dp0..\setsiono" desea ver el log de la ejecucion (%log%)
if /i "%siono%" == "S" start /d %SystemRoot% notepad %log%
echo.
goto:eof
