#!/bin/sh
ear=mhzap201.ear
cd $JBOSS_HOME
bash bin/jboss-cli.sh --connect --command="undeploy $ear"
