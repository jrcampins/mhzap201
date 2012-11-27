echo.
if not defined first_bat (pause & goto:eof)
if /i %first_bat% == "%~f1" (pause & set first_bat=)
