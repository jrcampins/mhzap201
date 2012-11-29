@echo off
cd /d "%~dp0"

setlocal
set variables=
call variables
if not defined variables goto:eof

if defined ask_before_starting (
    echo "%~n0" inicia la ejecucion del servidor de aplicaciones en modo standalone
    call "%~dp0..\setsiono" ejecutar "%~n0"
    if /i not "%siono%" == "S" goto:eof
)

set NOPAUSE=true
cd /d %JBOSS_HOME%
set cli=bin\standalone -c standalone-full.xml %offset%
echo %CD%\%cli%
%cli%
pause
