@echo off
cd /d "%~dp0"

set target=%cd%
call set source=%%target:oracle=postgresql%%
set source
REM call set target=%%target:functions=triggers%%
set target
pause

for /D %%d in (%source%\*.*) do (
    call:makedir %%d
)

pause
goto:eof

:makedir
set olddir=%1
call set newdir=%%olddir:%source%=%target%%%
if exist %newdir%\nul (
    echo  %newdir%
) else (
    mkdir %newdir%
)
echo.
goto:eof
