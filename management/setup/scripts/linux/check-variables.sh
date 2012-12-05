#!/bin/bash
on_info_messages="echo"
on_warning_messages="echo"
scriptpath=`cd $(dirname "$BASH_SOURCE"); pwd`
xs=$scriptpath/variables.sh
[ -x "$xs" ] && source "$xs"
