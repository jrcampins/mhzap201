@echo off
cd /d "%~dp0"
echo "%~n0" elimina la base de datos
call ..\setsiono ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto EOJ
call variables "%~f0"
if not defined variables goto EOJ

set EXE="%PGBINDIR:~1,-1%\dropdb.exe"
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
pause
:EOJ
call ..\eoj "%~f0"
