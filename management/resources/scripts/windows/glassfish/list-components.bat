@echo off
cd /d "%~dp0"
echo "%~n0" produce una lista de los componentes implementados en el servidor de aplicaciones
call ..\setsiono ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof
set variables=
call variables
if not defined variables goto:eof

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

call ..\eoj "%~f0"
goto:eof

echo.
call %ASADMIN% %GFDOMAINCST2% list-jndi-entries
echo.
call %ASADMIN% %GFDOMAINCST2% list-jndi-entries server
echo.
call %ASADMIN% %GFDOMAINCST2% list-jndi-entries domain
