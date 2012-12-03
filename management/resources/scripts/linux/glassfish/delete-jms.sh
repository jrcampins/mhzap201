#!/bin/bash
scriptname=$(basename "$BASH_SOURCE")
scriptpath=`cd $(dirname "$BASH_SOURCE"); pwd`
me=$scriptname
xs=$scriptpath/variables.sh
unset variables
[ -x "$xs" ] && . "$xs"
if [ -n "$variables" ]; then
    echo $me elimina las fabricas de conexiones, conjuntos de conexiones y demas recursos JMS del servidor de aplicaciones
    read -p "ejecutar $me ? (s/n): " siono
    if [ "$siono" = "s" ]; then
        S1=MessageFactoryPool
        S2=MessageFactory
        S3=MessageQueue
    #   for P1 in "BusinessProcess" "UtilityProcess" "ToolKit"; do
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
    fi
fi
