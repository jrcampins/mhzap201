#!/bin/sh
me=upgrade
if [ -f "$0" ]; then
    cd $(dirname "$0")
    wd=$(pwd)
    xs=$wd/resources/scripts/linux/setup/setup.sh
    if [ -x "$xs" ]; then
    #   export CRVLDIR="$wd"
        clear
        $xs $wd $me
    fi
else
    echo "Modo de empleo: bash $me.sh"
fi
unset me wd xs
