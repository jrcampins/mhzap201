--
--Descripción: Este procedimiento permite actualizar el estado de censo de un potencial beneficiario
--utilizando la proveniencia de su ficha persona
--@param row_beneficiario:datos completos del potencial beneficiario 
--@return: numero de condicion de censo
--
create or replace function potencial_ben_actualizar_condicion_censo(row_beneficiario potencial_ben) returns integer as $$
declare
    condicion_censo integer:=1;
    row_ficha record;
begin
    select * into row_ficha
    from ficha_persona fp 
    left join ficha_hogar fh on fp.id_ficha_hogar=fh.id_ficha_hogar 
    where fp.id_ficha_persona=row_beneficiario.id_ficha_persona;
    --Si no tiene ficha persona se actualiza como a censar
    if not found then
        return 1;
    end if;
    --Se actualiza el potencial beneficiario como censado y validado
    if (row_ficha.id_proveedor_dat_ext=102) then
    --Si viene de la DGEEC esta validado
        condicion_censo:=3;
    elsif (row_ficha.id_proveedor_dat_ext is not null) then
    --Si viene de cualquier otro organismo esta por validar
        condicion_censo:=2;
    else
    --Si no tiene proveedor pero si tiene ficha se coloca censado
        condicion_censo:=5;
    end if;
    return condicion_censo;
end;
$$ language plpgsql;