@echo off
cd /d "%~dp0"

set variables=
call variables
if not defined variables goto:eof

echo "%~n0" comprime la base de datos
call "%~dp0..\setsiono.bat" ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof

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
call "%~dp0..\eoj.bat" "%~f0"
