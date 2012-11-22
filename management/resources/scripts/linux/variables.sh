#!/bin/sh
pushd $(dirname "$BASH_SOURCE") > /dev/null
while true
do
    currdir=$(pwd)
    if [ -f "HOME" ]; then
        MHZAP201_HOME=$currdir
        break
    fi
    cd ..
    currdir=$(pwd)
    if [ "$currdir" = "/" ]; then
        MHZAP201_HOME=$HOME/mhzap201
        break
    fi
done
popd > /dev/null
echo MHZAP201_HOME=$MHZAP201_HOME
xs=$MHZAP201_HOME/variables.sh
[ -x "$xs" ] && . "$xs"
