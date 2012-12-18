procedure create_csv_log_imp_ubi(archivo varchar2, conjunto varchar2, ignorados varchar2, separador varchar2, delimitador varchar2) is
    comando varchar2(4000);
begin
    xsp.dropone('TABLE','csv_log_imp_ubi');
    comando := 'create table csv_log_imp_ubi '
            || '( '
            || 'codigo varchar2(255), '
            || 'ubicacion varchar2(255), '
            || 'tipo_ubicacion varchar2(255), '
            || 'tipo_area varchar2(255), '
            || 'codigo_ubicacion_superior varchar2(255) '
            || ') '
            || csv_org(archivo, conjunto, ignorados, separador, delimitador);
    dbms_output.put_line(comando);
    execute immediate comando;
end;
