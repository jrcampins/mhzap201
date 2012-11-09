create or replace function rastro_funcion_insert
(
id number,
usuario number,
funcion number,
recurso number,
version_recurso number,
codigo_recurso varchar2,
nombre_recurso varchar2,
propietario_recurso number,
segmento_recurso number,
numero_error number,
descripcion_error varchar2
)
return number is
begin
    insert into rastro_funcion
        (
        id_rastro_funcion,
        fecha_hora_ejecucion,
        id_usuario,
        id_funcion,
        id_recurso,
        version_recurso,
        codigo_recurso,
        nombre_recurso,
        id_propietario_recurso,
        id_segmento_recurso,
        numero_error,
        descripcion_error
        )
    values
        (
        id,
        CURRENT_TIMESTAMP,
        usuario,
        funcion,
        recurso,
        version_recurso,
        cast(codigo_recurso as varchar2(200)),
        cast(nombre_recurso as varchar2(200)),
        propietario_recurso,
        segmento_recurso,
        numero_error,
        cast(descripcion_error as varchar2(4000))
        );
    /**/
    return 0;
end;
/
show errors
