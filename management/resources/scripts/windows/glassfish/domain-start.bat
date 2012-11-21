@echo off
cd /d "%~dp0"
echo "%~n0" inicia la ejecucion del servidor de aplicaciones
call ..\setsiono ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof
call variables "%~f0"
rem set xs="%HOMEDIR%\variables-j2ee.bat"
rem if not defined variables goto:eof
if exist %xs% call %xs%
call %ASADMIN% %GFDOMAINCST2% start-domain %GFDOMAINNAME%
echo.
echo %ASADMIN% %GFDOMAINCST2% list-components
call %ASADMIN% %GFDOMAINCST2% list-components
echo.
call ..\eoj "%~f0"
