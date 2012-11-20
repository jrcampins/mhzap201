#!/bin/sh
set +v
CLASSPATH=.
. $CRVLDIR/resources/scripts/linux/classpath.sh
CLASS=com.egt.core.db.util.SqlAgentShell
export JAVA_PARAMETER_LIST="$*"
export SQLPRC_RUNNER_LOG=$1_$2.log
java -cp $CLASSPATH $CLASS 1>$MHZAP201_WAR/spool/$SQLPRC_RUNNER_LOG 2>&1
