create or replace function potencial_ben_copia_datos_persona (row_potencial_ben potencial_ben) returns potencial_ben as $$
declare
    row_persona persona;
begin
    if (row_potencial_ben.id_persona is not null) then
        select *
        into   row_persona
        from   persona
        where  id_persona = row_potencial_ben.id_persona;
        /**/
        if not found then
            raise exception 'persona no existe (id=%)', row_potencial_ben.id_persona;
        end if;
        --el método original fue modificado 
        --Se copian aquellos datos que siempre estarán actualizados en persona
        row_potencial_ben.primer_nombre = row_persona.primer_nombre;
        row_potencial_ben.segundo_nombre = row_persona.segundo_nombre;
        row_potencial_ben.primer_apellido = row_persona.primer_apellido;
        row_potencial_ben.segundo_apellido = row_persona.segundo_apellido;
        row_potencial_ben.apellido_casada = row_persona.apellido_casada;
        row_potencial_ben.fecha_nacimiento = row_persona.fecha_nacimiento;
        row_potencial_ben.edad = cast(extract(years from age(row_potencial_ben.fecha_nacimiento)) as integer);
        row_potencial_ben.es_paraguayo_natural = row_persona.es_paraguayo_natural;
        row_potencial_ben.numero_cedula = row_persona.numero_cedula;
        row_potencial_ben.letra_cedula = row_persona.letra_cedula;
        row_potencial_ben.id_ficha_persona = row_persona.id_ficha_persona;
        row_potencial_ben.es_persona_con_empleo = row_persona.es_persona_con_empleo;
        row_potencial_ben.es_persona_con_deuda = row_persona.es_persona_con_deuda;
        row_potencial_ben.es_persona_con_pena_judicial = row_persona.es_persona_con_pena_judicial;
        row_potencial_ben.es_persona_con_cer_vida = row_persona.es_persona_con_cer_vida;
        row_potencial_ben.es_persona_con_carta_renuncia = row_persona.es_persona_con_carta_renuncia;
        row_potencial_ben.apodo = row_persona.apodo;
        row_potencial_ben.fecha_expedicion_cedula = row_persona.fecha_expedicion_cedula;
        row_potencial_ben.fecha_vencimiento_cedula = row_persona.fecha_vencimiento_cedula;
        row_potencial_ben.es_indigena = row_persona.es_indigena;
        row_potencial_ben.id_etnia_indigena = row_persona.id_etnia_indigena;
        row_potencial_ben.nombre_comunidad_indigena = row_persona.nombre_comunidad_indigena;
        --Aquellos campos que no provengan del repositorio de identificaciones son obtenidos desde persona.
        if (row_potencial_ben.id_departamento is null) then
            row_potencial_ben.id_departamento = row_persona.id_departamento;
        end if;
        if (row_potencial_ben.id_distrito is null) then
            row_potencial_ben.id_distrito = row_persona.id_distrito;
        end if;
        if (row_potencial_ben.numero_tipo_area is null) then
            row_potencial_ben.numero_tipo_area = row_persona.numero_tipo_area;
        end if;
        if (row_potencial_ben.id_barrio is null) then
            row_potencial_ben.id_barrio = row_persona.id_barrio;
        end if;
        if (row_potencial_ben.manzana is null) then
            row_potencial_ben.manzana = row_persona.manzana;
        end if;
        if (row_potencial_ben.direccion is null) then
            row_potencial_ben.direccion = row_persona.direccion;
        end if;
        if (row_potencial_ben.es_persona_con_subsidio is null) then
            row_potencial_ben.es_persona_con_subsidio = row_persona.es_persona_con_subsidio ;
        end if;
        if (row_potencial_ben.es_persona_con_pension is null) then
            row_potencial_ben.es_persona_con_pension = row_persona.es_persona_con_pension ;
        end if;
        if (row_potencial_ben.es_persona_con_jubilacion is null) then
            row_potencial_ben.es_persona_con_jubilacion = row_persona.es_persona_con_jubilacion ;
        end if;
        /**/
    end if;
    /**/
    return row_potencial_ben;
end;
$$ language 'plpgsql' volatile called on null input security invoker;
