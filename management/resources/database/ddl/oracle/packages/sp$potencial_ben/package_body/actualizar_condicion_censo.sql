--
--Descripción: Este procedimiento permite actualizar el estado de censo de un potencial beneficiario
--utilizando la proveniencia de su ficha persona
--@param xnew:datos completos del potencial beneficiario 
--@return: numero de condicion de censo
--
function actualizar_condicion_censo(xnew potencial_ben%rowtype) return number is
    col_id_proveedor_dat_ext proveedor_dat_ext.id_proveedor_dat_ext%type;
begin
    begin
        select id_proveedor_dat_ext
        into col_id_proveedor_dat_ext
        from ficha_persona fp 
        left join ficha_hogar fh on fp.id_ficha_hogar=fh.id_ficha_hogar 
        where fp.id_ficha_persona=xnew.id_ficha_persona;
    exception
        --Si no tiene ficha persona se actualiza como a censar
        when no_data_found then return 1;
    end;
    --Se actualiza el potencial beneficiario como censado y/o validado
    if (col_id_proveedor_dat_ext is null) then
        --Si no tiene proveedor pero si tiene ficha se coloca censado
        return 5;
    end if;
    if (col_id_proveedor_dat_ext = 102) then
        --Si viene de la DGEEC esta validado
        return 3;
    end if;
    --Si viene de cualquier otro organismo esta por validar
    return 2;
end;
