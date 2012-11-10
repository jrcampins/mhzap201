@echo off
set JNDI_WEB_FACADE_LOCATOR=java:global/mhzap201-sdk/mhzap201-ejb-persistence/{0}
%MHZAP201_HOME%\resources\scripts\windows\glassfish\domain-start
