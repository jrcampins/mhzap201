@echo off
set CLASSPATH=.
call %MHZAP201_DIR%\scripts\windows\classpath.bat
set CLASS=com.egt.core.db.util.ExporterShell
set JAVA_PARAMETER_LIST="%*"
set EXPORT_RUNNER_LOG=%1_%2.log
set>%MHZAP201_WAR%\spool\%1_%2_environment_variables.log
java -cp %CLASSPATH% %CLASS% 1>%MHZAP201_WAR%\spool\%EXPORT_RUNNER_LOG% 2>&1
