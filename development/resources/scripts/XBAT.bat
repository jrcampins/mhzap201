@echo off
call "%~dp0variables"

type  %EMD%>%TMD%_EOS.sql

cd ..

rem type "%DBS%\echo-cd.bat">XCMS.bat
rem echo call "%DBS%\XCMS">>XCMS.bat

type "%DBS%\echo-cd.bat">XDDL.bat
echo call "%DBS%\XDDL">>XDDL.bat

type "%DBS%\echo-cd.bat">XJSC.bat
echo call "%DBS%\XJSC">>XJSC.bat

exit
