@echo off
cd /d "%~dp0"

setlocal
call variables
set log="%~dpn0.log"
if exist %log% del %log%

call:make-development-links
set siono=S
set /p siono="abrir %log% (S/N) ? [%siono%] "
if /i "%siono%" == "S" (start /d %SystemRoot% notepad %log%) else (del %log%)
goto:eof

:make-development-links
pushd %project_source_dir%\development\links
call:make-link-101 ear-conf                     mhzap201\src\conf
call:make-link-101 ejb-business-jms             mhzap201-ejb-business\src\java\com\egt\ejb\business\jms
call:make-link-101 ejb-business-message         mhzap201-ejb-business\src\java\com\egt\ejb\business\message
call:make-link-101 ejb-business-process         mhzap201-ejb-business\src\java\com\egt\ejb\business\process
call:make-link-101 ejb-business-process-logic   mhzap201-ejb-business\src\java\com\egt\ejb\business\process\logic
call:make-link-101 ejb-persistence-entity       mhzap201-ejb-persistence\src\java\com\egt\ejb\persistence\entity
call:make-link-101 ejb-persistence-facade       mhzap201-ejb-persistence\src\java\com\egt\ejb\persistence\facade
call:make-link-101 lib-base-bundles             mhzap201-lib-base\src\com\egt\base\bundles
call:make-link-101 lib-base-constants           mhzap201-lib-base\src\com\egt\base\constants
call:make-link-101 lib-base-entity-constants    mhzap201-lib-base\src\com\egt\base\entity\constants
call:make-link-101 lib-base-enums               mhzap201-lib-base\src\com\egt\base\enums
call:make-link-101 lib-data-general-xdp1        mhzap201-lib-data\src\com\egt\data\general\xdp1
call:make-link-101 lib-data-general-xdp2        mhzap201-lib-data\src\com\egt\data\general\xdp2
call:make-link-101 lib-data-generic-xdp1        mhzap201-lib-data\src\com\egt\data\generic\xdp1
call:make-link-101 lib-data-generic-xdp2        mhzap201-lib-data\src\com\egt\data\generic\xdp2
call:make-link-101 lib-data-specific-xdp1       mhzap201-lib-data\src\com\egt\data\specific\xdp1
call:make-link-101 lib-data-specific-xdp2       mhzap201-lib-data\src\com\egt\data\specific\xdp2
call:make-link-101 xmr-ddl-oracle-data          management\resources\database\ddl\oracle\data
call:make-link-101 xmr-ddl-oracle-views         management\resources\database\ddl\oracle\views\web
call:make-link-101 xmr-ddl-postgresql-data      management\resources\database\ddl\postgresql\data
call:make-link-101 xmr-ddl-postgresql-views     management\resources\database\ddl\postgresql\views\web
call:make-link-101 xmr-ddl-sqlserver-data       management\resources\database\ddl\sqlserver\data
call:make-link-101 xmr-ddl-sqlserver-views      management\resources\database\ddl\sqlserver\views\web
call:make-link-101 xmr-jasper-reports-web       management\resources\jasper\reports\web
call:make-link-101 xxx-scripts-windows          development\resources\scripts\windows
dir /a:-d/o:n *.lnk >> %log% 2>&1
popd
pushd %project_source_dir%\development\resources\database
call:make-link-101 check                        development\resources\scripts\sql\check
call:make-link-102 database                     C:\CVSNT\desarrollo\mhzap201\netbeans\development\resources\database
call:make-link-101 links                        development\links
call:make-link-101 metadata                     development\resources\scripts\sql\metadata
call:make-link-101 scripts                      development\resources\scripts\windows
copy *.lnk mhzdb201
dir /a:-d/o:n *.lnk >> %log% 2>&1
dir /a:-d/o:n mhzdb201\*.lnk >> %log% 2>&1
popd
pushd %project_source_dir%\development\resources\scripts\windows
call:make-link-101 acceso-directo-database      development\resources\database
call:make-link-102 acceso-directo-domain1       N:\glassfish\glassfish\domains\domain1
call:make-link-102 acceso-directo-logs          %~d0\logs
call:make-link-101 acceso-directo-scripts       management\resources\scripts\windows
call:make-link-102 acceso-directo-workspace     %~d0\workspace
call:make-link-101 go-glassfish                 management\resources\scripts\windows\glassfish
call:make-link-101 go-jboss                     management\resources\scripts\windows\jboss
call:make-link-201 domain-debug                 management\resources\scripts\windows\glassfish\domain-debug.bat
call:make-link-201 domain-list                  management\resources\scripts\windows\glassfish\list-components.bat
call:make-link-201 domain-start                 management\resources\scripts\windows\glassfish\domain-start.bat
call:make-link-201 domain-stop                  management\resources\scripts\windows\glassfish\domain-stop.bat
call:make-link-202 go-server-log                N:\glassfish\glassfish\domains\domain1\logs\server.log
dir /a:-d/o:n *.lnk >> %log% 2>&1
popd
goto:eof

:make-link-101
if /i "%~1" == "" goto:eof
if /i "%~2" == "" goto:eof
call:make-link-102 "%~f1" "%project_source_dir%\%2"
goto:eof

:make-link-102
if /i "%~1" == "" goto:eof
if /i "%~2" == "" goto:eof
set xxmklink="%ProgramFiles%\Pixelab\xxmklink"
set spath="%~f1"
set opath="%~f2"
set arg=""
set wdir=""
set desc="%~f2"
set NORMAL=1
set MAXIMIZED=3
set MINIMIZED=7
set mode=%NORMAL%
call:xxmklink %spath% %opath% %arg% %wdir% %desc% %mode% /q
goto:eof

:make-link-201
if /i "%~1" == "" goto:eof
if /i "%~2" == "" goto:eof
call:make-link-202 "%~f1" "%project_source_dir%\%2"
goto:eof

:make-link-202
if /i "%~1" == "" goto:eof
if /i "%~2" == "" goto:eof
set xxmklink="%ProgramFiles%\Pixelab\xxmklink"
set spath="%~f1"
set opath="%~f2"
set arg=""
set wdir=%~dp2
set wdir="%wdir:~0,-1%"
set desc="%~f2"
set NORMAL=1
set MAXIMIZED=3
set MINIMIZED=7
set mode=%NORMAL%
call:xxmklink %spath% %opath% %arg% %wdir% %desc% %mode% /q
goto:eof

:xxmklink
rem xxmklink spath opath [ arg [ wdir [ desc [ mode [ icon[:n] ]]]]] [switches...]
echo %xxmklink% %*
call %xxmklink% %* >> %log% 2>&1
goto:eof
