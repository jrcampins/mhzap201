@echo off
cd /d "%~dp0"

if not defined MHZAP201_VSWS exit

set SOURCE=%MHZAP201_VSWS%\development\resources\scripts\windows\release
set TARGET="%~dp0%"

xcopy %SOURCE%\*.bat %TARGET% /exclude:%SOURCE%\%~n0.txt

pause
exit
