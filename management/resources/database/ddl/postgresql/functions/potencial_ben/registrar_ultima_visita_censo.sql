--
--Descripción: Este procedimiento permite registrar la ultima visita del censo de un potencial beneficiario
--@param rastro: Identificador del proceso ejecutado.
--@param beneficiario: id del beneficiario sobre el que se ejecutara la funcion
--@param fecha: Fecha de la ultima visita
--@param funcionario: Funcionario que realiza la visita
--@param comentarios: Comentarios de la solicitud
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function potencial_ben_reg_ult_vis_cen(rastro bigint, beneficiario bigint, fecha timestamp, funcionario bigint, comentarios varchar) returns integer as $$
declare
    mensaje varchar:='';
begin
    select potencial_ben_reg_ult_vis_cen( beneficiario, fecha, funcionario, comentarios) into mensaje;
    return rastro_proceso_update(rastro, 21, null, mensaje);
end;
$$ language plpgsql;
--
--Descripción: Este procedimiento permite registrar la ultima visita del censo de un potencial beneficiario
--@param beneficiario: id del beneficiario sobre el que se ejecutara la funcion
--@param fecha: Fecha de la ultima visita
--@param funcionario: Funcionario que realiza la visita
--@param comentarios: Comentarios de la solicitud
--@return: mensaje indicando si se pudo realizar la visita o no
--
create or replace function potencial_ben_reg_ult_vis_cen(beneficiario bigint, fecha timestamp, funcionario bigint, comentarios varchar) returns varchar as $$
declare
    mensaje varchar:='';
    row_beneficiario potencial_ben;
    row_visita visita_censo;
begin
    select *
    into   row_beneficiario
    from   potencial_ben as p
    where  p.id_potencial_ben = beneficiario;
    if not found then
        raise exception 'Persona no existe (id=%)', persona_consultada;
    end if;
    --Solo se aceptan visitas posteriores a la ultima visita de censo
    if row_beneficiario.fecha_ultima_visita_censo is not null 
       and row_beneficiario.fecha_ultima_visita_censo>fecha then
       raise exception 'Fecha es anterior a la última visita del Potencial Beneficiario. No se puede registrar';
    end if;
    --Se registra la visita, almacenando los valores indicados por el usuario
    row_visita.id_visita_censo:=bigintid();
    row_visita.version_visita_censo:=0;
    row_visita.id_potencial_ben:=beneficiario;
    row_visita.id_funcionario_censista:=funcionario;
    row_visita.fecha_visita:=fecha;
    row_visita.observaciones:=comentarios;
    --El trigger after insert de Visita_Censo se encarga de actualizar Potencial_ben
    insert into visita_censo values (row_visita.*);
    mensaje:='Registrada Visita de Fecha: '||fecha||' para el beneficiario '||row_beneficiario.nombre_potencial_ben;
    return mensaje;
end;
$$ language plpgsql;