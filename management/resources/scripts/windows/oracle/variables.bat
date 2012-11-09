set O9HOST=
set O9PORT=
set O9USER=
set O9PASSWORD=
set O9PASSFILE=
set O9DATABASE=
set O9BINDIR=
set BACKUPDIR=
set SQLDDLDIR=
set SQLDATDIR=

set DBMS_OVERRIDE=Oracle
set dbms=oracle

call ..\variables
if not defined variables goto:eof

set O9HOST=%dbhost%
set O9PORT=%dbport%
set O9USER=%dbuser%
set O9PASSWORD=%dbpass%
set O9PASSFILE=%dbpassfile%
set O9DATABASE=%dbname%
set O9BINDIR="%ORACLE_HOME%\bin"
set BACKUPDIR="%HOMEDIR%\backup"
set SQLDDLDIR="%CRVLDIR%\resources\database\ddl"
set SQLDATDIR="%SQLSERVER_MSSQL%\data"
if not exist %BACKUPDIR% md %BACKUPDIR%
if not exist %SQLDDLDIR% md %SQLDDLDIR%
if not exist %BACKUPDIR% call ..\unset-variables el directorio %BACKUPDIR% no existe
if not exist %SQLDDLDIR% call ..\unset-variables el directorio %SQLDDLDIR% no existe
if not exist %O9BINDIR% call ..\unset-variables el directorio %O9BINDIR% no existe
