@echo off
cd /d "%~dp0"

echo "%~n0" undeploys application ear
call ..\setsiono ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof

call variables "%~f0" 
if not defined variables goto EOJ

set ear=%PROJKEY%.ear

set NOPAUSE=
rem %JBOSS_HOME%\bin\jboss-cli --file=%~dpn0.cli
%JBADMIN% %JBDOMAINCST2% --command="undeploy %ear%"
