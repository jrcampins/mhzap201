@echo off
cd /d "%~dp0"

echo "%~n0" detiene la ejecucion del servidor de aplicaciones en modo standalone
call ..\setsiono ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof

set NOPAUSE=true
%JBOSS_HOME%\bin\jboss-cli --connect command=:shutdown
