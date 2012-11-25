@echo off
cd /d "%~dp0"

set EEAS=glassfish
set DBMS=postgresql
set on_properly_defined_variables=echo
set variables=
call variables
if not defined variables goto:eof

set %UPPER_CASE_PROJECT%_HOME_DIR=%project_source_dir%\management
set %UPPER_CASE_PROJECT%
echo.

set ASADMIN="%GLASSFISH_HOME%\bin\asadmin.bat"
set ASADMIN
echo.

echo %ASADMIN% %ascst1% start-domain
call %ASADMIN% %ascst1% start-domain
echo.

echo %ASADMIN% %ascst2% list-components
call %ASADMIN% %ascst2% list-components
echo.

pause
goto:eof
