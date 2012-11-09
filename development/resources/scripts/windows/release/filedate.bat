@echo off
cd /d "%~dp0"
call variables-date-time
set folder=V10R%aa%%mm%%dd%
if not exist "%folder%" exit
echo C:\Setup\abfTools\FileDate\FileDate %folder%\*.* %mm%/%dd%/%aaaa% %hh24%-00-00 /r
call C:\Setup\abfTools\FileDate\FileDate %folder%\*.* %mm%/%dd%/%aaaa% %hh24%-00-00 /r
pause
