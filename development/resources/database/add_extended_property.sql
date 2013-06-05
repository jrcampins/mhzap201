USE MHZMD201
GO
select 'exec sp_addextendedproperty N''MS_Description'', N''' + inline_help
+ ''', N''user'', N''dbo'', N''table'', N''' + tabname
+ ''', N''column'', N''' + colname
+ ''''
from xdbLabels
order by tabname, colname
go
