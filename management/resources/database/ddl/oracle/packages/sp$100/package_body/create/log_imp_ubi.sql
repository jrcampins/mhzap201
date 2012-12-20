procedure create_csv_log_imp_ubi(archivo varchar2, conjunto varchar2, ignorados varchar2, separador varchar2, demarcador varchar2) is
    comando varchar2(4000);
begin
    xsp.dropone('TABLE','csv_log_imp_ubi');
    comando := 'create table csv_log_imp_ubi '
            || '( '
            || 'codigo varchar2(4000), '
            || 'ubicacion varchar2(4000), '
            || 'tipo_ubicacion varchar2(4000), '
            || 'tipo_area varchar2(4000), '
            || 'codigo_ubicacion_superior varchar2(4000) '
            || ') ';
    comando := comando || csv_org(archivo, conjunto, ignorados, separador, demarcador, comando);
    dbms_output.put_line(comando);
    execute immediate comando;
end;
