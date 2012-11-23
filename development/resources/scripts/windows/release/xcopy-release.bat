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
set MHZAP201_SOURCE
goto:eof

:set-source-dir-loop
if exist .svn\nul (
    set MHZAP201_SOURCE=%CD%
    goto:eof
)
cd ..
if "%CD%" == "%~d0\" (
    set MHZAP201_SOURCE=%~d0\mhzap201\source
    goto:eof
)
call:set-source-dir-loop
goto:eof
