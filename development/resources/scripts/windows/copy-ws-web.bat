@echo off
cd /d "%~dp0"
call variables

set root1=%~d0\%lower_case_project%\ws-glassfish
set root2=%project_source_dir%
for /D %%d in (%root1%\%lower_case_project%-web-*) do call:copy-web-project %%d
pause
echo.
goto:eof

:copy-web-project
set dp1=%~f1
call set dp2=%%dp1:%root1%=%root2%%%
set hdw=%dp2%\handiwork
set dp1
set dp2
if     exist "%hdw%" (call:handiwork & goto:eof)
if not exist "%dp1%" (call:noSource & goto:eof)
if not exist "%dp2%" (call:noTarget & goto:eof)
set siono=N
echo.
set /p siono="*** ELIMINAR %dp2% (S/N) ? [%siono%] "
echo.
if /i "%siono%" == "S" call:removeTarget
call:xcopySourceToTarget
goto:eof
echo.

:removeTarget
echo removing %dp2%
if exist %dp2% rmdir %dp2% /s
echo.
goto:eof

:xcopySourceToTarget
echo copying from %dp1% to %dp2%
xcopy %dp1%\*.* %dp2% /i /s /y /exclude:%~dpn0.txt
echo.
goto:eof

:handiwork
echo.
echo *** %dp2% no se puede modificar
echo.
pause
echo.
goto:eof

:noSource
echo.
echo *** %dp1% no existe
echo.
pause
echo.
goto:eof

:noTarget
echo.
echo *** %dp2% no existe
echo.
pause
echo.
goto:eof
