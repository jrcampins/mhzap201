@echo off
cd /d "%~dp0"

echo "%~n0" implementa la aplicacion de empresa en el servidor de aplicaciones
call ..\setsiono ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof

set variables=
call variables
if not defined variables goto:eof

if not defined MHZAP201_DIST set MHZAP201_DIST=%CRVLDIR%
set ear=%MHZAP201_DIST%\mhzap201.ear
set cli=%JBOSS_HOME%\bin\jboss-cli %jbcst2% --command="deploy %ear%"
echo %cli%
%cli%
pause
