@echo off
cd /d "%~dp0"
echo "%~n0" inicia la ejecucion del servidor de aplicaciones
call ..\setsiono ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof
call variables "%~f0"
set xs="%HOMEDIR%\variables-j2ee.bat"
if not defined variables goto :EOJ
if exist %xs% call %xs%
call %ASADMIN% %GFDOMAINCST2% start-domain %GFDOMAINNAME%
echo.
echo %ASADMIN% %GFDOMAINCST2% list-components
call %ASADMIN% %GFDOMAINCST2% list-components
echo.

:EOJ
call ..\eoj "%~f0"
goto.eof
