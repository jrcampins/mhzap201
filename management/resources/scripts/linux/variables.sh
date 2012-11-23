#!/bin/sh
pushd $(dirname "$BASH_SOURCE") > /dev/null
while true
do
    if [ -f "HOME" ]; then
        homedir=$(pwd)
        break
    fi
    cd ..
    if [ "$(pwd)" = "/" ]; then
        homedir=$HOME/mhzap201
        break
    fi
done
popd > /dev/null
echo HOME=$homedir
xs=$homedir/variables.sh
[ -x "$xs" ] && . "$xs"
