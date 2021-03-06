procedure create_csv_log_imp_fal(archivo varchar2, conjunto varchar2, ignorados varchar2, separador varchar2, demarcador varchar2) is
    comando varchar2(4000);
begin
    xsp.dropone('TABLE','csv_log_imp_fal');
    comando := 'create table csv_log_imp_fal '
            || '( '
            || 'cedula varchar2(4000), '
            || 'primer_nombre varchar2(4000), '
            || 'segundo_nombre varchar2(4000), '
            || 'primer_apellido varchar2(4000), '
            || 'segundo_apellido varchar2(4000), '
            || 'apellido_casada varchar2(4000), '
            || 'fecha_defuncion varchar2(4000) '
            || ') '
            || csv_org(archivo, conjunto, ignorados, separador, demarcador, comando);
    dbms_output.put_line(comando);
    execute immediate comando;
end;
