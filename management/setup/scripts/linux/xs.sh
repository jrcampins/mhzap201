#!/bin/bash
scriptname=$(basename "$BASH_SOURCE")
scriptpath=`cd $(dirname "$BASH_SOURCE"); pwd`
xs=$scriptpath/resources/scripts/linux/$scriptname
[ -x "$xs" ] && . $xs install
