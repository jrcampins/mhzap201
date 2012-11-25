@echo off
cd /d "%~dp0"

set variables=
call variables
if not defined variables goto:eof

echo "%~n0" elimina el dominio de seguridad, los conjuntos de conexiones y demas recursos JDBC del servidor de aplicaciones
call "%~dp0..\setsiono.bat" ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof

echo.
set JDBC
echo.
set REALMID="%lower_case_project%-jdbc-realm"
set REALMID
echo.
echo %ASADMIN% %GFDOMAINCST2% delete-auth-realm %REALMID%
call %ASADMIN% %GFDOMAINCST2% delete-auth-realm %REALMID%
echo.
set RESOURCEID="jdbc/%lower_case_project%"
set RESOURCEID
echo.
echo %ASADMIN% %GFDOMAINCST2% delete-jdbc-resource %RESOURCEID%
call %ASADMIN% %GFDOMAINCST2% delete-jdbc-resource %RESOURCEID%
echo.
set POOLID="%lower_case_project%-pool"
set POOLID
echo.
echo %ASADMIN% %GFDOMAINCST2% delete-jdbc-connection-pool %POOLID%
call %ASADMIN% %GFDOMAINCST2% delete-jdbc-connection-pool %POOLID%
echo.
call "%~dp0..\eoj.bat" "%~f0"
