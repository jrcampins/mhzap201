@echo off
cd /d "%~dp0"
call variables

set   APPLID=mhzap201
set   SOURCE=W:\workspace\%APPLID%
set   TARGET=%MHZAP201_SOURCE%\%APPLID%

set   APPLID
set   SOURCE
set   TARGET
pause

if exist "%SOURCE%" xcopy "%SOURCE%\*.*" "%TARGET%" /S

REM pause
