@echo off
set   APPLID=mhzap201-ejb-business
set   SOURCE=W:\workspace\%APPLID%
set   TARGET=%MHZAP201_SOURCE%\%APPLID%
set   APPLID
set   SOURCE
set   TARGET
pause
if exist "%SOURCE%\." xcopy "%SOURCE%\*.*" "%TARGET%" /S /exclude:%~dpn0.txt
