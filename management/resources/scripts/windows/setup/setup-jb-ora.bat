@echo off
cd /d "%~dp0"

setlocal
set EEAS=JBoss
set DBMS=Oracle
set variables=
call variables
if not defined variables goto:eof

set resources=%HOMEDIR%\resources
set windows=%resources%\scripts\windows
set setup=%windows%\setup
set jboss=%windows%\jboss
set oracle=%windows%\oracle
set upgrade_or_install=
set upgrade_or_uninstall=
if /i "%1" == "upgrade"     set upgrade_or_install=true
if /i "%1" == "install"     set upgrade_or_install=true
if /i "%1" == "upgrade"     set upgrade_or_uninstall=true
if /i "%1" == "uninstall"   set upgrade_or_uninstall=true

if defined upgrade_or_uninstall (
    call:jbstart
    echo.
    call %jboss%\ear-undeploy
    echo.
    call %jboss%\standalone-stop
    echo.
    call %oracle%\export
    echo.
)

if /i "%1" == "install" (
    call %oracle%\createdb
    echo.
)

set siono=N
if /i "%1" == "install" (
    call "%~dp0..\setsiono" restaurar de la base de datos a partir de un archivo respaldo
    echo.
)

if /i "%1" == "install" (
    if /i "%siono%" == "S" (
        call %oracle%\import
        echo.
    ) else (
        call %oracle%\customize
        echo.
        call %oracle%\makedb
        echo.
    )
)

if /i "%1" == "uninstall" (
    call %oracle%\dropdb
    echo.
)

if /i "%1" == "upgrade" (
    call %oracle%\upgradedb
    echo.
)

if defined upgrade_or_install (
    call %oracle%\rebuild
    echo.
    call:jbstart
    echo.
    call %jboss%\ear-deploy
    echo.
    call %jboss%\standalone-stop
    echo.
)

echo.
echo fin del procedimiento %~n0
echo.
pause
goto:eof

:jbstart
set me=standalone-start
echo "%me%" inicia la ejecucion del servidor de aplicaciones en modo standalone
set siono=S
set pregunta="ejecutar %me% ? (S/N) [%siono%] "
set /p siono=%pregunta%
echo.
if /i not "%siono%" == "S" goto:eof
set ask_before_starting=
start /d %jboss% %jboss%\standalone-start
goto:eof
