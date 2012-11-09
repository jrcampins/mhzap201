USE MHZMD201

select codigo_aplicacion
from xdbprojects
where codigo_aplicacion not in (select codigo_aplicacion from aplicacion)
order by 1

select codigo_aplicacion
from aplicacion
where codigo_aplicacion not in (select codigo_aplicacion from xdbprojects)
order by 1

select id_aplicacion, id_pagina 
from pagina 
where id_pagina not between 100*id_aplicacion and 100*id_aplicacion+99
order by 1

--update pagina set url_pagina='/faces/'+codigo_pagina+'.jsp'
