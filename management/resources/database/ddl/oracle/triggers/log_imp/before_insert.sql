--Considerando que oracle no proporciona el tipo de dato serial 
--y se necesita dicho tipo de dato para asignar automaticamente el id a los logs,
--se hace necesario definir un trigger para cada uno de los logs de importacion
create or replace trigger trigger_log_imp_deu
before insert on log_imp_deu
for each row
begin
select utils.bigintid into :new.id_log_imp_deu from dual;
end;
/
show errors

create or replace trigger trigger_log_imp_emp
before insert on log_imp_emp
for each row
begin
select utils.bigintid into :new.id_log_imp_emp from dual;
end;
/
show errors

create or replace trigger trigger_log_imp_fal
before insert on log_imp_fal
for each row
begin
select utils.bigintid into :new.id_log_imp_fal from dual;
end;
/
show errors

create or replace trigger trigger_log_imp_hog
before insert on log_imp_hog
for each row
begin
select utils.bigintid into :new.id_log_imp_hog from dual;
end;
/
show errors

create or replace trigger trigger_log_imp_ids
before insert on log_imp_ids
for each row
begin
select utils.bigintid into :new.id_log_imp_ids from dual;
end;
/
show errors

create or replace trigger trigger_log_imp_jub
before insert on log_imp_jub
for each row
begin
select utils.bigintid into :new.id_log_imp_jub from dual;
end;
/
show errors

create or replace trigger trigger_log_imp_pen
before insert on log_imp_pen
for each row
begin
select utils.bigintid into :new.id_log_imp_pen from dual;
end;
/
show errors

create or replace trigger trigger_log_imp_per
before insert on log_imp_per
for each row
begin
select utils.bigintid into :new.id_log_imp_per from dual;
end;
/
show errors

create or replace trigger trigger_log_imp_pot
before insert on log_imp_pot
for each row
begin
select utils.bigintid into :new.id_log_imp_pot from dual;
end;
/
show errors

create or replace trigger trigger_log_imp_sub
before insert on log_imp_sub
for each row
begin
select utils.bigintid into :new.id_log_imp_sub from dual;
end;
/
show errors