@echo off
cd /d "%~dp0"
set wd=%CD%
set xs="%wd%\resources\scripts\windows\setup\setup.bat"
if exist "%xs%" call %xs% %wd% install
