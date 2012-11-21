@echo off
cd /d "%~dp0"
call variables
if not defined variables goto:eof

echo "%~n0" desinstala y reinstala los componentes de la aplicacion de empresa en el servidor de aplicaciones y en el servidor de base de datos
call ..\setsiono ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof

set resources=%MHZAP201_HOME%\resources
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

if /i "%1" == "uninstall" (
    call %postgresql%\dropdb
    echo.
)

if /i "%1" == "upgrade" (
    call %postgresql%\upgradedb
    echo.
)

if defined upgrade_or_install (
    call %postgresql%\createdb
    echo.
    call ..\setsiono restaurar de la base de datos a partir de un archivo respaldo
)

if defined upgrade_or_install (
    if /i "%siono%" == "S" (
        call %postgresql%\restore
        echo.
    ) else (
        call %postgresql%\makedb
        echo.
    )
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
)

goto:eof
