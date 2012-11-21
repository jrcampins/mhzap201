@echo off
cd /d "%~dp0"
set xs="%CD%\resources\scripts\windows\setup\setup.bat"
if exist %xs% call %xs% upgrade
