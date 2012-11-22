@echo off
cd /d "%~dp0"
echo "%~n0" comprime la base de datos
call ..\setsiono ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof
set variables=
call variables
if not defined variables goto:eof

set EXE="%O9BINDIR%\vacuumdb.exe"
set CMD=%EXE% -e -f -q -z
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
echo vacuumdb: %xerrorlevel%
echo.
call ..\eoj "%~f0"
