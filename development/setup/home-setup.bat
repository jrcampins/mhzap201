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
call:make-subdir "%~d0\%project%\eclipse\%project%\dist"
call:make-subdir "%~d0\%project%\netbeans\%project%\dist"
call:make-subdir "%home%\dist"
pushd %subdir%
call:link "%~d0\%project%\eclipse\%project%\dist"   jboss
call:link "%~d0\%project%\netbeans\%project%\dist"  glassfish
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
