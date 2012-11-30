@echo off
cd /d "%~dp0"

setlocal
set variables=
call variables
if not defined variables goto:eof

echo "%~n0" inicia la ejecucion del servidor de aplicaciones en modo debug
call "%~dp0..\setsiono" ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof

echo %ASADMIN% %ascst1% start-domain --debug %domain%
call %ASADMIN% %ascst1% start-domain --debug %domain%
echo.
echo %ASADMIN% %ascst2% list-components
call %ASADMIN% %ascst2% list-components
echo.
call "%~dp0..\eoj" "%~f0"
