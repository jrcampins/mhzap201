@echo off
cd /d "%~dp0"
call variables

set target=%MHZAP201_SOURCE%\management

set source=%~dp0scripts
set source
set target
echo.
rem xcopy "%source%\*.password" "%target%"
xcopy "%source%\asadmin.password" "%target%"
echo.

set source=%~dp0scripts\linux
set source
set target
echo.
xcopy "%source%\*.sh"   "%target%"
echo.

set source=%~dp0scripts\windows
set source
set target
echo.
xcopy "%source%\*.bat"  "%target%"
echo.

set siono=S
set /p siono="eliminar variables-j2ee ? (Si/No) [%siono%] "
if /i "%siono%" == "S" (
    del "%target%\variables-j2ee.*"
    echo.
)

dir /a:-d/o:n %target%
echo.
pause
