echo %~f0 %*
set callerdir=%CD%
cd /d "%~dp0"
echo.

call:setdir1 %1
if not defined scripts call:ask4dir %callerdir%
if not defined scripts (
    pause
    goto:eof
)

set SQLDIR=%scripts%
echo "%~n0" ejecuta todos los scripts que se encuentran en %SQLDIR%

cd /d "%~dp0"
set scripts=%CD%

call "%~dp0..\setsiono" ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof

set variables=
call variables
if not defined variables goto:eof

call:init-sqlplus-spool
set SQLPATH=%SQLDIR%
for /R "%SQLDIR%" %%f in (*.sql) do (
    rem  SQLPATH=%%~dpf
    call sqlplus "%%f"
)
call:open-sqlplus-spool
goto:eof

:init-sqlplus-spool
set dir="%~dp0logs"
set log="%~dp0logs\%~nx0.log"
if not defined SQLPLUS_SPOOL (
    set SQLPLUS_SPOOL=%log%
    if exist %log% (del %log%) else (if not exist %dir% md %dir%)
)
echo %~f0 >> %SQLPLUS_SPOOL%
goto:eof

:open-sqlplus-spool
set log="%~dp0logs\%~nx0.log"
if /i %SQLPLUS_SPOOL% == %log% (echo.) else (goto:eof)
set SQLPLUS_SPOOL=
call "%~dp0..\setsiono" desea ver el log de la ejecucion (%log%)
if /i "%siono%" == "S" start /d %SystemRoot% notepad %log%
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
    set dotsql=
    if not exist %%d\package.sql (
        for %%f in (%%d\*.sql) do set dotsql=%%f
    )
    if defined dotsql (
        echo %%d>>%tokens1%
    )
)
if exist %tokens1% sort %tokens1% /o %tokens2%
echo (.) %xsqlrootdir%
if exist %tokens2% for /f "tokens=1*" %%t in (%tokens2%) do call:render1token %%t
echo.
echo (X) Ninguno de los anteriores
echo.
echo.
echo Escriba el numero del directorio de scripts que desea ejecutar o X para salir
echo.
set tokenum=
set chosen1=
set /p chosen1="numero del directorio ? "
if /i "%chosen1%" == "X" (
    call:remove-tokens
    goto:eof
)
if /i "%chosen1%" == "." (
    set scripts=%xsqlrootdir%
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
echo     (%tokenum%) %~n1
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

----------------------------------------------------------------------------------------------------
call:setdir2
if not defined scripts (
    pause
    goto:eof
)
cd /d %scripts%
----------------------------------------------------------------------------------------------------
