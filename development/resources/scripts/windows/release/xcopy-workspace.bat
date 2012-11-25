@echo off
cd /d "%~dp0"
call variables
call variables-date-time
set junction="%ProgramFiles%\Sysinternals\Junction\junction.exe"
if not exist %junction% set junction=
set junction
echo.

:ask
set nn=20
set /p nn="version (nn) [%nn%] "
if not defined nn goto ask
set VRNAME=V%nn%R%aammdd%
set VRPATH=%~dp0%VRNAME%
set DQPATH="%VRPATH%"
goto check

:check
echo.
set VR
echo.
echo rd %DQPATH%
if exist %DQPATH% rd %DQPATH% /s /q
echo.
echo md %DQPATH%
md %DQPATH%
echo.

echo %VRNAME%>"%VRPATH%\HOME"

if defined junction (
    if exist latest (
        echo %junction% -d latest
        call %junction% -d latest
        echo.
    )
    echo %junction% latest %DQPATH%
    call %junction% latest %DQPATH%
    echo.
)

pause
echo.

set DVLP=%project_source_dir%\development
set MGMT=%project_source_dir%\management

:x-010
pushd %MGMT%\resources\jasper
del reports\*.pdf /s
echo.
del reports\*.jasper
echo.
del reports\web\*.jasper
echo.
call xcopy-resources.bat
popd

:x-020
call:xcopy-folder %MGMT%                                                        %DQPATH% resources S
rem pause
rem echo.

:x-030
call:setsiono copiar el ear
echo.
if /i "%siono%" == "S" (
call:xcopy-file "%project_source_dir%\%project%\dist\%project%.ear"                  %DQPATH%
)
rem pause
rem echo.

:x-040
call:xcopy-file-batch "%MGMT%\setup\scripts\*.*"                                %DQPATH%
call:xcopy-file-batch "%MGMT%\setup\scripts\linux\*.*"                          %DQPATH%
call:xcopy-file-batch "%MGMT%\setup\scripts\windows\*.*"                        %DQPATH%
rem pause
rem echo.

goto x-060

:x-050
call:set-sub-dir "%VRPATH%\setup"
call:xcopy-folder %MGMT%\setup                                                  %SUBDIR% jboss S
rem pause
rem echo.

:x-060
call:set-sub-dir "%VRPATH%\setup"
call:xcopy-folder %MGMT%\setup                                                  %SUBDIR% oracle S
rem pause
rem echo.

:x-070
call:set-sub-dir "%VRPATH%\setup\jboss\welcome-content\%project%\attachments"
call:set-sub-dir "%VRPATH%\setup\jboss\welcome-content\%project%\spool"
rem pause
rem echo.

:x-080
call:renameRunTimeVelocityProperties
pause
echo.

:x-090
sweep
pause
goto:eof

:xcopy-file-batch
if "%1" == "" goto:eof
if "%2" == "" goto:eof
set SOURCE=%1
set TARGET="%~f2"
echo copy %SOURCE% %TARGET%
call copy %SOURCE% %TARGET%
echo.
goto:eof

:xcopy-file
if "%1" == "" goto:eof
if "%2" == "" goto:eof
set SOURCE="%~f1"
set TARGET="%~f2"
if not exist %SOURCE% (
    echo %SOURCE% no existe!
    echo.
    pause
    echo.
    goto:eof
)
echo copy %SOURCE% %TARGET%
call copy %SOURCE% %TARGET%
echo.
goto:eof

:xcopy-folder
if "%1" == "" goto:eof
if "%2" == "" goto:eof
if "%3" == "" goto:eof
set SOURCE="%~f1\%3"
set TARGET="%~f2\%3"
if not exist %SOURCE% (
    echo %SOURCE% no existe!
    echo.
    pause
    echo.
    goto:eof
)
if exist %TARGET% rmdir %TARGET% /s /q
if not exist %TARGET% md %TARGET%
rem dir %SOURCE% /a:d
echo xcopy %SOURCE% %TARGET% /i /%4
call xcopy %SOURCE% %TARGET% /i /%4
echo.
goto:eof

:renameRunTimeVelocityProperties
set vd=%VRPATH%\resources\velocity
set vp=velocity.properties
if not exist "%vd%\run-time-%vp%" goto:eof
echo del "%vd%\%vp%"
del "%vd%\%vp%"
echo ren "%vd%\run-time-%vp%" %vp%
ren "%vd%\run-time-%vp%" %vp%
echo.
goto:eof

:setsiono
set siono=S
set pregunta="%* ? (S/N) [%siono%] "
:preguntar
set /p siono=%pregunta%
if /i "%siono%" == "S" goto:eof
if /i "%siono%" == "N" goto:eof
goto preguntar
goto:eof

:set-sub-dir
set SUBDIR="%~f1"
set SUBDIR
if not exist %SUBDIR% md %SUBDIR%
echo.
goto:eof
