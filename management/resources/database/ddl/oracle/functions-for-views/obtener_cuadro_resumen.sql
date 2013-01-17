DROP TYPE cuadro_resumen;
DROP TYPE resumen;

create type resumen as object( 
    id_barrio number,
    barrio varchar2(4000),
    por_censar number,
    censado number,
    no_censado number,
    total_ben number,
    total_ben_c_ci number,
    total_ben_s_ci number,
    total_no_ben number,
    total_cen number,
    total_val number,
    total_no_val number
    );
/

create type cuadro_resumen as table of resumen;
/

create or replace function get_cuadro_resumen(param number) return cuadro_resumen is
    row_ubicacion ubicacion%rowtype;
    retorno cuadro_resumen:= cuadro_resumen();
    aux number;
    conta number:=0;
    conta_por_censar number:=0;
    conta_censado number:=0;
    conta_no_censado number:=0;
    conta_ben number:=0;
    conta_ben_c_ci number:=0;
    conta_ben_s_ci number:=0;
    conta_no_ben number:=0;
    conta_cen number:=0;
    conta_val number:=0;
    conta_no_val number:=0;
    punto_corte number;
begin
    --Se pide el punto de corte
    begin
        select limite_indice_calidad_vida into punto_corte from parametro_global;
    exception
        when no_data_found then null;
    end;
    --Se determina cuantos barrios hay
    begin 
        select count(id_ubicacion) into conta from ubicacion where id_ubicacion in (select id_ubicacion from consulta_ubicacion_1 where numero_nivel_ubicacion=3);
    exception
        when no_data_found then
            return retorno;
    end;
    --Si todavía no hay barrios en la vista se regenera
    if conta=0 then
        aux:=sp$ubicacion.rebuild();
    end if;
    for row_ubicacion in (select * from consulta_ubicacion_1 where numero_nivel_ubicacion=3) loop
        --PB por censar en el barrio
        conta_por_censar:=0;
        begin
            select count(id_potencial_ben) into conta_por_censar from potencial_ben where numero_condicion_censo=1 and id_barrio=row_ubicacion.id_ubicacion;
        exception
        when no_data_found then
            null;
        end;
        --PB censados en el barrio
        conta_censado:=0;
        begin
            select count(id_potencial_ben) into conta_censado from potencial_ben where id_ficha_persona is not null and id_barrio=row_ubicacion.id_ubicacion;
        exception
        when no_data_found then
            null;
        end;
        --PB no censados en el barrio
        conta_no_censado:=0;
        begin
            select count(id_potencial_ben) into conta_no_censado from potencial_ben where id_ficha_persona is null and id_barrio=row_ubicacion.id_ubicacion;
        exception
        when no_data_found then
            null;
        end;
        --PB con ICV menor e igual a punto de corte
        begin
            select count(pb.id_potencial_ben) into conta_ben from potencial_ben pb 
            left join ficha_persona fp on pb.id_ficha_persona=fp.id_ficha_persona
            left join ficha_hogar fh on fp.id_ficha_hogar=fh.id_ficha_hogar
            where fh.es_ficha_hogar_inactiva=0 and fh.indice_calidad_vida<=punto_corte and pb.id_barrio=row_ubicacion.id_ubicacion;
        exception
        when no_data_found then
            null;
        end;
        --PB con ICV menor a 65 con cédula
        conta_ben_c_ci:=0;
        begin
            select count(pb.id_potencial_ben) into conta_ben_c_ci from potencial_ben pb 
            left join ficha_persona fp on pb.id_ficha_persona=fp.id_ficha_persona
            left join ficha_hogar fh on fp.id_ficha_hogar=fh.id_ficha_hogar
            where fh.es_ficha_hogar_inactiva=0 and fh.indice_calidad_vida<=punto_corte and pb.id_barrio=row_ubicacion.id_ubicacion and pb.id_persona is not null;
        exception
        when no_data_found then
            null;
        end;
        --PB con ICV menor a 65 sin cédula
        conta_ben_s_ci:=0;
        begin
            select count(pb.id_potencial_ben) into conta_ben_s_ci from potencial_ben pb 
            left join ficha_persona fp on pb.id_ficha_persona=fp.id_ficha_persona
            left join ficha_hogar fh on fp.id_ficha_hogar=fh.id_ficha_hogar
            where fh.es_ficha_hogar_inactiva=0 and fh.indice_calidad_vida<=punto_corte and pb.id_barrio=row_ubicacion.id_ubicacion and pb.id_persona is null;
        exception
        when no_data_found then
            null;
        end;
        --PB con ICV mayor a punto de corte
        conta_no_ben:=0;
        begin
            select count(pb.id_potencial_ben) into conta_no_ben from potencial_ben pb 
            left join ficha_persona fp on pb.id_ficha_persona=fp.id_ficha_persona
            left join ficha_hogar fh on fp.id_ficha_hogar=fh.id_ficha_hogar
            where fh.es_ficha_hogar_inactiva=0 and fh.indice_calidad_vida>punto_corte and pb.id_barrio=row_ubicacion.id_ubicacion;
        exception
        when no_data_found then
            null;
        end;
        --PB con condicion_censo=3 o condicion_Censo=5
        conta_cen:=0;
        begin
            select count(pb.id_potencial_ben) into conta_cen from potencial_ben pb 
            left join ficha_persona fp on pb.id_ficha_persona=fp.id_ficha_persona
            left join ficha_hogar fh on fp.id_ficha_hogar=fh.id_ficha_hogar
            where fh.es_ficha_hogar_inactiva=0 and pb.numero_condicion_censo=3 or pb.numero_condicion_censo=5 and pb.id_barrio=row_ubicacion.id_ubicacion;
        exception
        when no_data_found then
            null;
        end;
        --PB con condicion_censo=3 o condicion_Censo=5
        begin
            select count(pb.id_potencial_ben) into conta_no_ben from potencial_ben pb 
            left join ficha_persona fp on pb.id_ficha_persona=fp.id_ficha_persona
            left join ficha_hogar fh on fp.id_ficha_hogar=fh.id_ficha_hogar
            where fh.es_ficha_hogar_inactiva=0 and pb.numero_condicion_censo=3 or pb.numero_condicion_censo=5 and pb.id_barrio=row_ubicacion.id_ubicacion;
        exception
        when no_data_found then
            null;
        end;
        --PB acreditado y elegible
        conta_val:=0;
        begin
            select count(pb.id_potencial_ben) into conta_val from potencial_ben pb 
            left join persona p on pb.id_persona=p.id_persona
            where p.es_persona_acreditada_para_pen=1 and p.es_persona_elegible_para_pen=1 and pb.id_barrio=row_ubicacion.id_ubicacion;
        exception
        when no_data_found then
            null;
        end;
        --PB acreditado y no elegible
        conta_no_val:=0;
        begin
            select count(pb.id_potencial_ben) into conta_val from potencial_ben pb 
            left join persona p on pb.id_persona=p.id_persona
            where p.es_persona_acreditada_para_pen=1 and p.es_persona_elegible_para_pen=0 and pb.id_barrio=row_ubicacion.id_ubicacion;
        exception
        when no_data_found then
            null;
        end;
        retorno.extend;
        retorno(retorno.last).id_barrio:=row_ubicacion.id_ubicacion;
        retorno(retorno.last).barrio:=row_ubicacion.nombre_ubicacion;
        retorno(retorno.last).por_censar:=conta_por_censar;
        retorno(retorno.last).censado:=conta_censado;
        retorno(retorno.last).no_censado:=conta_no_censado;
        retorno(retorno.last).total_ben:=conta_ben;
        retorno(retorno.last).total_ben_c_ci:=conta_ben_c_ci;
        retorno(retorno.last).total_ben_s_ci:=conta_ben_s_ci;
        retorno(retorno.last).total_no_ben:=conta_no_ben;
        retorno(retorno.last).total_cen:=conta_cen;
        retorno(retorno.last).total_val:=conta_val;
        retorno(retorno.last).total_no_val:=conta_no_val;
    end loop;
    return retorno;
end;
/
show errors;