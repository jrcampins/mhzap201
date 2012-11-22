pushd "%~dp0"
call:set-home-dir-loop
popd
set MHZAP201_HOME
set xs=%MHZAP201_HOME%\variables.bat
if exist %xs% call %xs%
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
set currdir=%CD%
if "%currdir%" == "%~d0\" (
    set MHZAP201_HOME=%~d0\mhzap201
    goto:eof
)
call:set-home-dir-loop
goto:eof
