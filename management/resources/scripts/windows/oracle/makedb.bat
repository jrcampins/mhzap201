@echo off
cd /d "%~dp0"

set variables=
call variables
if not defined variables goto:eof

echo "%~n0" crea los objetos de la base de datos
call "%~dp0..\setsiono" ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof

set SQLPATH=%SQLDDLDIR%
call sqlplus "%~dpn0.sql" %O9DATABASE% O9
call "%~dp0..\eoj" "%~f0"
