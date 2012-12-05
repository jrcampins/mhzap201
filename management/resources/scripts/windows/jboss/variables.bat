@echo off
rem set on_info_messages=echo
rem set on_warning_messages=echo
set EEAS=jboss
set xs="%~dp0..\variables.bat"
if exist %xs% call %xs%
if not defined variables (pause & echo. & goto:eof)
if defined on_info_messages (pause & echo.)
