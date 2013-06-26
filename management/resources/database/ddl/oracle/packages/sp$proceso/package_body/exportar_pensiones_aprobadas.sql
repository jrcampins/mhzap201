function exportar_pen_apr(nombre_archivo varchar2, codigo_sime varchar2) return varchar2 is
    retorno number:=0;
    file_path varchar2(2000):='';
    output_file utl_file.file_type;
    row_persona persona%rowtype;
    mensaje varchar2(2000):='';
    v_str    VARCHAR2(200);
    type pen_apr is record( 
          codigo_persona varchar2(60), 
          primer_nombre  varchar2(60),
          segundo_nombre varchar2(60),
          primer_apellido varchar2(60),
          segundo_apellido varchar2(60),
          apellido_casada varchar2(60),
          edad number
    ); 
    type cons_pen_apr is table of pen_apr;
    vista_pen_apr cons_pen_apr;
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
        v_str:='Cédula;Primer Nombre;Segundo Nombre;Primer Apellido;Segundo Apellido;Apellido Casada;Edad';
        utl_file.put_line(output_file,CONVERT(v_str,'WE8ISO8859P1'));
        --Se consultan las personas
        execute immediate 'select codigo_persona, 
                              primer_nombre, 
                              segundo_nombre, 
                              primer_apellido, 
                              segundo_apellido, 
                              apellido_casada, 
                              utils.years_since(fecha_nacimiento) as edad 
                       from persona where numero_condicion_pension=2 and codigo_sime='''||codigo_sime||'''
                       order by codigo_persona'
            bulk collect into vista_pen_apr;
        if vista_pen_apr.count=0 then
            return 'No hay Pensiones aprobadas con el código de SIME '||codigo_sime;
        end if;
        for i in vista_pen_apr.first..vista_pen_apr.last loop
            v_str:=vista_pen_apr(i).codigo_persona||';'
                   ||vista_pen_apr(i).primer_nombre||';'
                   ||vista_pen_apr(i).segundo_nombre||';'
                   ||vista_pen_apr(i).primer_apellido||';'
                   ||vista_pen_apr(i).segundo_apellido||';'
                   ||vista_pen_apr(i).apellido_casada||';'
                   ||vista_pen_apr(i).edad;
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
     mensaje:=conta||' Personas con pensión aprobada exportadas';
     return mensaje;
end;