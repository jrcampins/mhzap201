@echo off
call:set-root-dir
pause
goto:eof

:set-root-dir
set ROOTDIR=
pushd "%~dp0"
call:set-root-dir-loop
popd
set ROOTDIR
goto:eof

:set-root-dir-loop
set currdir=%CD%
set currdir
if exist root (
    if not exist root\nul (
        set ROOTDIR=%currdir%
        goto:eof
    )
)
cd ..
if "%currdir%" == "%CD%" (
    set ROOTDIR=%currdir%mhzap201\root
    goto:eof
)
call:set-root-dir-loop
goto:eof
