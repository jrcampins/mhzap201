@echo off
cd /d "%~dp0"

set EEAS=glassfish
set DBMS=postgresql
set variables=
call variables
if not defined variables goto:eof

set target=glassfish
set %UPPER_CASE_PROJECT%_HOME_DIR=%project_source_dir%\management
set %UPPER_CASE_PROJECT%_JNDI_EJB_PERSISTENCE_PATTERN=java:global/%lower_case_project%-sdk/%lower_case_project%-ejb-persistence/{0}
set %UPPER_CASE_PROJECT%_VELOCITY_PROPERTIES_FILE=%project_source_dir%\management\resources\velocity\sdk-velocity.properties
set %UPPER_CASE_PROJECT%_WEB_TEMPLATE_PROJECT_NAME=%lower_case_project%-web-template
set %UPPER_CASE_PROJECT%_WEB_TEMPLATE_PROJECT_ROOT=%project_source_dir%
set %UPPER_CASE_PROJECT%_WORKSPACE=%~d0\%lower_case_project%\ws-%target%
set %UPPER_CASE_PROJECT%_TARGET_APPLICATION_SERVER=%target%
set %UPPER_CASE_PROJECT%
echo.

set ASADMIN="%GLASSFISH_HOME%\bin\asadmin.bat"
set ASADMIN
echo.

echo %ASADMIN% %ascst1% start-domain --debug %domain%
call %ASADMIN% %ascst1% start-domain --debug %domain%
echo.

echo %ASADMIN% %ascst2% list-components
call %ASADMIN% %ascst2% list-components
echo.

pause
goto:eof
