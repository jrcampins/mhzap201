@echo off
cd /d "%~dp0"
call variables
set junction="%ProgramFiles%\Sysinternals\Junction\junction.exe"
set junction
if not exist %junction% goto:eof
echo.
call:link "%SystemDrive%\NetBeans\NB72\glassfish" "%SystemDrive%\glassfish"
call:link "%SystemDrive%\jboss-as-7.1.1.Final"    "%SystemDrive%\jboss"
pause
goto:eof

:link
set folder="%~f1"
set symlnk="%~f2"
if exist %symlnk% (
    echo %junction% %symlnk% %folder%
    echo ***
    echo *** %symlnk% ya existe
    echo ***
    echo.
    echo %junction% -d %symlnk%
    call %junction% -d %symlnk%
    echo.
)
if not exist %symlnk% (
    echo %junction% %symlnk% %folder%
    call %junction% %symlnk% %folder%
    echo.
)
goto:eof
