#!/bin/bash
scriptname=$(basename "$BASH_SOURCE")
scriptpath=`cd $(dirname "$BASH_SOURCE"); pwd`
me=$scriptname
xs=$scriptpath/variables.sh
unset variables
[ -x "$xs" ] && source "$xs"
[ -z "$variables" ] && exit 100 # environment variables not set
echo $me crea el dominio de seguridad, los conjuntos de conexiones y demas recursos JDBC
read -p "ejecutar $me? (s/n): " -n 1; echo ""; REPLY=`echo $REPLY|tr '[:upper:]' '[:lower:]'`
[ "$REPLY" != "s" ] && exit 101 # cancelled by user
[ "$DBMSKEY" = "Oracle"     ] && DS=oracle.jdbc.pool.OracleDataSource
[ "$DBMSKEY" = "PostgreSQL" ] && DS=org.postgresql.ds.PGSimpleDataSource
RT=javax.sql.DataSource
P1=serverName="$dbhost"
P2=portNumber="$dbport"
P3=databaseName="$dbname"
P4=driverClass="$driver"
[ "$DBMSKEY" = "Oracle"     ] && P5=URL="jdbc\:oracle\:thin\:@$dbhost\:$dbport\:$dbserv"
[ "$DBMSKEY" = "PostgreSQL" ] && P5=URL="jdbc\:postgresql\://$dbhost\:$dbport/$dbname"
P6=User="$dbuser"
P7=Password="$dbpass"
[ "$DBMSKEY" = "Oracle"     ] && PX="${P5}:${P6}:${P7}"
[ "$DBMSKEY" = "PostgreSQL" ] && PX="${P1}:${P2}:${P3}:${P4}:${P5}:${P6}:${P7}"
echo ""
POOLID="${lower_case_project}-pool"
echo $ASADMIN $ascst2 create-jdbc-connection-pool --datasourceclassname $DS --restype $RT --property $PX $POOLID
bash $ASADMIN $ascst2 create-jdbc-connection-pool --datasourceclassname $DS --restype $RT --property $PX $POOLID
echo ""
echo $ASADMIN $ascst2 ping-connection-pool $POOLID
bash $ASADMIN $ascst2 ping-connection-pool $POOLID
echo ""
RESOURCEID="jdbc/${lower_case_project}"
echo $ASADMIN $ascst2 create-jdbc-resource --connectionpoolid $POOLID $RESOURCEID
bash $ASADMIN $ascst2 create-jdbc-resource --connectionpoolid $POOLID $RESOURCEID
REALMID="${lower_case_project}-jdbc-realm"
CLASS=com.sun.enterprise.security.auth.realm.jdbc.JDBCRealm
P1=jaas-context="jdbcRealm"
P2=datasource-jndi="$RESOURCEID"
P3=user-table="vista_autenticacion_1"
P4=user-name-column="codigo_usuario"
P5=password-column="password_usuario"
P6=group-table="vista_autenticacion_3"
P7=group-name-column="codigo_rol"
P8=digest-algorithm="MD5"
PX="${P1}:${P2}:${P3}:${P4}:${P5}:${P6}:${P7}:${P8}"
echo ""
echo $ASADMIN $ascst2 create-auth-realm --classname $CLASS --property $PX $REALMID
bash $ASADMIN $ascst2 create-auth-realm --classname $CLASS --property $PX $REALMID
