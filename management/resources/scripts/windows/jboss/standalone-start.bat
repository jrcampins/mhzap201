@echo off
cd /d "%~dp0"

echo "%~n0" inicia la ejecucion del servidor de aplicaciones en modo standalone
call ..\setsiono ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof

set MHZAP201
set logging=false
set NOPAUSE=true
cd /d %JBOSS_HOME%
echo %JBOSS_HOME%\bin\standalone -c standalone-full.xml
bin\standalone -c standalone-full.xml
