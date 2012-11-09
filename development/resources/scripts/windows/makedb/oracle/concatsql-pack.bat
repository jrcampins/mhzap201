if not defined variables goto:eof
set s1=%~s1
if not defined s1 (
     echo %~n0 necesita un directorio empaquetable como primer argumento 
     goto:eof
)
if not exist %s1%\package.sql (
     echo %1 no es un directorio empaquetable
     goto:eof
)
set package=%~n1
set packdir=%~f1
pushd %packdir%
cd ..
set sql="%CD%\%package%.sql"
if exist %sql% del %sql%
popd
echo +pack: %1
call:type-package-heading
for /R "%packdir%" %%f in (*.sql) do (
    if /i "%%~nf" == "package" (
        call:type-package-spec-heading
        call:type-file "%%f"
        call:type-package-spec-footing
        call:type-package-body-heading
    ) else (
        call:type-file "%%f"
    )
)
call:type-package-body-footing
call:type-package-footing
goto:eof

:type-file
set filepath=%~f1
call set filename=%%filepath:%packdir%=%package%%%
echo -->>%sql%
echo -- %filename%>>%sql%
echo -->>%sql%
type "%~f1" >> %sql%
echo.>>%sql%
goto:eof

:type-package-heading
echo -->>%sql%
echo -- package %packdir%>>%sql%
echo -->>%sql%
echo.>>%sql%
goto:eof

:type-package-footing
goto:eof

:type-package-spec-heading
echo -->>%sql%
echo -- package specification>>%sql%
echo -->>%sql%
echo create or replace package %package% as>>%sql%
goto:eof

:type-package-spec-footing
echo end;>>%sql%
echo />>%sql%
echo show errors>>%sql%
echo.>>%sql%
goto:eof

:type-package-body-heading
echo -->>%sql%
echo -- package body>>%sql%
echo -->>%sql%
echo create or replace package body %package% as>>%sql%
goto:eof

:type-package-body-footing
echo end;>>%sql%
echo />>%sql%
echo show errors>>%sql%
goto:eof
