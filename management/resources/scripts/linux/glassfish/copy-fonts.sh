#!/bin/sh
me=copy-fonts
echo $me copia las fuentes usadas por los informes a la carpeta de configuracion del servidor de aplicaciones
read -p "ejecutar $me ? (s/n): " siono
if [ "$siono" = "s" ]; then
    if [ -f "$BASH_SOURCE" ]; then
        . $(dirname "$BASH_SOURCE")/variables.sh
        if [ -n "$variables" ]; then
            source="$CRVLDIR/resources/jasper/fonts"
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
            unset source target
        fi
    else
        echo "Modo de empleo: bash $me.sh"
    fi
fi
unset me siono
