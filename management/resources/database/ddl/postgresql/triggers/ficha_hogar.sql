-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
-- ficha_hogar
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
-- DROP TRIGGER ficha_hogar_before_insert_trigger ON ficha_hogar CASCADE;
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
CREATE TRIGGER ficha_hogar_before_insert_trigger
BEFORE INSERT ON ficha_hogar
FOR EACH ROW EXECUTE PROCEDURE ficha_hogar_before_insert();
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
-- DROP TRIGGER ficha_hogar_before_update_trigger ON ficha_hogar CASCADE;
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
CREATE TRIGGER ficha_hogar_before_update_trigger
BEFORE UPDATE ON ficha_hogar
FOR EACH ROW EXECUTE PROCEDURE ficha_hogar_before_update();
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
-- DROP TRIGGER ficha_hogar_after_update_trigger ON ficha_hogar CASCADE;
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
CREATE TRIGGER ficha_hogar_after_update_trigger
AFTER UPDATE ON ficha_hogar
FOR EACH ROW EXECUTE PROCEDURE ficha_hogar_after_update();
