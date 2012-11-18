@echo off
cd /d "%~dp0"

echo "%~n0" deploys application ear
call ..\setsiono ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof

call variables "%~f0" 
if not defined variables goto EOJ

if not defined MHZAP201_DIST set MHZAP201_DIST=%CRVLDIR%
set ear=%MHZAP201_DIST%\%PROJKEY%.ear

set NOPAUSE=
rem %JBOSS_HOME%\bin\jboss-cli --file=%~dpn0.cli
%JBADMIN% %JBDOMAINCST2% --command="deploy %ear%"
