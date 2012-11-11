set logging=true
set NOPAUSE=true
cd /d %JBOSS_HOME%
del standalone\log\*.log /q
bin\standalone.bat -c standalone-full.xml
