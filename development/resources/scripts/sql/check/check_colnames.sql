use MHZMD201
go
select colname, tabname, len(colname) as len_colname
from xdbscripttables x1
where len(colname)>30
order by colname, coltype, length, tabname
go
select colname, coltype, length, prec, scale, tabname
from xdbscripttables x1
where colname in (
select colname
from xdbscripttables x2
where x2.colname = x1.colname
and ( x2.coltype <> x1.coltype )
)
order by colname, coltype, length, tabname
go
select colname, coltype, length, prec, scale, tabname
from xdbscripttables x1
where (tabname not like'log[_]imp[_]%') --  or tabname like'log[_]imp[_]%[_]eec'
and colname in (
select colname
from xdbscripttables x2
where (x2.tabname not like'log[_]imp[_]%') --  or x2.tabname like'log[_]imp[_]%[_]eec'
and x2.colname = x1.colname
and ( x2.coltype <> x1.coltype or ( x2.coltype = x1.coltype and x2.length <> x1.length ) )
)
order by colname, coltype, length, tabname
go
