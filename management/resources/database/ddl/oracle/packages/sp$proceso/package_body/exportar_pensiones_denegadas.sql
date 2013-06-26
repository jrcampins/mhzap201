function exportar_pen_den(nombre_archivo varchar2, codigo_sime varchar2) return varchar2 is
    retorno number:=0;
    file_path varchar2(2000):='';
    output_file utl_file.file_type;
    row_persona persona%rowtype;
    mensaje varchar2(2000):='';
    v_str    VARCHAR2(200);
    type pen_den is record( 
          codigo_persona varchar2(60), 
          primer_nombre  varchar2(60),
          segundo_nombre varchar2(60),
          primer_apellido varchar2(60),
          segundo_apellido varchar2(60),
          apellido_casada varchar2(60),
          edad number,
          causa_den varchar2(4000),
          organismo_externo varchar2(4000)
    ); 
    type cons_pen_den is table of pen_den;
    vista_pen_den cons_pen_den;
    conta number:=0;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000); -- a character string of at most 2048 bytes
begin
    if nombre_archivo is null then
        msg_string := 'archivo no existe';
        raise_application_error(err_number, msg_string, true);
    end if;
    begin
        begin
            select directory_path into file_path from all_directories where directory_name='MHZAP201_SPOOL';
        exception when others  then null;
        end;
        output_file := utl_file.fopen('MHZAP201_SPOOL',nombre_archivo, 'W');
        v_str:='Cédula;Primer Nombre;Segundo Nombre;Primer Apellido;Segundo Apellido;Apellido Casada;Edad;Causa de Denegación; Organismo';
        utl_file.put_line(output_file,CONVERT(v_str,'WE8ISO8859P1'));
        --Se consultan las personas
        execute immediate 'select p.codigo_persona, 
                                p.primer_nombre, 
                                p.segundo_nombre, 
                                p.primer_apellido, 
                                p.segundo_apellido, 
                                p.apellido_casada, 
                                utils.years_since(p.fecha_nacimiento) as edad,
                                sp$utils.concat_objecion(toep.codigo_tipo_obj_ele_pen,oep.referencia) as codigo_causa_den,
                                pde.nombre_proveedor_dat_ext as nombre_proveedor
                         from persona p
                         left join objecion_ele_pen oep on oep.id_persona=p.id_persona
                         left join tipo_obj_ele_pen toep on oep.numero_tipo_obj_ele_pen=toep.numero_tipo_obj_ele_pen
                         left join proveedor_dat_ext pde on oep.id_proveedor_dat_ext=pde.id_proveedor_dat_ext
                         where numero_condicion_pension=6 and codigo_sime='''||codigo_sime||'''and oep.es_objecion_ele_pen_inactiva=0
                        order by codigo_persona'
            bulk collect into vista_pen_den;
        if vista_pen_den.count=0 then
            return 'No hay Pensiones denegadas con el código de SIME '||codigo_sime;
        end if;
        for i in vista_pen_den.first..vista_pen_den.last loop
            v_str:=vista_pen_den(i).codigo_persona||';'
                   ||vista_pen_den(i).primer_nombre||';'
                   ||vista_pen_den(i).segundo_nombre||';'
                   ||vista_pen_den(i).primer_apellido||';'
                   ||vista_pen_den(i).segundo_apellido||';'
                   ||vista_pen_den(i).apellido_casada||';'
                   ||vista_pen_den(i).edad||';'
                   ||vista_pen_den(i).causa_den||';'
                   ||vista_pen_den(i).organismo_externo||';';
            utl_file.put_line(output_file,CONVERT(v_str,'WE8ISO8859P1'));
            conta:=conta+1;
        end loop;
        utl_file.fclose(output_file);
     exception
        when UTL_FILE.INVALID_OPERATION then
             UTL_FILE.FCLOSE_ALL;
             RAISE_APPLICATION_ERROR(-20054, 'Operación Inválida. Verifique que el archivo no se encuentra abierto');
        when UTL_FILE.INVALID_PATH then
             UTL_FILE.FCLOSE_ALL;
             RAISE_APPLICATION_ERROR(-20054, 'Ruta Inválida. Verifique el nombre del archivo '||file_path );
        when others then
             UTL_FILE.FCLOSE_ALL;
             RAISE_APPLICATION_ERROR(-20054, 'Error escribiendo en el archivo');
     end;
     mensaje:=conta||' objeciones de personas con pensión denegada exportadas';
     return mensaje;
end;