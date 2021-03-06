function bigintid return number;
function btrim_or_empty(string1 varchar2) return varchar2;
function cast_varchar_as_decimal(x varchar2) return number;
function cast_varchar_as_integer(x varchar2) return number;
function cast_varchar_as_timestamp(v varchar2) return timestamp;
function cast_varchar_wo_s_as_timestamp(v varchar2) return timestamp;
function concat_or_empty(string1 varchar2, string2 varchar2) return varchar2;
function concat_or_empty(string1 varchar2, string2 varchar2, string3 varchar2) return varchar2;
function dateadd(fecha timestamp, numero number, intervalo varchar2) return timestamp;
function dateadd(fecha timestamp, dias number, meses number, anys number) return timestamp;
function execute_procedure(routine varchar2, args varchar2) return varchar2;
function years_between(hasta timestamp, desde timestamp) return number;
function years_since(desde timestamp) return number;
function get_causa_denegacion(persona_consultada number) return varchar2;
function get_organismo_causa(persona_consultada number) return varchar2;
function extract_objeciones(persona_consultada number) return varchar2;
