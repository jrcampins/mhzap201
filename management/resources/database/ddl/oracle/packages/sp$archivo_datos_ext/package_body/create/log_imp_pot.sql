procedure create_csv_log_imp_pot(archivo varchar2, conjunto varchar2, ignorados varchar2, separador varchar2, demarcador varchar2) is
    comando varchar2(4000);
begin
    xsp.dropone('TABLE','csv_log_imp_pot');
    comando := 'create table csv_log_imp_pot '
            || '( '
            || 'departamento varchar2(4000), '
            || 'distrito varchar2(4000), '
            || 'nombres_apellidos varchar2(4000), '
            || 'apodo varchar2(4000), '
            || 'edad varchar2(4000), '
            || 'fecha_nacimiento varchar2(4000), '
            || 'numero_cedula varchar2(4000), '
            || 'numero_telefono varchar2(4000), '
            || 'direccion varchar2(4000), '
            || 'referencia varchar2(4000), '
            || 'barrio varchar2(4000), '
            || 'nombre_referente varchar2(4000), '
            || 'numero_telefono_referente varchar2(4000) '
            || ') '
            || csv_org(archivo, conjunto, ignorados, separador, demarcador, comando);
    dbms_output.put_line(comando);
    execute immediate comando;
end;
