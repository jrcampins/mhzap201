procedure create_csv_log_imp_ids(archivo varchar2, conjunto varchar2, ignorados varchar2, separador varchar2, demarcador varchar2) is
    comando varchar2(4000);
begin
    xsp.dropone('TABLE','csv_log_imp_ids');
    comando := 'create table csv_log_imp_ids '
            || '( '
            || 'cedula varchar2(4000), '
            || 'letra_cedula varchar2(4000), '
            || 'apellidos varchar2(4000), '
            || 'nombres varchar2(4000), '
            || 'fecha_nacimiento varchar2(4000), '
            || 'sexo varchar2(4000), '
            || 'nacionalidad varchar2(4000), '
            || 'estado_civil varchar2(4000), '
            || 'lugar_nacimiento varchar2(4000), '
            || 'es_indigena varchar2(4000) '
            || ') '
            || csv_org(archivo, conjunto, ignorados, separador, demarcador, comando);
    dbms_output.put_line(comando);
    execute immediate comando;
end;
