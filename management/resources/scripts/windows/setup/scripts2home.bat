@echo off
cd /d "%~dp0"
echo "%~n0" copia los archivos de configuracion a %MHZAP201_HOME%
call ..\setsiono ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto EOJ
cd /d "%MHZAP201_HOME%"
rem if not exist "%~f1" goto ERR1
if exist "%~f1" cd /d "%~f1"
set wd=%CD%
set p1="%wd%\resources\scripts\asadmin.password"
set p2="%wd%\resources\scripts\pgadmin.password"
set s1="%wd%\resources\scripts\windows\variables.bat"
set s2="%wd%\resources\scripts\windows\variables-home.bat"
set s3="%wd%\resources\scripts\windows\variables-dbdc.bat"
set s4="%wd%\resources\scripts\windows\variables-j2ee.bat"
if exist %p1% copy /-Y %p1% %MHZAP201_HOME%
if exist %p2% copy /-Y %p2% %MHZAP201_HOME%
if exist %s1% copy /-Y %s1% %MHZAP201_HOME%
if exist %s2% copy /-Y %s2% %MHZAP201_HOME%
if exist %s3% copy /-Y %s3% %MHZAP201_HOME%
if exist %s4% copy /-Y %s4% %MHZAP201_HOME%
echo.
dir /a:-d %MHZAP201_HOME%
echo.
goto DONE
:ERR1
set ERRMSG=directorio "%~f1" no existe
goto TELL
:TELL
@echo.
@echo %ERRMSG%
@echo.
:DONE
pause
:EOJ
echo.
