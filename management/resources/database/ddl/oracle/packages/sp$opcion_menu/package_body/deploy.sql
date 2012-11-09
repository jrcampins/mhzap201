function deploy return number is
    retcode number;
begin
    retcode := rebuild();
    update opcion_menu set es_opcion_menu_inactiva=1 where codigo_opcion_menu like'N9%';
    return 0;
end;
