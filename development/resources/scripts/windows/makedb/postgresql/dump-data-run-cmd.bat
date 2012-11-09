if not defined variables goto EOJ
echo dump table %1
echo.>>%LOG%
echo dump table %1>>%LOG%
echo.>>%LOG%
%CMD% %1 1>>%BAK% 2>>%LOG%
:EOJ
