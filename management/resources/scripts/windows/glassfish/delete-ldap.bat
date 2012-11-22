@echo off
cd /d "%~dp0"
echo "%~n0" elimina el dominio de seguridad LDAP
call ..\setsiono ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof
set variables=
call variables
if not defined variables goto:eof
echo.
set REALMID="%PROJKEY%-ldap-realm"
set REALMID
echo.
echo %ASADMIN% %GFDOMAINCST2% delete-auth-realm %REALMID%
call %ASADMIN% %GFDOMAINCST2% delete-auth-realm %REALMID%
echo.
call ..\eoj "%~f0"
