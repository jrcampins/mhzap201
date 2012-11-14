@echo off
cd /d "%~dp0"

call:xc reports
call:xc reports\subreports
call:xc reports\web

pause
goto:eof

:xc
set SOURCE=templates\resources
set SOURCE
set TARGET=%1\resources
set TARGET
echo.
if not exist %TARGET%\nul md %TARGET%
copy %SOURCE% %TARGET%
echo.
goto:eof
