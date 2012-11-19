#!/bin/sh
if [ ! -f "$0" ]; then
    exit 1
fi

unset SOURCEDIR
pushd $(dirname "$0") > /dev/null
while true
do
    pwd
    currdir=$(pwd)
    if [ -d ".svn" ]; then
        SOURCEDIR=$currdir
        break
    fi
    cd ..
    if [ "$currdir" = "$(pwd)" ]; then
        SOURCEDIR=${currdir}mhzap201/source
        break
    fi
done
popd > /dev/null
export SOURCEDIR
echo SOURCEDIR=$SOURCEDIR
