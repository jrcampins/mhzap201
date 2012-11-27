@echo off
cd /d "%~dp0"

setlocal
set variables=
call variables
if not defined variables goto:eof

echo "%~n0" elimina la base de datos
call "%~dp0..\setsiono" ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof

set EXE="%PGBINDIR%\dropdb.exe"
set CMD=%EXE% -e -i %PGDATABASE%
echo.
echo %CMD%
echo.
%CMD%
set /a xerrorlevel=%ERRORLEVEL%
echo.
echo %~n0: %xerrorlevel%
echo.
call "%~dp0..\eoj" "%~f0"
