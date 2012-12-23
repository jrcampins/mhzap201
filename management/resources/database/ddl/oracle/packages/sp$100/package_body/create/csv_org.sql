function csv_org(archivo varchar2, conjunto varchar2, ignorados varchar2, separador varchar2, demarcador varchar2, comando varchar2) return varchar2 is
    campos varchar2(4000);
    org varchar2(4000);
    record_format_info varchar2(4000);
    delim_spec varchar2(4000);
begin
    campos := substr(comando, instr(comando, '('));
    campos := replace(campos, 'varchar2', 'CHAR');
    record_format_info := 'RECORDS DELIMITED BY NEWLINE ';
    if (conjunto is not null and length(trim(conjunto)) > 0) then
        record_format_info := record_format_info || 'CHARACTERSET ''' || trim(conjunto) || ''' ';
    end if;
    if (ignorados is not null and length(trim(ignorados)) > 0) then
        record_format_info := record_format_info || 'SKIP ' || trim(ignorados) || ' ';
    end if;
    if (separador is not null and length(trim(separador)) > 0) then
        delim_spec := 'FIELDS TERMINATED BY ''' || trim(separador) ||  ''' ';
    else
        delim_spec := 'FIELDS TERMINATED BY '','' ';
    end if;
    if (demarcador is not null and length(trim(demarcador)) > 0 and trim(demarcador) <> '''') then
        delim_spec := delim_spec || 'OPTIONALLY ENCLOSED BY ''' || trim(demarcador) ||  ''' ';
    end if;
    org := 'ORGANIZATION EXTERNAL '
        || '( '
        || 'TYPE ORACLE_LOADER '
        || 'DEFAULT DIRECTORY MHZAP201_DATOS '
        || 'ACCESS PARAMETERS '
        || '( '
        || record_format_info
        || delim_spec
        || 'LRTRIM '
        || 'MISSING FIELD VALUES ARE NULL '
        || 'REJECT ROWS WITH ALL NULL FIELDS '
        || campos
        || ') '
        || 'LOCATION (  ''' || replace(archivo, 'archivo_datos_ext/', '') ||  ''' ) '
        || ') ';
    return org;
end;
