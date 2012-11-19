#!/bin/sh
if [ ! -f "$0" ]; then
    exit 1
fi

unset HOMEDIR
pushd $(dirname "$0") > /dev/null
while true
do
    pwd
    currdir=$(pwd)
    if [ -f "HOME" ]; then
        HOMEDIR=$currdir
        break
    fi
    cd ..
    if [ "$currdir" = "$(pwd)" ]; then
        HOMEDIR=${currdir}mhzap201/home
        break
    fi
done
popd > /dev/null
export HOMEDIR
echo HOMEDIR=$HOMEDIR
