@echo off
cd /d "%~dp0"
echo "%~n0" inicia la ejecucion del servidor de aplicaciones
call variables "%~f0"
if not defined variables goto:eof
rem set xs="%HOMEDIR%\variables-j2ee.bat"
rem if exist %xs% call %xs%
call %ASADMIN% start-domain %GFDOMAINNAME%
