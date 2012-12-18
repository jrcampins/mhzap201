procedure create_csv_log_imp_sub(archivo varchar2, conjunto varchar2, ignorados varchar2, separador varchar2, delimitador varchar2) is
    comando varchar2(4000);
begin
    xsp.dropone('TABLE','csv_log_imp_sub');
    comando := 'create table csv_log_imp_sub '
            || '(  '
            || 'cedula varchar2(255), '
            || 'primer_nombre varchar2(255), '
            || 'segundo_nombre varchar2(255), '
            || 'primer_apellido varchar2(255), '
            || 'segundo_apellido varchar2(255), '
            || 'apellido_casada varchar2(255) '
            || ') '
            || csv_org(archivo, conjunto, ignorados, separador, delimitador);
    dbms_output.put_line(comando);
    execute immediate comando;
end;
