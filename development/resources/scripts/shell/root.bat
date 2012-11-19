@echo off
call:set-root
pause
goto:eof

:set-root
pushd "%~dp0"
call:set-root-loop
popd
goto:eof

:set-root-loop
set root=%CD%
set root
if exist root goto:eof
cd ..
if "%root%" == "%CD%" goto:eof
call:set-root-loop
goto:eof
