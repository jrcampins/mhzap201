-- --IGNORAR: Este segmento debera ser comentado al momento de agregar el nuevo prototipo
-- alter table ubicacion
-- add column numero_tipo_Area integer;
-- --IGNORAR FIN
-- 
-- Este procedimiento importa un archivo de datos externos, particularmente el archivo de ubicaciones
-- @param nombre_archivo: Nombre del archivo a importar
-- @param codigo_Archivo: Codigo del archivo a importar
-- @returns numero de registros importados
--
create or replace function importar_ubicaciones(nombre_archivo varchar2,codigo_archivo varchar2) return number as

    --UTL

    v_dir varchar2(4000);
   
    v_dir1 varchar2(4000);

    v_filename varchar2(4000);
    
    v_line varchar2(4000);
       
    v_file utl_file.file_type; 

    retorno number:=0;
    path_domain varchar2(4000):='';
    path_archivos_externos varchar2(4000):='';
    path_archivo_importar varchar2(4000):='';
--     nombre_tabla varchar2(4000):='archivo_datos_ext';
    current_ubicacion log_imp_ubi%ROWTYPE;
    codigo_ubicacion_superior varchar2(4000):='';
    id_ubicacion_superior number:=0;
    new_ubicacion ubicacion%ROWTYPE;
    mensaje varchar2(4000):='';    
    v_nombre_archivo varchar2(4000);
    l_cur_string varchar2(4000);
    TYPE cur_type IS REF CURSOR;
    a cur_type;
    --current_ubicacion 
    b cur_type;
    c cur_type;    
begin

    if nombre_archivo is null or codigo_archivo is null then
        raise_application_error(-20001, 'Archivo No Existe');
    end if;
    
    --Copiamos la ruta del domain
    begin
       select valor_opcion_sistema 
       into path_domain 
       from opcion_sistema 
       where id_opcion_sistema=104;
    exception
       when no_data_found then
          raise_application_error(-20001, 'Ruta de dominio inválida, verifique opciones del sistema');
       when others then
          raise_application_error(-20001, 'Error al recuperar PATH_DOMAIN '||SQLERRM); 
    end;      
    
    --Copiamos la ruta de archivos externos
    begin
       select valor_opcion_sistema 
       into path_archivos_externos
       from opcion_sistema 
       where id_opcion_sistema=105;
    exception   
       when no_data_found then
          raise_application_error(-20001, 'Ruta de archivos externos inválida, verifique opciones del sistema');
       when others then
          raise_application_error(-20001, 'Error al recuperar PATH_ARCHIVOS_EXTERNOS '||SQLERRM);
    end;

    --Se limpia el nombre del archivo    
    v_nombre_archivo := rtrim(ltrim(nombre_archivo));
    --Copiamos la ruta con el nombre del archivo
    path_archivo_importar := path_domain||path_archivos_externos||v_nombre_archivo;

    v_dir := substr(path_archivo_importar, 1, (instr(path_archivo_importar, '/', -1) - 1));

    v_filename := substr(path_archivo_importar, (instr(path_archivo_importar, '/', - 1) + 1), (length(path_archivo_importar) - instr(path_archivo_importar, '/', - 1)));

    
    begin     
         select directory_name
         into   v_dir1
         from   all_directories
         where  directory_path = v_dir;
    exception
         when others then
            raise_application_error(-20001, 'Error al recupear Directorio '||sqlerrm);        
    end;      
       
    v_file := utl_file.fopen(v_dir1, v_filename, 'r');

    loop        
         begin
            utl_file.get_line(v_file, v_line);
         exception 
            when no_data_found then 
               exit;         
         end;
         DBMS_OUTPUT.PUT_LINE('linea!!! = ' || v_line);
    end loop;
--     --Se indica el nombre de la tabla temporal
--     --nombre_tabla := lower(nombre_tabla||'_'||codigo_archivo);
--     /*
--     --Se crea la tabla temporal 
--     execute 'drop table if exists  '||nombre_tabla||';
--              create table '||nombre_tabla||'(
--                 id_reg serial,
--                 codigo character varying (15),
--                 ubicacion character varying (100),
--                 tipo_ubicacion character varying (50),
--                 tipo_area character varying (30),
--                 codigo_ubicacion_superior character varying (15),
--                 importado integer default 0,
--                 observacion character varying,
--                 constraint pk_'||nombre_tabla||'  primary key (id_reg)
--                 );';
--     set client_encoding to LATIN1;
--     --Se copia el contenido del archivo en la tabla temporal
--     execute'copy '
--            ||nombre_tabla||
--            '(codigo,ubicacion,tipo_ubicacion,tipo_area,codigo_ubicacion_superior) from E'''
--            || path_archivo_importar||
--            ''' with delimiter as '';'' csv header;';
--     set client_encoding to UTF8;
--     */
-- --  begin  
-- --       execute immediate 'drop table log_imp_ubi';
-- --  exception
-- --       when others then
-- --          if (sqlcode = -942) then        
-- --             null;
-- --          else
-- --             raise_application_error(-20001, 'Error al eliminar tabla '||sqlerrm);  
-- --          end if;
-- --  end;
-- --  execute immediate 'create table log_imp_ubi (
-- --                 id_reg number,
-- --                 codigo varchar2 (15),
-- --                 ubicacion varchar2 (100),
-- --                 tipo_ubicacion varchar2 (50),
-- --                 tipo_area varchar2 (30),
-- --                 codigo_ubicacion_superior varchar2 (15),
-- --                 importado number default 0,
-- --                 observacion varchar2(4000),
-- --                 constraint pk_log_imp_ubi  primary key (id_reg))'; 
-- --importamos departamentos     
-- --for current_ubicacion in execute 'select * from '||nombre_tabla||' where btrim(tipo_ubicacion)=''DEPARTAMENTO''' loop 
--    
--    l_cur_string := 'select * from log_imp_ubi where ltrim(rtrim(tipo_ubicacion)) = '||'''DEPARTAMENTO''';      
--    open a for l_cur_string;  
--    loop   
--       fetch a into current_ubicacion;      
--       exit when a%notfound;            
--       begin       
--             --Reiniciar los valores de la nueva ubicacion para cada registro a importar            
--             new_ubicacion.id_ubicacion := utils.bigintid();            
--             new_ubicacion.version_ubicacion := 0;
--             new_ubicacion.id_ubicacion_superior := null;            
--             --Obtener valores
--             new_ubicacion.codigo_ubicacion := current_ubicacion.codigo;
--             new_ubicacion.nombre_ubicacion := current_ubicacion.ubicacion;           
--             --Se inserta el registro importado en la tabla persona           
--             insert into ubicacion values new_ubicacion;
--             --Se registra la inserción en la tabla intermedia           
--             execute immediate 'update log_imp_ubi set importado=1 where id_reg='||current_ubicacion.id_reg;            
--             --Se incrementa el numero de insertados           
--             retorno:=retorno+1;           
--             --Si no se pudo insertar el registro se marca el motivo            
--       exception when others then
--             mensaje:='Error '||SQLERRM;
--             execute immediate 'update log_imp_ubi set observacion='''||mensaje||''' where id_reg = '||current_ubicacion.id_reg;                
--       end;     
--     end loop;    
--     close a;
--   
--     --Distritos
--     --for current_ubicacion in execute 'select * from '||nombre_tabla||' where btrim(tipo_ubicacion)=''DISTRITO''' loop
--     
--    l_cur_string := 'select * from log_imp_ubi where ltrim(rtrim(tipo_ubicacion)) = '||'''DISTRITO''';   
--    open b for l_cur_string;
--    loop  
--         fetch b into current_ubicacion;
--         exit when b%notfound;        
--         begin
--             --Reiniciar los valores de la nueva ubicacion para cada registro a importar
--             new_ubicacion.id_ubicacion := utils.bigintid();
--             new_ubicacion.version_ubicacion := 0;
--             new_ubicacion.id_ubicacion_superior := null;
--             --Obtener valores
--             new_ubicacion.codigo_ubicacion := current_ubicacion.codigo;
--             new_ubicacion.nombre_ubicacion := current_ubicacion.ubicacion;
--             --Obtener ubicacion superior
--             codigo_ubicacion_superior := current_ubicacion.codigo_ubicacion_superior;
--             if(codigo_ubicacion_superior is null) then
--                 raise_application_error(-20001, 'Distrito '||current_ubicacion.codigo||':'||current_ubicacion.ubicacion||' sin departamento');
--             else 
--                 begin
--                    select id_ubicacion 
--                    into id_ubicacion_superior
--                    from ubicacion 
--                    where codigo_ubicacion = codigo_ubicacion_superior;
--                 exception   
--                    when no_data_found then
--                       raise_application_error(-20001, 'Ubicacion superior desconocida para '||current_ubicacion.codigo||':'||current_ubicacion.ubicacion);                 
--                       new_ubicacion.id_ubicacion_superior:=id_ubicacion_superior;
--                    when others then
--                       raise_application_error(-20001, 'Error al recuperar ID_UBICACION '||sqlerrm);                      
--                    end;                         
--             end if;
--             --Se inserta el registro importado en la tabla persona
--             insert into ubicacion values new_ubicacion;
--             --Se registra la inserción en la tabla intermedia
--             execute immediate 'update log_imp_ubi set importado=1 where id_reg='||current_ubicacion.id_reg;
--             --Se incrementa el numero de insertados
--             retorno:=retorno+1;            
--             --Si no se pudo insertar el registro se marca el motivo
--             exception when others then
--                mensaje:='Error '||SQLCODE||' : '||SQLERRM;
--                execute immediate 'update log_imp_ubi set observacion='''||mensaje||''' where id_reg = '||current_ubicacion.id_reg;
--         end;        
--     end loop;
--     close b;
--     
--     --Barrios
--     --for current_ubicacion in execute 'select * from '||nombre_tabla||' where btrim(tipo_ubicacion)=''BARRIO''' loop    
--     l_cur_string := 'select * from log_imp_ubi where ltrim(rtrim(tipo_ubicacion)) = '||'''BARRIO''';   
--     open c for l_cur_string;
--     loop   
--       fetch c into current_ubicacion;      
--       exit when c%notfound;
--         begin        
--             --Reiniciar los valores de la nueva ubicacion para cada registro a importar            
--             new_ubicacion.id_ubicacion:= utils.bigintid();
--             new_ubicacion.version_ubicacion:=0;            
--             new_ubicacion.id_ubicacion_superior:=null;            
--             --Obtener valores
--             new_ubicacion.codigo_ubicacion:=current_ubicacion.codigo;
--             new_ubicacion.nombre_ubicacion:=current_ubicacion.ubicacion;
--             new_ubicacion.numero_tipo_area:=ext_tipo_area_ubi(current_ubicacion.tipo_area);            
--             --Obtener ubicacion superior            
--             codigo_ubicacion_superior:=current_ubicacion.codigo_ubicacion_superior;
--             
--             if(codigo_ubicacion_superior is null) then
--             
--                 raise_application_error(-20001, 'Barrio '||current_ubicacion.codigo||':'||current_ubicacion.ubicacion||' sin distrito');
--                 
--             else
--             
--                begin
--                 
--                    select id_ubicacion 
--                    into id_ubicacion_superior
--                    from ubicacion 
--                    where codigo_ubicacion=codigo_ubicacion_superior;
--                exception   
--                   when no_data_found then
--                      raise_application_error(-20001, 'Ubicacion superior desconocida para '||current_ubicacion.codigo||':'||current_ubicacion.ubicacion);
--                      new_ubicacion.id_ubicacion_superior:=id_ubicacion_superior;
--                   when others then
--                      raise_application_error(-20001, 'Error al recuperar ID_UBICACION-SUPERIOR '||sqlerrm);
--                     
--                end;
--                        
--             end if;
--             
--             --Se inserta el registro importado en la tabla persona
--             
--             insert into ubicacion values new_ubicacion;
--             
--             --Se registra la inserción en la tabla intermedia
--             
--             execute immediate 'update log_imp_ubi set importado=1 where id_reg='||current_ubicacion.id_reg;
--             
--             --Se incrementa el numero de insertados
--             
--             retorno:=retorno+1;
--             
--             --Si no se pudo insertar el registro se marca el motivo
--             
--         exception 
--         
--            when others then
--               mensaje:='Error '||SQLCODE||' : '||SQLERRM;
--               execute immediate 'update log_imp_ubi set observacion='''||mensaje||''' where id_reg = '||current_ubicacion.id_reg;
-- 
--         end;        
--     end loop;    
   return retorno;   
end;
/
show errors;
