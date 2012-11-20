@echo off
cd /d "%~dp0"

echo "%~n0" undeploys jdbc drivers
call ..\setsiono ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto EOJ

call variables "%~f0" 
if not defined variables goto EOJ

rem set xs="%HOMEDIR%\variables-j2ee.bat"
rem if exist %xs% call %xs%

set NOPAUSE=true
call %JBOSS_HOME%\bin\jboss-cli --file=%~dpn0.cli

:EOJ
call ..\eoj "%~f0"
goto:eof
