@echo off
cd /d "%~dp0"
set xs="%CD%\resources\scripts\windows\variables-home.bat"
cd ..
echo set MHZAP201_HOME=%CD%>>%xs%
type %xs%
pause