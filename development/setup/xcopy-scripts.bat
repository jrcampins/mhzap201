@echo off
cd /d "%~dp0"
call variables

set source=%project_source_dir%\management\setup\scripts
set source
set target=%project_source_dir%\management
set target
echo.
xcopy "%source%\*.*" "%target%" /exclude:%~dpn0-exclude.txt /y
echo.
pause
echo.

set source=%project_source_dir%\management\setup\scripts\linux
set source
set target=%project_source_dir%\management
set target
echo.
xcopy "%source%\*.*" "%target%" /exclude:%~dpn0-exclude.txt /y
echo.
pause
echo.

set source=%project_source_dir%\management\setup\scripts\windows
set source
set target=%project_source_dir%\management
set target
echo.
xcopy "%source%\*.*" "%target%" /exclude:%~dpn0-exclude.txt /y
echo.
pause
echo.

set filedate="%ProgramFiles%\ABF\Tools\FileDate\FileDate.exe"
if not exist %filedate% set filedate=
set filedate
echo.
if not defined filedate (pause & goto:eof)
set target=%project_source_dir%\management
%filedate% "%target%\*" %mm%/%dd%/%aaaa% %hh24%-00-00
echo.
dir /a:-d/o:n "%target%"
echo.
pause
echo.
goto:eof
