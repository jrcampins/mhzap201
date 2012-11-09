@echo off
cd /d "%~dp0"

set SOURCE=W:\third-party\lib\eclipselink\2.3.2
set TARGET=N:\glassfish\glassfish\modules

xcopy %SOURCE%\*.jar %TARGET%

del %TARGET%\org.eclipse.persistence.jpa.jpql.jar

pause
goto:eof

