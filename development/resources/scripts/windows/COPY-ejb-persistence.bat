@echo off
cd /d "%~dp0"
call variables

set   applid=%lower_case_project%-ejb-persistence
set   source=%~d0\workspace\%applid%
set   target=%project_source_dir%\%applid%

set   applid
set   source
set   target

echo.
pause
echo.

echo xcopy "%source%\*.*" "%target%" /s
if exist "%source%" xcopy "%source%\*.*" "%target%" /s
