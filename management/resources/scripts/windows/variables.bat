pushd "%~dp0"
call:set-home-dir-loop
popd
echo HOME=%homedir%
set xs=%homedir%\variables.bat
if exist "%xs%" call "%xs%"
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
    for /F "delims=*" %%s in ("%HOMEDRIVE%%HOMEPATH%") do set homedir=%%~ss
    goto:eof
)
call:set-home-dir-loop
goto:eof
