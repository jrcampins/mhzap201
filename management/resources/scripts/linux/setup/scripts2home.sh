#!/bin/sh 
scriptname=$(basename "$BASH_SOURCE")
scriptpath=`cd $(dirname "$BASH_SOURCE"); pwd`
me=$scriptname
xs=$scriptpath/variables.sh
# [ -x "$xs" ] && echo "$xs"
[ -x "$xs" ] && . "$xs"
if [ -n "$variables" ]; then
    echo $me copia los archivos de configuracion a $MHZAP201_HOME
    read -p "ejecutar $me ? (s/n): " siono
    if [ "$siono" = "s" ]; then
        p1=$MHZAP201_HOME/resources/scripts/asadmin.password
        s1=$MHZAP201_HOME/resources/scripts/linux/variables.sh
        s2=$MHZAP201_HOME/resources/scripts/linux/variables-home.sh
        s3=$MHZAP201_HOME/resources/scripts/linux/variables-dbdc.sh
        [ -f $p1 ] && cp -i $p1 $MHZAP201_HOME
        [ -f $s1 ] && cp -i $s1 $MHZAP201_HOME
        [ -f $s2 ] && cp -i $s2 $MHZAP201_HOME
        [ -f $s3 ] && cp -i $s3 $MHZAP201_HOME
        chmod 0600 $p1
        chmod 0777 $s1
        chmod 0777 $s2
        chmod 0777 $s3
        ls -l $MHZAP201_HOME
fi
