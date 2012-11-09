-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
-- visita_censo
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
-- DROP TRIGGER visita_censo_after_insert_trigger ON visita_censo CASCADE;
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
CREATE TRIGGER visita_censo_after_insert_trigger
AFTER INSERT ON visita_censo
FOR EACH ROW EXECUTE PROCEDURE visita_censo_after_insert();
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
-- DROP TRIGGER visita_censo_after_update_trigger ON visita_censo CASCADE;
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
CREATE TRIGGER visita_censo_after_update_trigger
AFTER UPDATE ON visita_censo
FOR EACH ROW EXECUTE PROCEDURE visita_censo_after_update();
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
-- DROP TRIGGER visita_censo_after_delete_trigger ON visita_censo CASCADE;
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
CREATE TRIGGER visita_censo_after_delete_trigger
AFTER DELETE ON visita_censo
FOR EACH ROW EXECUTE PROCEDURE visita_censo_after_delete();
