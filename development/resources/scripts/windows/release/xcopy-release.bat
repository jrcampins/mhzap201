@echo off
cd /d "%~dp0"
call:set-source-dir

set SOURCE=%MHZAP201_SOURCE%\development\resources\scripts\windows\release
set TARGET="%~dp0%"

xcopy %SOURCE%\*.bat %TARGET% /exclude:%SOURCE%\%~n0.txt

pause
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
