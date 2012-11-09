SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
DROP PROCEDURE xdbMetadataBuild
GO
CREATE PROCEDURE xdbMetadataBuild AS
BEGIN
/*
-- EXECUTE xisClaseRecurso20K
-- EXECUTE xisClaseRecurso30K
-- EXECUTE xusClaseRecursoMaestro
-- EXECUTE xisParametroSDK
*/
UPDATE	dual SET id_dual=0
EXECUTE xisParametro
EXECUTE xusParametro				-- 3 grid (es, id, numero)
EXECUTE xisDominio				-- 1 grid
EXECUTE xisDominioPaquete			-- 1 grid
EXECUTE xisDominioParametro			-- 1 grid
--
-- INSERT	INTO dominio_parametro (id_dominio_parametro, id_dominio, id_parametro, numero_tipo_parametro_dom)
-- SELECT	100*id_dominio + 8, id_dominio, id_parametro, 8
-- FROM		dominio, parametro
-- WHERE	codigo_parametro = 'es_nota_confirmada' and numero_tipo_dominio=2 and nombre_tabla = 'nota' and codigo_dominio = 'nota_regular';
--
EXECUTE xisFuncion				-- 1 grid
EXECUTE xisFuncionParametro			-- 1 grid
EXECUTE xisFuncionXP4
EXECUTE xusClaseRecurso				-- 1 grid
EXECUTE xusDominio				-- 1 grid
EXECUTE xusDominioParametro			-- 1 grid
EXECUTE xusFuncion				-- 3 grid
EXECUTE xusFuncionParametro			-- 6 grid
EXECUTE xisClaseRecursoParametro		-- 1 grid
EXECUTE xusClaseRecursoParametro		-- 5 grid
EXECUTE xisAplicacion				-- 1 grid
EXECUTE xisPagina				-- 5 grid
EXECUTE xisPaginaFuncion
EXECUTE xisRol					-- 1 grid
EXECUTE xisRolFuncion
EXECUTE xisOpcionMenu				-- 1 grid
EXECUTE xusOpcionMenu				-- 1 grid
EXECUTE xusClaseRecursoPaginas
/*
UPDATE	funcion set id_grupo_proceso=310300000 where codigo_funcion like'%periodo_pago%' and numero_tipo_funcion=13
*/
UPDATE	dual SET id_dual=1
END
GO
SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
