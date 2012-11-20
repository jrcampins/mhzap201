@echo off
cd /d "%~dp0"
call variables
if not defined variables goto:eof

echo "%~n0" copia los archivos de configuracion a %MHZAP201_HOME%
call ..\setsiono ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof

set p1="%MHZAP201_HOME%\resources\scripts\asadmin.password"
set p2="%MHZAP201_HOME%\resources\scripts\jbadmin.password"
set p3="%MHZAP201_HOME%\resources\scripts\oradmin.password"
set p4="%MHZAP201_HOME%\resources\scripts\pgadmin.password"

set s1="%MHZAP201_HOME%\resources\scripts\windows\variables.bat"
set s2="%MHZAP201_HOME%\resources\scripts\windows\variables-home.bat"
set s3="%MHZAP201_HOME%\resources\scripts\windows\variables-dbdc.bat"
set s4="%MHZAP201_HOME%\resources\scripts\windows\variables-j2ee.bat"

if exist %p1% copy /-Y %p1% %MHZAP201_HOME%
if exist %p2% copy /-Y %p2% %MHZAP201_HOME%
if exist %p1% copy /-Y %p3% %MHZAP201_HOME%
if exist %p2% copy /-Y %p4% %MHZAP201_HOME%

if exist %s1% copy /-Y %s1% %MHZAP201_HOME%
if exist %s2% copy /-Y %s2% %MHZAP201_HOME%
if exist %s3% copy /-Y %s3% %MHZAP201_HOME%
if exist %s4% copy /-Y %s4% %MHZAP201_HOME%

echo.
dir /a:-d/o:e %MHZAP201_HOME%
echo.
pause
goto:eof
