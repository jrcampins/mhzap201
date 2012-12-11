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
echo dir *.lnk /b ^> links.txt
call:make-dir-link ear-conf                     mhzap201\src\conf
call:make-dir-link ejb-business-jms             mhzap201-ejb-business\src\java\com\egt\ejb\business\jms
call:make-dir-link ejb-business-message         mhzap201-ejb-business\src\java\com\egt\ejb\business\message
call:make-dir-link ejb-business-process         mhzap201-ejb-business\src\java\com\egt\ejb\business\process
call:make-dir-link ejb-business-process-logic   mhzap201-ejb-business\src\java\com\egt\ejb\business\process\logic
call:make-dir-link ejb-persistence-entity       mhzap201-ejb-persistence\src\java\com\egt\ejb\persistence\entity
call:make-dir-link ejb-persistence-facade       mhzap201-ejb-persistence\src\java\com\egt\ejb\persistence\facade
call:make-dir-link lib-base-bundles             mhzap201-lib-base\src\com\egt\base\bundles
call:make-dir-link lib-base-constants           mhzap201-lib-base\src\com\egt\base\constants
call:make-dir-link lib-base-entity-constants    mhzap201-lib-base\src\com\egt\base\entity\constants
call:make-dir-link lib-base-enums               mhzap201-lib-base\src\com\egt\base\enums
call:make-dir-link lib-data-general-xdp1        mhzap201-lib-data\src\com\egt\data\general\xdp1
call:make-dir-link lib-data-general-xdp2        mhzap201-lib-data\src\com\egt\data\general\xdp2
call:make-dir-link lib-data-generic-xdp1        mhzap201-lib-data\src\com\egt\data\generic\xdp1
call:make-dir-link lib-data-generic-xdp2        mhzap201-lib-data\src\com\egt\data\generic\xdp2
call:make-dir-link lib-data-specific-xdp1       mhzap201-lib-data\src\com\egt\data\specific\xdp1
call:make-dir-link lib-data-specific-xdp2       mhzap201-lib-data\src\com\egt\data\specific\xdp2
call:make-dir-link xmr-ddl-oracle-data          management\resources\database\ddl\oracle\data
call:make-dir-link xmr-ddl-oracle-views         management\resources\database\ddl\oracle\views\web
call:make-dir-link xmr-ddl-postgresql-data      management\resources\database\ddl\postgresql\data
call:make-dir-link xmr-ddl-postgresql-views     management\resources\database\ddl\postgresql\views\web
call:make-dir-link xmr-ddl-sqlserver-data       management\resources\database\ddl\sqlserver\data
call:make-dir-link xmr-ddl-sqlserver-views      management\resources\database\ddl\sqlserver\views\web
call:make-dir-link xmr-jasper-reports-web       management\resources\jasper\reports\web
call:make-dir-link xxx-scripts-windows          development\resources\scripts\windows
dir /a:-d/o:n *.lnk >> %log% 2>&1
popd
goto:eof

:make-dir-link
if /i "%~1" == "" goto:eof
if /i "%~2" == "" goto:eof
rem xxmklink spath opath [ arg [ wdir [ desc [ mode [ icon[:n] ]]]]] [switches...]
set xxmklink="%ProgramFiles%\Pixelab\xxmklink"
set spath="%~f1"
set opath="%project_source_dir%\%2"
set arg=""
set wdir=""
set desc=""
set NORMAL=1
set MAXIMIZED=3
set MINIMIZED=7
set mode=%NORMAL%
call:xxmklink %spath% %opath% %arg% %wdir% %desc% %mode%
goto:eof

:xxmklink
echo %xxmklink% %*
call %xxmklink% %* >> %log% 2>&1
goto:eof
