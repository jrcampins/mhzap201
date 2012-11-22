@echo off
cd /d "%~dp0"
echo "%~n0" detiene la ejecucion del servidor de aplicaciones
set variables=
call variables
if not defined variables goto:eof
call %ASADMIN% stop-domain %GFDOMAINNAME%
