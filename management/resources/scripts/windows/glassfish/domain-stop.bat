@echo off
cd /d "%~dp0"
echo "%~n0" detiene la ejecucion del servidor de aplicaciones
call ..\setsiono ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof
call variables "%~f0" 
if not defined variables goto :EOJ
call %ASADMIN% %GFDOMAINCST2% stop-domain %GFDOMAINNAME%

:EOJ
call ..\eoj "%~f0"
goto.eof
