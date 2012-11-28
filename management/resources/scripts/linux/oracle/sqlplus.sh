#!/bin/sh
if [ -n "$variables" ]; then
    echo sqlplus $*
    scriptname=$(basename "$BASH_SOURCE")
    scriptpath=`cd $(dirname "$BASH_SOURCE"); pwd`
    LOGS="$scriptpath/logs"
    [ -e "$LOGS" ] || mkdir $LOGS
    PLOG="$scriptpath/logs/$scriptname.log"
    [ -f "$PLOG" ] && rm $PLOG
    PSQL="$scriptpath/$scriptname.sql"
    if [ -f "$PSQL" ]; then
        if [ -f "$1" ]; then            
            SQLPATH=$scriptpath:$SQLPATH
            case "`uname`" in
                CYGWIN*)
                    PSQL=`cygpath --windows $PSQL`
                    SQLPATH=`cygpath --windows --path $SQLPATH`
                    ;;
            esac
            PSQL2=$(basename "$1")
            shift
            echo SQLPATH=$SQLPATH >> $PLOG 2>$1
            export SQLPATH
            pushd $O9BINDIR > /dev/null
            echo sqlplus "$O9USER"/"$O9PASSWORD" @"$PSQL" "$PSQL2" $* >> $PLOG 2>$1
#           bash sqlplus "$O9USER"/"$O9PASSWORD" @"$PSQL" "$PSQL2" $* >> $PLOG 2>$1
            popd > /dev/null
        else
            echo "ERROR: el script "$1" no existe "
        fi
    else
        echo "ERROR: el script "$PSQL" no existe "
    fi
fi
