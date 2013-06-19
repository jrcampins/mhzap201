--
--Descripción: Este procedimiento asigna el monto de pensión a una persona.
--@param persona: código de la persona
--@return: mensaje indicando la asignación
--
function asignar_monto_pension(persona_consultada number,monto number) return varchar2 is
    row_persona persona%rowtype;
    salario_minimo number(16,2);
    monto_asignado number(16,2);
    mensaje varchar2(4000);
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000);
begin
    begin
        select * into   row_persona from persona p where  p.id_persona = persona_consultada;
    exception
        when no_data_found then null;
    end;
    if not sql%found then
        msg_string := 'Persona no existe (id='||persona_consultada||')';
        raise_application_error(err_number, msg_string, true);
    elsif row_persona.numero_condicion_pension is null or row_persona.numero_condicion_pension!=5 then
        msg_string := 'Persona no tiene pensión otorgada. No se puede asignar monto';
        raise_application_error(err_number, msg_string, true);
    end if;
    if monto is null or monto<=0 then
        begin 
            select monto_salario_minimo into salario_minimo from parametro_global;
        exception when no_data_found then null;
        end;
        monto_asignado:=0.25*salario_minimo;
    else
        monto_asignado:=monto;
    end if;
    begin
        update persona p
        set p.monto_pension=monto_asignado
        where p.id_persona=persona_consultada;
    exception 
        when no_data_found then null;
    end;
    mensaje:='Monto de pensión asignado '||to_char(monto_asignado, '9999999999999999.99');
    return mensaje;
end;