@echo off
cd /d "%~dp0"
call variables
call variables-date-time
set nn=00
set filedate="%ProgramFiles%\ABF\Tools\FileDate\FileDate.exe"
set source=%~dp0scripts
set management=%project_source_dir%\management
%filedate% "%source%\*.*"       %mm%/%dd%/%aaaa% %hh24%-%nn%-00 /r
echo.
%filedate% "%management%\HOME"  %mm%/%dd%/%aaaa% %hh24%-%nn%-00
echo.
call:xcopy-to-management
call:xcopy-to-management-setup-scripts
pause
goto:eof
dir /a:-d/o:n   %management%
echo.
rem dir /a:-d/o:n/s %management%\setup\scripts\*.password
echo.
dir /a:-d/o:n/s %management%\setup\scripts\variables*.*
echo.
pause
goto:eof

:xcopy-to-management
set source=%~dp0scripts
set target=%management%
xcopy "%source%\*.*" "%target%" /exclude:%~dpn0-exclude-mgmt.txt
echo.
set source=%~dp0scripts\linux
set target=%management%
xcopy "%source%\*.*" "%target%" /exclude:%~dpn0-exclude-mgmt.txt /y
echo.
set source=%~dp0scripts\windows
set target=%management%
xcopy "%source%\*.*" "%target%" /exclude:%~dpn0-exclude-mgmt.txt /y
echo.
goto:eof

:xcopy-to-management-setup-scripts
set source=%~dp0scripts
set target=%management%\setup\scripts
xcopy "%source%\*.*" "%target%" /exclude:%~dpn0-exclude-setup.txt
echo.
set source=%~dp0scripts\linux
set target=%management%\setup\scripts\linux
xcopy "%source%\*.*" "%target%" /exclude:%~dpn0-exclude-setup.txt /y
echo.
set source=%~dp0scripts\windows
set target=%management%\setup\scripts\windows
xcopy "%source%\*.*" "%target%" /exclude:%~dpn0-exclude-setup.txt /y
echo.
goto:eof
