@echo off
cd /d "%~dp0"

setlocal
call:xc reports
call:xc reports\subreports
call:xc reports\web

pause
goto:eof

:xc
set source=templates\resources
set source
set target=%1\resources
set target
echo.
if not exist %target% md %target%
copy %source% %target%
echo.
goto:eof
