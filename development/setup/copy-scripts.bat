@echo off
cd /d "%~dp0"
call variables
set nn=00
echo %mm%/%dd%/%aaaa% %hh24%-%nn%-00
echo.
set filedate="%ProgramFiles%\ABF\Tools\FileDate\FileDate.exe"
set source=%~dp0scripts
set management=%project_source_dir%\management
call %filedate% "%source%\*.*" %mm%/%dd%/%aaaa% %hh24%-%nn%-00 /r
echo.
call %filedate% "%management%\HOME" %mm%/%dd%/%aaaa% %hh24%-%nn%-00
echo.
call:xcopy-to-management
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
dir /a:-d/o:n %management%
echo.
goto:eof
