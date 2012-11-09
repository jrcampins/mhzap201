@echo off
cd /d "%~dp0"
echo "%~n0" inicia la ejecucion del servidor de aplicaciones en modo standalone
call ..\setsiono ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto EOJ
call variables "%~f0" 
if not defined variables goto EOJ
set xs="%HOMEDIR%\variables-j2ee.bat"
if exist %xs% call %xs%
call ..\setsiono eliminar los logs?
if /i "%siono%" NEQ "S" goto RUN
del %JBOSS_HOME%\standalone\log\*.log /q
:RUN
set logging=false
set NOPAUSE=true
pushd %JBOSS_HOME%
echo  %JBOSS_HOME%\bin\standalone -c standalone-full.xml
call  %JBOSS_HOME%\bin\standalone -c standalone-full.xml
popd
:EOJ
goto:eof
