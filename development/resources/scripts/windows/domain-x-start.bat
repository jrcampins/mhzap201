@echo off
cd /d "%~dp0"

set ASADMIN="N:\glassfish\glassfish\bin\asadmin.bat"
set GFDOMAINCST2=--host localhost --port 4848
set MHZAP201_DIR=%MHZAP201_HOME%\resources

echo %ASADMIN% %GFDOMAINCST2% start-domain
call %ASADMIN% %GFDOMAINCST2% start-domain
echo.

echo %ASADMIN% %GFDOMAINCST2% list-components
call %ASADMIN% %GFDOMAINCST2% list-components
echo.

pause
goto.eof
