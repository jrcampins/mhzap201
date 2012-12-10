--
--Descripción: Este procedimiento permite registrar la ultima visita del censo de un potencial beneficiario
--@param beneficiario: id del beneficiario sobre el que se ejecutara la funcion
--@param fecha: Fecha de la ultima visita
--@param funcionario: Funcionario que realiza la visita
--@param comentarios: Comentarios de la solicitud
--@return: mensaje indicando si se pudo realizar la visita o no
--
function reg_ult_vis_cen(beneficiario number, fecha timestamp, funcionario number, comentarios varchar2) return varchar2 is
    mensaje varchar2(2000);
    row_beneficiario potencial_ben%rowtype;
    row_visita visita_censo%rowtype;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000); -- a character string of at most 2048 bytes
begin
    begin
        select * into   row_beneficiario from   potencial_ben p where  p.id_potencial_ben = beneficiario;
    exception
        when no_data_found then null;
    end;
    --Si no se encuentra un registro, no se hace nada
    if not sql%found then
        msg_string:='Potencial beneficiario no existe';
        raise_application_error(err_number, msg_string, true);
    end if;
    --Solo se aceptan visitas posteriores a la ultima visita de censo
    if row_beneficiario.fecha_ultima_visita_censo is not null 
       and row_beneficiario.fecha_ultima_visita_censo>fecha then
       msg_string:='Fecha es anterior a la última visita del Potencial Beneficiario. No se puede registrar';
       raise_application_error(err_number, msg_string, true);
    end if;
    --Se registra la visita, almacenando los valores indicados por el usuario
    row_visita.id_visita_censo:=utils.bigintid();
    row_visita.version_visita_censo:=0;
    row_visita.id_potencial_ben:=beneficiario;
    row_visita.id_funcionario_censista:=funcionario;
    row_visita.fecha_visita:=fecha;
    row_visita.observaciones:=comentarios;
    --El trigger after insert de Visita_Censo se encarga de actualizar Potencial_ben
    insert into visita_censo 
    values (row_visita.id_visita_censo,row_visita.version_visita_censo,row_visita.id_potencial_ben,row_visita.id_funcionario_censista, row_visita.fecha_visita, row_visita.observaciones);
    mensaje:='Registrada Visita de Fecha: '||fecha||' para el beneficiario '||row_beneficiario.nombre_potencial_ben;
    return mensaje;
end;