@echo off
cd /d "%~dp0"
echo "%~n0" elimina el dominio de seguridad, los conjuntos de conexiones y demas recursos JDBC del servidor de aplicaciones
call ..\setsiono ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof
call variables "%~f0" 
if not defined variables goto EOJ
echo.
set JDBC
echo.
set REALMID="%PROJKEY%-jdbc-realm"
set REALMID
echo.
echo %ASADMIN% %GFDOMAINCST2% delete-auth-realm %REALMID%
call %ASADMIN% %GFDOMAINCST2% delete-auth-realm %REALMID%
echo.
set RESOURCEID="jdbc/%PROJKEY%"
set RESOURCEID
echo.
echo %ASADMIN% %GFDOMAINCST2% delete-jdbc-resource %RESOURCEID%
call %ASADMIN% %GFDOMAINCST2% delete-jdbc-resource %RESOURCEID%
echo.
set POOLID="%PROJKEY%-pool"
set POOLID
echo.
echo %ASADMIN% %GFDOMAINCST2% delete-jdbc-connection-pool %POOLID%
call %ASADMIN% %GFDOMAINCST2% delete-jdbc-connection-pool %POOLID%
echo.

:EOJ
call ..\eoj "%~f0"
goto.eof
