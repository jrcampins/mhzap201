@echo off
cd /d "%~dp0"

setlocal
call variables
set log="%~dpn0.log"
set>%log%

set folder="%~dp0"

:ask4nn
set /p nn="nn [%nn%] "
if not defined nn goto ask4nn

echo %ProgramFiles%\ABF\Tools\FileDate\FileDate %folder%\*.* %mm%/%dd%/%aaaa% %hh24%-%nn%-00
pause

del %log%
echo %ProgramFiles%\ABF\Tools\FileDate\FileDate %folder%\*.* %mm%/%dd%/%aaaa% %hh24%-%nn%-00>>%log%
     %ProgramFiles%\ABF\Tools\FileDate\FileDate %folder%\*.* %mm%/%dd%/%aaaa% %hh24%-%nn%-00>>%log%

pause
del %log%
exit
