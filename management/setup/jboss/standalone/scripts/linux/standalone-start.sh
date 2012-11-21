#!/bin/sh
cd $JBOSS_HOME
# rm -rf standalone/log/*.log
# rm -rf standalone/tmp
export NOPAUSE=true
bash bin/standalone.sh -c standalone-full.xml
