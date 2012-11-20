@echo off
cd /d "%~dp0"
call variables

set   APPLID=management
set   SOURCE=W:\workspace\%APPLID%
set   TARGET=%MHZAP201_SOURCE%\%APPLID%

set   APPLID
set   SOURCE
set   TARGET

pause

if    exist "%SOURCE%\." xcopy "%SOURCE%\*.*" "%TARGET%" /S /exclude:%~dpn0.txt

:DONE
REM pause
