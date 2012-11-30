@echo off
cd /d "%~dp0"

setlocal
set variables=
call variables
if not defined variables goto:eof

echo "%~n0" establece parametros de configuracion del servidor de aplicaciones
call "%~dp0..\setsiono" ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof

rem .
rem  %ASADMIN% %ascst2% set server-config.security-service.default-principal=principal
rem  %ASADMIN% %ascst2% set server-config.security-service.default-principal=principal
rem .
rem  %ASADMIN% %ascst2% set server-config.security-service.default-principal-password=password
rem  %ASADMIN% %ascst2% set server-config.security-service.default-principal-password=password
rem .
rem  %ASADMIN% %ascst2% set server-config.security-service.mapped-principal-class=CustomPrincipalImplClass
rem  %ASADMIN% %ascst2% set server-config.security-service.mapped-principal-class=CustomPrincipalImplClass
echo.
echo %ASADMIN% %ascst2% set server-config.security-service.activate-default-principal-to-role-mapping=false
call %ASADMIN% %ascst2% set server-config.security-service.activate-default-principal-to-role-mapping=false
echo.
echo %ASADMIN% %ascst2% set server-config.http-service.virtual-server.server.property.sso-enabled="true"
call %ASADMIN% %ascst2% set server-config.http-service.virtual-server.server.property.sso-enabled="true"
echo.
echo %ASADMIN% %ascst2% set server-config.http-service.virtual-server.server.property.sso-max-inactive-seconds="300"
call %ASADMIN% %ascst2% set server-config.http-service.virtual-server.server.property.sso-max-inactive-seconds="300"
echo.
echo %ASADMIN% %ascst2% set server-config.http-service.virtual-server.server.property.sso-reap-interval-seconds="60"
call %ASADMIN% %ascst2% set server-config.http-service.virtual-server.server.property.sso-reap-interval-seconds="60"
echo.
call "%~dp0..\eoj" "%~f0"
