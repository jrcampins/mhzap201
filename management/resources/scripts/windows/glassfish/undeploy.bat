@echo off
cd /d "%~dp0"

set variables=
call variables
if not defined variables goto:eof

echo "%~n0" anula la implementacion de la aplicacion de empresa del servidor de aplicaciones
call ..\setsiono ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof

echo.
echo %ASADMIN% %GFDOMAINCST2% undeploy %PROJKEY%
call %ASADMIN% %GFDOMAINCST2% undeploy %PROJKEY%
echo.
echo %ASADMIN% %GFDOMAINCST2% list-components
call %ASADMIN% %GFDOMAINCST2% list-components
echo.
call ..\eoj "%~f0"
