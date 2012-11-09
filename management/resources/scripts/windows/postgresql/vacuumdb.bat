@echo off
cd /d "%~dp0"
echo "%~n0" comprime la base de datos
call ..\setsiono ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto EOJ
call variables "%~f0"
if not defined variables goto EOJ

set EXE="%PGBINDIR:~1,-1%\vacuumdb.exe"
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
pause
:EOJ
call ..\eoj "%~f0"
