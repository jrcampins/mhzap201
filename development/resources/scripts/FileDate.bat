@echo off
cd /d "%~dp0"

setlocal
call variables
set log="%~dpn0.log"
set>%log%

set folder=%aaaammdd%
if not exist "%~f1" goto PDQ2

set folder=%~n1
if "%folder:~0,2%" == "20" goto PDQ1
echo %folder% is not a valid directory name
goto PDQ4

:PDQ1
set dd=%folder:~-2%
set mm=%folder:~4,2%
set aaaa=%folder:~0,4%
set pregunta="hora? [%hh24%] "
set /p hh24=%pregunta%

:PDQ2
set nn=00
echo %ProgramFiles%\ABF\Tools\FileDate\FileDate %folder%\*.* %mm%/%dd%/%aaaa% %hh24%-%nn%-00 /r
pause

:PDQ3
del %log%
echo %ProgramFiles%\ABF\Tools\FileDate\FileDate %folder%\*.* %mm%/%dd%/%aaaa% %hh24%-%nn%-00 /r>>%log%
     %ProgramFiles%\ABF\Tools\FileDate\FileDate %folder%\*.* %mm%/%dd%/%aaaa% %hh24%-%nn%-00 /r>>%log%

:PDQ4
pause
exit
