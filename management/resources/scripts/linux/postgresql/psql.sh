#!/bin/sh
me=psql
if [ -f "$0" ]; then
    . $(dirname "$0")/variables.sh
    if [ -n "$variables" ]; then
        [ -f "$PSQL" ] || PSQL="$scriptpath/$scriptname.psql"
        [ -n "$PLOG" ] || PLOG="$scriptpath/$scriptname.plog"
        [ -n "$TXT1" ] || TXT1="$scriptpath/$scriptname.txt1"
        [ -n "$TXT2" ] || TXT2="$scriptpath/$scriptname.txt2"
        [ -n "$PGDB" ] || PGDB="$PGDATABASE"
        [ -n "$CRVL" ] || CRVL=""
        case "`uname`" in
            CYGWIN*)
                PSQL=`cygpath --windows $PSQL`
                SQLDDLDIR=`cygpath --windows $SQLDDLDIR`
                ;;
        esac
        EXE="$PGBINDIR/psql"
    #   CMD="$EXE -e -f $PSQL -L $TXT1 -o $TXT2 -q -1"
        CMD="$EXE -e -f $PSQL -q -v ddldir=$SQLDDLDIR -v pgdb=$PGDB -v crvl=$CRVL"
        echo $CMD
        echo $(date)>$PLOG
        echo $CMD>>$PLOG
        $CMD 1>>$PLOG 2>&1
        echo $me: $?
        echo ""
        read -p "cat $PLOG ? (s/n): " siono
        echo ""
        [ "$siono" = "s" ] && cat $PLOG | more
        unset EXE CMD PSQL PLOG TXT1 TXT2 PGDB CRVL siono
    fi
else
    echo "Modo de empleo: bash $me.sh"
fi
unset me
