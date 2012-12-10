@echo off
cd /d "%~dp0"

setlocal
call variables
cd /d "%project_source_dir%\.."
if not exist release md release
cd release
set release=%CD%
set release

:ask
set nn=20
set /p nn="version (nn) [%nn%] "
if not defined nn goto ask

set VRNAME=V%nn%R%aammdd%
set VRPATH=%release%\%VRNAME%
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
call:x-junction
echo.
set siono=N
call:setsiono actualizar workspace antes de copiarlo
echo.
if /i "%siono%" == "S" (
    call:x-concatsql
    call:x-copy-resources
)
call:x-home
call:x-dist
call:x-sql
call:x-resources
call:x-scripts
pause
echo.
call:sweep
pause
echo.
goto:eof

:x-junction
set junction="%ProgramFiles%\Sysinternals\Junction\junction.exe"
if not exist %junction% set junction=
set junction
echo.
if not defined junction goto:eof
if exist latest (
    echo %junction% -d latest
    call %junction% -d latest
    echo.
)
echo %junction% latest %DQPATH%
call %junction% latest %DQPATH%
echo.
goto:eof

:x-concatsql
set SUBDIR="%management%\sql"
if exist %SUBDIR% (echo rd %SUBDIR% & rd %SUBDIR% /s /q)
set concat_without_asking=true
pushd %development%\resources\scripts\windows\makedb\oracle
call concatsql
popd
echo.
pushd %development%\resources\scripts\windows\makedb\postgresql
call concatsql
popd
echo.
rem pushd %development%\resources\scripts\windows\makedb\sqlserver
rem call concatsql
rem popd
rem echo.
goto:eof

:x-copy-resources
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

:x-dist
set target_eeas=
set /a target_eeas_count=0
set siono=S
call:setsiono copiar "%management%\dist\glassfish\%project%.ear"
echo.
if /i "%siono%" == "S" call:set-sub-dir "%VRPATH%\dist\glassfish"
if /i "%siono%" == "S" (
    set target_eeas=GlassFish
    set /a target_eeas_count+=1
    call:xcopy-file "%management%\dist\glassfish\%project%.ear" %SUBDIR%
)
set siono=S
call:setsiono copiar "%management%\dist\jboss\%project%.ear"
echo.
if /i "%siono%" == "S" call:set-sub-dir "%VRPATH%\dist\jboss"
if /i "%siono%" == "S" (
    set target_eeas=JBoss
    set /a target_eeas_count+=1
    call:xcopy-file "%management%\dist\jboss\%project%.ear" %SUBDIR%
)
goto:eof

:x-resources
call:xcopy-folder %management% %DQPATH% resources /s
goto:eof

:x-sql
echo xcopy-folder %management% %DQPATH% sql /s
set target_dbms=
set /a target_dbms_count=0
set siono=S
call:setsiono copiar "%management%\sql\oracle"
echo.
if /i "%siono%" == "S" call:set-sub-dir "%VRPATH%\sql\oracle"
if /i "%siono%" == "S" (
    set target_dbms=Oracle
    set /a target_dbms_count+=1
    call:xcopy-file-batch "%management%\sql\oracle\*.sql" %SUBDIR%
    call:xcopy-folder %management%\sql\oracle %SUBDIR% custom /s
)
set siono=S
call:setsiono copiar "%management%\sql\postgresql"
echo.
if /i "%siono%" == "S" call:set-sub-dir "%VRPATH%\sql\postgresql"
if /i "%siono%" == "S" (
    set target_dbms=PostgreSQL
    set /a target_dbms_count+=1
    call:xcopy-file-batch "%management%\sql\postgresql\*.sql" %SUBDIR%
)
goto:eof

:x-scripts
call:xcopy-file-batch "%management%\setup\scripts\*.*"         %DQPATH%
call:xcopy-file-batch "%management%\setup\scripts\linux\*.*"   %DQPATH%
call:xcopy-file-batch "%management%\setup\scripts\windows\*.*" %DQPATH%
set exclude=%development%\setup\copy-scripts-exclude-setup.txt
set exclude
echo.
xcopy "%development%\setup\scripts\*.*"         %DQPATH% /exclude:%exclude%
echo.
xcopy "%development%\setup\scripts\linux\*.*"   %DQPATH% /exclude:%exclude%
echo.
xcopy "%development%\setup\scripts\windows\*.*" %DQPATH% /exclude:%exclude%
echo.
set single_target=
if %target_eeas_count% == 1 set single_target=true
if %target_dbms_count% == 1 set single_target=true
if defined single_target (
    echo.>>"%VRPATH%\variables-conf.sh"
    echo.>>"%VRPATH%\variables-conf.bat"
)
if %target_eeas_count% == 1 (
    set target_eeas
    echo EEAS=%target_eeas%>>"%VRPATH%\variables-conf.sh"
    echo set EEAS=%target_eeas%>>"%VRPATH%\variables-conf.bat"
)
if %target_dbms_count% == 1 (
    set target_dbms
    echo DBMS=%target_dbms%>>"%VRPATH%\variables-conf.sh"
    echo set DBMS=%target_dbms%>>"%VRPATH%\variables-conf.bat"
)
if defined single_target (
    echo.>>"%VRPATH%\variables-conf.sh"
    echo.>>"%VRPATH%\variables-conf.bat"
)
goto:eof

:xcopy-file
if "%~1" == "" goto:eof
if "%~2" == "" goto:eof
set SOURCE="%~f1"
set TARGET="%~f2"
if not exist %SOURCE% (
    echo %SOURCE% no existe
    echo.
    pause
    echo.
    goto:eof
)
echo copy %SOURCE% %TARGET%
call copy %SOURCE% %TARGET%
echo.
goto:eof

:xcopy-file-batch
if "%~1" == "" goto:eof
if "%~2" == "" goto:eof
set SOURCE=%1
set TARGET="%~f2"
echo copy %SOURCE% %TARGET%
call copy %SOURCE% %TARGET%
echo.
goto:eof

:xcopy-folder
if "%~1" == "" goto:eof
if "%~2" == "" goto:eof
if "%~3" == "" goto:eof
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
echo xcopy %SOURCE% %TARGET% /i %4 /exclude:%~dpn0.txt
call xcopy %SOURCE% %TARGET% /i %4 /exclude:%~dpn0.txt
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

rem call:echo2 sweep-remove .
rem for /R "%VRPATH%" %%f in (.)    do call:sweep-remove %%f

rem call:echo2 sweep-delete *.*
rem for /R "%VRPATH%" %%f in (*.*)  do call:sweep-delete %%f

rem call:echo2 sweep-delete-file *.#*
rem for /R "%VRPATH%" %%f in (*.#*) do call:sweep-delete-file "%%f"

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
goto:eof

:sweep-remove-folder
if not exist %1 goto:eof
echo rmdir %1
rmdir %1 /s /q
goto:eof

:sweep-delete
if /i "%~x1" == ".lnk"		call:sweep-delete-file "%1"
if /i "%~x1" == ".log"		call:sweep-delete-file "%1"
goto:eof

:sweep-delete-file
if not exist %1 goto:eof
echo del %1
del %1
goto:eof

:replace-VnnRaammdd
set replacer="%ProgramFiles%\ABF\Tools\Replacer\Replacer.exe"
if not exist %replacer% set replacer=
set replacer
echo.
if not defined replacer goto:eof
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
set dos2unix="%ProgramFiles%\GnuWin32\bin\dos2unix.exe"
if not exist %dos2unix% set dos2unix=
set dos2unix
echo.
if not defined dos2unix goto:eof
call:dos2unix *.jrtx
call:dos2unix *.jrxml
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
set filedate="%ProgramFiles%\ABF\Tools\FileDate\FileDate.exe"
if not exist %filedate% set filedate=
set filedate
echo.
if not defined filedate goto:eof
%filedate% "%VRPATH%\*" %mm%/%dd%/%aaaa% %hh24%-00-00 /r
echo.
goto:eof
