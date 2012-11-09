set SSHOST=
set SSPORT=
set SSUSER=
set SSPASS=
set SSDATABASE=
set SSPASSFILE=
set SSBINDIR=
set BACKUPDIR=
set SQLDDLDIR=
set SQLDATDIR=

set DBMS_OVERRIDE=SQLServer
set dbms=sqlserver

call ..\variables
if not defined variables goto:eof

set SSHOST=%dbhost%
set SSPORT=%dbport%
set SSUSER=%dbuser%
set SSPASS=%dbpass%
set SSPASSFILE=%dbpassfile%
set SSDATABASE=%dbname%
set SSBINDIR="%SQLSERVER_TOOLS%\Binn"
set BACKUPDIR="%HOMEDIR%\backup"
set SQLDDLDIR="%CRVLDIR%\resources\database\ddl"
set SQLDATDIR="%SQLSERVER_MSSQL%\Data"
if not exist %BACKUPDIR% md %BACKUPDIR%
if not exist %SQLDDLDIR% md %SQLDDLDIR%
if not exist %BACKUPDIR% call ..\unset-variables el directorio %BACKUPDIR% no existe
if not exist %SQLDDLDIR% call ..\unset-variables el directorio %SQLDDLDIR% no existe
if not exist %SSBINDIR%  call ..\unset-variables el directorio %PGBINDIR% no existe
