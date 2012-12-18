procedure create_csv_log_imp_ids(archivo varchar2, conjunto varchar2, ignorados varchar2, separador varchar2, delimitador varchar2) is
    comando varchar2(4000);
begin
    xsp.dropone('TABLE','csv_log_imp_ids');
    comando := 'create table csv_log_imp_ids '
            || '( '
            || 'cedula varchar2(255), '
            || 'letra_cedula varchar2(255), '
            || 'apellidos varchar2(255), '
            || 'nombres varchar2(255), '
            || 'fecha_nacimiento varchar2(255), '
            || 'sexo varchar2(255), '
            || 'nacionalidad varchar2(255), '
            || 'estado_civil varchar2(255), '
            || 'lugar_nacimiento varchar2(255), '
            || 'es_indigena varchar2(255) '
            || ') '
            || csv_org(archivo, conjunto, ignorados, separador, delimitador);
    dbms_output.put_line(comando);
    execute immediate comando;
end;
