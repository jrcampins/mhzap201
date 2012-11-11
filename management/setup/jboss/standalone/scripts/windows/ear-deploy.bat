set ear=%MHZAP201_HOME%\VnnRaammdd\mhzap201.ear
cd /d %JBOSS_HOME%
.\bin\jboss-cli --connect --command="deploy %ear%"
