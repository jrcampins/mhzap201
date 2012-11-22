@echo off
cd /d "%~dp0"

set variables=
call variables
if not defined variables goto:eof

echo "%~n0" comprime la base de datos
call ..\setsiono ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof

set EXE="%PGBINDIR%\vacuumdb.exe"
set CMD=%EXE% -e -f -q -z
echo.
echo %CMD%
echo.
rem pause
echo.
%CMD%
set /a xerrorlevel=%ERRORLEVEL%
echo.
echo vacuumdb: %xerrorlevel%
echo.
call ..\eoj "%~f0"
