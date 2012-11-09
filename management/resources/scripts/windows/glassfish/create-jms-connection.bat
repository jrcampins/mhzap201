echo.
set P1=%1
set P1
echo.
echo.
echo %ASADMIN% %GFDOMAINCST2% create-connector-connection-pool --raname %RA% --connectiondefinition %CC% "jms/%P1%%S1%"
call %ASADMIN% %GFDOMAINCST2% create-connector-connection-pool --raname %RA% --connectiondefinition %CC% "jms/%P1%%S1%"
echo.
echo.
echo %ASADMIN% %GFDOMAINCST2% create-connector-resource --poolname "jms/%P1%%S1%" "jms/%P1%%S2%"
call %ASADMIN% %GFDOMAINCST2% create-connector-resource --poolname "jms/%P1%%S1%" "jms/%P1%%S2%"
for /f "tokens=1*" %%t in (jms-destination) do call create-jms-destination %%t
