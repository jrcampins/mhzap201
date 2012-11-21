#!/bin/sh
set +v
CLASS=com.egt.core.db.util.ExporterShell
CLASSPATH=.
source $CRVLDIR/resources/scripts/linux/classpath.sh
export JAVA_PARAMETER_LIST="$*"
export EXPORT_RUNNER_LOG=$1_$2.log
java -cp $CLASSPATH $CLASS 1>$MHZAP201_WAR/spool/$EXPORT_RUNNER_LOG 2>&1
