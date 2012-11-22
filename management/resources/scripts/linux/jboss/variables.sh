#!/bin/sh
xs=$scriptpath/../variables.sh
[ -x "$xs" ] && . "$xs"
if [ -n "$variables" ]; then
    eeas=jboss
    EEAS_OVERRIDE=JBoss
fi
