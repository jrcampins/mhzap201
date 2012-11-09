-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
-- ficha_persona
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
-- DROP TRIGGER ficha_persona_before_insert_trigger ON ficha_persona CASCADE;
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
CREATE TRIGGER ficha_persona_before_insert_trigger
BEFORE INSERT ON ficha_persona
FOR EACH ROW EXECUTE PROCEDURE ficha_persona_before_insert();
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
-- DROP TRIGGER ficha_persona_before_update_trigger ON ficha_persona CASCADE;
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
CREATE TRIGGER ficha_persona_before_update_trigger
BEFORE UPDATE ON ficha_persona
FOR EACH ROW EXECUTE PROCEDURE ficha_persona_before_update();
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
-- DROP TRIGGER ficha_persona_after_insert_trigger ON ficha_persona CASCADE;
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
CREATE TRIGGER ficha_persona_after_insert_trigger
AFTER INSERT ON ficha_persona
FOR EACH ROW EXECUTE PROCEDURE ficha_persona_after_insert();
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
-- DROP TRIGGER ficha_persona_after_update_trigger ON ficha_persona CASCADE;
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
CREATE TRIGGER ficha_persona_after_update_trigger
AFTER UPDATE ON ficha_persona
FOR EACH ROW EXECUTE PROCEDURE ficha_persona_after_update();
