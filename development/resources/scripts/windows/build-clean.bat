@echo off
cd /d "%~dp0"

:ask1a
set clean_and_build=N
set /p clean_and_build="build despues del clean ? (G=GlassFish, J=JBoss, S=SDK, E=EJBs, N=None) [%clean_and_build%] "
if not defined clean_and_build goto ask1a

:ask1b
set clean_and_build
if /i "%clean_and_build%" EQU "G" goto got1
if /i "%clean_and_build%" EQU "J" goto got1
if /i "%clean_and_build%" EQU "S" goto got1
if /i "%clean_and_build%" EQU "E" goto got1
if /i "%clean_and_build%" EQU "N" goto got1
goto ask1a

:got1
call build
goto:eof
