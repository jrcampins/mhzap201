set project=mhzap201
set project_source_dir=%~d0\%project%\source
set project
echo.
call "%project_source_dir%\management\resources\scripts\windows\postgresql\variables.bat"
echo.
if defined variables call "%~dp0..\variables.bat" "%~f1"
