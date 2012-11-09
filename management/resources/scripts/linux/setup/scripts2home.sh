#!/bin/sh 
me=scripts2home
export MHZAP201_HOME=${MHZAP201_HOME:-"$HOME/mhzap201"}
xs="$MHZAP201_HOME/variables-home.sh"
[ -d "$MHZAP201_HOME" -a -x "$xs" ] && . "$xs"
unset xs

[ -d "$MHZAP201_HOME"   ] || echo La variable de entorno MHZAP201_HOME no esta correctamente definida
[ -d "$GLASSFISH_HOME"  ] || echo La variable de entorno GLASSFISH_HOME no esta correctamente definida
[ -d "$POSTGRESQL_HOME" ] || echo La variable de entorno POSTGRESQL_HOME no esta correctamente definida

if [ -d "$MHZAP201_HOME" ]; then
    echo $me copia los archivos de configuracion a $MHZAP201_HOME
    read -p "ejecutar $me ? (s/n): " siono
    if [ "$siono" = "s" ]; then
        if [ -d "$1" ]; then
            cd "$1"
            wd=$(pwd)/resources/scripts

            p1=$wd/asadmin.password
            p2=$wd/pgadmin.password

            s1=$wd/linux/variables.sh
            s2=$wd/linux/variables-home.sh
            s3=$wd/linux/variables-dbdc.sh
            s4=$wd/linux/variables-j2ee.sh

            [ -f $p1 ] && cp -i $p1 $MHZAP201_HOME
            [ -f $p2 ] && cp -i $p2 $MHZAP201_HOME

            [ -f $s1 ] && cp -i $s1 $MHZAP201_HOME
            [ -f $s2 ] && cp -i $s2 $MHZAP201_HOME
            [ -f $s3 ] && cp -i $s3 $MHZAP201_HOME
            [ -f $s4 ] && cp -i $s4 $MHZAP201_HOME

            chmod 0600 $p1
            chmod 0600 $p2

            chmod 0777 $s1
            chmod 0777 $s2
            chmod 0777 $s3
            chmod 0777 $s4

            ls -l $MHZAP201_HOME
        else
            echo "Modo de empleo: bash $me.sh"
        fi
    fi
fi
echo ""
unset me wd p1 p2 s1 s2 s3 s4 siono
