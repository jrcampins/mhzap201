#!/bin/sh
if [ -n "$variables" ]; then
    echo psql $*
    nx0=$(basename "$BASH_SOURCE")
    dp0=`cd $(dirname "$BASH_SOURCE"); pwd`
    sf1=$1
    if [ -f "$sf1" ]; then
        nx1=$(basename "$sf1")
        dp1=`cd $(dirname "$sf1"); pwd`
        log="$LOGSDIR/${nx0}.${nx1}.log"
        [ -f "$log" ] && rm "$log"
        [ -n "$PGDB" ] || PGDB="$PGDATABASE"
        [ -n "$CRVL" ] || CRVL="$(date +%Y%m%d)"
        case "`uname`" in
            CYGWIN*)
                sf1=`cygpath --windows $sf1`
                SQLDDLDIR=`cygpath --windows $SQLDDLDIR`
                SQLJOINDIR=`cygpath --windows $SQLJOINDIR`
                ;;
        esac
        echo SQLDDLDIR=$SQLDDLDIR >> $log 2>&1
        echo SQLJOINDIR=$SQLJOINDIR >> $log 2>&1
        echo POSTGRESQL_HOME=$POSTGRESQL_HOME >> $log 2>&1
        echo working_directory=$(pwd) >> $log 2>&1
        EXE="$PGBINDIR/psql"
        CMD="$EXE -e -f $sf1 -q -v crvl=$CRVL -v pgdb=$PGDB -v ddldir=$SQLDDLDIR -v joindir=$SQLJOINDIR"
        $CMD 1>>$log 2>&1
        echo $nx1: $?
        echo ""
        read -p "cat $log ? (s/n): " siono
        echo ""
        [ "$siono" = "s" ] && cat $log | more
    else
        echo "ERROR: el script "$sf1" no existe "
    fi
fi
