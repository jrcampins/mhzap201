#!/bin/sh
unset variables
pushd $(dirname "$BASH_SOURCE") > /dev/null
while true
do
    currdir=$(pwd)
    if [ -f "HOME" ]; then
        MHZAP201_HOME=$currdir
        break
    fi
    cd ..
    if [ "$currdir" = "$(pwd)" ]; then
        MHZAP201_HOME=${currdir}mhzap201/home
        break
    fi
done
popd > /dev/null
xs=$MHZAP201_HOME/variables.sh
# [ -x "$xs" ] && echo "$xs"
[ -x "$xs" ] && . "$xs"
