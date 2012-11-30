@echo off
cd /d "%~dp0"

setlocal
set variables=
call variables
if not defined variables goto:eof

echo "%~n0" crea el dominio de seguridad LDAP
call "%~dp0..\setsiono" ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof

set CLASS=com.sun.enterprise.security.auth.realm.ldap.LDAPRealm
set P1=jaas-context="ldapRealm"
set P2=directory="ldap\://localhost\:3268"
set P3=base-dn="DC\=egt,DC\=com,DC\=ve"
set P4=assign-groups="%lower_case_project%"
set P5=search-filter="(\&(objectClass\=user)(sAMAccountName\=%%%%s))"
set P6=search-bind-password="password"
set P7=group-search-filter="(\&(objectClass\=group)(member\=%%%%d))"
set P8=search-bind-dn="EGT\\%lower_case_project%"
set PX=%P1%:%P2%:%P3%:%P4%:%P5%:%P6%:%P7%:%P8%
echo.
set REALMID="%lower_case_project%-ldap-realm"
set REALMID
echo.
echo %ASADMIN% %ascst2% create-auth-realm --classname %CLASS% --property %PX% %REALMID%
call %ASADMIN% %ascst2% create-auth-realm --classname %CLASS% --property %PX% %REALMID%
echo.
call "%~dp0..\eoj" "%~f0"
