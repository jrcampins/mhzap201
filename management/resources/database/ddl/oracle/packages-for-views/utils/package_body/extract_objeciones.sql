function extract_objeciones(persona_consultada number) return varchar2 is
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000); -- a character string of at most 2048 bytes
    mensaje varchar2(4000);
    type objecion is record( 
          id_persona number,
          tipo_objecion number,
          codigo_objecion varchar2(100),
          codigo_proveedor varchar2(100),
          referencia varchar2(100),
          fecha_fallecimiento date
    );
    type cons_objeciones is table of objecion;
    vista_objeciones cons_objeciones;
    row_persona persona%rowtype;
    row_objecion objecion_ele_pen%rowtype;
begin
    begin
        select * into   row_persona from persona p where  p.id_persona = persona_consultada;
    exception
        when no_data_found then null;
    end;
    if not sql%found then
        msg_string := 'Persona no existe (id='||persona_consultada||')';
        raise_application_error(err_number, msg_string, true);
    else
        execute immediate 'select oep.id_persona as id_persona, 
                                oep.numero_tipo_obj_ele_pen as tipo_objecion,
                                toep.codigo_tipo_obj_ele_pen as codigo_objecion, 
                                pde.nombre_proveedor_dat_ext as codigo_proveedor, 
                                oep.referencia as referencia,
                                p.fecha_certificado_defuncion  as fecha_fallecimiento
                         from objecion_ele_pen oep
                         left join tipo_obj_ele_pen toep on oep.numero_tipo_obj_ele_pen=toep.numero_tipo_obj_ele_pen
                         left join proveedor_dat_ext pde on oep.id_proveedor_dat_ext=pde.id_proveedor_dat_ext
                         left join persona p on oep.id_persona=p.id_persona 
                         where oep.id_persona='||persona_consultada||' and oep.es_objecion_ele_pen_inactiva=0'
            bulk collect into vista_objeciones;
        if vista_objeciones.count=0 then
            return '';
        else 
            mensaje:='';
            for i in vista_objeciones.first..vista_objeciones.last loop
                if vista_objeciones(i).tipo_objecion=12 then
                    mensaje:=mensaje||'Fallecido (Fecha de Fallecimiento: '||vista_objeciones(i).fecha_fallecimiento||'). ';
                elsif vista_objeciones(i).tipo_objecion=21 then
                    mensaje:=mensaje||'Empleado: '|| vista_objeciones(i).codigo_proveedor||'. ';
                elsif vista_objeciones(i).tipo_objecion=22 then
                    mensaje:=mensaje||'Jubilado: '|| vista_objeciones(i).codigo_proveedor||'. ';
                elsif vista_objeciones(i).tipo_objecion=23 then
                    mensaje:=mensaje||'Deuda: '|| vista_objeciones(i).codigo_proveedor||' ';
                    if vista_objeciones(i).referencia is not null then
                        mensaje:=mensaje||'(NIS: '||vista_objeciones(i).referencia||') ';
                    end if;
                    mensaje:=mensaje||'. ';
                elsif vista_objeciones(i).tipo_objecion=24 then
                    mensaje:=mensaje||'Pena Judicial. ';
                elsif vista_objeciones(i).tipo_objecion=25 then
                    mensaje:=mensaje||'Pensionado: '||vista_objeciones(i).codigo_proveedor||'. ';
                elsif vista_objeciones(i).tipo_objecion=26 then
                    mensaje:=mensaje||'Subsidiado '||vista_objeciones(i).codigo_proveedor||'. ';
                elsif vista_objeciones(i).tipo_objecion=99 then
                    mensaje:=mensaje||'Otra causa.';
                end if;               
            end loop;
        end if;
    end if;
    return mensaje;
end;