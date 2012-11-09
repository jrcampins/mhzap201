USE MHZMD201
GO

-- select * from xdbscripttables where tabname in 
-- (
-- select codigo_clase_recurso from clase_recurso
-- where numero_tipo_recurso not in (12,22) and es_clase_recurso_independiente=0 and es_clase_recurso_sin_detalle=0 and id_clase_recurso_maestro is null
-- and codigo_clase_recurso not in (select tabname from xdbscripttables where isnullable=1)
-- )
-- order by 1, 3

-- select * from xdbscripttables where tabname in
-- (
-- select codigo_clase_recurso from clase_recurso
-- where numero_tipo_recurso not in (12,22) and es_clase_recurso_independiente=0 and es_clase_recurso_sin_detalle=0 and id_clase_recurso_maestro is not null
-- and codigo_clase_recurso not in (select tabname from xdbscripttables where isnullable=1)
-- )
-- order by 1,3

-- select * from xdbscripttables where tabname in 
-- (
-- select codigo_clase_recurso from clase_recurso
-- where numero_tipo_recurso not in (12,22) and es_clase_recurso_independiente=0 and es_clase_recurso_sin_detalle=0
-- and codigo_clase_recurso not in (select tabname from xdbscripttables where colid>5)
-- )
-- order by 1, 3

-- select * from xdbscripttables where tabname in 
-- (
-- select codigo_clase_recurso from clase_recurso
-- where numero_tipo_recurso not in (12,22) and es_clase_recurso_independiente=0 and es_clase_recurso_sin_detalle=0
-- and codigo_clase_recurso not in (select tabname from xdbscripttables where colid>7)
-- and codigo_clase_recurso not in (select tabname from xdbscripttables where coltype=58)
-- and codigo_clase_recurso not in (select tabname from xdbscripttables where coltype=167)
-- )
-- order by 1, 3

-- select codigo_clase_recurso from clase_recurso
-- where es_clase_recurso_sin_detalle=1
-- and codigo_clase_recurso not in 
-- (
-- select codigo_clase_recurso from clase_recurso
-- where numero_tipo_recurso not in (12,22) and es_clase_recurso_independiente=0
-- and codigo_clase_recurso not in (select tabname from xdbscripttables where isnullable=1)
-- )
-- order by 1

select * from xdbscripttables where tabname in (
select codigo_clase_recurso from clase_recurso
where numero_tipo_recurso not in (12,22) and es_clase_recurso_independiente=0 and es_clase_recurso_sin_detalle=1
and codigo_clase_recurso in (select tabname from xdbscripttables where isnullable=1)
)
order by 1,3

select	*
from	xdbScriptForeignKeys
where	tabname in (select codigo_clase_recurso from clase_recurso where numero_tipo_recurso<20)
and	refname in (select codigo_clase_recurso from clase_recurso where numero_tipo_recurso>20)
order 	by 1

select	id_aplicacion as aplicacion, codigo_pagina as pagina, numero_tipo_pagina as tipo, dominio_detalle.codigo_dominio as detalle, dominio_maestro.codigo_dominio as maestro
from	pagina
inner 	join dominio dominio_detalle on pagina.id_dominio = dominio_detalle.id_dominio
inner	join dominio dominio_maestro on pagina.id_dominio_maestro = dominio_maestro.id_dominio
where	pagina.id_dominio in (select 100*id_clase_recurso+1 from clase_recurso where numero_tipo_recurso<20)
and	pagina.id_dominio_maestro in (select 100*id_clase_recurso+1 from clase_recurso where numero_tipo_recurso>20)
order 	by id_aplicacion, codigo_pagina

select	id_aplicacion as aplicacion, codigo_pagina as pagina, numero_tipo_pagina as tipo, dominio_detalle.codigo_dominio as detalle, dominio_maestro.codigo_dominio as maestro
from	pagina
inner 	join dominio dominio_detalle on pagina.id_dominio = dominio_detalle.id_dominio
inner	join dominio dominio_maestro on pagina.id_dominio_maestro = dominio_maestro.id_dominio
where	pagina.id_dominio in (select 100*id_clase_recurso+1 from clase_recurso where numero_tipo_recurso>20)
and	pagina.id_dominio_maestro in (select 100*id_clase_recurso+1 from clase_recurso where numero_tipo_recurso<20)
order 	by id_aplicacion, codigo_pagina
