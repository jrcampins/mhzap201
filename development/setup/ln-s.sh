#!/bin/bash

JAVA_HOME=/cygdrive/p/Java
GLASSFISH_HOME=/cygdrive/n/glassfish
JBOSS_HOME=/cygdrive/c/jboss
ORACLE_HOME=/cygdrive/c/oraclexe
POSTGRESQL_HOME=/cygdrive/p/PostgreSQL/9.0

ln -s $JAVA_HOME        /opt/java
ln -s $GLASSFISH_HOME   /opt/glassfish
ln -s $JBOSS_HOME       /opt/jboss
ln -s $ORACLE_HOME      /opt/oraclexe
ln -s $POSTGRESQL_HOME  /opt/postgresql
