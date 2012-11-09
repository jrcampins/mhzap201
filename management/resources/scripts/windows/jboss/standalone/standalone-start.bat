set JAVA_HOME=C:\Archivos de programa\Java\jdk1.7.0_05
set JBOSS_HOME=C:\jboss
set logging=on
set NOPAUSE=true
cd /d %JBOSS_HOME%
.\bin\standalone -c standalone-full.xml
