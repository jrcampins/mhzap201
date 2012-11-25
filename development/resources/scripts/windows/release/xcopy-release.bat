@echo off
set source=%~dp0
set source
set target=%CD%\
set target
if /i %source% == %target% (
    echo ***
    echo *** source=target
    echo ***
    pause
    goto:eof
)
echo.
echo xcopy "%source%*.*" "%target%"
echo.
pause
echo.
call xcopy "%source%*.*" "%target%" /y /exclude:%source%%~n0.txt
echo.
pause
