set JAVA_HOME=%ProgramFiles%\Java\jdk1.7.0_05
set JBOSS_HOME=%SystemDrive%\jboss
cd /d %JBOSS_HOME%
bin\jboss-cli --connect --command="/system-property=eclipselink.archive.factory:remove"
