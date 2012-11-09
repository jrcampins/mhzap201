-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
-- funcionario
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
-- DROP TRIGGER funcionario_before_insert_trigger ON funcionario CASCADE;
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
CREATE TRIGGER funcionario_before_insert_trigger
BEFORE INSERT ON funcionario
FOR EACH ROW EXECUTE PROCEDURE funcionario_before_insert();
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
-- DROP TRIGGER funcionario_before_update_trigger ON funcionario CASCADE;
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
CREATE TRIGGER funcionario_before_update_trigger
BEFORE UPDATE ON funcionario
FOR EACH ROW EXECUTE PROCEDURE funcionario_before_update();
