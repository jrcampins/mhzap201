@echo off
set MHZAP201_JNDI_EJB_PERSISTENCE_PATTERN=java:global/mhzap201-sdk/mhzap201-ejb-persistence/{0}
set MHZAP201_VELOCITY_PROPERTIES=%MHZAP201_HOME%\resources\velocity\sdk-velocity.properties
set MHZAP201_WEB_TEMPLATE_PROJECT_NAME=mhzap201-web-template
set MHZAP201_WEB_TEMPLATE_PROJECT_ROOT=%MHZAP201_VSWS%
set MHZAP201_WORKSPACE=W:\workspace
%MHZAP201_HOME%\resources\scripts\windows\glassfish\domain-start
