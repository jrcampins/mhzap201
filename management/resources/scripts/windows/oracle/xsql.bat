@echo off
setlocal
set f1="%~f1"
if /i "%~x1" == ".log" shift /1

echo.
echo %~n0 %1
echo.

call:setdir1 %1
if not defined scripts call:ask4dir
if not defined scripts (
    pause
    goto:eof
)

set SQLDIR=%scripts%
call:set-package %SQLDIR%

set siono=S
if not defined execute_without_asking (call "%~dp0..\setsiono" ejecutar sqlplus %SQLDIR%\*.sql & echo.)
if /i not "%siono%" == "S" goto:eof

set variables=
call "%~dp0variables"
if not defined variables goto:eof

call:init-log %f1%
set SQLPATH=
for /R "%SQLDIR%" %%f in (*.sql) do (
    call "%~dp0sqlplus" %log% "%%f"
)
call:open-log
goto:eof

:init-log
set log="%SQLLOGSDIR%\%~n0.%package%.log"
if exist %log% del %log%
if /i "%~x1" == ".log" (
    set log="%~f1"
    if not exist "%~dp1" md "%~dp1"
)
echo %~f0 >> %log%
goto:eof

:open-log
if /i %log% == "%SQLLOGSDIR%\%~n0.%package%.log" (echo.) else (goto:eof)
call "%~dp0..\setsiono" desea ver el log de la ejecucion (%log%)
if /i "%siono%" == "S" start /d %SystemRoot% notepad %log%
echo.
goto:eof

:set-package
set package=%~n1
goto:eof

:setdir1
set scripts=
set directory=
if "%~f1" == "" goto:eof
if exist "%~f1" for /D %%d in ("%~f1\..\*") do if /i "%%~nxd" == "%~nx1" set directory=%~f1
if defined directory (
   set scripts=%directory%
) else (
   echo %1 no es un directorio
)
goto:eof

:ask4dir
echo.
set xsqlrootdir=%CD%
pushd "%~dp0"
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
popd
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
