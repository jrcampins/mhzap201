#!/bin/sh
if [ ! -f "$0" ]; then
    exit 1
fi

pushd $(dirname "$0") > /dev/null
while true
do
    pwd
    root=$(pwd)
    if [ -f "root" ]; then
        break
    fi
    cd ..
    if [ "$root" = "$(pwd)" ]; then
        break
    fi
done
popd > /dev/null
