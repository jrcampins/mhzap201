@echo off
cd /d "%~dp0"

set variables=
call variables
if not defined variables goto:eof

rem MHZAP201_HOME_DIR=%MHZAP201_SOURCE%\management
set MHZAP201_JNDI_EJB_PERSISTENCE_PATTERN=java:global/mhzap201-sdk/mhzap201-ejb-persistence/{0}
set MHZAP201_VELOCITY_PROPERTIES_FILE=%MHZAP201_SOURCE%\management\resources\velocity\sdk-velocity.properties
set MHZAP201_WEB_TEMPLATE_PROJECT_NAME=mhzap201-web-template
set MHZAP201_WEB_TEMPLATE_PROJECT_ROOT=%MHZAP201_SOURCE%
set MHZAP201_WORKSPACE=W:\workspace
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
goto:eof
