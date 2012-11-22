@echo off
cd /d "%~dp0"

set variables=
call variables
if not defined variables goto:eof

echo "%~n0" elimina la base de datos
call ..\setsiono ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof

set EXE="%O9BINDIR%\dropdb.exe"
set CMD=%EXE% -e -i %O9DATABASE%
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
echo dropdb: %xerrorlevel%
echo.
call ..\eoj "%~f0"
