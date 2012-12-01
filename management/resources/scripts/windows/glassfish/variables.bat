@echo off
rem on_properly_defined_variables=echo
set EEAS=glassfish
set xs="%~dp0..\variables.bat"
if exist %xs% call %xs%
if not defined variables (pause & echo. & goto:eof)
if defined on_properly_defined_variables (pause & echo.)
