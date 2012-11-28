#!/bin/sh
if [ -n "$variables" ]; then
    echo sqlplus $*
    scriptname=$(basename "$BASH_SOURCE")
    scriptpath=`cd $(dirname "$BASH_SOURCE"); pwd`
    PSQL="$scriptpath/$scriptname.sql"
    if [ -f "$PSQL" ]; then
        if [ -f "$1" ]; then            
            psql=$(basename "$1")
            LOGS="$scriptpath/logs"
            [ -e "$LOGS" ] || mkdir $LOGS
            PLOG="$scriptpath/logs/${scriptname}.${psql}.log"
            [ -f "$PLOG" ] && rm $PLOG
            SQLPATH=$scriptpath:$SQLPATH
            case "`uname`" in
                CYGWIN*)
                    PSQL=`cygpath --windows $PSQL`
                    SQLPATH=`cygpath --windows --path $SQLPATH`
                    ;;
            esac
            echo SQLPATH=$SQLPATH >> $PLOG 2>&1
            export SQLPATH
            shift
            pushd $O9BINDIR > /dev/null
            echo sqlplus $O9USER/$O9PASSWORD @$PSQL $psql $* >> $PLOG 2>&1
            popd > /dev/null
        else
            echo "ERROR: el script "$1" no existe "
        fi
    else
        echo "ERROR: el script "$PSQL" no existe "
    fi
fi
