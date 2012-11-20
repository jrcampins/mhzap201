@echo off
cd /d "%~dp0"
echo "%~n0" crea las fabricas de conexiones, conjuntos de conexiones y demas recursos JMS del servidor de aplicaciones
call ..\setsiono ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof
call variables "%~f0" 
if not defined variables goto EOJ
set RA="jmsra"
set CC="javax.jms.QueueConnectionFactory"
set AO="javax.jms.Queue"
set S1=MessageFactoryPool
set S2=MessageFactory
set S3=MessageQueue
for /f "tokens=1*" %%t in (jms-connection) do call create-jms-connection %%t
echo.

:EOJ
call ..\eoj "%~f0"
goto:eof
