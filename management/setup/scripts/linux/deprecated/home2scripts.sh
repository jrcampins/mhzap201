#!/bin/sh
me=home2scripts
if [ -f "$BASH_SOURCE" ]; then
    cd $(dirname "$BASH_SOURCE")
    wd=$(pwd)
    xs=$wd/resources/scripts/linux/variables-home.sh
    echo export MHZAP201_HOME=$(dirname "$wd")>>$xs
    cat $xs
else
    echo "Modo de empleo: bash $me.sh"
fi
unset me wd xs
