#!/bin/bash
scriptname=$(basename "$BASH_SOURCE")
scriptpath=`cd $(dirname "$BASH_SOURCE"); pwd`
me=$scriptname
xs=$scriptpath/variables.sh
unset variables
[ -x "$xs" ] && source "$xs"
[ -z "$variables" ] && exit 100 # environment variables not set
echo $me crea las fabricas de conexiones, conjuntos de conexiones y demas recursos JMS
read -p "ejecutar $me? (s/n): " -n 1; echo ""; REPLY=`echo $REPLY|tr '[:upper:]' '[:lower:]'`
[ "$REPLY" != "s" ] && exit 101 # cancelled by user
RA="jmsra"
CC="javax.jms.QueueConnectionFactory"
AO="javax.jms.Queue"
S1=MessageFactoryPool
S2=MessageFactory
S3=MessageQueue
for P1 in "BusinessProcess" "UtilityProcess"; do
    echo ""
    echo $P1
    echo ""
    echo $ASADMIN $ascst2 create-connector-connection-pool --raname $RA --connectiondefinition $CC "jms/$P1$S1"
    bash $ASADMIN $ascst2 create-connector-connection-pool --raname $RA --connectiondefinition $CC "jms/$P1$S1"
    echo ""
    echo $ASADMIN $ascst2 create-connector-resource --poolname "jms/$P1$S1" "jms/$P1$S2"
    bash $ASADMIN $ascst2 create-connector-resource --poolname "jms/$P1$S1" "jms/$P1$S2"
    for Q1 in "Request" "Reply" "Return"; do
        echo ""
        echo $Q1
        echo ""
        echo $ASADMIN $ascst2 create-admin-object --restype $AO --raname $RA --property Name="$P1$Q1$S3" "jms/$P1$Q1$S3"
        bash $ASADMIN $ascst2 create-admin-object --restype $AO --raname $RA --property Name="$P1$Q1$S3" "jms/$P1$Q1$S3"
    done
done
