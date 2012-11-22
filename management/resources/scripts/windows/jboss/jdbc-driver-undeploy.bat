@echo off
cd /d "%~dp0"

set variables=
call variables
if not defined variables goto:eof

echo "%~n0" undeploys jdbc drivers
call ..\setsiono ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof

call %JBOSS_HOME%\bin\jboss-cli --file=%~dpn0.cli
call ..\eoj "%~f0"
