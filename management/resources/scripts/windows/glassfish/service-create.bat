@echo off
cd /d "%~dp0"
echo "%~n0" crea el servicio para iniciar y detener la ejecucion del servidor de aplicaciones
call ..\setsiono ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof
call variables "%~f0"
if not defined variables goto EOJ
set win32sc1="C:\windows\system32\sc.exe"
set appserv1="%GLASSFISH_HOME%\lib\appservService.exe"
set asadmin1=\\\"%~dp0service-start.bat\\\"
set asadmin2=\\\"%~dp0service-stop.bat\\\"
set binPath1="%appserv1% \"%asadmin1%\" \"%asadmin2%\""
set service1=appserv-service-%domain%
set display1="/appserv/service/%domain%"
echo create %service1% binPath= %binPath1% start= auto DisplayName= %display1%
%win32sc1% create %service1% binPath= %binPath1% start= auto DisplayName= %display1%

:EOJ
call ..\eoj "%~f0"
goto.eof