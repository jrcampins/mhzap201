call:set-source-dir
pushd %MHZAP201_SOURCE%\management\resources\scripts\windows\sqlserver
call variables
popd
goto:eof

:set-source-dir
pushd "%~dp0"
call:set-source-dir-loop
popd
goto:eof

:set-source-dir-loop
set currdir=%CD%
if exist .svn\nul (
    set MHZAP201_SOURCE=%currdir%
    goto:eof
)
cd ..
if "%currdir%" == "%CD%" (
    set MHZAP201_SOURCE=%currdir%mhzap201\source
    goto:eof
)
call:set-source-dir-loop
goto:eof
