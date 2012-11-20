#!/bin/sh
me=upgrade
if [ -f "$BASH_SOURCE" ]; then
    cd $(dirname "$BASH_SOURCE")
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
