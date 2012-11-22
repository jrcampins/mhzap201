@echo off
cd /d "%~dp0"

echo "%~n0" inicia la ejecucion del servidor de aplicaciones en modo standalone
call ..\setsiono ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof

set variables=
call variables
if not defined variables goto:eof

set NOPAUSE=true
cd /d %JBOSS_HOME%
set cli=bin\standalone -c standalone-full.xml %offset%
echo %CD%\%cli%
%cli%
pause
