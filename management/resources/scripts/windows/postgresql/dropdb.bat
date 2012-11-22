@echo off
cd /d "%~dp0"

set variables=
call variables
if not defined variables goto:eof

echo "%~n0" elimina la base de datos
call ..\setsiono ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof

set EXE="%PGBINDIR%\dropdb.exe"
set CMD=%EXE% -e -i %PGDATABASE%
echo.
echo %CMD%
echo.
rem pause
echo.
%CMD%
set /a xerrorlevel=%ERRORLEVEL%
echo.
echo dropdb: %xerrorlevel%
echo.
call ..\eoj "%~f0"
