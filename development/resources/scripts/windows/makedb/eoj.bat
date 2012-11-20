set PSQL=
if "%~f1" == "" goto:eof
if defined NOPAUSE goto:eof
if defined MAINBAT (
    rem remove double quotes from MAINBAT
    set pdq=%MAINBAT:"=%
) else (
    set pdq=%~f1
)
if "%~f1" == "%pdq%" (
    echo.
    pause
    echo.
)
