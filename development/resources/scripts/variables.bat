set project=mhzap201
set project_source_dir=%~d0\%project%\source
set project
echo.

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
