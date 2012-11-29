@echo off
setlocal
set source=%~dp0
set source
set target=%CD%
set target
if /i "%source%" == "%target%\" (
    echo ***
    echo *** source=target
    echo ***
    pause
    goto:eof
)
pause

call "%~dp0variables"
call "%~dp0variables-date-time"

:ask
set nn=20
set /p nn="version (nn) [%nn%] "
if not defined nn goto ask

set VRNAME=V%nn%R%aammdd%
set VRPATH=%target%\%VRNAME%
set DQPATH="%VRPATH%"
set management=%project_source_dir%\management
set development=%project_source_dir%\development
echo.
set VR
echo.
echo rd %DQPATH%
if exist %DQPATH% rd %DQPATH% /s /q
echo.
echo md %DQPATH%
md %DQPATH%
echo.
call:x-symlink
call:x-concatsql
call:x-jasper
call:x-home
call:x-resources
call:x-ear
call:x-scripts
pause
echo.
call:sweep
pause
echo.
goto:eof

:x-symlink
set junction="%ProgramFiles%\Sysinternals\Junction\junction.exe"
if not exist %junction% set junction=
set junction
echo.
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
goto:eof

:x-concatsql
pushd %development%\resources\scripts\windows\makedb\oracle
call concatsql
popd
echo.
pushd %development%\resources\scripts\windows\makedb\postgresql
call concatsql
popd
echo.
goto:eof

:x-jasper
pushd %management%\resources\jasper
del reports\*.pdf /s
echo.
del reports\*.jasper
echo.
del reports\web\*.jasper
echo.
call xcopy-resources.bat
popd
echo.
goto:eof

:x-home
echo %VRNAME%>"%VRPATH%\HOME"
goto:eof

:x-resources
call:xcopy-folder %management% %DQPATH% resources s
goto:eof

:x-ear
call:xcopy-file "%project_source_dir%\%project%\dist\%project%.ear" %DQPATH%
goto:eof

:x-scripts
call:xcopy-file-batch "%management%\setup\scripts\*.*"         %DQPATH%
call:xcopy-file-batch "%management%\setup\scripts\linux\*.*"   %DQPATH%
call:xcopy-file-batch "%management%\setup\scripts\windows\*.*" %DQPATH%
goto:eof

:x-jboss
call:set-sub-dir "%VRPATH%\setup"
call:xcopy-folder %management%\setup %SUBDIR% jboss s
goto:eof

:x-oracle
call:set-sub-dir "%VRPATH%\setup"
call:xcopy-folder %management%\setup %SUBDIR% oracle s
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
echo xcopy %SOURCE% %TARGET% /i /%4
call xcopy %SOURCE% %TARGET% /i /%4
echo.
goto:eof

:rename-run-time-velocity-properties
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

:sweep
if not defined VRNAME goto:eof
if not defined VRPATH goto:eof

call:echo1 sweep %VRNAME% "%VRPATH%"

set replacer="%ProgramFiles%\ABF\Tools\Replacer\Replacer.exe"
set dos2unix="%ProgramFiles%\GnuWin32\bin\dos2unix.exe"
set filedate="%ProgramFiles%\ABF\Tools\FileDate\FileDate.exe"

call:echo2 sweep-remove .
for /R "%VRPATH%" %%f in (.)	do call:sweep-remove %%f

call:echo2 sweep-delete *.*
for /R "%VRPATH%" %%f in (*.*)	do call:sweep-delete %%f

call:echo2 sweep-delete-file *.#*
for /R "%VRPATH%" %%f in (*.#*)	do call:sweep-delete-file "%%f"

call:replace-VnnRaammdd
call:convert-text-files
call:modify-files-date

goto:eof

:echo1
echo.
echo %*
echo.
goto:eof

:echo2
echo.
echo %*
echo.
goto:eof

:sweep-remove
if "%~n1" == "build"		call:sweep-remove-folder "%~dpn1"
if "%~n1" == "dist"		call:sweep-remove-folder "%~dpn1"
if "%~n1" == "CVS"		call:sweep-remove-folder "%~dpn1"
if "%~n1" == "RevisionCache"	call:sweep-remove-folder "%~dpn1"
goto:eof

:sweep-remove-folder
if not exist %1 goto:eof
echo rmdir %1
rmdir %1 /s /q
goto:eof

:sweep-delete
if /i "%~x1" == ".cvsignore"	call:sweep-delete-file "%1"
if /i "%~x1" == ".lnk"		call:sweep-delete-file "%1"
if /i "%~x1" == ".log"		call:sweep-delete-file "%1"
if /i "%~x1" == ".plog"		call:sweep-delete-file "%1"
goto:eof

:sweep-delete-file
if not exist %1 goto:eof
echo del %1
del %1
goto:eof

:replace-VnnRaammdd
set findstring="VnnRaammdd"
set replacestring="%VRNAME%"
call:replacer bat
call:replacer properties
call:replacer sh
call:replacer sql
call:replacer txt
goto:eof

:replacer
set wildcard="%VRPATH%\*.%1"
%replacer% %wildcard% %findstring% %replacestring% /r
echo.
goto:eof

:convert-text-files
call:dos2unix *.jrtx
call:dos2unix *.jrxml
call:dos2unix *.osql
call:dos2unix *.password
call:dos2unix *.properties
call:dos2unix *.psql
call:dos2unix *.sh
call:dos2unix *.sql
call:dos2unix *.txt
call:dos2unix *.vm
call:dos2unix *.xml
goto:eof

:dos2unix
echo.
echo dos2unix %1
echo.
for /R "%VRPATH%" %%f in (%1) do %dos2unix% -U "%%f"
echo.
goto:eof

:modify-files-date
%filedate% "%VRPATH%\*.*" %mm%/%dd%/%aaaa% %hh24%-00-00 /r
echo.
goto:eof
