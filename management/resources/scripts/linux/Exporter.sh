#!/bin/bash
set +v
CLASS=com.egt.core.db.util.ExporterShell
CLASSPATH=.
source $HOMEDIR/resources/scripts/linux/classpath.sh
export JAVA_PARAMETER_LIST="$*"
export EXPORT_RUNNER_LOG=$1_$2.log
printenv>%PROJWAR%\spool\%1_%2_environment_variables.log
java -cp $CLASSPATH $CLASS 1>$PROJWAR/spool/$EXPORT_RUNNER_LOG 2>&1
