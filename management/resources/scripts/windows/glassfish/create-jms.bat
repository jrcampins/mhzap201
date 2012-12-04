@echo off
cd /d "%~dp0"

setlocal
set variables=
call variables
if not defined variables goto:eof

echo "%~n0" crea las fabricas de conexiones, conjuntos de conexiones y demas recursos JMS
call "%~dp0..\setsiono" ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof

set RA="jmsra"
set CC="javax.jms.QueueConnectionFactory"
set AO="javax.jms.Queue"
set S1=MessageFactoryPool
set S2=MessageFactory
set S3=MessageQueue
for /f "tokens=1*" %%t in (jms-connection) do call:create-jms-connection %%t
echo.
call "%~dp0..\eoj" "%~f0"
goto:eof

:create-jms-connection
echo.
set P1=%1
set P1
echo.
echo.
echo %ASADMIN% %ascst2% create-connector-connection-pool --raname %RA% --connectiondefinition %CC% "jms/%P1%%S1%"
call %ASADMIN% %ascst2% create-connector-connection-pool --raname %RA% --connectiondefinition %CC% "jms/%P1%%S1%"
echo.
echo.
echo %ASADMIN% %ascst2% create-connector-resource --poolname "jms/%P1%%S1%" "jms/%P1%%S2%"
call %ASADMIN% %ascst2% create-connector-resource --poolname "jms/%P1%%S1%" "jms/%P1%%S2%"
for /f "tokens=1*" %%t in (jms-destination) do call:create-jms-destination %%t
goto:eof

:create-jms-destination
echo.
set Q1=%1
set Q1
echo.
echo.
echo %ASADMIN% %ascst2% create-admin-object --restype %AO% --raname %RA% --property Name="%P1%%Q1%%S3%" "jms/%P1%%Q1%%S3%"
call %ASADMIN% %ascst2% create-admin-object --restype %AO% --raname %RA% --property Name="%P1%%Q1%%S3%" "jms/%P1%%Q1%%S3%"
goto:eof
