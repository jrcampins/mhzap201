create or replace trigger usuario_before_insert
before insert on usuario
for each row
begin
    :new.es_usuario_modificado := 1;
end;
/
show errors
