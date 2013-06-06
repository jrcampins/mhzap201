SET DATEFORMAT ymd
GO
INSERT INTO filtro_cla_rec_par (id_filtro_cla_rec_par, version_filtro_cla_rec_par, id_clase_recurso_par, id_clase_recurso_par_columna, numero_operador_com, id_clase_recurso_par_valor, valor)
VALUES (10660040001, 0, 106600400, 103100100, 51, NULL, 'select id_funcion from funcion f, dominio d, clase_recurso c where es_programatica=0 and (es_publica=0 or es_segmentada=1) and f.id_dominio=d.id_dominio and d.id_clase_recurso=c.id_clase_recurso and id_grupo_aplicacion>200');
INSERT INTO filtro_cla_rec_par (id_filtro_cla_rec_par, version_filtro_cla_rec_par, id_clase_recurso_par, id_clase_recurso_par_columna, numero_operador_com, id_clase_recurso_par_valor, valor)
VALUES (10660050001, 0, 106600500, 106200600, 51, NULL, 'select id_clase_recurso_segmento from funcion f, dominio d, clase_recurso c where es_segmentada=1 and f.id_dominio=d.id_dominio and d.id_clase_recurso=c.id_clase_recurso and id_clase_recurso_segmento is not null and id_funcion={id_funcion}');
INSERT INTO filtro_cla_rec_par (id_filtro_cla_rec_par, version_filtro_cla_rec_par, id_clase_recurso_par, id_clase_recurso_par_columna, numero_operador_com, id_clase_recurso_par_valor, valor)
VALUES (10670040001, 0, 106700400, 106100900, 11, NULL, '0');
INSERT INTO filtro_cla_rec_par (id_filtro_cla_rec_par, version_filtro_cla_rec_par, id_clase_recurso_par, id_clase_recurso_par_columna, numero_operador_com, id_clase_recurso_par_valor, valor)
VALUES (10680040001, 0, 106800400, 108100700, 11, NULL, '{userid}');
INSERT INTO filtro_cla_rec_par (id_filtro_cla_rec_par, version_filtro_cla_rec_par, id_clase_recurso_par, id_clase_recurso_par_columna, numero_operador_com, id_clase_recurso_par_valor, valor)
VALUES (10690040001, 0, 106900400, 104200100, 51, NULL, 'select id_pagina from pagina p, aplicacion a where numero_tipo_pagina not in (2,6) and id_dominio_maestro is null and p.id_aplicacion=a.id_aplicacion and a.es_publica=0 and id_grupo_aplicacion>200');
INSERT INTO filtro_cla_rec_par (id_filtro_cla_rec_par, version_filtro_cla_rec_par, id_clase_recurso_par, id_clase_recurso_par_columna, numero_operador_com, id_clase_recurso_par_valor, valor)
VALUES (20100220001, 0, 201002200, 202000500, 1, NULL, NULL);
INSERT INTO filtro_cla_rec_par (id_filtro_cla_rec_par, version_filtro_cla_rec_par, id_clase_recurso_par, id_clase_recurso_par_columna, numero_operador_com, id_clase_recurso_par_valor, valor)
VALUES (20100230001, 0, 201002300, 202000500, 11, 201002200, NULL);
INSERT INTO filtro_cla_rec_par (id_filtro_cla_rec_par, version_filtro_cla_rec_par, id_clase_recurso_par, id_clase_recurso_par_columna, numero_operador_com, id_clase_recurso_par_valor, valor)
VALUES (20100250001, 0, 201002500, 202000500, 11, 201002300, NULL);
INSERT INTO filtro_cla_rec_par (id_filtro_cla_rec_par, version_filtro_cla_rec_par, id_clase_recurso_par, id_clase_recurso_par_columna, numero_operador_com, id_clase_recurso_par_valor, valor)
VALUES (32010170001, 0, 320101700, 202000500, 1, NULL, NULL);
INSERT INTO filtro_cla_rec_par (id_filtro_cla_rec_par, version_filtro_cla_rec_par, id_clase_recurso_par, id_clase_recurso_par_columna, numero_operador_com, id_clase_recurso_par_valor, valor)
VALUES (32010180001, 0, 320101800, 202000500, 11, 320101700, NULL);
INSERT INTO filtro_cla_rec_par (id_filtro_cla_rec_par, version_filtro_cla_rec_par, id_clase_recurso_par, id_clase_recurso_par_columna, numero_operador_com, id_clase_recurso_par_valor, valor)
VALUES (32010200001, 0, 320102000, 202000500, 11, 320101800, NULL);
INSERT INTO filtro_cla_rec_par (id_filtro_cla_rec_par, version_filtro_cla_rec_par, id_clase_recurso_par, id_clase_recurso_par_columna, numero_operador_com, id_clase_recurso_par_valor, valor)
VALUES (32010210001, 0, 320102100, 202000500, 11, 320102000, NULL);
INSERT INTO filtro_cla_rec_par (id_filtro_cla_rec_par, version_filtro_cla_rec_par, id_clase_recurso_par, id_clase_recurso_par_columna, numero_operador_com, id_clase_recurso_par_valor, valor)
VALUES (32020260001, 0, 320202600, 202000500, 1, NULL, NULL);
INSERT INTO filtro_cla_rec_par (id_filtro_cla_rec_par, version_filtro_cla_rec_par, id_clase_recurso_par, id_clase_recurso_par_columna, numero_operador_com, id_clase_recurso_par_valor, valor)
VALUES (32020270001, 0, 320202700, 202000500, 11, 320202600, NULL);
INSERT INTO filtro_cla_rec_par (id_filtro_cla_rec_par, version_filtro_cla_rec_par, id_clase_recurso_par, id_clase_recurso_par_columna, numero_operador_com, id_clase_recurso_par_valor, valor)
VALUES (32040230001, 0, 320402300, 202000500, 1, NULL, NULL);
INSERT INTO filtro_cla_rec_par (id_filtro_cla_rec_par, version_filtro_cla_rec_par, id_clase_recurso_par, id_clase_recurso_par_columna, numero_operador_com, id_clase_recurso_par_valor, valor)
VALUES (32040240001, 0, 320402400, 202000500, 11, 320402300, NULL);
INSERT INTO filtro_cla_rec_par (id_filtro_cla_rec_par, version_filtro_cla_rec_par, id_clase_recurso_par, id_clase_recurso_par_columna, numero_operador_com, id_clase_recurso_par_valor, valor)
VALUES (32040260001, 0, 320402600, 202000500, 11, 320402400, NULL);
INSERT INTO filtro_cla_rec_par (id_filtro_cla_rec_par, version_filtro_cla_rec_par, id_clase_recurso_par, id_clase_recurso_par_columna, numero_operador_com, id_clase_recurso_par_valor, valor)
VALUES (32040270001, 0, 320402700, 202000500, 11, 320402600, NULL);
GO
