set ashost=
set asport=
set asuser=
set aspass=
set aspassfile=
set ascst1=
set ascst2=
set domain=
set jbhost=
set jbport=
set jbuser=
set jbpjbs=
set jbpassfile=
set jbcst1=
set jbcst2=
set offset=
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
set aspassfile=%HOMEDIR%\asadmin.password
set ascst1=--user %asuser% --passwordfile %aspassfile%
set ascst2=--host %ashost% --port %asport% %ascst1%
set ascst2=--host %ashost% --port %asport%
set domain=domain1
goto:eof

:setJBoss
rem
rem parametros para la conexion al servidor de aplicaciones JBoss
rem
set jbhost=localhost
set jbport=9999
set jbuser=admin
set jbpass=sesamo
rem jbpassfile=%HOMEDIR%\jbadmin.password
rem jbcst1=--user %jbuser% --passwordfile %jbpassfile%
rem jbcst2=--connect controller=%jbhost%:%jbport% %jbcst1%
set jbcst2=--connect controller=%jbhost%:%jbport%
set offset=-Djboss.socket.binding.port-offset=0
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
rem dbpassfile=%HOMEDIR%\oradmin.password
set dbname=MHZDB201
set dbcurl=jdbc:oracle:thin:@%dbhost%:%dbport%:%dbconnid%
set driver=oracle.jdbc.OracleDriver
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
rem dbpassfile=%HOMEDIR%\pgadmin.password
set dbname=MHZDB201
set dbcurl=jdbc:postgresql://%dbhost%:%dbport%/%dbname%
set driver=org.postgresql.Driver
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
rem dbpassfile=%HOMEDIR%\ssadmin.password
set dbname=MHZDB201
set dbcurl=jdbc:sqlserver://%dbhost%:%dbport%;databaseName=MHZDB201
set driver=com.microsoft.sqlserver.jdbc.SQLServerDriver
goto:eof
