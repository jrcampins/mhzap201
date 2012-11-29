@echo off
cd /d "%~dp0"

setlocal
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
    start /d %jboss% %jboss%\standalone-start
    echo.
    call %jboss%\ear-undeploy
    echo.
    call %jboss%\standalone-stop
    echo.
rem call %oracle%\dump
rem echo.
)

set siono=N
rem if /i "%1" == "install" (
rem     echo.
rem     call "%~dp0..\setsiono" restaurar de la base de datos a partir de un archivo respaldo
rem     echo.
rem )

if /i "%1" == "install" (
    if /i "%siono%" == "S" (
        call %oracle%\restore
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
    start /d %jboss% %jboss%\standalone-start
    echo.
    call %jboss%\ear-deploy
    echo.
)

echo.
echo fin del procedimiento de instalacion
echo.
pause
