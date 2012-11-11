export logging=true
export NOPAUSE=true
cd $JBOSS_HOME
rm -rf standalone/log/*.log
bin/standalone.sh -c standalone-full.xml
