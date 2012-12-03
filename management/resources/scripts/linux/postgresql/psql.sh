#!/bin/bash
funky() {
   [ -n "$variables" ] || return 1
    echo psql $*
    nx0=$(basename "$BASH_SOURCE")
    dp0=`cd $(dirname "$BASH_SOURCE"); pwd`
    sf1=$1
    if [ ! -f "$sf1" ]; then
        echo "ERROR: el script "$sf1" no existe "
        return 3
    fi
    nx1=$(basename "$sf1")
    dp1=`cd $(dirname "$sf1"); pwd`
    log="$SQLLOGSDIR/${nx0%%.*}.${nx1}.log"
    [ -f "$log" ] && rm "$log"
    [ -n "$PGDB" ] || PGDB="$PGDATABASE"
    [ -n "$CRVL" ] || CRVL="$(date +%Y%m%d)"
    case "`uname`" in
        CYGWIN*)
            sf1=`cygpath --windows $sf1`
            SQLDDLXDIR=`cygpath --windows $SQLDDLXDIR`
            SQLJOINDIR=`cygpath --windows $SQLJOINDIR`
            ;;
    esac
    echo SQLDDLXDIR=$SQLDDLXDIR >> $log 2>&1
    echo SQLJOINDIR=$SQLJOINDIR >> $log 2>&1
    echo POSTGRESQL_HOME=$POSTGRESQL_HOME >> $log 2>&1
    echo working_directory=$(pwd) >> $log 2>&1
    EXE="$PGBINDIR/psql"
    CMD="$EXE -e -f $sf1 -q -v crvl=$CRVL -v pgdb=$PGDB -v ddlxdir=$SQLDDLXDIR -v joindir=$SQLJOINDIR"
    $CMD 1>>$log 2>&1
    echo $nx1: $?
    echo ""
    read -p "cat $log ? (s/n): " siono
    echo ""
    [ "$siono" = "s" ] && cat $log | more
}

funky "$@"
unset funky
