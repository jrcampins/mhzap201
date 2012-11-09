@echo off
cd /d "%~dp0"
call ear-undeploy
call standalone-stop
call standalone-start
goto:eof
