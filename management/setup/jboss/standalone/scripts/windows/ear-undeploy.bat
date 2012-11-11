set ear=mhzap201.ear
cd /d %JBOSS_HOME%
bin\jboss-cli.bat --connect --command="undeploy %ear%"
