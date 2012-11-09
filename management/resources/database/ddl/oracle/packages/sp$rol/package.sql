function copiar(id_rol_viejo number, codigo varchar2, nombre varchar2) return number;
function modificar_conjunto(r number, c number, segmentada number) return varchar2;
function propagar_favoritos(r number) return number;
function propagar_favoritos(r number, u number, x number) return number;
function propagar_filtros(r number) return number;
function propagar_filtros(r number, u number, x number) return number;
