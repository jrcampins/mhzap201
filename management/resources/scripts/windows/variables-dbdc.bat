set ashost=
set asport=
set asuser=
set aspass=
set aspassfile=
set ascst1=
set ascst2=
set jbhost=
set jbport=
set jbuser=
set jbpjbs=
set jbpassfile=
set jbcst1=
set jbcst2=
set domain=
set dbmsys=
set dbhost=
set dbport=
set dbconnid=
set dbuser=
set dbpass=
set dbpassfile=
set dbname=
set dbcurl=
set driver=
set LOWER_EEASKEY=
set UPPER_EEASKEY=
set LOWER_DBMSKEY=
set UPPER_DBMSKEY=
if not defined variables goto:eof

if /i "%EEASKEY%" == "GlassFish"  call:setGlassFish
if /i "%EEASKEY%" == "JBoss"      call:setJBoss
if /i "%DBMSKEY%" == "Oracle"     call:setOracle
if /i "%DBMSKEY%" == "PostgreSQL" call:setPostgreSQL
if /i "%DBMSKEY%" == "SQLServer"  call:setSQLServer
goto:eof

:setGlassFish
rem
rem parametros para la conexion al servidor de aplicaciones GlassFish
rem
set ashost=localhost
set asport=4848
set asuser=admin
set aspass=admin
set aspassfile="%HOMEDIR%\asadmin.password"
set ascst1=--user %asuser% --passwordfile %aspassfile%
set ascst2=--host %ashost% --port %asport% %ascst1%
set domain=domain1
set LOWER_EEASKEY=glassfish
set UPPER_EEASKEY=GLASSFISH
goto:eof

:setJBoss
rem
rem parametros para la conexion al servidor de aplicaciones JBoss
rem
set jbhost=localhost
set jbport=9990
set jbuser=admin
set jbpass=sesamo
set jbpassfile="%HOMEDIR%\jbadmin.password"
set jbcst1=--user %jbuser% --passwordfile %jbpassfile%
set jbcst2=--host %jbhost% --port %jbport% %jbcst1%
set domain=server-one
set LOWER_EEASKEY=jboss
set UPPER_EEASKEY=JBOSS
goto:eof

:setOracle
rem
rem parametros para la conexion al servidor de base de datos Oracle
rem
set dbmsys=Oracle
set dbhost=localhost
set dbport=1521
set dbconnid=XE
set dbuser=MHZ
set dbpass=sesamo
set dbpassfile="%HOMEDIR%\oradmin.password"
set dbname=MHZDB201
set dbcurl=jdbc:oracle:thin:@%dbhost%:%dbport%:%dbconnid%
set driver=oracle.jdbc.OracleDriver
set LOWER_DBMSKEY=oracle
set UPPER_DBMSKEY=ORACLE
goto:eof

:setPostgreSQL
rem
rem parametros para la conexion al servidor de base de datos PostgreSQL
rem
set dbmsys=PostgreSQL
set dbhost=localhost
set dbport=5432
set dbuser=postgres
set dbpass=postgres
set dbpassfile="%HOMEDIR%\pgadmin.password"
set dbname=MHZDB201
set dbcurl=jdbc:postgresql://%dbhost%:%dbport%/%dbname%
set driver=org.postgresql.Driver
set LOWER_DBMSKEY=postgresql
set UPPER_DBMSKEY=POSTGRESQL
goto:eof

:setSQLServer
rem
rem parametros para la conexion al servidor de base de datos SQLServer
rem
set dbmsys=SQLServer
set dbhost=localhost
set dbport=1433
set dbuser=sa
set dbpass=sa
set dbpassfile=
set dbname=MHZDB201
set dbcurl=jdbc:sqlserver://%dbhost%:%dbport%;databaseName=MHZDB201
set driver=com.microsoft.sqlserver.jdbc.SQLServerDriver
set LOWER_DBMSKEY=sqlserver
set UPPER_DBMSKEY=SQLSERVER
goto:eof
