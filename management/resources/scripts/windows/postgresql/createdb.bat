@echo off
cd /d "%~dp0"

set variables=
call variables
if not defined variables goto:eof

echo "%~n0" crea la base de datos
call ..\setsiono ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof

set EXE="%PGBINDIR%\createdb.exe"
set CMD=%EXE% -e -E UTF8
echo.
echo %CMD%
echo.
rem pause
echo.
%CMD%
set /a xerrorlevel=%ERRORLEVEL%
echo.
echo createdb: %xerrorlevel%
echo.
call ..\eoj "%~f0"
