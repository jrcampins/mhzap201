--
--Descripción: Este procedimiento aprueba la exclusión de pensiones
--@param sime: Número de mesa de entrada
--@return: mensaje indicando el número de registros actualizados
--
function aprobar_exclusion_pen(sime varchar2) return varchar2 is
    num_lote number;
    cod_sime varchar2(200);
    condicion_elegibilidad number;
    causa_revocacion number;
    otra_causa_revocacion varchar2(2000);
    mensaje varchar2(4000);
    type pen_oto is record(
          id_persona number,
          codigo_persona varchar2 (50),
          nombre_persona varchar2(200),
          id_departamento number,
          id_distrito number,
          id_barrio number,
          numero_condicion_pension number);
    type vista_cons is table of pen_oto;
    vista_pen_oto vista_cons;
    total_lote number:=0;
    total_procesadas number:=0;
    row_persona persona%rowtype;
    total_revocadas number:=0;
    mensaje_retorno  varchar2(4000);
    numero_lote number;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000); -- a character string of at most 2048 bytes
begin
    cod_sime:=sime;
    if cod_sime is null then
        msg_string := 'SIME no puede ser vacío';
        raise_application_error(err_number, msg_string, true);
    end if;
    execute immediate 'select id_persona, 
                                  codigo_persona, 
                                  nombre_persona,
                                  id_departamento,
                                  id_distrito, 
                                  id_barrio , 
                                  numero_condicion_pension
                           from persona 
                           where codigo_sime='''||sime||'''
                           and numero_condicion_pension=7'
        bulk collect into vista_pen_oto;
        if vista_pen_oto.count=0 then
            mensaje_retorno:='No hay Personas pendientes por excluir bajo el SIME '||cod_sime;
        else
            for i in vista_pen_oto.first..vista_pen_oto.last loop
                begin
                total_procesadas:=total_procesadas+1;
                condicion_elegibilidad:=sp$persona.act_persona_elegible(vista_pen_oto(i).id_persona);
                if condicion_elegibilidad=0 then
                    continue;
                --Si persona no es elegible por un solo motivo
                elsif condicion_elegibilidad <>99 then
                    causa_revocacion:=condicion_elegibilidad;
                --Si persona no es elegible por varios motivos
                else
                    causa_revocacion:=99;
                    otra_causa_revocacion:='Denuncia confirmada por varias objeciones';
                end if;
                mensaje:=sp$persona.revocar_pension(vista_pen_oto(i).id_persona,causa_revocacion,otra_causa_revocacion,'Exclusión aprobada automáticamente');
                if mensaje like 'Pensión Revocada%' then
                    total_revocadas:=total_revocadas+1;
                end if;
            exception when others then
                msg_string := 'Error procesando la persona ('||vista_pen_oto(i).codigo_persona||', '||vista_pen_oto(i).nombre_persona||') '||causa_revocacion||': '||SQLERRM;
                raise_application_error(err_number, msg_string, true);
            end;
            end loop;
            mensaje_retorno:=total_procesadas||' Personas procesadas. '||total_revocadas||' Pensiones revocadas';
       end if;
       return mensaje_retorno;
end;