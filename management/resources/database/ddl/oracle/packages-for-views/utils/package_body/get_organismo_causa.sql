function get_organismo_causa(persona_consultada number) return varchar2 is
    row_persona persona%rowtype;
    row_objecion objecion_ele_pen%rowtype;
    condicion number;
    codigo_causa varchar2(60);
    proveedor varchar2(100);
    conta_objeciones number;
    mensaje varchar2(4000):='';
    
begin
    begin
        select * into row_persona from persona where id_persona=persona_consultada;
    exception when no_data_found then null;
    end;
    if not sql%found then
        return mensaje;
    end if;
    --Solo se hace para personas con pensión denegada
    if row_persona.numero_condicion_pension is null or row_persona.numero_condicion_pension!=6 then
        return mensaje;
    end if;
    --Se identifica la condicion
    condicion:=row_persona.numero_causa_den_pension;
    if condicion=99 then
        mensaje:='Organismo no especificado';
    else
        begin
            select count (oep.id_objecion_ele_pen) into conta_objeciones
            from objecion_ele_pen oep 
            where oep.id_persona=row_persona.id_persona
            and oep.numero_tipo_obj_ele_pen=row_persona.numero_Causa_den_pension
            and oep.es_objecion_ele_pen_inactiva=0;
        exception when no_data_found then null;
        end;
        if sql%found then
            if conta_objeciones=0 then 
                mensaje:='';
            elsif conta_objeciones=1 then
                begin
                    select pde.nombre_proveedor_dat_ext into proveedor
                    from objecion_ele_pen oep 
                    left join proveedor_dat_Ext pde on oep.id_proveedor_dat_Ext=pde.id_proveedor_Dat_Ext
                    where oep.id_persona=row_persona.id_persona
                    and oep.numero_tipo_obj_ele_pen=row_persona.numero_Causa_den_pension
                    and oep.es_objecion_ele_pen_inactiva=0;
                exception when no_data_found then null;
                end;
                mensaje:=proveedor;
            elsif conta_objeciones>1 then
               for row_objecion in (select *
                    from objecion_ele_pen oep 
                    where oep.id_persona=row_persona.id_persona
                    and oep.numero_tipo_obj_ele_pen=row_persona.numero_Causa_den_pension
                    and oep.es_objecion_ele_pen_inactiva=0)
                    loop
                        if row_objecion.id_proveedor_dat_Ext is null then
                            continue;
                        end if;
                        begin 
                            select pde.nombre_proveedor_dat_ext into proveedor
                            from proveedor_dat_ext pde where id_proveedor_dat_Ext=row_objecion.id_proveedor_dat_ext;
                        exception when no_data_found then null;
                        end;
                        if not sql%found then 
                            continue;
                        else
                            if mensaje='' then
                                mensaje:=proveedor;
                            else
                                mensaje:=mensaje||'. '||proveedor;
                            end if;
                        end if;
                    end loop;
            end if;
        end if;
    end if;
    return mensaje;
end;
