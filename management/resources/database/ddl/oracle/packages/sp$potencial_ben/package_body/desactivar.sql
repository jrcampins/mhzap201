--
--Este procedimiento desactiva un potencial beneficiario, eliminando el vinculo entre la ficha_persona correspondiente
--@param beneficiario: Id del potencial beneficiario sobre el que se ejecuta el proceso
--@return: mensaje indicando si se pudo desactivar .
--
function desactivar(beneficiario number) return varchar2 is
    mensaje varchar2(2000);
    row_potencial_ben potencial_ben%rowtype;
    row_ficha_persona ficha_persona%rowtype;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000); -- a character string of at most 2048 bytes
begin
    begin
        select * into row_potencial_ben from potencial_ben where id_potencial_ben=beneficiario;
    exception
        when no_data_found then null;
    end;
    if not sql%found then
        msg_string := 'Potencial Beneficiario No encontrado'||beneficiario;
        raise_application_error(err_number, msg_string, true);
    --
    --Solo se puede desactivar un potencial beneficiario inactivo
    --
    elsif row_potencial_ben.es_potencial_ben_inactivo=1 then
        msg_string := 'Potencial Beneficiario ya fue desactivado';
    --
    --Se determina la ficha_persona que apunta al Potencial_ben
    --
    else
        begin
            select * into row_ficha_persona from ficha_persona where id_potencial_ben=beneficiario;
        exception
            when no_data_found then null;
        end;
        --Si se consigue se elimina el vinculo.
        if sql%found then
            if row_ficha_persona.es_ficha_persona_inactiva=1 then
                --Se reactiva para modificar
                update ficha_persona 
                set es_ficha_persona_inactiva=0, 
                id_potencial_ben=null
                where id_ficha_persona=row_ficha_persona.id_ficha_persona;
                --Se vuelve a desactivar
                update ficha_persona
                set es_ficha_persona_inactiva=1
                where id_ficha_persona=row_ficha_persona.id_ficha_persona;
            else
                --No hace falta reactivar para modificar
                update ficha_persona
                set id_potencial_ben=null
                where id_ficha_persona=row_ficha_persona.id_ficha_persona;
            end if;
        end if;
        --Se desactiva el potencial_ben
        update potencial_ben
        set es_potencial_ben_inactivo=1
        where id_potencial_ben=beneficiario;
        mensaje:='Se desactivů el Potencial Beneficiario: '||row_potencial_ben.nombre_potencial_ben;
    end if;
    return mensaje;
end;