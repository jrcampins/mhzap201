call:set-source-dir
pushd %MHZAP201_SOURCE%\management\resources\scripts\windows\postgresql
call variables
popd
if not defined variables goto:eof
call ..\variables "%~f1"
goto:eof

:set-source-dir
pushd "%~dp0"
call:set-source-dir-loop
popd
set MHZAP201_SOURCE
goto:eof

:set-source-dir-loop
if exist .svn\nul (
    set MHZAP201_SOURCE=%CD%
    goto:eof
)
cd ..
if "%CD%" == "%~d0\" (
    set MHZAP201_SOURCE=%~d0\mhzap201\source
    goto:eof
)
call:set-source-dir-loop
goto:eof
