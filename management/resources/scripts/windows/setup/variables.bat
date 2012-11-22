set xs="%~dp0..\variables.bat"
if exist %xs% call %xs%
if not defined variables goto:eof
