@echo off
cd /d "%~dp0"
call:set-home-dir
echo "%MHZAP201_HOME%\resources\scripts\windows\oracle\xsqlpack.bat"
"%MHZAP201_HOME%\resources\scripts\windows\oracle\xsqlpack.bat" %*
pause
goto:eof

:set-home-dir
pushd "%~dp0"
call:set-home-dir-loop
popd
goto:eof

:set-home-dir-loop
set currdir=%CD%
if exist HOME (
    if not exist HOME\nul (
        set MHZAP201_HOME=%currdir%
        goto:eof
    )
)
cd ..
if "%currdir%" == "%CD%" (
    set MHZAP201_HOME=%currdir%mhzap201\home
    goto:eof
)
call:set-home-dir-loop
goto:eof
