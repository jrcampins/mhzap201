@echo off

set   APPLID=management
set   SOURCE=W:\workspace\%APPLID%
set   TARGET=%MHZAP201_VSWS%\%APPLID%

set   APPLID
set   SOURCE
set   TARGET

pause

if    exist "%SOURCE%\." xcopy "%SOURCE%\*.*" "%TARGET%" /S /exclude:%~dpn0.txt

:DONE
REM pause
