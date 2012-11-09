-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
-- potencial_ben
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
-- DROP TRIGGER potencial_ben_before_insert_trigger ON potencial_ben CASCADE;
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
CREATE TRIGGER potencial_ben_before_insert_trigger
BEFORE INSERT ON potencial_ben
FOR EACH ROW EXECUTE PROCEDURE potencial_ben_before_insert();
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
-- DROP TRIGGER potencial_ben_after_insert_trigger ON potencial_ben CASCADE;
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
CREATE TRIGGER potencial_ben_after_insert_trigger
AFTER INSERT ON potencial_ben
FOR EACH ROW EXECUTE PROCEDURE potencial_ben_after_insert();
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
-- DROP TRIGGER potencial_ben_before_update_trigger ON potencial_ben CASCADE;
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
CREATE TRIGGER potencial_ben_before_update_trigger
BEFORE UPDATE ON potencial_ben
FOR EACH ROW EXECUTE PROCEDURE potencial_ben_before_update();
