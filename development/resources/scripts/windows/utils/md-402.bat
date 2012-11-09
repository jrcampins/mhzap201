cd /d %TARGET%
if exist "%~n1" goto SKIP
md "%~n1"
cd /d "%~n1"
echo copy "%~f1"
echo.
:SKIP
echo.
