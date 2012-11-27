echo.
if defined first_bat (
    if /i %first_bat% == "%~f1" (
        pause
    )
) else (
    pause
)
