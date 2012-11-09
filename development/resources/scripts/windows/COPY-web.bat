@echo off
set root1=W:\workspace
set root2=%MHZAP201_VSWS%
for /D %%d in (%root1%\mhzap201-web-*) do call:copy-web-project %%d
pause
goto:eof

:copy-web-project
set dp1=%~f1
call set dp2=%%dp1:%root1%=%root2%%%
set dp1
set dp2
if not exist %dp1% goto noSource
if not exist %dp2% call:noTarget
set siono=N
set /p siono="REMOVE %dp2% (S/N) [N] "
if /i "%siono%" == "S" call:removeTarget
call:xcopySourceToTarget
goto:eof
echo.

:removeTarget
echo removing %dp2%
if exist %dp2% rmdir %dp2% /s
goto:eof

:xcopySourceToTarget
echo copying from %dp1% to %dp2%
xcopy %dp1%\*.* %dp2% /i /s /y /exclude:%~dpn0.txt
goto:eof

:noSource
echo %dp1% does not exist
goto:eof

:noTarget
echo %dp2% does not exist
goto:eof
