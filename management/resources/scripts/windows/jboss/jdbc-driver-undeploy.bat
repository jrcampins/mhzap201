@echo off
cd /d "%~dp0"

echo "%~n0" undeploys jdbc drivers
call ..\setsiono ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof

call variables "%~f0" 
if not defined variables goto:eof

rem set xs="%HOMEDIR%\variables-j2ee.bat"
rem if exist %xs% call %xs%

set NOPAUSE=true
call %JBOSS_HOME%\bin\jboss-cli --file=%~dpn0.cli
call ..\eoj "%~f0"
