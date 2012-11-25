#!/bin/sh
on_properly_defined_variables="echo"
scriptpath=`cd $(dirname "$BASH_SOURCE"); pwd`
xs=$scriptpath/variables.sh
[ -x "$xs" ] && . $xs
