set PSQL=
if "%~f1" == "" goto:eof
rem if defined NOPAUSE goto:eof
if defined MAINBAT (
    set str=%MAINBAT%
    rem remove double quotes from str
    for /f "useback tokens=*" %%a in ('%str%') do set str=%%~a
    if "%str%" NEQ "%~f1" goto:eof
)
echo.
pause
