@echo off
set CLASSPATH=.
call %HOMEDIR%\resources\scripts\windows\classpath.bat
set CLASS=com.egt.core.db.util.ReporterShell
set JAVA_PARAMETER_LIST="%*"
set REPORT_RUNNER_LOG=%1_%2.log
set>%PROJWAR%\spool\%1_%2_environment_variables.log
java -cp %CLASSPATH% %CLASS% 1>%PROJWAR%\spool\%REPORT_RUNNER_LOG% 2>&1
