set sourcedir=%~d0\mhzap201\source
call "%sourcedir%\management\resources\scripts\windows\sqlserver\variables.bat"
echo.
if defined variables call "%~dp0..\variables.bat" "%~f1"
