setlocal
echo %~n0 %*
set callerdir=%CD%
cd /d "%~dp0"
echo.

call:init-log "%~f1" "%~dp0logs\%~nx0.log"
if /i "%~x1" == ".log" shift /1

call:setdir0 %1
if not defined scripts call:ask4dir %callerdir%
if not defined scripts (
    pause
    goto:eof
)

set SQLDIR=%scripts%
echo "%~n0" empaqueta los scripts que se encuentran en %SQLDIR%
call:set-package %SQLDIR%
echo.

pushd %SQLDIR%
cd ..
set sql="%CD%\%package%.sql"
if exist %sql% del %sql%
popd
echo.

call:type-package-heading
for /R "%SQLDIR%" %%f in (*.sql) do (
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

cd /d "%~dp0"
set scripts=%CD%

call "%~dp0..\setsiono" ejecutar %sql%
if /i "%siono%" NEQ "S" goto:eof

set variables=
call variables
if not defined variables goto:eof

call sqlplus %log% %sql%
call:open-log
goto:eof

:init-log
if /i "%~x1" == ".log" (
    set log="%~f1"
    if not exist "%~dp1" md "%~dp1"
) else (
    set log="%~f2"
    if exist "%~f2" (del "%~f2") else (if not exist "%~dp2" md "%~dp2")
)
echo %~f0 >> %log%
goto:eof

:open-log
if /i %log% == "%~dp0logs\%~nx0.log" (echo.) else (goto:eof)
call "%~dp0..\setsiono" desea ver el log de la ejecucion (%log%)
if /i "%siono%" == "S" start /d %SystemRoot% notepad %log%
goto:eof

:set-package
set package=%~n1
goto:eof

:type-file
set filepath=%~f1
call set filename=%%filepath:%SQLDIR%=%package%%%
echo -->>%sql%
echo -- %filename%>>%sql%
echo -->>%sql%
type "%~f1" >> %sql%
echo.>>%sql%
goto:eof

:type-package-heading
echo -->>%sql%
echo -- package %SQLDIR%>>%sql%
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

:setdir0
set scripts=
call:chkdir0 %1
if defined directory (
   set scripts=%directory%
)
goto:eof

:chkdir0
set directory=
set chkdir0p1=%~s1
if defined chkdir0p1 (
   if exist %chkdir0p1%\package.sql (
      set directory=%~f1
      goto:eof
   ) else (
      echo %1 no es un directorio empaquetable
   )
)
goto:eof

:setdir1
set scripts=
call:chkdir1 %1
if defined directory (
   set scripts=%directory%
)
goto:eof

:chkdir1
set directory=
set chkdir1p1=%~s1
if defined chkdir1p1 (
   if exist %chkdir1p1%\nul (
      set directory=%~f1
      goto:eof
   ) else (
      echo %1 no es un directorio
   )
)
goto:eof

:setdir2
set scripts=
set resources=
set setdir2p1=%~s1
if defined setdir2p1 (
   if exist %setdir2p1%\nul (
      if "%~n1" == "resources" (
         set resources=%~f1
         call:setdir1 %~f1\scripts\windows\%dbms%
         goto:eof
      )
   ) else (
      set setdir2p1
   )
)
if defined setdir2p1 (
   cd ..
)
if defined setdir2p1 (
   if "%setdir2p1%" == "%CD%" goto:eof
)
call:setdir2 %CD%
goto:eof

:ask4dir
set xsqlrootdir=%1
set scripts=
set tokenum=
set chosen1=
set tokens1=tokens1
set tokens2=tokens2
if exist %tokens1% del %tokens1% /q
if exist %tokens2% del %tokens2% /q
for /D %%d in (%xsqlrootdir%\*.*) do (
    if exist %%d\package.sql echo %%d>>%tokens1%
)
if exist %tokens1% sort %tokens1% /o %tokens2%
if exist %tokens2% for /f "tokens=1*" %%t in (%tokens2%) do call:render1token %%t
echo.
echo (X) Ninguno de los anteriores
echo.
echo.
echo Escriba el numero del directorio de scripts que desea empaquetar o X para salir
echo.
set tokenum=
set chosen1=
set /p chosen1="numero del directorio ? "
if /i "%chosen1%" == "X" (
    call:remove-tokens
    goto:eof
)
if exist %tokens2% for /f "tokens=1*" %%t in (%tokens2%) do call:select1token %%t %chosen1%
if not defined token goto ask4dir
if not exist %token% goto ask4dir
pushd %token%
set scripts=%CD%
popd
call:remove-tokens
goto:eof

:render1token
if not defined tokenum set /a tokenum=0
set /a tokenum+=1
echo (%tokenum%) %~n1
goto:eof

:select1token
if not defined tokenum set token=
if not defined tokenum set /a tokenum=0
set /a tokenum+=1
if "%tokenum%"=="%2" set token=%1
goto:eof

:remove-tokens
if exist %tokens1% del %tokens1% /q
if exist %tokens2% del %tokens2% /q
echo.
goto:eof
