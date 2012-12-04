@echo off
cd /d "%~dp0"

setlocal
set variables=
call variables
if not defined variables goto:eof

echo "%~n0" anula el despliegue de la aplicacion de empresa
call "%~dp0..\setsiono" ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof

set ear=%lower_case_project%.ear
set cli=%JBOSS_HOME%\bin\jboss-cli %ascst2% --command="undeploy %ear%"
echo %cli%
%cli%
pause
