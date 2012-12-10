@echo off
cd /d "%~dp0"
call variables
set home=%project_source_dir%\management
call copy-scripts
echo.
set junction="%ProgramFiles%\Sysinternals\Junction\junction.exe"
set junction
if not exist %junction% goto:eof
echo.
call:make-subdir "%home%\dist"
pushd %subdir%
call:link "%~d0\%project%\eclipse\%project%\dist"   jboss
call:link "%~d0\%project%\source\%project%\dist"    glassfish
popd
echo.
call %home%\check-variables
goto:eof

:make-subdir
set subdir="%~f1"
if not exist %subdir% (echo md %subdir% & md %subdir% & echo.)
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
