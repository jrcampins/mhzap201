#!/bin/sh
#
#   parametros para la conexion al servidor de aplicaciones GlassFish
#
ashost="localhost"
asport="4848"
asuser="admin"
aspass="admin"
aspassfile="$HOMEDIR/asadmin.password"
case "`uname`" in
    CYGWIN*) aspassfile=`cygpath --windows $aspassfile`
esac
domain="domain1"
