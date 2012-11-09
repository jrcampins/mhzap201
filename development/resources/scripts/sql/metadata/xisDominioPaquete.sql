SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
DROP PROCEDURE xisDominioPaquete
GO
CREATE PROCEDURE xisDominioPaquete AS
BEGIN
DECLARE @insertst varchar(8000)
DECLARE @selectst varchar(8000)
SET @insertst = "
INSERT
INTO	dominio_paquete (id_dominio_paquete, id_dominio, id_paquete)
"
SET @selectst = "
select	100*id_dominio+1 AS id_dominio_paquete, id_dominio, 1 AS id_paquete
from 	dominio
INNER 
JOIN	clase_recurso ON dominio.id_clase_recurso = clase_recurso.id_clase_recurso
where	id_dominio NOT IN (select id_dominio FROM dominio_paquete)
and		dominio.id_clase_recurso between 10000 and 19999
UNION
select	100*id_dominio+2 AS id_dominio_paquete, id_dominio, 2 AS id_paquete
from 	dominio
INNER 
JOIN	clase_recurso ON dominio.id_clase_recurso = clase_recurso.id_clase_recurso
where	id_dominio NOT IN (select id_dominio FROM dominio_paquete)
and		dominio.id_clase_recurso between 20000 and 29999
UNION
select	100*id_dominio+3AS id_dominio_paquete, id_dominio, 3 AS id_paquete
from 	dominio
INNER 
JOIN	clase_recurso ON dominio.id_clase_recurso = clase_recurso.id_clase_recurso
where	id_dominio NOT IN (select id_dominio FROM dominio_paquete)
and		dominio.id_clase_recurso between 30000 and 99999
order	by id_dominio
"
EXECUTE xis @insertst, @selectst
END
GO
SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
