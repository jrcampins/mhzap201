set sourcedir=%~d0\mhzap201\source
set sourcedir
echo.
call "%sourcedir%\management\resources\scripts\windows\oracle\variables.bat"
echo.
if defined variables call ..\variables "%~f1"
