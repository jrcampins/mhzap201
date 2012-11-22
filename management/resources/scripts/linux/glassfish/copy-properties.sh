#!/bin/sh
scriptname=$(basename "$BASH_SOURCE")
scriptpath=`cd $(dirname "$BASH_SOURCE"); pwd`
me=$scriptname
xs=$scriptpath/variables.sh
unset variables
[ -x "$xs" ] && . "$xs"
if [ -n "$variables" ]; then
    echo $me copia los archivos de propiedades a la carpeta de configuracion del servidor de aplicaciones
    read -p "ejecutar $me ? (s/n): " siono
    if [ "$siono" = "s" ]; then
        source="$CRVLDIR/resources/bootstrapping/$EEASDIR/$DBMSDIR/linux"
        if [ -d $source ]; then
            target="$GLASSFISH_HOME/domains/$GFDOMAINNAME/resources"
            [ -d "$target" ] || mkdir -p "$target"
            cp $source/* $target
            ls -l "$target"
            target="$GLASSFISH_HOME/domains/$GFDOMAINNAME/config/resources"
            [ -d "$target" ] || mkdir -p "$target"
            cp $source/* $target
            ls -l "$target"
        fi
    fi
fi
