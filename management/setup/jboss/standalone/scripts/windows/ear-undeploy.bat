@echo off
cd /d "%~dp0"
call variables
if not defined variables goto:eof

set ear=mhzap201.ear
set cli=%JBOSS_HOME%\bin\jboss-cli %jbcst2% --command="undeploy %ear%"
echo %cli%
%cli%
pause
