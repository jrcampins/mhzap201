set ear=mhzap201.ear
cd /d %JBOSS_HOME%
.\bin\jboss-cli --connect --command="undeploy %ear%"
