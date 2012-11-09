echo.
set P1=%1
set P1
for /f "tokens=1*" %%t in (jms-destination) do call delete-jms-destination %%t
echo.
echo %ASADMIN% %GFDOMAINCST2% delete-connector-resource "jms/%P1%%S2%"
call %ASADMIN% %GFDOMAINCST2% delete-connector-resource "jms/%P1%%S2%"
echo.
echo %ASADMIN% %GFDOMAINCST2% delete-connector-connection-pool "jms/%P1%%S1%"
call %ASADMIN% %GFDOMAINCST2% delete-connector-connection-pool "jms/%P1%%S1%"
