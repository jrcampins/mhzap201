set xs="%~dp0..\variables.bat"
if exist %xs% call %xs%
if not defined variables goto:eof

set eeas=jboss
set EEAS_OVERRIDE=JBoss
