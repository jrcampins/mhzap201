@echo off
cd /d "%~dp0"
echo "%~n0" produce una lista de los componentes implementados en el servidor de aplicaciones
call ..\setsiono ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto.eof
call variables "%~f0" 
if not defined variables goto :EOJ

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

goto :EOJ

echo.
call %ASADMIN% %GFDOMAINCST2% list-jndi-entries
echo.
call %ASADMIN% %GFDOMAINCST2% list-jndi-entries server
echo.
call %ASADMIN% %GFDOMAINCST2% list-jndi-entries domain

:EOJ
call ..\eoj "%~f0"
goto.eof
