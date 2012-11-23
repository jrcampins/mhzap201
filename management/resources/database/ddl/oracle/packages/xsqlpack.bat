@echo off
cd /d "%~dp0"
call:set-home-dir-loop
cd /d "%~dp0"
echo %homedir%
set xsqlbat=%homedir%\resources\scripts\windows\oracle\%~nx0
echo %xsqlbat%
"%xsqlbat%"
pause
goto:eof

:set-home-dir-loop
if exist HOME (
    if not exist HOME\nul (
        set homedir=%CD%
        goto:eof
    )
)
cd ..
if "%CD%" == "%~d0\" (
    set homedir=%~d0\mhzap201\source\management
    goto:eof
)
call:set-home-dir-loop
goto:eof
