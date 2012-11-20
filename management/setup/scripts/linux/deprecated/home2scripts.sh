#!/bin/sh
me=home2scripts
if [ -f "$0" ]; then
    cd $(dirname "$0")
    wd=$(pwd)
    xs=$wd/resources/scripts/linux/variables-home.sh
    echo export MHZAP201_HOME=$(dirname "$wd")>>$xs
    cat $xs
else
    echo "Modo de empleo: bash $me.sh"
fi
unset me wd xs
