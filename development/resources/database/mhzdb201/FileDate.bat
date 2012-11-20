@echo off
cd /d "%~dp0"

set log="%~dpn0.log"
call variables-date-time
set>%log%

set folder=%~n1
if exist "%folder%" goto PDQ2

:PDQ1
set folder=%aaaammdd%
if not exist "%folder%" goto PDQ4

:ask4nn
set /p nn="nn [%nn%] "
if not defined nn goto ask4nn

:PDQ2
echo "%ProgramFiles%\ABF\Tools\FileDate\FileDate" %folder%\*.* %mm%/%dd%/%aaaa% %hh24%-%nn%-00 /r
pause

:PDQ3
del %log%
echo "%ProgramFiles%\ABF\Tools\FileDate\FileDate" %folder%\*.* %mm%/%dd%/%aaaa% %hh24%-%nn%-00 /r>>%log%
     "%ProgramFiles%\ABF\Tools\FileDate\FileDate" %folder%\*.* %mm%/%dd%/%aaaa% %hh24%-%nn%-00 /r>>%log%

:PDQ4
pause
exit
