@echo off
cd /d "%~dp0"

setlocal
set variables=
call variables
if not defined variables goto:eof

echo "%~n0" elimina las fabricas de conexiones, conjuntos de conexiones y demas recursos JMS del servidor de aplicaciones
call "%~dp0..\setsiono" ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof

set S1=MessageFactoryPool
set S2=MessageFactory
set S3=MessageQueue
for /f "tokens=1*" %%t in (jms-connection) do call:delete-jms-connection %%t
echo.
call "%~dp0..\eoj" "%~f0"
goto:eof

:delete-jms-connection
echo.
set P1=%1
set P1
for /f "tokens=1*" %%t in (jms-destination) do call:delete-jms-destination %%t
echo.
echo %ASADMIN% %ascst2% delete-connector-resource "jms/%P1%%S2%"
call %ASADMIN% %ascst2% delete-connector-resource "jms/%P1%%S2%"
echo.
echo %ASADMIN% %ascst2% delete-connector-connection-pool "jms/%P1%%S1%"
call %ASADMIN% %ascst2% delete-connector-connection-pool "jms/%P1%%S1%"
goto:eof

:delete-jms-destination
echo.
set Q1=%1
set Q1
echo.
echo %ASADMIN% %ascst2% delete-admin-object "jms/%P1%%Q1%%S3%"
call %ASADMIN% %ascst2% delete-admin-object "jms/%P1%%Q1%%S3%"
goto:eof
