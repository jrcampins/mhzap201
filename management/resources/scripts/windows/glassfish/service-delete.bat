@echo off
cd /d "%~dp0"
echo "%~n0" elimina el servicio para iniciar y detener la ejecucion del servidor de aplicaciones
call ..\setsiono ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof
call variables "%~f0"
if not defined variables goto EOJ
set win32sc1="C:\windows\system32\sc.exe"
set service1=appserv-service-%domain%
echo delete %service1%
%win32sc1% delete %service1%

:EOJ
call ..\eoj "%~f0"
goto.eof
