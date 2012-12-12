@echo off
cd /d "%~dp0"

setlocal
set variables=
call variables
if not defined variables goto:eof

echo "%~n0" crea el propietario de la aplicacion en la base de datos
call "%~dp0..\setsiono" ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof

if defined SYS_PASSWORD goto got-system-password
set SYS_PASSWORD=%DBMS%
set /p SYS_PASSWORD="password de SYS: "
if "%SYS_PASSWORD%" == "" goto:eof

:got-system-password
set ORAUSER=SYS
set ORAROLE=SYSDBA
set ORAPASSWORD=%SYS_PASSWORD%

set sql="%~dpnx0.sql"
if exist %sql% del %sql%
echo create user %dbuser% identified by %dbpass%;>>%sql%
echo create or replace directory %dbuser%DIR as '%SQLBACKDIR%';>>%sql%
echo grant connect, DBA to %dbuser%;>>%sql%
echo grant execute on SYS.UTL_FILE to %dbuser%;>>%sql%
echo grant read, write on directory %dbuser%DIR to %dbuser%;>>%sql%

call sqlplus %sql%
del %sql%
