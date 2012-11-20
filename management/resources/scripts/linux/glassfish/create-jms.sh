#!/bin/sh
me=create-jms
echo $me crea las fabricas de conexiones, conjuntos de conexiones y demas recursos JMS del servidor de aplicaciones
read -p "ejecutar $me ? (s/n): " siono
if [ "$siono" = "s" ]; then
    if [ -f "$BASH_SOURCE" ]; then
        . $(dirname "$BASH_SOURCE")/variables.sh
        if [ -n "$variables" ]; then
            RA="jmsra"
            CC="javax.jms.QueueConnectionFactory"
            AO="javax.jms.Queue"
            S1=MessageFactoryPool
            S2=MessageFactory
            S3=MessageQueue
        #   for P1 in "BusinessProcess" "UtilityProcess" "ToolKit"; do
            for P1 in "BusinessProcess" "UtilityProcess"; do
                echo ""
                echo $P1
                echo ""
                echo $ASADMIN $GFDOMAINCST2 create-connector-connection-pool --raname $RA --connectiondefinition $CC "jms/$P1$S1"
                bash $ASADMIN $GFDOMAINCST2 create-connector-connection-pool --raname $RA --connectiondefinition $CC "jms/$P1$S1"
                echo ""
                echo $ASADMIN $GFDOMAINCST2 create-connector-resource --poolname "jms/$P1$S1" "jms/$P1$S2"
                bash $ASADMIN $GFDOMAINCST2 create-connector-resource --poolname "jms/$P1$S1" "jms/$P1$S2"
                for Q1 in "Request" "Reply" "Return"; do
                    echo ""
                    echo $Q1
                    echo ""
                    echo $ASADMIN $GFDOMAINCST2 create-admin-object --restype $AO --raname $RA --property Name="$P1$Q1$S3" "jms/$P1$Q1$S3"
                    bash $ASADMIN $GFDOMAINCST2 create-admin-object --restype $AO --raname $RA --property Name="$P1$Q1$S3" "jms/$P1$Q1$S3"
                done
            done
            unset RA CC AO P1 Q1 S1 S2 S3
        fi
    else
        echo "Modo de empleo: bash $me.sh"
    fi
fi
unset me siono
