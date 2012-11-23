@echo off
cd /d "%~dp0"
set sourcedir=%~d0\mhzap201\source
set source=%sourcedir%\development\resources\scripts\windows\release
set target="%~dp0%"
xcopy "%source%\*.bat" %target% /exclude:%source%\%~n0.txt
pause
