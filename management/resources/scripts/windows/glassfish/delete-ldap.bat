@echo off
cd /d "%~dp0"
echo "%~n0" elimina el dominio de seguridad LDAP
call ..\setsiono ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof
call variables "%~f0" 
if not defined variables goto EOJ
echo.
set REALMID="%PROJKEY%-ldap-realm"
set REALMID
echo.
echo %ASADMIN% %GFDOMAINCST2% delete-auth-realm %REALMID%
call %ASADMIN% %GFDOMAINCST2% delete-auth-realm %REALMID%
echo.

:EOJ
call ..\eoj "%~f0"
goto.eof