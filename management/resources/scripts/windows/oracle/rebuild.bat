@echo off
cd /d "%~dp0"

set variables=
call variables
if not defined variables goto:eof

echo "%~n0" reconstruye las tablas "plus" correspondientes a cada tabla "arbol"
call "%~dp0..\setsiono.bat" ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof

set log="%~dp0logs\%~n0.log"
if defined SQLPLUS_SPOOL (
    set rebuild_log=
) else (
    set rebuild_log=%log%
    set SQLPLUS_SPOOL=%log%
    if exist %log% (del %log%) else (if not exist "%~dp0logs" md "%~dp0logs")
)
echo "%~f0" >> %SQLPLUS_SPOOL%

set SQLPATH=%SQLDDLDIR%
call sqlplus "%~dpn0.sql"

if not defined rebuild_log goto:eof

call "%~dp0..\setsiono" desea ver el log de la ejecucion (%SQLPLUS_SPOOL%)
if /i "%siono%" NEQ "S" goto:eof

start /d %SystemRoot% notepad %SQLPLUS_SPOOL%
rem call "%~dp0..\eoj.bat" "%~f0"
