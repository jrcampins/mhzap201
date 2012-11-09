@echo off
cd /d "%~dp0"

set SOURCE=W:\third-party\lib\eclipselink\2.4.0
set TARGET=N:\glassfish\glassfish\modules
xcopy %SOURCE%\*.jar %TARGET%
pause
goto:eof

