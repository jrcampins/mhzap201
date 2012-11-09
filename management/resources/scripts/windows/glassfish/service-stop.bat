@echo off
cd /d "%~dp0"
echo "%~n0" detiene la ejecucion del servidor de aplicaciones
call variables "%~f0"
if not defined variables goto:eof
call %ASADMIN% stop-domain %GFDOMAINNAME%
