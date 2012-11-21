@echo off
cd /d "%~dp0"
echo "%~n0" crea la base de datos
call ..\setsiono ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof
call variables "%~f0"
if not defined variables goto:eof

set EXE="%O9BINDIR%\createdb.exe"
set CMD=%EXE% -e -E UTF8
echo.
echo %CMD%
echo.
rem pause
echo.
ECHO ---------------------------------------------------------------------------------------------------------
ECHO %CMD%
SET /a ERRORLEVEL=0
ECHO ---------------------------------------------------------------------------------------------------------
set /a xerrorlevel=%ERRORLEVEL%
echo.
echo createdb: %xerrorlevel%
echo.
call ..\eoj "%~f0"
