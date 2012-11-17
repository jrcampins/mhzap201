@echo off
cd /d "%~dp0"

echo "%~n0" undeploys application ear
call ..\setsiono ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof

set NOPAUSE=true
%JBOSS_HOME%\bin\jboss-cli --file=%~dpn0.cli
