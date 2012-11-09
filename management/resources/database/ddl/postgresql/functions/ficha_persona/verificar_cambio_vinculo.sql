--Este metodo compara dos ficha_persona y en base al id_persona_asociado
--(el cual se obtiene del metodo extract_id_persona_ficha_persona)
--indica si se produjeron cambios en el id_persona_asociado.
--@param ficha_old contiene la ficha anterior
create or replace function verificar_cambio_vinculo(ficha_old ficha_persona,ficha_new ficha_persona) returns integer as $$
declare
    id_persona_old bigint;
    id_persona_new bigint;
    retorno integer:=0;
begin
    id_persona_old:=extract_id_persona_ficha_persona(ficha_old);
    id_persona_new:=extract_id_persona_ficha_persona(ficha_new);
    if((id_persona_old is null and id_persona_new is not null)
       or(id_persona_old is not null and id_persona_new is null)
       or(id_persona_old <> id_persona_new)) then
        retorno:=1;
    end if;
    return retorno;
end;
$$ language'plpgsql';