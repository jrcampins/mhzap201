@echo off
cd /d "%~dp0"

setlocal
set variables=
call variables
if not defined variables goto:eof

echo "%~n0" inicia la ejecucion del servidor de aplicaciones
call "%~dp0..\setsiono" ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof

echo %ASADMIN% %ascst1% start-domain %domain%
call %ASADMIN% %ascst1% start-domain %domain%
echo.
echo %ASADMIN% %ascst2% list-components
call %ASADMIN% %ascst2% list-components
echo.
call "%~dp0..\eoj" "%~f0"
