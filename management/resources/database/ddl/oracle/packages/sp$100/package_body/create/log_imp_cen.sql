procedure create_csv_log_imp_cen(archivo varchar2, conjunto varchar2, ignorados varchar2, separador varchar2, demarcador varchar2) is
    comando varchar2(4000);
begin    
    xsp.dropone('TABLE','csv_log_imp_cen');
    comando := 'create table csv_log_imp_cen '
            ||'('
            || 'orden VARCHAR2(4000),'
            || 'barrio VARCHAR2(4000), '
            ||' direccion VARCHAR2(4000), '
            ||' telefono VARCHAR2(4000), '
            ||' primer_nombre VARCHAR2(4000), '
            ||' segundo_nombre VARCHAR2(4000), '
            ||' primer_apellido VARCHAR2(4000), '
            ||' segundo_apellido VARCHAR2(4000), '
            ||' edad_a_la_fecha VARCHAR2(4000), '
            ||' sexo VARCHAR2(4000), '
            ||' parentesco VARCHAR2(4000), '
            ||' cedula VARCHAR2(4000), '
            ||' nombre_jefe_hogar VARCHAR2(4000), '
            ||' cedula_jefe_hogar VARCHAR2(4000), '
            ||' icv VARCHAR2(4000), '
            ||' validado VARCHAR2(4000), '
            ||' observaciones VARCHAR2(4000), '
            ||' funcionario VARCHAR2(4000), '
            ||' causa_invalidacion VARCHAR2(4000) '
            ||') '
            || csv_org(archivo, conjunto, ignorados, separador, demarcador, comando);
    dbms_output.put_line(comando);
    execute immediate comando;
end;