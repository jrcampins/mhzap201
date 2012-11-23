call:set-source-dir
set CVS=%MHZAP201_SOURCE%
set CAP=mhzap201
set CDB=MHZDB201

set DDL=%CVS%\management\resources\database\ddl
set DBS=%CVS%\development\resources\scripts

set FMD=metadata
set FO9=oracle
set FPG=postgresql
set FSS=sqlserver

set PMD=%CDB%_MD
set PO9=%CDB%_O9
set PPG=%CDB%_PG
set PSS=%CDB%_SS

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

:set-source-dir
pushd "%~dp0"
call:set-source-dir-loop
popd
set MHZAP201_SOURCE
goto:eof

:set-source-dir-loop
if exist .svn\nul (
    set MHZAP201_SOURCE=%CD%
    goto:eof
)
cd ..
if "%CD%" == "%~d0\" (
    set MHZAP201_SOURCE=%~d0\mhzap201\source
    goto:eof
)
call:set-source-dir-loop
goto:eof
