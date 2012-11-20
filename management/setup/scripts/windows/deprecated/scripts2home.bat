@echo off
cd /d "%~dp0"
set wd=%CD%
set xs="%wd%\resources\scripts\windows\setup\%~n0.bat"
if exist "%xs%" call %xs% %wd% scripts2home
