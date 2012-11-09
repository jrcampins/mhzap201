@echo off
cd /d "%~dp0"
echo "%~n0" crea la base de datos
call ..\setsiono ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto EOJ
call variables "%~f0"
if not defined variables goto EOJ

set EXE="%PGBINDIR:~1,-1%\createdb.exe"
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
pause
:EOJ
call ..\eoj "%~f0"
