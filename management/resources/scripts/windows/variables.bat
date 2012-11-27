@echo off
set homedir=
pushd "%~dp0"
call:set-home-dir-loop
popd
rem echo HOME=%homedir%
set xs=%homedir%\variables.bat
if exist "%xs%" call "%xs%"
goto:eof

:set-home-dir-loop
if exist HOME (
    set homedir=%CD%
    for /D %%d in ("%CD%\HOME\..\*") do if /i "%%~nxd" == "HOME" set homedir=
)
if defined homedir goto:eof
cd ..
if "%CD%" == "%~d0\" (
    for /F "delims=*" %%s in ("%HOMEDRIVE%%HOMEPATH%") do set homedir=%%~ss
    goto:eof
)
call:set-home-dir-loop
goto:eof
