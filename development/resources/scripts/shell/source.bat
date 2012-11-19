@echo off
call:set-source-dir
pause
goto:eof

:set-source-dir
set SOURCEDIR=
pushd "%~dp0"
call:set-source-dir-loop
popd
set SOURCEDIR
goto:eof

:set-source-dir-loop
set currdir=%CD%
set currdir
if exist .svn\nul (
    set SOURCEDIR=%currdir%
    goto:eof
)
cd ..
if "%currdir%" == "%CD%" (
    set SOURCEDIR=%currdir%mhzap201\source
    goto:eof
)
call:set-source-dir-loop
goto:eof
