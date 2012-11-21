@echo off
cd /d "%~dp0"

call variables
set MHZAP201
pause
if not exist "%MHZAP201_SOURCE%" goto:eof
echo.

set junction="%ProgramFiles%\Sysinternals\Junction\junction.exe"
set junction
pause
if not exist %junction% goto:eof
echo.

call:link "N:\glassfish"            "%SystemDrive%\glassfish"
call:link "C:\jboss-as-7.1.1.Final" "%SystemDrive%\jboss"

pause
goto:eof

:link
set folder="%~f1"
set symlnk="%~f2"
if exist %symlnk% (
    rem echo %junction% -d %symlnk%
    rem call %junction% -d %symlnk%
    rem echo.
    echo %junction% %symlnk% %folder%
    echo ***
    echo *** %symlnk% ya existe
    echo ***
    echo.
)
if not exist %symlnk% (
    echo %junction% %symlnk% %folder%
    call %junction% %symlnk% %folder%
    echo.
)
goto:eof
