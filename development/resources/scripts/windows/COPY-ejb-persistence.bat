@echo off

set   APPLID=mhzap201-ejb-persistence
set   SOURCE=W:\workspace\%APPLID%
set   TARGET=%MHZAP201_VSWS%\%APPLID%

set   APPLID
set   SOURCE
set   TARGET

pause

if    exist "%SOURCE%\." xcopy "%SOURCE%\*.*" "%TARGET%" /S

:DONE
REM pause