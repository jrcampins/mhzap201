create or replace function rol_modificar_conjunto(rastro number, r number, c number, segmentada number) return number is
    mensaje varchar2(4000);
    retcode number;
begin
    mensaje := sp$rol.modificar_conjunto(r, c, segmentada);
    retcode := rastro_proceso_update(rastro, 21, null, mensaje);
    return 0;
end;
/
show errors
