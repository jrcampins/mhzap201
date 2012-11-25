#!/bin/sh
scriptpath=`cd $(dirname "$BASH_SOURCE"); pwd`
xs=$scriptpath/resources/scripts/linux/setup/setup.sh
[ -x "$xs" ] && . $xs install
