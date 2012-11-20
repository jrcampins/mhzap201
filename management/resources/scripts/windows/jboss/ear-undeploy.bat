@echo off
cd /d "%~dp0"
call variables
if not defined variables goto:eof

echo "%~n0" undeploys application ear
call ..\setsiono ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof

set ear=mhzap201.ear
set cli=%JBOSS_HOME%\bin\jboss-cli %jbcst2% --command="undeploy %ear%"
echo %cli%
%cli%
pause
