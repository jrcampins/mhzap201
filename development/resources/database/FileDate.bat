@echo off
cd /d "%~dp0"

set log="%~dpn0.log"
call variables-date-time
set>%log%

set folder="%~dp0"

:ask4nn
set /p nn="nn [%nn%] "
if not defined nn goto ask4nn

echo C:\Setup\abfTools\FileDate\FileDate %folder%\*.* %mm%/%dd%/%aaaa% %hh24%-%nn%-00
pause

del %log%
echo C:\Setup\abfTools\FileDate\FileDate %folder%\*.* %mm%/%dd%/%aaaa% %hh24%-%nn%-00>>%log%
     C:\Setup\abfTools\FileDate\FileDate %folder%\*.* %mm%/%dd%/%aaaa% %hh24%-%nn%-00>>%log%

pause
del %log%
exit
