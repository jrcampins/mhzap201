#!/bin/bash
scriptname=$(basename "$BASH_SOURCE")
scriptpath=`cd $(dirname "$BASH_SOURCE"); pwd`
me=$scriptname
xs=$scriptpath/variables.sh
unset variables
[ -x "$xs" ] && source "$xs"
[ -z "$variables" ] && exit 100 # environment variables not set
echo $me elimina las fabricas de conexiones, conjuntos de conexiones y demas recursos JMS
read -p "ejecutar $me? (s/n): " -n 1; echo ""; REPLY=`echo $REPLY|tr '[:upper:]' '[:lower:]'`
[ "$REPLY" != "s" ] && exit 101 # cancelled by user
S1=MessageFactoryPool
S2=MessageFactory
S3=MessageQueue
for P1 in "BusinessProcess" "UtilityProcess"; do
    echo ""
    echo $P1
    for Q1 in "Request" "Reply" "Return"; do
        echo ""
        echo $Q1
        echo ""
        echo $ASADMIN $ascst2 delete-admin-object "jms/$P1$Q1$S3"
        bash $ASADMIN $ascst2 delete-admin-object "jms/$P1$Q1$S3"
    done
    echo ""
    echo $ASADMIN $ascst2 delete-connector-resource "jms/$P1$S2"
    bash $ASADMIN $ascst2 delete-connector-resource "jms/$P1$S2"
    echo ""
    echo $ASADMIN $ascst2 delete-connector-connection-pool "jms/$P1$S1"
    bash $ASADMIN $ascst2 delete-connector-connection-pool "jms/$P1$S1"
done
