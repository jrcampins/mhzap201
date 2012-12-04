#!/bin/bash
scriptname=$(basename "$BASH_SOURCE")
scriptpath=`cd $(dirname "$BASH_SOURCE"); pwd`
me=$scriptname
xs=$scriptpath/variables.sh
unset variables
[ -x "$xs" ] && source "$xs"
[ -z "$variables" ] && exit 100 # environment variables not set
echo $me detiene la ejecucion del dominio $domain
read -p "ejecutar $me? (s/n): " -n 1; echo ""
[ "$REPLY" != "s" ] && exit 101 # cancelled by user
echo ""
echo $ASADMIN $ascst1 stop-domain $domain
bash $ASADMIN $ascst1 stop-domain $domain
