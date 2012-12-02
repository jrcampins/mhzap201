#!/bin/sh
if [ -n "$variables" ]; then
    echo sqlplus $*
    nx0=$(basename "$BASH_SOURCE")
    dp0=`cd $(dirname "$BASH_SOURCE"); pwd`
    sf0="$SQLXSQLDIR/${nx0%%.*}.sql"
    if [ -f "$sf0" ]; then
        sf1=$1
        if [ -f "$sf1" ]; then
            nx1=$(basename "$sf1")
            dp1=`cd $(dirname "$sf1"); pwd`
            log="$SQLLOGSDIR/${nx0%%.*}.${nx1}.log"
            [ -f "$log" ] && rm "$log"
            pdq=$SQLXSQLDIR
            [ "$pdq" = "$dp1" ] || pdq=$pdq:$dp1
            if [ -n "$SQLPATH" ]; then
                sqlpath=$SQLPATH
                pdq=$pdq:$SQLPATH
            else
                unset sqlpath
            fi
            SQLPATH=$pdq
            case "`uname`" in
                CYGWIN*)
                    sf0=`cygpath --windows $sf0`
                    sf1=`cygpath --windows $sf1`
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
            logon="/"
            [ -n "$ORAUSER" -a -n "$ORAPASSWORD" ] && logon="${ORAUSER}/${ORAPASSWORD}@${dbhost}:${dbport}/${dbserv}"
            [ -n "$ORAROLE" ] && logon="$logon AS $ORAROLE"
            shift
            $ORACLE_HOME/bin/sqlplus -L $logon @$sf0 $nx1 $* "?" "?" "?" "?" "?" "?" "?" "?" >> $log 2>&1
            echo $nx1: $?
            popd > /dev/null
            [ -n "$sqlpath" ] || export SQLPATH=$sqlpath
            [ -z "$sqlpath" ] || unset SQLPATH
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
