@echo off
cd /d "%~dp0"

setlocal
set variables=
call variables
if not defined variables goto:eof

echo "%~n0" crea el servicio para iniciar y detener la ejecucion del servidor de aplicaciones
call "%~dp0..\setsiono" ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof

set win32sc1="%SystemRoot%\system32\sc.exe"
set appserv1="%GLASSFISH_HOME%\lib\appservService.exe"
set asadmin1=\\\"%~dp0service-start.bat\\\"
set asadmin2=\\\"%~dp0service-stop.bat\\\"
set binPath1="%appserv1% \"%asadmin1%\" \"%asadmin2%\""
set service1=appserv-service-%domain%
set display1="/appserv/service/%domain%"
echo create %service1% binPath= %binPath1% start= auto DisplayName= %display1%
%win32sc1% create %service1% binPath= %binPath1% start= auto DisplayName= %display1%
call "%~dp0..\eoj" "%~f0"
