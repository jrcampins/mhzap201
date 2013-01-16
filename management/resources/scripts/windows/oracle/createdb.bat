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
echo create or replace directory %UPPER_CASE_PROJECT%_ARCHIVES as '%SQLBACKDIR%';>>%sql%
echo create or replace directory %UPPER_CASE_PROJECT%_ATTACHMENTS as '%WEBATTCHDIR%';>>%sql%
echo create or replace directory %UPPER_CASE_PROJECT%_DATOS as '%WEBATTCHDIR%\archivo_datos_ext';>>%sql%
echo create or replace directory %UPPER_CASE_PROJECT%_SPOOL as '%WEBSPOOLDIR%';>>%sql%
echo grant connect, DBA to %dbuser%;>>%sql%
echo grant create any table to %dbuser%;>>%sql%
echo grant execute on SYS.UTL_FILE to %dbuser%;>>%sql%
echo grant execute on SYS.UTL_HTTP to %dbuser%;>>%sql%
echo grant read, write on directory %UPPER_CASE_PROJECT%_ARCHIVES to %dbuser%;>>%sql%
echo grant read, write on directory %UPPER_CASE_PROJECT%_ATTACHMENTS to %dbuser%;>>%sql%
echo grant read, write on directory %UPPER_CASE_PROJECT%_DATOS to %dbuser%;>>%sql%
echo grant read, write on directory %UPPER_CASE_PROJECT%_SPOOL to %dbuser%;>>%sql%
echo begin>>%sql%
echo     dbms_network_acl_admin.create_acl(>>%sql%
echo         acl =^> 'Resolve_Access.xml',>>%sql%
echo         description =^> 'Resolve Network Access using UTL_INADDR',>>%sql%
echo         principal =^> '%dbuser%',>>%sql%
echo         is_grant =^> TRUE,>>%sql%
echo         privilege =^> 'connect',>>%sql%
echo         start_date =^> null,>>%sql%
echo         end_date =^> null>^>%sql%>>%sql%
echo         );>>%sql%
echo     dbms_network_acl_admin.assign_acl(>>%sql%
echo         acl =^> 'Resolve_Access.xml',>>%sql%
echo         host =^> '*',>>%sql%
echo         lower_port =^> null,>>%sql%
echo         upper_port =^> null>^>%sql%>>%sql%
echo         );>>%sql%
echo end;>>%sql%
echo />>%sql%

call sqlplus %sql%
del %sql%
