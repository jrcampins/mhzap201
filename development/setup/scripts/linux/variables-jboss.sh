#!/bin/sh
#
#   parametros para la conexion al servidor de aplicaciones JBoss
#
ashost="localhost"
asport="9999"
asuser="admin"
aspass="admin"
ascst1="--user ${asuser} --password ${aspass}"
ascst2="--connect controller=$ashost:$asport ${ascst1}"
ascst2="--connect controller=$ashost:$asport"
offset="-Djboss.socket.binding.port-offset=0"
