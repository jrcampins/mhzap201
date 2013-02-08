--Este metodo compara dos ficha_persona y en base al id_persona_asociado
--(el cual se obtiene del metodo extract_id_persona)
--indica si se produjeron cambios en el id_persona_asociado.
--@param xold contiene la ficha anterior
function verificar_cambio_vinculo(xold ficha_persona%rowtype, xnew ficha_persona%rowtype) return number is
    id_persona_old number;
    id_persona_new number;
begin
    --dbms_output.put_line('cambiando '||xold.numero_cedula||','||xold.primer_nombre||','||xold.segundo_nombre||','||xold.primer_apellido||','||xold.segundo_apellido);
    --dbms_output.put_line('cambiado por '||xnew.numero_cedula||','||xnew.primer_nombre||','||xnew.segundo_nombre||','||xnew.primer_apellido||','||xnew.segundo_apellido);
    id_persona_old:=extract_id_persona(xold);
    id_persona_new:=extract_id_persona(xnew);
    --dbms_output.put_line('id_viejo '||id_persona_old||' id_nuevo '||id_persona_new);
    if((id_persona_old is null and id_persona_new is not null)
    or(id_persona_old is not null and id_persona_new is null)
    or(id_persona_old <> id_persona_new)) then
         --dbms_output.put_line('si hay cambio');
         return 1;
    end if;
    --dbms_output.put_line('no hay cambio');
    return 0;
end;
