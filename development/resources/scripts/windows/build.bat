@echo off
cd /d "%~dp0"
call variables
if not defined variables goto:eof
call:main1
pause
goto:eof

rem CLASSPATH=.;%ProgramFiles%\Java\jre6\lib\ext\QTJava.zip
rem QTJAVA=%ProgramFiles%\Java\jre6\lib\ext\QTJava.zip
rem path=%ProgramFiles%\PC Connectivity Solution\
rem path=C:\oraclexe\app\oracle\product\11.2.0\server\bin
rem path=
rem path=%SystemRoot%\system32
rem path=%SystemRoot%
rem path=%SystemRoot%\System32\Wbem
rem path=%ProgramFiles%\Apache Software Foundation\apache-maven-3.0.3\bin
rem path=C:\cygwin\bin
rem path=%ProgramFiles%\JavaFX\javafx-sdk1.3\bin
rem path=%ProgramFiles%\JavaFX\javafx-sdk1.3\emulator\bin
rem path=%ProgramFiles%\JavaFX\javafx-sdk1.2\bin
rem path=%ProgramFiles%\JavaFX\javafx-sdk1.2\emulator\bin
rem path=%ProgramFiles%\SSH Communications Security\SSH Secure Shell
rem path=%ProgramFiles%\Wave Systems Corp\Dell Preboot Manager\Access Client\v5\
rem path=%ProgramFiles%\Archivos comunes\Roxio Shared\DLLShared\
rem path=%ProgramFiles%\CVSNT\
rem path=C:\svn\bin
rem path=%ProgramFiles%\QuickTime\QTSystem\

:main1
set project=mhzap201
set workspace=%MHZAP201_SOURCE%
set build_and_deploy=N
set jdk_update=30

if defined clean_and_build goto ask1b

:ask1a
set clean_and_build=N
set /p clean_and_build="build despues del clean ? (G=GlassFish, J=JBoss, S=SDK, E=EJBs, N=None) [%clean_and_build%] "
if not defined clean_and_build goto ask1a

:ask1b
set clean_and_build
if /i "%clean_and_build%" EQU "G" goto got2
if /i "%clean_and_build%" EQU "J" goto got2
if /i "%clean_and_build%" EQU "S" goto got1
if /i "%clean_and_build%" EQU "E" goto got2
if /i "%clean_and_build%" EQU "N" goto got3
goto ask1a

:got1
:ask2a
set build_and_deploy=N
set /p build_and_deploy="deploy despues del build ? (Y=YES, N=NO) [%build_and_deploy%] "
if not defined build_and_deploy goto ask2a

:ask2b
set build_and_deploy
if /i "%build_and_deploy%" EQU "Y" goto got2
if /i "%build_and_deploy%" EQU "N" goto got2
goto ask2a

:got2
:ask3a
set jdk_update=30
goto ask3b
set /p jdk_update="jdk update ? (25/30) [%jdk_update%] "
if not defined jdk_update goto ask3a

:ask3b
set jdk_update
if /i "%jdk_update%" EQU "25" goto got3
if /i "%jdk_update%" EQU "30" goto got3
goto ask3a

:got3
set BATSDIR=%CD%
set BUILDLOG=%BATSDIR%\build.log
set LOGSDIR=W:\logs
set ANTSDIR=N:\netbeans\java\ant\bin
echo.
echo %0 begun @ %time%
echo %0 begun @ %time% > %BUILDLOG%
echo.>>%BUILDLOG%
if not defined workspace   goto ERR1
if not exist "%workspace%" goto ERR2
if not exist "%ANTSDIR%"   goto ERR4
if not exist "%JAVA_HOME%" goto ERR5
set ANT_OPTS=-Xms256m -Xmx256m
rem time
rem set RUNTIME=%time%
rem if defined RUNTIME echo %RUNTIME%

:CLEAN-ALL
echo.
echo CLEAN-ALL
if exist %LOGSDIR% rmdir %LOGSDIR% /s /q
if not exist %LOGSDIR% md %LOGSDIR%

set target=clean
echo %target%

for /D %%d in (%workspace%\*) do call:ant-build %%d %target%
echo.
if /i "%clean_and_build%" EQU "N" goto DONE
goto BUILD-JARS

:BUILD-JARS
echo.
echo BUILD-JARS
if exist %LOGSDIR% rmdir %LOGSDIR% /s /q
if not exist %LOGSDIR% md %LOGSDIR%

set target=build
echo %target%

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
if /i "%clean_and_build%" EQU "E" goto DONE
goto BUILD-EARS

:BUILD-WARS
echo.
echo BUILD-WARS
set target=build
call:ant-build %workspace%\%project%-web                          %target%
for /D %%d in (%workspace%\%project%-web-*) do call:ant-build %%d %target%
echo.
goto BUILD-EARS

:BUILD-EARS
echo.
echo BUILD-EARS

set target=build
rem if /i "%build_and_deploy%" EQU "Y" set target=run-deploy
echo %target%

if /i "%clean_and_build%" EQU "G" call:ant-build %workspace%\%project% %target%
if /i "%clean_and_build%" EQU "J" call:ant-build %workspace%\%project% %target%
if /i "%clean_and_build%" EQU "S" call:ant-build %workspace%\%project%-sdk %target%
echo.

if /i "%build_and_deploy%" EQU "N" goto DONE

set target=build
if /i "%build_and_deploy%" EQU "Y" set target=run-deploy
echo %target%

set ASADMIN="%GLASSFISH_HOME%\bin\asadmin.bat"
call:list-components
rem --property "compatibility=v2"
set siono=S
if /i "%clean_and_build%" EQU "G" call:deploy %workspace%\%project%
set siono=S
if /i "%clean_and_build%" EQU "S" call:deploy %workspace%\%project%-sdk
echo.
call:list-components
goto DONE

:ERR1
set ERRMSG=variable de entorno workspace no definida (workspace corresponde a la ruta de su directorio de trabajo de CVS)
goto TELL

:ERR2
set ERRMSG=directorio %workspace% no existe
goto TELL

:ERR3
set ERRMSG=directorio %LOGSDIR% no existe
goto TELL

:ERR4
set ERRMSG=directorio %ANTSDIR% no existe
goto TELL

:ERR5
set ERRMSG=directorio %JAVA_HOME% no existe
goto TELL

:TELL
echo.
echo %ERRMSG%
echo.

:DONE
echo %0 ended @ %time%
echo %0 ended @ %time% >> %BUILDLOG%
echo.
goto:eof

:ant-build
set BLDFILE="%~f1\build.xml"
set LOGFILE="%LOGSDIR%\%~n1.log"
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
cd /d %ANTSDIR%
if defined RUNTIME time %RUNTIME%
echo.
echo ant -buildfile %BLDFILE% -logfile %LOGFILE%%TARGETS%>>%BUILDLOG%
call ant -buildfile %BLDFILE% -logfile %LOGFILE%%TARGETS%

:ant-build-done
echo.>>%BUILDLOG%
goto:eof

:deploy
echo.
echo %*
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
for /f "useback tokens=*" %%a in ('%str%') do set str=%%~a
if "%str%"=="" goto deploy-doit
set CMD=%CMD% %str%
goto deploy-loop

:deploy-doit
set CMD=%CMD% %EAR%
if defined siono goto deploy-test
echo.
set siono=S
set /p siono="%CMD% (S/N) [%siono%] "

:deploy-test
if /i "%siono%" NEQ "S" goto deploy-done
if  not exist %EAQ% goto deploy-exec
echo.
echo.>>%BUILDLOG%
echo %ASADMIN% %ascst2% undeploy %EAP%
echo.
echo %ASADMIN% %ascst2% undeploy %EAP%>>%BUILDLOG%
call %ASADMIN% %ascst2% undeploy %EAP% 2>&1

:deploy-exec
echo.
echo.>>%BUILDLOG%
echo %ASADMIN% %ascst2% %CMD%
echo.
echo %ASADMIN% %ascst2% %CMD%>>%BUILDLOG%
call %ASADMIN% %ascst2% %CMD% 2>&1

:deploy-done
set siono=
goto:eof

:list-components
echo %ASADMIN% %ascst2% list-components
call %ASADMIN% %ascst2% list-components
goto:eof
