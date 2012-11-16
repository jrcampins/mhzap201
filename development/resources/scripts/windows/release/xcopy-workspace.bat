@echo off
cd /d "%~dp0"

set MHZAP201
set W_THIRD_PARTY=W:\third-party
set W_THIRD_PARTY

set junction="%ProgramFiles%\Sysinternals\Junction\junction.exe"
if not exist %junction% set junction=
set junction

if not defined MHZAP201_VSWS goto:eof
call variables-date-time
echo.

:ask
set nn=20
set /p nn="version (nn) [%nn%] "
if not defined nn goto ask
set VR=V%nn%R%aammdd%
set CRVL="%VR%"
set CRVLDIR="%~dp0%VR%"
set CRVLDIR11=%CRVLDIR:~1,-1%
goto check

:check
echo.
set CRVL
echo.
echo rd %CRVLDIR%
if exist %CRVLDIR% rd %CRVLDIR% /s /q
echo.
echo md %CRVLDIR%
md %CRVLDIR%
echo.

if defined junction (
    if exist latest (
        echo %junction% -d latest
        call %junction% -d latest
        echo.
    )
    echo %junction% latest %CRVLDIR%
    call %junction% latest %CRVLDIR%
    echo.
)

pause
echo.

set DVLP=%MHZAP201_VSWS%\development
set MGMT=%MHZAP201_VSWS%\management

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
call:xcopy-folder %MGMT%                                                        %CRVLDIR% resources S

rem pause
rem echo.

:x-030
call:setsiono copiar el ear
echo.
if /i "%siono%" == "S" (
call:xcopy-file "%MHZAP201_VSWS%\mhzap201\dist\mhzap201.ear"                    %CRVLDIR%
)

call:setsiono copiar el backup de postgresql
echo.
if /i "%siono%" == "S" (
call:xcopy-file "%MHZAP201_VSWS%\management\backup\MHZDB201_%aaaammdd%.backup"  %CRVLDIR%
)

rem pause
rem echo.

:x-040
call:xcopy-file-batch "%MGMT%\setup\scripts\linux\*.sh"                         %CRVLDIR%
call:xcopy-file-batch "%MGMT%\setup\scripts\linux\*.txt"                        %CRVLDIR%

call:xcopy-file-batch "%MGMT%\setup\scripts\windows\*.bat"                      %CRVLDIR%
call:xcopy-file-batch "%MGMT%\setup\scripts\windows\*.txt"                      %CRVLDIR%

rem pause
rem echo.

:x-050
set CRVLSUBDIR="%CRVLDIR11%\setup"
set CRVLSUBDIR
if not exist %CRVLSUBDIR% md %CRVLSUBDIR%
echo.

call:xcopy-folder %MGMT%\setup                                                  %CRVLSUBDIR% jboss  E
call:xcopy-folder %MGMT%\setup                                                  %CRVLSUBDIR% oracle E

rem pause
rem echo.

goto x-070

:x-060
set CRVLSUBDIR="%CRVLDIR11%\setup\jboss\standalone\linux"
set CRVLSUBDIR
if not exist %CRVLSUBDIR% md %CRVLSUBDIR%
echo.

call:xcopy-file-batch "%MGMT%\resources\bootstrapping\jboss\oracle\linux\*.*"   %CRVLSUBDIR%

set CRVLSUBDIR="%CRVLDIR11%\setup\jboss\standalone\windows"
set CRVLSUBDIR
if not exist %CRVLSUBDIR% md %CRVLSUBDIR%
echo.

call:xcopy-file-batch "%MGMT%\resources\bootstrapping\jboss\oracle\windows\*.*" %CRVLSUBDIR%

rem pause
rem echo.

:x-070
set CRVLSUBDIR="%CRVLDIR11%\setup\jboss\welcome-content\mhzap201\attachments"
set CRVLSUBDIR
if not exist %CRVLSUBDIR% md %CRVLSUBDIR%
echo.

set CRVLSUBDIR="%CRVLDIR11%\setup\jboss\welcome-content\mhzap201\spool"
set CRVLSUBDIR
if not exist %CRVLSUBDIR% md %CRVLSUBDIR%
echo.

rem pause
rem echo.

goto x-080

:x-070
call:setsiono copiar los jar de los modulos jboss
echo.
if /i "%siono%" == "N" goto x-080

set CRVLSUBDIR="%CRVLDIR11%\setup\jboss\modules\com\oracle\ojdbc6\main"
set CRVLSUBDIR
if not exist %CRVLSUBDIR% md %CRVLSUBDIR%
echo.

call:xcopy-file "%W_THIRD_PARTY%\lib\jdbc\oracle\ojdbc6.jar"                    %CRVLSUBDIR%

set CRVLSUBDIR="%CRVLDIR11%\setup\jboss\modules\com\microsoft\core\fonts\main"
set CRVLSUBDIR
if not exist %CRVLSUBDIR% md %CRVLSUBDIR%
echo.

call:xcopy-file "%W_THIRD_PARTY%\lib\microsoft-core-fonts-for-the-web.jar"      %CRVLSUBDIR%

rem pause
rem echo.

:x-080
call:renameRunTimeVelocityProperties

pause
echo.

:x-090
sweep %CRVLDIR%

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
set vd=%CRVLDIR11%\resources\velocity
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
