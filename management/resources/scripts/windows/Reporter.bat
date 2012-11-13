@echo off
set CLASSPATH=.
call %CRVLDIR%\resources\scripts\windows\classpath.bat
set CLASS=com.egt.core.db.util.ReporterShell
set JAVA_PARAMETER_LIST="%*"
set REPORT_RUNNER_LOG=%1_%2.log
set>%MHZAP201_WAR%\spool\%1_%2_environment_variables.log
java -cp %CLASSPATH% %CLASS% 1>%MHZAP201_WAR%\spool\%REPORT_RUNNER_LOG% 2>&1
