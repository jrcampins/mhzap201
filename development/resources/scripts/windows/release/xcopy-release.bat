@echo off
cd /d "%~dp0"
set project=mhzap201
set project_source_dir=%~d0\%project%\source
set project
echo.
set source=%project_source_dir%\development\resources\scripts\windows\release
set target="%~dp0%"
xcopy "%source%\*.bat" %target% /exclude:%source%\%~n0.txt
pause
