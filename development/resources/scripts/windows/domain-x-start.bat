@echo off
cd /d "%~dp0"

set MHZAP201_RESOURCES_DIR=%MHZAP201_HOME%\resources
set MHZAP201

set ASADMIN="N:\glassfish\glassfish\bin\asadmin.bat"
set GFDOMAINCST2=--host localhost --port 4848

echo %ASADMIN% %GFDOMAINCST2% start-domain
call %ASADMIN% %GFDOMAINCST2% start-domain
echo.

echo %ASADMIN% %GFDOMAINCST2% list-components
call %ASADMIN% %GFDOMAINCST2% list-components
echo.

pause
goto.eof
