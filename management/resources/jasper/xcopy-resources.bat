@echo off
cd /d "%~dp0"

call:xc1 %~dp0reports
call:xc1 %~dp0reports\subreports
call:xc1 %~dp0reports\web
call:xc1 N:\glassfish\glassfish\domains\domain1
call:xc1 N:\glassfish\glassfish\domains\domain1\config

pause
goto:eof

:xc1
set SOURCE=%~dp0templates
set TARGET=%1
set SOURCE
set TARGET
echo.
pause

call:xc3
goto:eof

call:xc2 jrtx
call:xc2 jpg
goto:eof

:xc2
echo xcopy "%SOURCE%\*.%1" "%TARGET%" /i /s /exclude:%~dpn0.txt
call xcopy "%SOURCE%\*.%1" "%TARGET%" /i /s /exclude:%~dpn0.txt
echo.
goto:eof

:xc3
if not exist "%TARGET%\resources\nul" md "%TARGET%\resources"
copy "%SOURCE%\resources" "%TARGET%\resources"
goto:eof
