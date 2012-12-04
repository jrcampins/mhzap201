@echo off
cd /d "%~dp0"

setlocal
set variables=
call variables
if not defined variables goto:eof

echo "%~n0" anula el despliegue de los drivers JDBC
call "%~dp0..\setsiono" ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof

call %JBOSS_HOME%\bin\jboss-cli --file=%~dpn0.cli
call "%~dp0..\eoj" "%~f0"
