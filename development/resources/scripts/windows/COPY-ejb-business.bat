@echo off
cd /d "%~dp0"
call variables

set   APPLID=mhzap201-ejb-business
set   SOURCE=W:\workspace\%APPLID%
set   TARGET=%sourcedir%\%APPLID%
set   APPLID
set   SOURCE
set   TARGET
pause
if exist "%SOURCE%\." xcopy "%SOURCE%\*.*" "%TARGET%" /S /exclude:%~dpn0.txt
