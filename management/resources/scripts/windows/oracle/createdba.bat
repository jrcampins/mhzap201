@echo off
cd /d "%~dp0"

setlocal
set variables=
call variables
if not defined variables goto:eof

echo "%~n0" crea el propietario de la aplicacion en la base de datos
call "%~dp0..\setsiono" ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof

set /p REPLY="password de SYS: "
if "%REPLY%" == "" goto:eof

set ORAUSER=SYS
set ORAROLE=SYSDBA
set ORAPASSWORD=%REPLY%
set sql="%~dpn0.sql"
if exist %sql% del %sql%
echo create user %dbuser% identified by %dbpass%;>>%sql%
echo grant connect, DBA to %dbuser%;>>%sql%
echo grant execute on sys.utl_file to %dbuser%;>>%sql%

call sqlplus %sql%
del %sql%
