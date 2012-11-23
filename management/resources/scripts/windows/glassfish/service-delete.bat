@echo off
cd /d "%~dp0"

set variables=
call variables
if not defined variables goto:eof

echo "%~n0" elimina el servicio para iniciar y detener la ejecucion del servidor de aplicaciones
call "%~dp0..\setsiono.bat" ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof

set win32sc1="%SystemRoot%\system32\sc.exe"
set service1=appserv-service-%domain%
echo delete %service1%
%win32sc1% delete %service1%
call "%~dp0..\eoj.bat" "%~f0"
