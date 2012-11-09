@echo on
set APPCLIENT=N:\glassfish\bin\appclient.bat
set CLIENT=W:\utils\mhzap201\mhzap201-sdkClient.jar
set MAINCLASS=com.egt.eac.toolkit.ToolKit
call %APPCLIENT% -client %CLIENT% -mainclass %MAINCLASS%
pause
exit
