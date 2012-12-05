set project=mhzap201
call:set-project-source-dir
call:set-further-variables
goto:eof

:set-further-variables
set thisdir=%~dp0
set thisdir=%thisdir:~0,-1%
set thatdir=%project_source_dir%\management\resources\scripts\windows\sqlserver
call "%thatdir%\variables"
goto:eof

:set-project-source-dir
set project_source_dir=
pushd "%~dp0"
call:set-project-source-dir-loop
popd
goto:eof

:set-project-source-dir-loop
if exist ROOT (
    set project_source_dir=%CD%
    for /D %%d in ("%CD%\ROOT\..\*") do if /i "%%~nxd" == "ROOT" set project_source_dir=
)
if defined project_source_dir goto:eof
cd ..
if "%CD%" == "%~d0\" (
    set project_source_dir=%~d0\%project%\source
    goto:eof
)
call:set-project-source-dir-loop
goto:eof
