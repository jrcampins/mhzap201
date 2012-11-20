@echo off
cd /d "%~dp0"
call variables
if not defined variables goto:eof

echo "%~n0" detiene la ejecucion del servidor de aplicaciones en modo standalone
call ..\setsiono ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof

set cli=%JBOSS_HOME%\bin\jboss-cli %jbcst2% command=:shutdown
echo %cli%
%cli%
pause
