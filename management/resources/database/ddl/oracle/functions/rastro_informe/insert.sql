create or replace function rastro_informe_insert(id number, usuario number, funcion number) return number is
    row_rastro_informe rastro_informe%rowtype;
begin
    row_rastro_informe.id_rastro_informe                  := id;
    row_rastro_informe.version_rastro_informe             := 0;
    row_rastro_informe.fecha_hora_inicio_ejecucion        := CURRENT_TIMESTAMP;
    row_rastro_informe.id_usuario                         := usuario;
    row_rastro_informe.id_funcion                         := funcion;
    row_rastro_informe.numero_condicion_eje_fun           := 11;
    /**/
    insert into rastro_informe values row_rastro_informe;
    /**/
    return 0;
end;
/
show errors
