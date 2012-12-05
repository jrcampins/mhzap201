@echo off
cd /d "%~dp0"

setlocal
set variables=
call variables
if not defined variables goto:eof

call:build
pause
goto:eof

:build
set build_and_deploy=N
set workspace=%project_source_dir%

if defined clean_and_build goto check-clean-and-build

:get-clean-and-build
set clean_and_build=T
set /p clean_and_build="build despues del clean ? (E=%project%, S=%project%-sdk, J=JARs, W=WARs, T=Todos, N=Ninguno, X=Salir) [%clean_and_build%] "
if not defined clean_and_build goto get-clean-and-build

:check-clean-and-build
if /i "%clean_and_build%" EQU "E" goto got-build-and-deploy
if /i "%clean_and_build%" EQU "S" goto get-build-and-deploy
if /i "%clean_and_build%" EQU "J" goto got-build-and-deploy
if /i "%clean_and_build%" EQU "W" goto got-build-and-deploy
if /i "%clean_and_build%" EQU "T" goto got-build-and-deploy
if /i "%clean_and_build%" EQU "N" goto got-build-and-deploy
if /i "%clean_and_build%" EQU "X" goto:eof
goto get-clean-and-build

:get-build-and-deploy
set /p build_and_deploy="deploy despues del build ? (S=Si, N=No) [%build_and_deploy%] "
if not defined build_and_deploy goto get-build-and-deploy

:check-build-and-deploy
if /i "%build_and_deploy%" EQU "S" goto got-build-and-deploy
if /i "%build_and_deploy%" EQU "N" goto got-build-and-deploy
goto get-build-and-deploy

:got-build-and-deploy
set clean_and_build
set build_and_deploy
echo.

set ANT_OPTS=-Xms256m -Xmx256m
set batsxdir=%CD%
set logsxdir=%~d0\logs
set antsxdir=N:\netbeans\java\ant\bin
set buildlog=%batsxdir%\build.log
if exist "%buildlog%" del "%buildlog%"
if not defined workspace   goto ERR1
if not exist "%workspace%" goto ERR2
if not exist "%antsxdir%"  goto ERR4
if not exist "%JAVA_HOME%" goto ERR5

:clean-all
set target=clean
echo %target%
echo.
if exist "%logsxdir%" (del "%logsxdir%\*.log" /s /q >> "%buildlog%") else (md "%logsxdir%")
for /D %%d in (%workspace%\*) do call:ant-build %%d %target%
echo.
if /i "%clean_and_build%" EQU "N" goto:eof
if exist "%logsxdir%" (del "%logsxdir%\*.log" /s /q >> "%buildlog%") else (md "%logsxdir%")

:build-jars
set target=build
echo %target%
echo.
call:ant-build %workspace%\commons-lib                %target%
call:ant-build %workspace%\%project%-lib-base         %target%
call:ant-build %workspace%\%project%-lib-core         %target%
call:ant-build %workspace%\%project%-lib-data         %target%
call:ant-build %workspace%\%project%-ejb-persistence  %target%
call:ant-build %workspace%\%project%-ejb-core         %target%
call:ant-build %workspace%\%project%-ejb-business     %target%
call:ant-build %workspace%\%project%-ejb-toolkit      %target%
call:ant-build %workspace%\%project%-eac-toolkit      %target%
echo.
if /i "%clean_and_build%" EQU "J" goto:eof
if /i "%clean_and_build%" EQU "E" goto build-ears
if /i "%clean_and_build%" EQU "S" goto build-ears
if /i "%clean_and_build%" EQU "T" goto build-ears

:build-wars
set target=build
echo %target%
echo.
call:ant-build %workspace%\%project%-web                          %target%
for /D %%d in (%workspace%\%project%-web-*) do call:ant-build %%d %target%
echo.
if /i "%clean_and_build%" EQU "W" goto:eof

:build-ears
set target=build
echo %target%
echo.
if /i "%clean_and_build%" EQU "E" call:ant-build %workspace%\%project% %target%
if /i "%clean_and_build%" EQU "T" call:ant-build %workspace%\%project% %target%
if /i "%clean_and_build%" EQU "S" call:ant-build %workspace%\%project%-sdk %target%
if /i "%clean_and_build%" EQU "T" call:ant-build %workspace%\%project%-sdk %target%
echo.
if /i "%build_and_deploy%" EQU "N" goto:eof

:deploy-ears
set target=run-deploy
echo %target%
echo.
set ASADMIN="%GLASSFISH_HOME%\bin\asadmin.bat"
call:list-components
set siono=S
if /i "%clean_and_build%" EQU "E" call:deploy %workspace%\%project%
echo.
set siono=S
if /i "%clean_and_build%" EQU "S" call:deploy %workspace%\%project%-sdk
echo.
call:list-components
goto:eof

:ERR1
set ERRMSG=variable de entorno workspace no definida (workspace corresponde a la ruta de su directorio de trabajo de CVS)
goto TELL

:ERR2
set ERRMSG=directorio %workspace% no existe
goto TELL

:ERR3
set ERRMSG=directorio %logsxdir% no existe
goto TELL

:ERR4
set ERRMSG=directorio %antsxdir% no existe
goto TELL

:ERR5
set ERRMSG=directorio %JAVA_HOME% no existe
goto TELL

:TELL
echo.
echo %ERRMSG%
echo.

:ant-build
set BLDFILE="%~f1\build.xml"
set LOGFILE="%logsxdir%\%~n1.log"
set MANFILE="%~f1\src\conf\MANIFEST.MF"
set WEBFILE="%~f1\web\WEB-INF\web.xml"
set STDFILE="%~f1\src\conf\application.xml"
set SUNFILE="%~f1\src\conf\sun-application.xml"
if not exist %BLDFILE% goto ant-build-done
set BUILDER=jar
if exist %MANFILE% set BUILDER=dist
if exist %SUNFILE% set BUILDER=dist
set TARGETS=

:ant-build-loop
shift
if "%1" EQU "" goto ant-build-doit
if "%1" EQU "build" set TARGETS=%TARGETS% %BUILDER%
if "%1" NEQ "build" set TARGETS=%TARGETS% %1
goto ant-build-loop

:ant-build-doit
cd /d %antsxdir%
echo ant -buildfile %BLDFILE% -logfile %LOGFILE%%TARGETS%>>%buildlog%
call ant -buildfile %BLDFILE% -logfile %LOGFILE%%TARGETS%

:ant-build-done
goto:eof

:deploy
echo %*
echo.
set CMD=deploy
set STD="%~f1\src\conf\application.xml"
set SUN="%~f1\src\conf\sun-application.xml"
set EAP=%~n1
set EAQ="%GLASSFISH_HOME%\domains\domain1\applications\%~n1"
set EAR="%~f1\dist\%~n1.ear"
if  not exist %STD% goto deploy-done
if  not exist %SUN% goto deploy-done
if  not exist %EAR% goto deploy-done

:deploy-loop
shift
set str=%1
rem remove double quotes
for /f "useback tokens=*" %%a in ('%str%') do set str=%%~a
if "%str%"=="" goto deploy-one
set CMD=%CMD% %str%
goto deploy-loop

:deploy-one
set CMD=%CMD% %EAR%
if defined siono goto deploy-test
set siono=S
set /p siono="%CMD% (S/N) [%siono%] "
echo.

:deploy-test
if /i "%siono%" NEQ "S" goto deploy-done
if  not exist %EAQ% goto deploy-exec
echo %ASADMIN% %ascst2% undeploy %EAP%
echo %ASADMIN% %ascst2% undeploy %EAP%>>%buildlog%
call %ASADMIN% %ascst2% undeploy %EAP% 2>&1

:deploy-exec
echo %ASADMIN% %ascst2% %CMD%
echo %ASADMIN% %ascst2% %CMD%>>%buildlog%
call %ASADMIN% %ascst2% %CMD% 2>&1

:deploy-done
set siono=
goto:eof

:list-components
echo %ASADMIN% %ascst2% list-components
call %ASADMIN% %ascst2% list-components
goto:eof
