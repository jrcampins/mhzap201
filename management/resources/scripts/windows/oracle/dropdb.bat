@echo off
cd /d "%~dp0"
echo "%~n0" elimina la base de datos
call ..\setsiono ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto EOJ
call variables "%~f0"
if not defined variables goto EOJ

set EXE="%O9BINDIR:~1,-1%\dropdb.exe"
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
pause
:EOJ
call ..\eoj "%~f0"