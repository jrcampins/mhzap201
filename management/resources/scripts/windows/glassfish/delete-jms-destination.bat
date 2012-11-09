echo.
set Q1=%1
set Q1
echo.
echo %ASADMIN% %GFDOMAINCST2% delete-admin-object "jms/%P1%%Q1%%S3%"
call %ASADMIN% %GFDOMAINCST2% delete-admin-object "jms/%P1%%Q1%%S3%"
