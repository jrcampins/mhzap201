@echo off
cd /d "%~dp0"

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

echo.
echo %CMD%
echo.
if exist "%BAK%" del "%BAK%"

call:init-psql-spool
echo %CMD%>>%PLOG%
echo %DATE% %TIME% %CD% %PGDATABASE%>>%PLOG%
%CMD% 1>>%PLOG% 2>&1
set /a xerrorlevel=%ERRORLEVEL%
echo %DATE% %TIME% %CD% %PGDATABASE%>>%PLOG%
echo.
echo dump: %xerrorlevel%
echo.
call:open-psql-spool
goto:eof

:init-psql-spool
set dir="%~dp0logs"
set log="%~dp0logs\%~nx0.log"
if not defined PLOG (
    set PLOG=%log%
    if exist %log% (del %log%) else (if not exist %dir% md %dir%)
)
echo %~f0 >> %PLOG%
goto:eof

:open-psql-spool
set log="%~dp0logs\%~nx0.log"
if /i %PLOG% == %log% (echo.) else (goto:eof)
set PLOG=
call "%~dp0..\setsiono" desea ver el log de la ejecucion (%log%)
if /i "%siono%" == "S" start /d %SystemRoot% notepad %log%
goto:eof
