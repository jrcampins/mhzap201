@echo off
cd /d "%~dp0"

if not defined MHZAP201_VSWS goto:eof
call variables-date-time

:ask
set nn=10
set /p nn="version (nn) [%nn%] "
if not defined nn goto ask
set VR=V%nn%R%aammdd%
set CRVL="%VR%"
set CRVLDIR="%~dp0%VR%"
goto check

:check
echo.
set CRVL
echo.
pause
echo.
echo rmdir %CRVLDIR%
echo.
if exist %CRVLDIR% rmdir %CRVLDIR% /s /q
echo mkdir %CRVLDIR%
echo.
md %CRVLDIR%
md "%CRVLDIR:~1,-1%\setup\linux\as\resources"
md "%CRVLDIR:~1,-1%\setup\linux\db\oracle"
md "%CRVLDIR:~1,-1%\setup\windows\as\resources"
md "%CRVLDIR:~1,-1%\setup\windows\db\oracle"
pause
echo.

set DVLP=%MHZAP201_VSWS%\development
set MGMT=%MHZAP201_VSWS%\management

call:xcopy-folder %MGMT% %CRVLDIR% resources

call:xcopy-file "%MHZAP201_VSWS%\mhzap201\dist\mhzap201.ear" %CRVLDIR%

call:xcopy-file "%MHZAP201_VSWS%\management\backup\MHZDB201_%aaaammdd%.backup" %CRVLDIR%

call:xcopy-file-batch "%MGMT%\setup\scripts\linux\*.sh"  %CRVLDIR%

call:xcopy-file-batch "%MGMT%\setup\scripts\linux\*.txt" %CRVLDIR%

call:xcopy-file-batch "%MGMT%\setup\scripts\windows\*.bat" %CRVLDIR%

call:xcopy-file-batch "%MGMT%\setup\scripts\windows\*.txt" %CRVLDIR%

call:xcopy-file-batch "%MGMT%\resources\env\linux\*.*"                          "%CRVLDIR:~1,-1%\setup\linux\as\resources"
call:xcopy-file-batch "%MGMT%\resources\env\windows\*.*"                        "%CRVLDIR:~1,-1%\setup\windows\as\resources"

call:xcopy-file-batch "%MGMT%\resources\jasper\fonts\*.*"                       "%CRVLDIR:~1,-1%\setup\linux\as\resources"
call:xcopy-file-batch "%MGMT%\resources\jasper\fonts\*.*"                       "%CRVLDIR:~1,-1%\setup\windows\as\resources"

call:xcopy-file-batch "%MGMT%\resources\jasper\templates\resources\*.*"         "%CRVLDIR:~1,-1%\setup\linux\as\resources"
call:xcopy-file-batch "%MGMT%\resources\jasper\templates\resources\*.*"         "%CRVLDIR:~1,-1%\setup\windows\as\resources"

call:xcopy-file-batch "%DVLP%\resources\setup\database\oracle\linux\*.*"        "%CRVLDIR:~1,-1%\setup\linux\db\oracle"
call:xcopy-file-batch "%DVLP%\resources\setup\database\oracle\windows\*.*"      "%CRVLDIR:~1,-1%\setup\windows\db\oracle"

call:renameRunTimeVelocityProperties

call:changeVnnRaammdd

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
    echo copy %SOURCE% ********** no existe **********
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
    echo copy %SOURCE% ********** no existe **********
    echo.
    pause
    echo.
    goto:eof
)
if exist %TARGET% rmdir %TARGET% /s /q
if not exist %TARGET% md %TARGET%
rem dir %SOURCE% /a:d
echo xcopy %SOURCE% %TARGET% /i /s
call xcopy %SOURCE% %TARGET% /i /s
echo.
goto:eof

:renameRunTimeVelocityProperties
set vd=%CRVLDIR:~1,-1%\resources\velocity
set vp=velocity.properties
if not exist "%vd%\run-time-%vp%" goto:eof
echo del "%vd%\%vp%"
del "%vd%\%vp%"
echo ren "%vd%\run-time-%vp%" %vp%
ren "%vd%\run-time-%vp%" %vp%
echo.
goto:eof

:changeVnnRaammdd
set fart="C:\Archivos de programa\WinUtils\fart.exe"
set findstring="VnnRaammdd"
set replacestring=%CRVL%
call:fart %CRVLDIR% properties
call:fart %CRVLDIR% sql
call:fart %CRVLDIR% txt
goto:eof

:fart
set wildcard="%~f1\*.%2"
echo %fart% -r -c -i %wildcard% %findstring% %replacestring%
call %fart% -r -c -i %wildcard% %findstring% %replacestring%
echo.
goto:eof
