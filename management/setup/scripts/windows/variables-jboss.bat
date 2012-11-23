rem
rem parametros para la conexion al servidor de aplicaciones JBoss
rem
set ashost=localhost
set asport=9999
rem asuser=admin
rem aspass=sesamo
set ascst1=--user %asuser% --password %aspass%
set ascst2=--connect controller=%ashost%:%asport% %ascst1%
set ascst2=--connect controller=%ashost%:%asport%
set offset=-Djboss.socket.binding.port-offset=0
