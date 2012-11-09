--Este metodo compara dos ficha_persona y en base al id_persona_asociado
--(el cual se obtiene del metodo extract_id_persona)
--indica si se produjeron cambios en el id_persona_asociado.
--@param xold contiene la ficha anterior
function verificar_cambio_vinculo(xold ficha_persona%rowtype, xnew ficha_persona%rowtype) return number is
    id_persona_old number;
    id_persona_new number;
begin
    id_persona_old:=extract_id_persona(xold);
    id_persona_new:=extract_id_persona(xnew);
    if((id_persona_old is null and id_persona_new is not null)
    or(id_persona_old is not null and id_persona_new is null)
    or(id_persona_old <> id_persona_new)) then
         return 1;
    end if;
    return 0;
end;
