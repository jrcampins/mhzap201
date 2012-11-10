-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
-- ubicacion
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
-- DROP TRIGGER ubicacion_before_update_trigger ON ubicacion CASCADE;
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
CREATE TRIGGER ubicacion_before_update_trigger
BEFORE UPDATE ON ubicacion
FOR EACH ROW EXECUTE PROCEDURE ubicacion_before_update();