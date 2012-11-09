#!/bin/sh
set +v
CLASSPATH=.
. $MHZAP201_DIR/scripts/linux/classpath.sh
CLASS=com.egt.core.db.util.ReporterShell
export JAVA_PARAMETER_LIST="$*"
export REPORT_RUNNER_LOG=$1_$2.log
java -cp $CLASSPATH $CLASS 1>$MHZAP201_WAR/spool/$REPORT_RUNNER_LOG 2>&1
