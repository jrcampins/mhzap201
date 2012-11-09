@echo off
cd /d "%~dp0"
call variables
if not defined variables goto:eof
if not defined f0 set f0="%~f0"

set siono=S
set /p siono="Eliminar logs de GlassFish ? (S/N) [%siono%] "
if /i "%siono%" NEQ "S" goto:eof
echo.

set target="%GLASSFISH_HOME%\domains\domain1\log4j.appender.rolling.log"
set target="%GLASSFISH_HOME%\domains\domain1\*.log"
del %target% /q
echo.

set target="%GLASSFISH_HOME%\domains\domain1\config\log4j.appender.rolling.log"
set target="%GLASSFISH_HOME%\domains\domain1\config\*.log"
del %target% /q
echo.

set siono=S
call:erase1 "%GLASSFISH_HOME%\domains\domain1\logs"

set siono=N
call:erase1 "%GLASSFISH_HOME%\domains\domain1\osgi-cache"

if %f0% == "%~f0" pause
goto:eof

:erase1
set target="%~f1"
if exist %target% (call:present) else (call:missing)
echo.
goto:eof

:erase2
set target="%~f1"
set server="%~f1\server.log"
if exist %server% (call:present) else (call:missing)
echo.
goto:eof

:present
set /p siono="ELIMINAR EL DIRECTORIO %target% ? (S/N) [%siono%] "
if /i "%siono%" NEQ "S" goto:eof

rmdir %target% /s /q
rem mkdir %target%
goto:eof

:missing
echo %target% esta vacio
goto:eof
