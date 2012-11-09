set PGHOST=
set PGPORT=
set PGUSER=
set PGPASSWORD=
set PGPASSFILE=
set PGDATABASE=
set PGBINDIR=
set BACKUPDIR=
set SQLDDLDIR=
set SQLDATDIR=

set DBMS_OVERRIDE=PostgreSQL
set dbms=postgresql

call ..\variables
if not defined variables goto:eof

set PGHOST=%dbhost%
set PGPORT=%dbport%
set PGUSER=%dbuser%
set PGPASSWORD=%dbpass%
set PGPASSFILE=%dbpassfile%
set PGDATABASE=%dbname%
set PGBINDIR="%POSTGRESQL_HOME%\bin"
set BACKUPDIR="%HOMEDIR%\backup"
set SQLDDLDIR="%CRVLDIR%\resources\database\ddl"
set SQLDATDIR="%SQLSERVER_MSSQL%\data"
if not exist %BACKUPDIR% md %BACKUPDIR%
if not exist %SQLDDLDIR% md %SQLDDLDIR%
if not exist %BACKUPDIR% call ..\unset-variables el directorio %BACKUPDIR% no existe
if not exist %SQLDDLDIR% call ..\unset-variables el directorio %SQLDDLDIR% no existe
if not exist %PGBINDIR%  call ..\unset-variables el directorio %PGBINDIR% no existe
