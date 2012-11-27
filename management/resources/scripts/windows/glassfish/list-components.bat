@echo off
cd /d "%~dp0"

set variables=
call variables
if not defined variables goto:eof

echo "%~n0" produce una lista de los componentes implementados en el servidor de aplicaciones
call "%~dp0..\setsiono" ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof

echo.
echo %ASADMIN% %GFDOMAINCST2% list-components
echo.
call %ASADMIN% %GFDOMAINCST2% list-components
echo.

echo.
echo %ASADMIN% %GFDOMAINCST2% list-jndi-entries
echo.
call %ASADMIN% %GFDOMAINCST2% list-jndi-entries

echo.
call %ASADMIN% %GFDOMAINCST2% list-jndi-entries --context ejb
echo.
call %ASADMIN% %GFDOMAINCST2% list-jndi-entries --context jdbc
echo.
call %ASADMIN% %GFDOMAINCST2% list-jndi-entries --context jms

call "%~dp0..\eoj" "%~f0"
goto:eof

echo.
call %ASADMIN% %GFDOMAINCST2% list-jndi-entries
echo.
call %ASADMIN% %GFDOMAINCST2% list-jndi-entries server
echo.
call %ASADMIN% %GFDOMAINCST2% list-jndi-entries domain
