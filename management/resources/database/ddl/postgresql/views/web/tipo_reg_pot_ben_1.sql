/**/
DROP VIEW IF EXISTS consulta_tipo_reg_pot_ben_1;
/**/
CREATE OR REPLACE VIEW consulta_tipo_reg_pot_ben_1 AS
SELECT
	tipo_reg_pot_ben.numero_tipo_reg_pot_ben AS numero_tipo_reg_pot_ben,
	tipo_reg_pot_ben.codigo_tipo_reg_pot_ben AS codigo_tipo_reg_pot_ben
FROM
	tipo_reg_pot_ben tipo_reg_pot_ben;

