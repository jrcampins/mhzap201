create or replace trigger funcionario_before_update
before update on funcionario
for each row
declare
    xnew funcionario%rowtype;
begin
    xnew.id_funcionario := :new.id_funcionario;                                
    xnew.version_funcionario := :new.version_funcionario;                      
    xnew.codigo_funcionario := :new.codigo_funcionario;                        
    xnew.nombre_funcionario := :new.nombre_funcionario;                        
    xnew.numero_cedula := :new.numero_cedula;                                  
    xnew.letra_cedula := :new.letra_cedula;                                    
    xnew.primer_nombre := :new.primer_nombre;                                  
    xnew.segundo_nombre := :new.segundo_nombre;                                
    xnew.primer_apellido := :new.primer_apellido;                              
    xnew.segundo_apellido := :new.segundo_apellido;                            
    xnew.apellido_casada := :new.apellido_casada;                              
    /**/
    :new.codigo_funcionario := sp$funcionario.concat_codigo(xnew);
    :new.nombre_funcionario := sp$funcionario.concat_nombre(xnew);
end;
/
show errors
