@echo off
cd /d "%~dp0"

set variables=
call variables
if not defined variables goto:eof

echo "%~n0" inicia la ejecucion del servidor de aplicaciones en modo debug
call "%~dp0..\setsiono.bat" ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof

call %ASADMIN% %GFDOMAINCST2% start-domain --debug %GFDOMAINNAME%
echo.
echo %ASADMIN% %GFDOMAINCST2% list-components
call %ASADMIN% %GFDOMAINCST2% list-components
echo.
call "%~dp0..\eoj.bat" "%~f0"
