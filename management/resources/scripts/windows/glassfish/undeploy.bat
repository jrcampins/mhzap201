@echo off
cd /d "%~dp0"

setlocal
set variables=
call variables
if not defined variables goto:eof

echo "%~n0" anula la implementacion de la aplicacion de empresa del servidor de aplicaciones
call "%~dp0..\setsiono" ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof

echo.
echo %ASADMIN% %ascst2% undeploy %lower_case_project%
call %ASADMIN% %ascst2% undeploy %lower_case_project%
echo.
echo %ASADMIN% %ascst2% list-components
call %ASADMIN% %ascst2% list-components
echo.
call "%~dp0..\eoj" "%~f0"
