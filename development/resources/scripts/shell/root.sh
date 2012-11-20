#!/bin/sh
if [ ! -f "$BASH_SOURCE" ]; then
    exit 1
fi

unset ROOTDIR
pushd $(dirname "$BASH_SOURCE") > /dev/null
while true
do
    pwd
    currdir=$(pwd)
    if [ -f "ROOT" ]; then
        ROOTDIR=$currdir
        break
    fi
    cd ..
    if [ "$currdir" = "$(pwd)" ]; then
        ROOTDIR=${currdir}mhzap201/root
        break
    fi
done
popd > /dev/null
export ROOTDIR
echo ROOTDIR=$ROOTDIR
