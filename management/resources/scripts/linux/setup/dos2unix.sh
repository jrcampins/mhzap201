#!/bin/bash
scriptname=$(basename "$BASH_SOURCE")
scriptpath=`cd $(dirname "$BASH_SOURCE"); pwd`
me=$scriptname
xs=$scriptpath/variables.sh
unset variables
[ -x "$xs" ] && source "$xs"
[ -z "$variables" ] && exit 100 # environment variables not set
echo $me convierte los archivos de texto de formato DOS a formato UNIX
read -p "ejecutar $me? (s/n): " -n 1; echo ""
[ "$REPLY" != "s" ] && exit 101 # cancelled by user
log=$LOGSDIR/${scriptname%%.*}.log
case "`uname`" in
    CYGWIN*)    comando="dos2unix";;
    *)          comando="dos2unix -o";;
esac
echo $comando $HOMEDIR > $log
for name in "*.jrtx" "*.jrxml" "*.password" "*.properties" "*.psql" "*.sh" "*.sql" "*.txt" "*.vm" "*.xml" ; do
    echo "$comando $HOMEDIR/$name"
    for archivo in $(find -L "$HOMEDIR" -type f -name "$name" | sort -f); do
        $comando "$archivo" >> $log 2>&1
    done
done
echo ""
read -p "cat $log ? (s/n): " -n 1; echo ""
[ "$REPLY" != "s" ] || cat $log | more
