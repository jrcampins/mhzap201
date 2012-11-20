@echo off
cd /d "%~dp0"
call variables
if not defined variables goto:eof

set cli=%JBOSS_HOME%\bin\jboss-cli %jbcst2% command=:shutdown
echo %cli%
%cli%
pause
