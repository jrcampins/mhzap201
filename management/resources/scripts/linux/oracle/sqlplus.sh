#!/bin/sh
if [ -n "$variables" ]; then
    echo sqlplus $*
    sf0="$BASH_SOURCE.sql"
    if [ -f "$sf0" ]; then
        nx0=$(basename "$BASH_SOURCE")
        dp0=`cd $(dirname "$BASH_SOURCE"); pwd`
        sf1=$1
        if [ -f "$sf1" ]; then
            nx1=$(basename "$sf1")
            dp1=`cd $(dirname "$sf1"); pwd`
            log="$LOGSDIR/${nx0}.${nx1}.log"
            [ -f "$log" ] && rm "$log"
            if [ -n "$SQLPATH" ]; then
                SQLPATH=$dp1:$SQLPATH
            else
                SQLPATH=$dp1
            fi
            case "`uname`" in
                CYGWIN*)
                    sf0=`cygpath --windows $sf0`
                    sf1=`cygpath --windows $sf1`
                    export SQLPATH=`cygpath --windows --path $SQLPATH`
                    export ORACLE_HOME=`cygpath --windows $ORACLE_HOME`
                    ;;
            esac
            pushd $ORACLE_HOME/bin > /dev/null
            echo SQLPATH=$SQLPATH >> $log 2>&1
            echo ORACLE_HOME=$ORACLE_HOME >> $log 2>&1
            echo working_directory=$(pwd) >> $log 2>&1
            shift
            $ORACLE_HOME/bin/sqlplus $ORAUSER/$ORAPASSWORD @$sf0 $nx1 $* "?" "?" "?" "?" "?" "?" "?" "?" >> $log 2>&1
            echo $nx1: $?
            popd > /dev/null
            echo ""
            read -p "cat $log ? (s/n): " siono
            echo ""
            [ "$siono" = "s" ] && cat $log | more
        else
            echo "ERROR: el script "$sf1" no existe "
        fi
    else
        echo "ERROR: el script "$sf0" no existe "
    fi
fi
