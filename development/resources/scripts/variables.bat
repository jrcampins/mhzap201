set project=mhzap201
call:set-project-source-dir
call:set-further-variables
goto:eof

:set-further-variables
call %project_source_dir%\management\setup\scripts\windows\variables-date-time
set CVS=%project_source_dir%
set CAP=%project%
set CDB=MHZDB201
set DDL=%CVS%\management\resources\database\ddl
set DBS=%CVS%\development\resources\scripts
set FMD=metadata
set FO9=oracle
set FPG=postgresql
set FSS=sqlserver
set PMD=%CDB%
set PO9=%CDB%
set PPG=%CDB%
set PSS=%CDB%
set SMD=%FMD%\%PSS%
set SO9=%FO9%\%PO9%
set SPG=%FPG%\%PPG%
set SSS=%FSS%\%PSS%
set TMD=metadata\ext\%PMD%
set TO9=oracle\ext\%PO9%
set TPG=postgresql\ext\%PPG%
set TSS=sqlserver\ext\%PSS%
set BMD=%DBS%\%CDB%BMD.sql
set BSS=%DBS%\%CDB%BSS.sql
set EMD=%DBS%\%CDB%EMD.sql
set ESS=%DBS%\%CDB%ESS.sql
set>"%~dpn0.log"
goto:eof

:set-project-source-dir
set project_source_dir=
pushd "%~dp0"
call:set-project-source-dir-loop
popd
goto:eof

:set-project-source-dir-loop
if exist .metadata set project_source_dir=%CD%
if defined project_source_dir goto:eof
cd ..
if "%CD%" == "%~d0\" (
    set project_source_dir=%~d0\%project%\source
    goto:eof
)
call:set-project-source-dir-loop
goto:eof
