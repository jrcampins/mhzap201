@echo off
call:set-home-dir
pause
goto:eof

:set-home-dir
set HOMEDIR=
pushd "%~dp0"
call:set-home-dir-loop
popd
set HOMEDIR
goto:eof

:set-home-dir-loop
set currdir=%CD%
set currdir
if exist home (
    if not exist home\nul (
        set HOMEDIR=%currdir%
        goto:eof
    )
)
cd ..
if "%currdir%" == "%CD%" (
    set HOMEDIR=%currdir%mhzap201\home
    goto:eof
)
call:set-home-dir-loop
goto:eof
