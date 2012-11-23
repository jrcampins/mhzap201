rem
rem parametros para la conexion al servidor de aplicaciones GlassFish
rem
set ashost=localhost
set asport=4848
set asuser=admin
set aspass=admin
set aspassfile=%HOMEDIR%\asadmin.password
set ascst1=--user %asuser% --passwordfile %aspassfile%
set ascst2=--host %ashost% --port %asport% %ascst1%
set ascst2=--host %ashost% --port %asport%
set domain=domain1
