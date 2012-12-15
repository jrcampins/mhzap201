@echo off
cd /d "%~dp0"
call variables

set   applid=%lower_case_project%-lib-base
set   source=%~d0\%lower_case_project%\ws-glassfish\%applid%
set   target=%project_source_dir%\%applid%

set   applid
set   source
set   target

echo.
pause
echo.

echo xcopy "%source%\*.*" "%target%" /s
if exist "%source%" xcopy "%source%\*.*" "%target%" /s
