create or replace function rol_copiar(rastro number, id_rol_viejo number, codigo varchar2, nombre varchar2) return number is
    retcode number;
begin
    retcode := sp$rol.copiar(id_rol_viejo, codigo, nombre);
    retcode := rastro_proceso_update(rastro, 21, null, 'rol copiado exitosamente');
    return 0;
end;
/
show errors
