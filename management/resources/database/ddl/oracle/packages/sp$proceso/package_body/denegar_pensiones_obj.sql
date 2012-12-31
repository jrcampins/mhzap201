--
--Descripci�n: Este procedimiento otorga las pensiones aprobadas
--@param ubicacion_consultada: Identificacion de la ubicacion donde se aprobaran las pensiones
--@param numero_resolucion: numero de la resoluci�n en la que se otorga la pensi�n
--@param fecha_resolucion: fecha de la resoluci�n en la que se otorga la pensi�n
--@return: mensaje indicando el numero de pensiones otorgadas
--
function denegar_pensiones_obj(ubicacion_consultada number,numero_resolucion varchar2, fecha_resolucion timestamp) return varchar2 is

    mensaje varchar2(2000):='';
    mensaje_retorno varchar2(2000):='';
    segmento_consulta_ubicacion varchar2(2000):='';
    total number:=0;
    total_otorgados number:=0;
    total_rechazados number:=0;
    total_errores number:=0;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000); -- a character string of at most 2048 bytes
begin
    if numero_resolucion is null then
        msg_string:='N�mero de Resoluci�n no puede ser vac�o';
        raise_application_error(err_number, msg_string, true);
    end if;
    if fecha_resolucion is null then
        msg_string:='Fecha de Resoluci�n no puede ser vac�a';
        raise_application_error(err_number, msg_string, true);
    end if;
     return mensaje_retorno;                 
end;
