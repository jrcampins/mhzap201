#!/bin/sh
export NOPAUSE=true
cd $JBOSS_HOME
# rm -rf standalone/log/*.log
# rm -rf standalone/tmp
bin/standalone.sh -c standalone-full.xml
