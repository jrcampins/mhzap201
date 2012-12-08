rem ----------------------------------------------------------------------------
rem Variables del Entorno de desarrollo
rem ----------------------------------------------------------------------------
call:set-project-source-dir
set DISTDIR=%project_source_dir%\%lower_case_project%\dist
if defined on_info_messages echo [Informacion] DISTDIR=%DISTDIR%
goto:eof

:set-project-source-dir
set project_source_dir=
pushd "%~dp0"
call:set-project-source-dir-loop
popd
goto:eof

:set-project-source-dir-loop
if exist .metadata set project_source_dir=%CD%
if defined project_source_dir goto:eof
cd ..
if "%CD%" == "%~d0\" (
    set project_source_dir=%~d0\%lower_case_project%\source
    goto:eof
)
call:set-project-source-dir-loop
goto:eof
