@echo off
cd /d "%~dp0"

echo "%~n0" deploys application ear
call ..\setsiono ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto EOJ

REM call variables "%~f0" 
REM if not defined variables goto EOJ

REM set xs="%HOMEDIR%\variables-j2ee.bat"
REM if exist %xs% call %xs%

set NOPAUSE=true
call %JBOSS_HOME%\bin\jboss-cli --file=%~dpn0.cli

:EOJ
call ..\eoj "%~f0"
goto:eof
