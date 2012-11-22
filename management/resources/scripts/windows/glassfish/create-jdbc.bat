@echo off
cd /d "%~dp0"
echo "%~n0" crea el dominio de seguridad, los conjuntos de conexiones y demas recursos JDBC del servidor de aplicaciones
call ..\setsiono ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof
set variables=
call variables
if not defined variables goto:eof
if /i "%dbmsys%" == "Oracle"     set DS=oracle.jdbc.pool.OracleDataSource
if /i "%dbmsys%" == "PostgreSQL" set DS=org.postgresql.ds.PGConnectionPoolDataSource
if /i "%dbmsys%" == "PostgreSQL" set DS=org.postgresql.ds.PGSimpleDataSource
if /i "%dbmsys%" == "SQLServer"  set DS=com.microsoft.sqlserver.jdbc.SQLServerDataSource
set RT=javax.sql.DataSource
set P1=serverName="%JDBC_HOST%"
set P2=portNumber="%JDBC_PORT%"
set P3=databaseName="%JDBC_DATABASE%"
set P4=driverClass="%JDBC_DRIVER%"
if /i "%dbmsys%" == "Oracle"     set P5=URL="jdbc\:oracle\:thin\:@%JDBC_HOST%\:%JDBC_PORT%\:%JDBC_CONNECTION_ID%"
if /i "%dbmsys%" == "PostgreSQL" set P5=URL="jdbc\:postgresql\://%JDBC_HOST%\:%JDBC_PORT%/%JDBC_DATABASE%"
if /i "%dbmsys%" == "SQLServer"  set P5=URL="jdbc\:sqlserver\://%JDBC_HOST%\:%JDBC_PORT%\;databaseName\=%JDBC_DATABASE%"
set P6=User="%JDBC_USER%"
set P7=Password="%JDBC_PASSWORD%"
if /i "%dbmsys%" == "Oracle"     set PX=%P5%:%P6%:%P7%
if /i "%dbmsys%" == "PostgreSQL" set PX=%P1%:%P2%:%P3%:%P4%:%P5%:%P6%:%P7%
if /i "%dbmsys%" == "SQLServer"  set PX=%P1%:%P2%:%P3%:%P4%:%P5%:%P6%:%P7%
echo.
set JDBC
echo.
set POOLID="%PROJKEY%-pool"
set POOLID
echo.
echo %ASADMIN% %GFDOMAINCST2% create-jdbc-connection-pool --datasourceclassname %DS% --restype %RT% --property %PX% %POOLID%
call %ASADMIN% %GFDOMAINCST2% create-jdbc-connection-pool --datasourceclassname %DS% --restype %RT% --property %PX% %POOLID%
echo.
echo %ASADMIN% %GFDOMAINCST2% ping-connection-pool %POOLID%
call %ASADMIN% %GFDOMAINCST2% ping-connection-pool %POOLID%
echo.
set RESOURCEID="jdbc/%PROJKEY%"
set RESOURCEID
echo.
echo %ASADMIN% %GFDOMAINCST2% create-jdbc-resource --connectionpoolid %POOLID% %RESOURCEID%
call %ASADMIN% %GFDOMAINCST2% create-jdbc-resource --connectionpoolid %POOLID% %RESOURCEID%
echo.
set CLASS=com.sun.enterprise.security.auth.realm.jdbc.JDBCRealm
set P1=jaas-context="jdbcRealm"
set P2=datasource-jndi="jdbc/%PROJKEY%"
set P3=user-table="vista_autenticacion_1"
set P4=user-name-column="codigo_usuario"
set P5=password-column="password_usuario"
set P6=group-table="vista_autenticacion_3"
set P7=group-name-column="codigo_rol"
set P8=digest-algorithm="MD5"
set PX=%P1%:%P2%:%P3%:%P4%:%P5%:%P6%:%P7%:%P8%
echo.
set REALMID="%PROJKEY%-jdbc-realm"
set REALMID
echo.
echo %ASADMIN% %GFDOMAINCST2% create-auth-realm --classname %CLASS% --property %PX% %REALMID%
call %ASADMIN% %GFDOMAINCST2% create-auth-realm --classname %CLASS% --property %PX% %REALMID%
echo.
call ..\eoj "%~f0"
