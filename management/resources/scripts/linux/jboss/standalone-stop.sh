#!/bin/bash
scriptname=$(basename "$BASH_SOURCE")
scriptpath=`cd $(dirname "$BASH_SOURCE"); pwd`
me=$scriptname
xs=$scriptpath/variables.sh
unset variables
[ -x "$xs" ] && source "$xs"
[ -z "$variables" ] && exit 100 # environment variables not set
echo $me detiene la ejecucion del servidor de aplicaciones
read -p "ejecutar $me? (s/n): " -n 1; echo ""
[ "$REPLY" != "s" ] && exit 101 # cancelled by user
cd $JBOSS_HOME
echo bin/jboss-cli.sh $ascst2 command=:shutdown
bash bin/jboss-cli.sh $ascst2 command=:shutdown
