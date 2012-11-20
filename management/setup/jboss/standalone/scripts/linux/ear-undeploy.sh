#!/bin/sh
ear=mhzap201.ear
cd $JBOSS_HOME
bin/jboss-cli.sh --connect --command="undeploy $ear"
