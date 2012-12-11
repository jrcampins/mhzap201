if defined HOMEDIR (
    if exist "%HOMEDIR%" (
        set %UPPER_CASE_PROJECT%_HOME_DIR=%HOMEDIR%
    )
)
if defined driver set %UPPER_CASE_PROJECT%_JDBC_DRIVER=%driver%
if defined dbcurl set %UPPER_CASE_PROJECT%_JDBC_URL=%dbcurl%
if defined dbuser set %UPPER_CASE_PROJECT%_JDBC_USER=%dbuser%
if defined dbpass set %UPPER_CASE_PROJECT%_JDBC_PASSWORD=%dbpass%
