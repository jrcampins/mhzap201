@echo off
cd /d "%~dp0"
call variables
if not defined variables goto:eof

set NOPAUSE=true
cd /d %JBOSS_HOME%
set cli=bin\standalone -c standalone-full.xml %offset%
echo %CD%\%cli%
%cli%
pause
