use MHZMD201
go
select colname, coltype, length, prec, scale, tabname
from xdbscripttables x1
where tabname not like'log[_]imp[_]%'
and colname in (
select colname
from xdbscripttables x2
where x2.tabname not like'log[_]imp[_]%'
and x2.colname = x1.colname
and ( x2.coltype <> x1.coltype or ( x2.coltype = x1.coltype and x2.length <> x1.length ) )
)
order by colname, coltype, length, tabname
go
