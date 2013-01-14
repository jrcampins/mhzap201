function extract_id_funcionario(cedula varchar2) return number is
    id_func number;
begin
    begin 
       select id_funcionario into id_func from funcionario where codigo_funcionario=cedula;
    exception
       when no_data_found then
            return null;
    end;
    return id_func;
end;