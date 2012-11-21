#!/bin/sh
cd $JBOSS_HOME
bash bin/jboss-cli.sh --connect command=:shutdown
