create or replace trigger usuario_before_update
before update on usuario
for each row
begin
    if (:old.es_super_usuario <> :new.es_super_usuario) then
        :new.es_usuario_modificado := 1;
    end if;	
end;
/
show errors
