@echo off
cd /d "%~dp0"

setlocal
set variables=
call variables
if not defined variables goto:eof

echo "%~n0" reconstruye las tablas "plus" correspondientes a cada tabla "arbol"
call "%~dp0..\setsiono" ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof

call psql "%SQLSCRXDIR%\%~n0.psql"
