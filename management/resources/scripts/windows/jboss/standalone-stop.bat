@echo off
cd /d "%~dp0"

setlocal
set variables=
call variables
if not defined variables goto:eof

echo "%~n0" detiene la ejecucion del servidor de aplicaciones
call "%~dp0..\setsiono" ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof

set cli=%JBOSS_HOME%\bin\jboss-cli %ascst2% command=:shutdown
echo %cli%
%cli%
pause
