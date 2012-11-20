@echo off
cd /d "%~dp0"
echo "%~n0" crea la base de datos
call ..\setsiono ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto EOJ
call variables "%~f0"
if not defined variables goto EOJ

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
pause
:EOJ
call ..\eoj "%~f0"
