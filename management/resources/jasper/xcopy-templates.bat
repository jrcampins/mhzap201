@echo off
cd /d "%~dp0"

set SOURCE=%CD%
set TARGET=W:\workspace\jasper
set SOURCE
set TARGET
pause

if exist %TARGET% rmdir %TARGET% /s
dir %TARGET%
pause

call:xc1 .         *.*
pause
goto:eof

call:xc1 .         xcopy-resources.*
call:xc1 reports   *.jrtx
call:xc1 reports   *.jpg
call:xc1 templates *.*
pause
goto:eof

:xc1
set p1=%SOURCE%\%1\%2
set p2=%TARGET%\%1
if /i "%1" == "." set p1=%SOURCE%\%2
if /i "%1" == "." set p2=%TARGET%
call:xc2 %p1% %p2% %p3%
goto:eof

:xc2
echo xcopy "%1" "%2" /i /s /exclude:%~dpn0.txt
call xcopy "%1" "%2" /i /s /exclude:%~dpn0.txt
echo.
goto:eof
