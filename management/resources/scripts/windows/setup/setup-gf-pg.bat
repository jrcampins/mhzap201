@echo off
cd /d "%~dp0"

setlocal
set EEAS=GlassFish
set DBMS=PostgreSQL
set variables=
call variables
if not defined variables goto:eof

clear
set resources=%HOMEDIR%\resources
set windows=%resources%\scripts\windows
set setup=%windows%\setup
set glassfish=%windows%\glassfish
set postgresql=%windows%\postgresql
set upgrade_or_install=
set upgrade_or_uninstall=
if /i "%1" == "upgrade"     set upgrade_or_install=true
if /i "%1" == "install"     set upgrade_or_install=true
if /i "%1" == "upgrade"     set upgrade_or_uninstall=true
if /i "%1" == "uninstall"   set upgrade_or_uninstall=true

if defined upgrade_or_uninstall (
    call %glassfish%\domain-start
    echo.
    call %glassfish%\undeploy
    echo.
    call %glassfish%\delete-jms
    echo.
    call %glassfish%\delete-jdbc
    echo.
    call %glassfish%\domain-stop
    echo.
    call %postgresql%\dump
    echo.
)

if /i "%1" == "install" (
    call %postgresql%\createdb
    echo.
    call "%~dp0..\setsiono" restaurar de la base de datos a partir de un archivo respaldo
    echo.
)

if /i "%1" == "install" (
    if /i "%siono%" == "S" (
        call %postgresql%\restore
        echo.
    ) else (
        call %postgresql%\makedb
        echo.
    )
)

if /i "%1" == "uninstall" (
    call %postgresql%\dropdb
    echo.
)

if /i "%1" == "upgrade" (
    call %postgresql%\upgradedb
    echo.
)

if defined upgrade_or_install (
    call %postgresql%\rebuild
    echo.
    call %postgresql%\vacuumdb
    echo.
    call %glassfish%\domain-start
    echo.
    call %glassfish%\server-config
    echo.
    call %glassfish%\create-jdbc
    echo.
    call %glassfish%\create-jms
    echo.
    call %glassfish%\deploy
    echo.
    call %glassfish%\domain-stop
    echo.
)

echo.
echo fin del procedimiento de instalacion
echo.
pause
