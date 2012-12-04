#!/bin/bash
scriptname=$(basename "$BASH_SOURCE")
scriptpath=`cd $(dirname "$BASH_SOURCE"); pwd`
me=$scriptname
xs=$scriptpath/variables.sh
unset variables
[ -x "$xs" ] && source "$xs"
[ -z "$variables" ] && exit 100 # environment variables not set
echo $me despliega la aplicacion de empresa
read -p "ejecutar $me? (s/n): " -n 1; echo ""; REPLY=`echo $REPLY|tr '[:upper:]' '[:lower:]'`
[ "$REPLY" != "s" ] && exit 101 # cancelled by user
ear="$DISTDIR/${lower_case_project}.ear"
if [ ! -f $ear ]; then
    echo el archivo "$ear" no existe
    exit 113 # unexpected condition encountered
fi
case "`uname`" in
    CYGWIN*) ear=`cygpath --windows $ear`
esac
cd $JBOSS_HOME
echo bin/jboss-cli.sh $ascst2 --command="deploy $ear"
bash bin/jboss-cli.sh $ascst2 --command="deploy $ear"
