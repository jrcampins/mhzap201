@echo off
cd /d "%~dp0"

set variables=
call variables
if not defined variables goto:eof

echo "%~n0" detiene la ejecucion del servidor de aplicaciones
call ..\setsiono ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof

call %ASADMIN% %GFDOMAINCST2% stop-domain %GFDOMAINNAME%
call ..\eoj "%~f0"
