#!/bin/sh
set +v
CLASS=com.egt.core.db.util.ReporterShell
CLASSPATH=.
source $HOMEDIR/resources/scripts/linux/classpath.sh
export JAVA_PARAMETER_LIST="$*"
export REPORT_RUNNER_LOG=$1_$2.log
printenv>%PROJWAR%\spool\%1_%2_environment_variables.log
java -cp $CLASSPATH $CLASS 1>$PROJWAR/spool/$REPORT_RUNNER_LOG 2>&1
