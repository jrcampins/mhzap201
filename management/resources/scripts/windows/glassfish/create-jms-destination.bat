echo.
set Q1=%1
set Q1
echo.
echo.
echo %ASADMIN% %GFDOMAINCST2% create-admin-object --restype %AO% --raname %RA% --property Name="%P1%%Q1%%S3%" "jms/%P1%%Q1%%S3%"
call %ASADMIN% %GFDOMAINCST2% create-admin-object --restype %AO% --raname %RA% --property Name="%P1%%Q1%%S3%" "jms/%P1%%Q1%%S3%"
