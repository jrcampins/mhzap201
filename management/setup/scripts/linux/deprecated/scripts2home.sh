#!/bin/sh
me=scripts2home
if [ -f "$0" ]; then
    cd $(dirname "$0")
    wd=$(pwd)
    xs=$wd/resources/scripts/linux/setup/$me.sh
    if [ -x "$xs" ]; then
    #   export CRVLDIR="$wd"
        clear
        $xs $wd $me
    fi
else
    echo "Modo de empleo: bash $me.sh"
fi
unset me wd xs
