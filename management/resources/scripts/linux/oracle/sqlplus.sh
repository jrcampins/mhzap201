#!/bin/sh
if [ -n "$variables" ]; then
    echo sqlplus $*
    nx0=$(basename "$BASH_SOURCE")
    dp0=`cd $(dirname "$BASH_SOURCE"); pwd`
    sql="$BASH_SOURCE.sql"
    if [ -f "$sql" ]; then
        if [ -f "$1" ]; then            
            dir="$HOMEDIR/logs"
            nx1=$(basename "$1")
            log="$dir/${nx0}.${nx1}.log"
            [ -d "$dir" ] || mkdir "$dir"
            [ -f "$log" ] && rm "$log"
            SQLPATH=$dp0:$SQLPATH
            case "`uname`" in
                CYGWIN*)
                    sql=`cygpath --windows $sql`
                    SQLPATH=`cygpath --windows --path $SQLPATH`
                    ORACLE_HOME=`cygpath --windows $ORACLE_HOME`
                    ;;
            esac
            export SQLPATH
            export ORACLE_HOME
            pushd $ORACLE_HOME/bin > /dev/null
            echo SQLPATH=$SQLPATH >> $log 2>&1
            echo ORACLE_HOME=$ORACLE_HOME >> $log 2>&1
            echo working_directory=$(pwd) >> $log 2>&1
            shift
            $ORACLE_HOME/bin/sqlplus $O9USER/$O9PASSWORD @$sql $nx1 $* "?" "?" "?" "?" "?" "?" "?" "?" >> $log 2>&1
            echo $nx1: $?
            popd > /dev/null
            echo ""
            read -p "cat $log ? (s/n): " siono
            echo ""
            [ "$siono" = "s" ] && cat $log | more
        else
            echo "ERROR: el script "$1" no existe "
        fi
    else
        echo "ERROR: el script "$sql" no existe "
    fi
fi
