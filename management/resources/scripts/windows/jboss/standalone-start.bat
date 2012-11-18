@echo off
cd /d "%~dp0"

echo "%~n0" inicia la ejecucion del servidor de aplicaciones en modo standalone
call ..\setsiono ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof

set NOPAUSE=true
cd /d %JBOSS_HOME%
rem %JBOSS_HOME%\bin\standalone --server-config standalone-full.xml --properties=standalone-full.properties -Djboss.socket.binding.port-offset=0
bin\standalone -c standalone-full.xml
