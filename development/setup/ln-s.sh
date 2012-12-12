#!/bin/bash

clear
cd /opt
pwd
rm java
rm glassfish
rm jboss
rm oraclexe
rm postgresql
ln -s /cygdrive/c/"Archivos de programa"/Java                   java
ln -s /cygdrive/c/NetBeans/NB72/glassfish                       glassfish
ln -s /cygdrive/c/jboss-as-7.1.1.Final                          jboss
ln -s /cygdrive/c/oraclexe                                      oraclexe
ln -s /cygdrive/c/"Archivos de programa"/PostgreSQL/9.0         postgresql
ls -l
echo ""

cd mhzap201
pwd
rm latest
ln -s /cygdrive/c/CVSNT/desarrollo/mhzap201/netbeans/management latest
ls -l
echo ""
