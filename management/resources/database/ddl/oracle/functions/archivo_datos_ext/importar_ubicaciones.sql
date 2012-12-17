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

  /*TYPE DeptRecTyp IS RECORD (
    dept_id    NUMBER(4) NOT NULL := 10,
    dept_name  VARCHAR2(30) NOT NULL := 'Administration',
    mgr_id     NUMBER(6) := 200,
    loc_id     NUMBER(4) := 1700
  );
 
  dept_rec DeptRecTyp;
  */
  
   -- UTL
   
   v_dir varchar2(4000);
   
    v_dir1                  ALL_DIRECTORIES.DIRECTORY_NAME%type;

   v_filename varchar2(4000);
       
   v_file utl_file.file_type; 
  
  type t_ubicacion is record (id_reg number,
                                                codigo_ubicacion varchar2 (15),
                                                nombre_ubicacion varchar2 (100),
                                                tipo_ubicacion varchar2 (50),
                                                tipo_area varchar2 (30),
                                                id_ubicacion_superior varchar2 (15),
                                                importado number default 0,
                                                observacion varchar2(4000));
                                                
   v_codigo                       varchar2(15);
   v_ubicacion                  varchar2(100);
   v_tipo_ubicacion         varchar2(50);
   v_tipo_area                  varchar2(30);
   v_ubicacion_superior varchar2(15);
   v_line                            varchar2(4000);
   v_contador                   number := 0;

    dir_name varchar2(20):='MHZAP201_ATTACHMENTS';

    retorno number:=0;
    path_domain varchar2(4000):='';
    path_archivos_externos varchar2(4000):='';
    path_archivo_importar varchar2(4000):='';
    nombre_tabla varchar2(4000):='archivo_datos_ext';
    current_ubicacion t_ubicacion;
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
    
   v33 varchar2(4000);
   
   v_id_reg varchar2(50);
   
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
          raise_application_error(-20001, 'Error al recuperar PATH_DOMAIN '||sqlerrm);
          
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
          raise_application_error(-20001, 'Error al recuperar PATH_ARCHIVOS_EXTERNOS '||sqlerrm);
       
    end;
    
    --Se limpia el nombre del archivo
    
    v_nombre_archivo := rtrim(ltrim(nombre_archivo));
    
    --Copiamos la ruta con el nombre del archivo
    
    path_archivo_importar := path_domain||path_archivos_externos||v_nombre_archivo;
    
    --Se indica el nombre de la tabla temporal
    
    nombre_tabla := lower(nombre_tabla||'_'||codigo_archivo);
    
    /*
    --Se crea la tabla temporal 
    
    execute 'drop table if exists  '||nombre_tabla||';
             create table '||nombre_tabla||'(
                id_reg serial,
                codigo character varying (15),
                ubicacion character varying (100),
                tipo_ubicacion character varying (50),
                tipo_area character varying (30),
                codigo_ubicacion_superior character varying (15),
                importado integer default 0,
                observacion character varying,
                constraint pk_'||nombre_tabla||'  primary key (id_reg)
                );';
    
    set client_encoding to LATIN1;
    
    --Se copia el contenido del archivo en la tabla temporal
    execute'copy '
           ||nombre_tabla||
           '(codigo,ubicacion,tipo_ubicacion,tipo_area,codigo_ubicacion_superior) from E'''
           || path_archivo_importar||
           ''' with delimiter as '';'' csv header;';
    set client_encoding to UTF8;
    */
    
   begin
    
      execute immediate 'drop table '||nombre_tabla;
   exception
      when others then
         if (sqlcode = -942) then
         
            null;
            
         else
         
            raise_application_error(-20001, 'Error al eliminar tabla '||sqlerrm);
               
         end if;
         
   end;
    
   execute immediate 'create table '||nombre_tabla||'(
                id_reg number,
                codigo varchar2 (100),
                ubicacion varchar2 (2000),
                tipo_ubicacion varchar2 (100),
                tipo_area varchar2 (100),
                codigo_ubicacion_superior varchar2 (100),
                importado number default 0,
                observacion varchar2(4000),
                constraint pk_'||nombre_tabla||'  primary key (id_reg))'; 
                
   -- Se carga la tabla a partir del archivo (Inicio)
  
   begin
 
 
       v_dir := substr(path_archivo_importar, 1, (instr(path_archivo_importar, '/', -1) - 1));

       v_filename := substr(path_archivo_importar, (instr(path_archivo_importar, '/', - 1) + 1), (length(path_archivo_importar) - instr(path_archivo_importar, '/', - 1)));
       
       begin
       
          select directory_name
          into    v_dir1
          from  all_directories
          where directory_name = dir_name;
       exception
          when others then
             raise_application_error(-20001, 'Error al seleccionar directorio '||v_dir||' '||sqlerrm);
             
       end; 
       
       v_file := utl_file.fopen(v_dir1, v_filename, 'r');

       loop
       
          v_contador := nvl(v_contador,0) + 1;          
          
          begin
 
             utl_file.get_line(v_file, v_line);
 
          exception 
             when no_data_found then 
                exit;
                 
          end;
 
         if nvl(v_contador,0) > 1 then

         v_line:=CONVERT(v_line, 'UTF8', 'WE8ISO8859P1');
         
          --dbms_output.put_line('Linea '||v_line);
          
          v_line := replace(v_line, chr(39), '');
          
          v_codigo := substr(v_line, 1, (instr(v_line, ';') - 1));
          
          v_line   := substr(v_line, (length(v_codigo) + 2), (length(v_line) - (length(v_codigo) + 1)));
          
          v_ubicacion := substr(v_line, 1, (instr(v_line, ';') - 1));

          v_line   := substr(v_line, (length(v_ubicacion) + 2), (length(v_line) - (length(v_ubicacion) + 1)));
          
          v_tipo_ubicacion := substr(v_line, 1, (instr(v_line, ';') - 1));
          
          v_line   := substr(v_line, (length(v_tipo_ubicacion) + 2), (length(v_line) - (length(v_tipo_ubicacion) + 1)));
          
          v_tipo_area := substr(v_line, 1, (instr(v_line, ';') - 1));
          
          v_line   := substr(v_line, (length(v_tipo_area) + 2), (length(v_line) - (length(v_tipo_area) + 1)));
          
          v_ubicacion_superior := substr(v_line, 1, length(v_line));
          
          
          
          if nvl(ltrim(rtrim(v_codigo)), 'XX') <> 'XX' then
          /*
             begin
          
                insert into nombre_tabla(id_reg,
                                                           codigo,
                                                           ubicacion,
                                                           tipo_ubicacion,
                                                           tipo_area,
                                                           codigo_ubicacion_superior
                                 values(rownum,
                                        v_codigo,
                                        v_ubicacion,
                                        v_tipo_ubicacion,
                                        v_tipo_area,
                                        v_codigo_ubicacion_superior);
             exception
                when others then
                   raise_application_error(-20001, 'Error al insertar datos en LOG_IMP_PEN '||sqlerrm);
                
             end;
            */  
                     
            begin
            
            v_id_reg := to_char(nvl(v_contador,0) - 1);
            
            v33 := 'insert into '||nombre_tabla||' (id_reg,
                                                 codigo,
                                                 ubicacion,
                                                 tipo_ubicacion,
                                                 tipo_area,
                                                 codigo_ubicacion_superior)
                                 values('||v_id_reg||', '||
                                        chr(39)||v_codigo||chr(39)||', '||
                                        chr(39)||v_ubicacion||chr(39)||', '||
                                        chr(39)||v_tipo_ubicacion||chr(39)||', '||
                                        chr(39)||v_tipo_area||chr(39)||', '||
                                        chr(39)||v_ubicacion_superior||chr(39)||')';
               execute immediate 'insert into '||nombre_tabla||' (id_reg,
                                                 codigo,
                                                 ubicacion,
                                                 tipo_ubicacion,
                                                 tipo_area,
                                                 codigo_ubicacion_superior)
                                 values('||v_id_reg||', '||
                                        chr(39)||v_codigo||chr(39)||', '||
                                        chr(39)||v_ubicacion||chr(39)||', '||
                                        chr(39)||v_tipo_ubicacion||chr(39)||', '||
                                        chr(39)||v_tipo_area||chr(39)||', '||
                                        chr(39)||v_ubicacion_superior||chr(39)||')';
                                        
            exception
               when others then
                  raise_application_error(-20005, 'Error en Insert '||v33||' - '||sqlerrm);
                  
            end;                                  
             
          end if;
          
         end if;   

       end loop;
       
       utl_file.fclose(v_file);
       
    exception
       when others then
          raise_application_error(-20002, 'Error '||v_line||' -- '||v_tipo_area||' - '||sqlerrm);   
       
    end;
    
 -- Se carga la tabla a partir del archivo (Fin)
     
    --importamos departamentos
    
    
    --for current_ubicacion in execute 'select * from '||nombre_tabla||' where btrim(tipo_ubicacion)=''DEPARTAMENTO''' loop 
   
-- ***** desde aca comentado
--for current_ubicacion in execute 'select * from '||nombre_tabla||' where btrim(tipo_ubicacion)=''DEPARTAMENTO''' loop 
   
   l_cur_string := 'select * from '||nombre_tabla||' where ltrim(rtrim(tipo_ubicacion)) = '||'''DEPARTAMENTO''';   
   
   open a for l_cur_string;
   
   loop
   
      fetch a into current_ubicacion;
      
      exit when a%notfound;
              
       begin
       
            --Reiniciar los valores de la nueva ubicacion para cada registro a importar
            
            new_ubicacion.id_ubicacion := utils.bigintid;
            
            new_ubicacion.version_ubicacion := 0;
            
            new_ubicacion.id_ubicacion_superior := null;
            
            --Obtener valores
            
            new_ubicacion.codigo_ubicacion := current_ubicacion.codigo_ubicacion;
            
            new_ubicacion.nombre_ubicacion := current_ubicacion.nombre_ubicacion;
            
            --Se inserta el registro importado en la tabla persona
            
            insert into ubicacion values new_ubicacion;
            
            --Se registra la inserción en la tabla intermedia
            
            execute immediate 'update '||nombre_tabla||' set importado=1 where id_reg='||current_ubicacion.id_reg;
            
            --Se incrementa el numero de insertados
            
            retorno:=retorno+1;
            
            --Si no se pudo insertar el registro se marca el motivo
            
       exception when others then
                mensaje:='Error '||SQLERRM;
                execute immediate 'update '||nombre_tabla||' set observacion='''||mensaje||''' where id_reg = '||current_ubicacion.id_reg;
                

        end;
        
    end loop;
    
    close a;
  
    --Distritos
    
    --for current_ubicacion in execute 'select * from '||nombre_tabla||' where btrim(tipo_ubicacion)=''DISTRITO''' loop
    
   l_cur_string := 'select * from '||nombre_tabla||' where ltrim(rtrim(tipo_ubicacion)) = '||'''DISTRITO''';   
   
   open b for l_cur_string;
   
   loop
   
      fetch b into current_ubicacion;
      
      exit when b%notfound;    
    
        begin
        
            --Reiniciar los valores de la nueva ubicacion para cada registro a importar
            
            new_ubicacion.id_ubicacion := utils.bigintid;
            
            new_ubicacion.version_ubicacion := 0;
            
            new_ubicacion.id_ubicacion_superior := null;
            
            --Obtener valores
            
            new_ubicacion.codigo_ubicacion := current_ubicacion.codigo_ubicacion;
            
            new_ubicacion.nombre_ubicacion := current_ubicacion.nombre_ubicacion;
            
            --Obtener ubicacion superior
            
            codigo_ubicacion_superior := current_ubicacion.id_ubicacion_superior;
            
            if(codigo_ubicacion_superior is null) then
            
                raise_application_error(-20001, 'Distrito '||current_ubicacion.codigo_ubicacion||':'||current_ubicacion.nombre_ubicacion||' sin departamento');
                
            else
            
                begin
                
                   select id_ubicacion 
                   into id_ubicacion_superior
                   from ubicacion 
                   where codigo_ubicacion = codigo_ubicacion_superior;
                   new_ubicacion.id_ubicacion_superior:=id_ubicacion_superior;
                   --dbms_output.put_line('superior '||id_ubicacion_superior||' codigo '||codigo_ubicacion_superior||' nombre '||new_ubicacion.id_ubicacion_superior);
                exception   
                   when no_data_found then
                      raise_application_error(-20001, 'Ubicacion superior desconocida para '||current_ubicacion.codigo_ubicacion||':'||current_ubicacion.nombre_ubicacion);                 
                   when others then
                      raise_application_error(-20001, 'Error al recuperar ID_UBICACION '||sqlerrm);
                      
                   end;   
                      
            end if;
            
            --Se inserta el registro importado en la tabla persona
            
            insert into ubicacion values new_ubicacion;
            
            --Se registra la inserción en la tabla intermedia
            
            execute immediate 'update '||nombre_tabla||' set importado=1 where id_reg='||current_ubicacion.id_reg;
            
            --Se incrementa el numero de insertados
            
            retorno:=retorno+1;
            
            --Si no se pudo insertar el registro se marca el motivo
            
            exception when others then
               mensaje:='Error '||SQLERRM;
               
               execute immediate 'update '||nombre_tabla||' set observacion='''||mensaje||''' where id_reg = '||current_ubicacion.id_reg;

        end;
        
    end loop;
    
    close b;
    
    --Barrios
    
    --for current_ubicacion in execute 'select * from '||nombre_tabla||' where btrim(tipo_ubicacion)=''BARRIO''' loop
    
   l_cur_string := 'select * from '||nombre_tabla||' where ltrim(rtrim(tipo_ubicacion)) = '||'''BARRIO''';   
   
   open c for l_cur_string;
   
   loop
   
      fetch c into current_ubicacion;
      
      exit when c%notfound;
    
        begin
        
            --Reiniciar los valores de la nueva ubicacion para cada registro a importar
            
            new_ubicacion.id_ubicacion:=utils.bigintid;
            
            new_ubicacion.version_ubicacion:=0;
            
            new_ubicacion.id_ubicacion_superior:=null;
            
            --Obtener valores
            
            new_ubicacion.codigo_ubicacion := current_ubicacion.codigo_ubicacion;
            
            new_ubicacion.nombre_ubicacion := current_ubicacion.nombre_ubicacion;            
                       
            begin
            
               select to_number(decode(current_ubicacion.tipo_area, 'URBANA','1','RURAL','6','6'))
               into new_ubicacion.numero_tipo_area
               from  dual;
            exception
               when others then
                  raise_application_error(-20001, 'Error de conversión en TIPO_AREA '||sqlerrm);   
            
            end;
            --new_ubicacion.numero_tipo_area := extract_tipo_area_ubicacion(current_ubicacion.tipo_area);
            
            --Obtener ubicacion superior
            
            codigo_ubicacion_superior:=current_ubicacion.id_ubicacion_superior;
            
            if(codigo_ubicacion_superior is null) then
            
                raise_application_error(-20001, 'Barrio '||current_ubicacion.codigo_ubicacion||':'||current_ubicacion.nombre_ubicacion||' sin distrito');
                
            else
            
               begin
                
                   select id_ubicacion 
                   into id_ubicacion_superior
                   from ubicacion 
                   where codigo_ubicacion=codigo_ubicacion_superior;
                   new_ubicacion.id_ubicacion_superior:=id_ubicacion_superior;
               exception   
                  when no_data_found then
                     raise_application_error(-20001, 'Ubicacion superior desconocida para '||current_ubicacion.codigo_ubicacion||':'||current_ubicacion.nombre_ubicacion);
                     
                  when others then
                     raise_application_error(-20001, 'Error al recuperar ID_UBICACION_SUPERIOR. ID '||to_char(codigo_ubicacion_superior)||'-'||sqlerrm);
                    
               end;
                       
            end if;
            
            --Se inserta el registro importado en la tabla persona
            
            insert into ubicacion values new_ubicacion;
            
            --Se registra la inserción en la tabla intermedia
            
            execute immediate 'update '||nombre_tabla||' set importado=1 where id_reg='||current_ubicacion.id_reg;
            
            --Se incrementa el numero de insertados
            
            retorno:=retorno+1;
            
            --Si no se pudo insertar el registro se marca el motivo
            
        exception 
        
           when others then
              mensaje:='Error '||SQLERRM;
              execute immediate 'update '||nombre_tabla||' set observacion='''||mensaje||''' where id_reg = '||current_ubicacion.id_reg;

        end;
        
    end loop;
    
    return retorno;
    
end;
/
show errors;