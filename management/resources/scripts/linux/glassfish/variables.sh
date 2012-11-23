#!/bin/sh
eeas=glassfish
EEAS_OVERRIDE=GlassFish
xs=$scriptpath/../variables.sh
[ -x "$xs" ] && . "$xs"
if [ -n "$variables" ]; then
    JDBC_HOST=$dbhost
    JDBC_PORT=$dbport
    JDBC_CONNECTION_ID=$dbconnid
    JDBC_USER=$dbuser
    JDBC_PASSWORD=$dbpass
    JDBC_DATABASE=$dbname
    JDBC_URL=$dbcurl
    JDBC_DRIVER=$driver
    ASADMIN=$GLASSFISH_HOME/bin/asadmin
    GFDOMAINNAME=$domain
    GFDOMAINCDIR=$GLASSFISH_HOME/domains/$GFDOMAINNAME/config
    GFDOMAINCST1=$ascst1
    GFDOMAINCST2=$ascst2
    GFDOMAINCST2=$ascst2
    [ -x "$ASADMIN"      ] || . $scriptpath/unset-variables.sh el archivo "$ASADMIN" no existe
#   [ -f "$aspassfile"   ] || . $scriptpath/unset-variables.sh el archivo "$aspassfile" no existe
    [ -d "$GFDOMAINCDIR" ] || . $scriptpath/unset-variables.sh el directorio "$GFDOMAINCDIR" no existe
fi
