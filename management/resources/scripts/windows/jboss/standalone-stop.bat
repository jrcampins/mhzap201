@echo off
cd /d "%~dp0"

echo "%~n0" detiene la ejecucion del servidor de aplicaciones en modo standalone
call ..\setsiono ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof

call variables "%~f0" 
if not defined variables goto EOJ

set NOPAUSE=
echo %JBADMIN% %JBDOMAINCST2% command=:shutdown
%JBADMIN% %JBDOMAINCST2% command=:shutdown
