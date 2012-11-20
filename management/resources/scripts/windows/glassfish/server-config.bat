@echo off
cd /d "%~dp0"
echo "%~n0" establece parametros de configuracion del servidor de aplicaciones
call ..\setsiono ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof
call variables "%~f0" 
if not defined variables goto EOJ
rem .
rem  %ASADMIN% %GFDOMAINCST2% set server-config.security-service.default-principal=principal
rem  %ASADMIN% %GFDOMAINCST2% set server-config.security-service.default-principal=principal
rem .
rem  %ASADMIN% %GFDOMAINCST2% set server-config.security-service.default-principal-password=password
rem  %ASADMIN% %GFDOMAINCST2% set server-config.security-service.default-principal-password=password
rem .
rem  %ASADMIN% %GFDOMAINCST2% set server-config.security-service.mapped-principal-class=CustomPrincipalImplClass
rem  %ASADMIN% %GFDOMAINCST2% set server-config.security-service.mapped-principal-class=CustomPrincipalImplClass
echo.
echo %ASADMIN% %GFDOMAINCST2% set server-config.security-service.activate-default-principal-to-role-mapping=false
call %ASADMIN% %GFDOMAINCST2% set server-config.security-service.activate-default-principal-to-role-mapping=false
echo.
echo %ASADMIN% %GFDOMAINCST2% set server-config.http-service.virtual-server.server.property.sso-enabled="true"
call %ASADMIN% %GFDOMAINCST2% set server-config.http-service.virtual-server.server.property.sso-enabled="true"
echo.
echo %ASADMIN% %GFDOMAINCST2% set server-config.http-service.virtual-server.server.property.sso-max-inactive-seconds="300"
call %ASADMIN% %GFDOMAINCST2% set server-config.http-service.virtual-server.server.property.sso-max-inactive-seconds="300"
echo.
echo %ASADMIN% %GFDOMAINCST2% set server-config.http-service.virtual-server.server.property.sso-reap-interval-seconds="60"
call %ASADMIN% %GFDOMAINCST2% set server-config.http-service.virtual-server.server.property.sso-reap-interval-seconds="60"
echo.

:EOJ
call ..\eoj "%~f0"
goto:eof
