#!/bin/sh
me=create-jdbc
echo $me crea el dominio de seguridad, los conjuntos de conexiones y demas recursos JDBC del servidor de aplicaciones
read -p "ejecutar $me ? (s/n): " siono
if [ "$siono" = "s" ]; then
    if [ -f "$0" ]; then
        . $(dirname "$0")/variables.sh
        if [ -n "$variables" ]; then
            POOLID="${PROJKEY}-pool"
            DS=org.postgresql.ds.PGSimpleDataSource
            P1=serverName="$JDBC_HOST"
            P2=portNumber="$JDBC_PORT"
            P3=databaseName="$JDBC_DATABASE"
            P4=driverClass="$JDBC_DRIVER"
            P5=URL="jdbc\:postgresql\://$JDBC_HOST\:$JDBC_PORT/$JDBC_DATABASE"
            P6=User="$JDBC_USER"
            P7=Password="$JDBC_PASSWORD"
            PX="${P1}:${P2}:${P3}:${P4}:${P5}:${P6}:${P7}"
            echo ""
        #   echo $POOLID
            echo $ASADMIN $GFDOMAINCST2 create-jdbc-connection-pool --datasourceclassname $DS --property $PX $POOLID
            bash $ASADMIN $GFDOMAINCST2 create-jdbc-connection-pool --datasourceclassname $DS --property $PX $POOLID
            RESOURCEID="jdbc/${PROJKEY}"
            echo ""
        #   echo $RESOURCEID
            echo $ASADMIN $GFDOMAINCST2 create-jdbc-resource --connectionpoolid $POOLID $RESOURCEID
            bash $ASADMIN $GFDOMAINCST2 create-jdbc-resource --connectionpoolid $POOLID $RESOURCEID
            REALMID="${PROJKEY}-jdbc-realm"
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
        #   echo $REALMID
            echo $ASADMIN $GFDOMAINCST2 create-auth-realm --classname $CLASS --property $PX $REALMID
            bash $ASADMIN $GFDOMAINCST2 create-auth-realm --classname $CLASS --property $PX $REALMID
            unset POOLID RESOURCEID REALMID CLASS DS P1 P2 P3 P4 P5 P6 P7 P8 PX
        fi
    else
        echo "Modo de empleo: bash $me.sh"
    fi
fi
unset me siono
