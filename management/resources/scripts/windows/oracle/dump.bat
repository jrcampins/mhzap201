@echo off
cd /d "%~dp0"

set variables=
call variables
if not defined variables goto:eof

echo "%~n0" crea un archivo respaldo de la base de datos
call ..\setsiono ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof

:ask
set SUFIJO=%aaaammdd%
set /p SUFIJO="sufijo del archivo de respaldo [%SUFIJO%] "
if not defined SUFIJO goto ask

set EXE="%O9BINDIR%\dump.exe"
set BAK="%BACKUPDIR%\%O9DATABASE%_%SUFIJO%.backup"
set CMD=%EXE% -b -f %BAK% -F c -i -v
if not exist "%~dp0logs" md "%~dp0logs"
set LOG="%~dp0logs\%~n0.log"

echo.
echo %CMD%
echo.
if exist "%BAK%" del "%BAK%"
:DOIT
echo %CMD%>%LOG%
echo %DATE% %TIME% %CD% %O9DATABASE%>>%LOG%
ECHO ---------------------------------------------------------------------------------------------------------
ECHO %CMD% 1>>%LOG% 2>&1
SET /a ERRORLEVEL=0
ECHO ---------------------------------------------------------------------------------------------------------
set /a xerrorlevel=%ERRORLEVEL%
echo %DATE% %TIME% %CD% %O9DATABASE%>>%LOG%
echo.
echo dump: %xerrorlevel%
echo.

if defined XLOG goto:eof
call ..\setsiono desea ver el log de la ejecucion (%LOG%)
if /i "%siono%" == "S" start /d %SystemRoot% notepad %LOG%
goto:eof

:unreachable-statements
call ..\eoj "%~f0"
goto:eof
