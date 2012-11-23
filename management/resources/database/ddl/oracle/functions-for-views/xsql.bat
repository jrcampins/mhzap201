@echo off
pushd "%~dp0"
call:set-home-dir-loop
popd
echo MHZAP201_HOME=%homedir%
set xsqlbat="%homedir%\resources\scripts\windows\oracle\%~nx0"
set xsqlbat
%xsqlbat% %*
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
    set homedir=%~d0\mhzap201
    goto:eof
)
call:set-home-dir-loop
goto:eof
