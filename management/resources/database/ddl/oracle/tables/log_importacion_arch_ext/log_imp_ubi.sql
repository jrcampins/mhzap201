begin
   execute immediate 'create table log_imp_ubi (
                id_reg number,
                codigo varchar2 (15),
                ubicacion varchar2 (100),
                tipo_ubicacion varchar2 (50),
                tipo_area varchar2 (30),
                codigo_ubicacion_superior varchar2 (15),
                importado number default 0,
                observacion varchar2(4000),
                constraint pk_log_imp_ubi  primary key (id_reg))';
exception
   when others then
    if (sqlcode = -955) then
         dbms_output.put_line('Tabla ya existe. No se hace nada: '||SQLERRM);
    end if;
end;
/
show errors;