set ear=W:\mhzap201\source\mhzap201\dist\mhzap201.ear
set JAVA_HOME=C:\Archivos de programa\Java\jdk1.7.0_05
set JBOSS_HOME=C:\jboss
cd /d %JBOSS_HOME%
.\bin\jboss-cli --connect --command="deploy %ear%"
