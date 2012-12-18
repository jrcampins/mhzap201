procedure create_csv_log_imp_pot(archivo varchar2, conjunto varchar2, ignorados varchar2, separador varchar2, delimitador varchar2) is
    comando varchar2(4000);
begin
    xsp.dropone('TABLE','csv_log_imp_pot');
    comando := 'create table csv_log_imp_pot '
            || '( '
            || 'departamento varchar2(255), '
            || 'distrito varchar2(255), '
            || 'nombres_apellidos varchar2(255), '
            || 'apodo varchar2(255), '
            || 'edad varchar2(255), '
            || 'fecha_nacimiento varchar2(255), '
            || 'numero_cedula varchar2(255), '
            || 'numero_telefono varchar2(255), '
            || 'direccion varchar2(255), '
            || 'referencia varchar2(255), '
            || 'barrio varchar2(255), '
            || 'nombre_referente varchar2(255), '
            || 'numero_telefono_referente varchar2(255) '
            || ') '
            || csv_org(archivo, conjunto, ignorados, separador, delimitador);
    dbms_output.put_line(comando);
    execute immediate comando;
end;
