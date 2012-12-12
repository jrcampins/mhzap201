@echo off
cd /d "%~dp0"

setlocal
set variables=
call variables
if not defined variables goto:eof

echo "%~n0" elimina el propietario de la aplicacion y todos sus objetos en la base de datos
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
echo drop user %dbuser% cascade;>>%sql%
echo drop directory %UPPER_CASE_PROJECT%_ARCHIVES;>>%sql%
echo drop directory %UPPER_CASE_PROJECT%_ATTACHMENTS;>>%sql%
echo drop directory %UPPER_CASE_PROJECT%_SPOOL;>>%sql%

call sqlplus %sql%
del %sql%
