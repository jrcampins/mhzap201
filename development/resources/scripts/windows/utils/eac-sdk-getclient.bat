@echo on
set ASADMIN=N:\glassfish\bin\asadmin.bat
set APPNAME=mhzap201-sdk
set DIRPATH=W:\utils\mhzap201
call %ASADMIN% get-client-stubs --appname %APPNAME% %DIRPATH%
pause
exit
