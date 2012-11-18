set NOPAUSE=true
cd /d %JBOSS_HOME%
rem del standalone\log\*.log /q
rem rd C:\jboss\standalone\tmp /s /q
bin\standalone.bat -c standalone-full.xml
