ear=$MHZAP201_HOME/VnnRaammdd/mhzap201.ear
cd $JBOSS_HOME
bin/jboss-cli.sh --connect --command="deploy $ear"
