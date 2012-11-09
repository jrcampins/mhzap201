-- delimiter ??
CREATE OR REPLACE FUNCTION check_procedure (sp varchar) RETURNS bigint AS $$
declare
    fk bigint := 0;
begin
--  select function_key into fk from vista_system_sysroutines where routine_name = sp;
    select count(*)  into fk from information_schema.routines where routine_name = sp;
    return fk;
end;
$$ LANGUAGE 'plpgsql' VOLATILE;
-- ??
