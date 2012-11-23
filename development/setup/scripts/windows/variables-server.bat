if defined HOMEDIR (
    if exist "%HOMEDIR%" (
        set MHZAP201_HOME_DIR=%HOMEDIR%
    )
)
if defined driver  set MHZAP201_JDBC_DRIVER=%driver%
if defined dbcurl  set MHZAP201_JDBC_URL=%dbcurl%
if defined dbuser  set MHZAP201_JDBC_USER=%dbuser%
if defined dbpass  set MHZAP201_JDBC_PASSWORD=%dbpass%
