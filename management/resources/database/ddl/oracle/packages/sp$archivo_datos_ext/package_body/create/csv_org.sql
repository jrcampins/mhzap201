function csv_org(archivo varchar2, conjunto varchar2, ignorados varchar2, separador varchar2, delimitador varchar2) return varchar2 is
    org varchar2(4000);
    record_format_info varchar2(500);
    delim_spec varchar2(500);
begin
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
    if (delimitador is not null and length(trim(delimitador)) > 0 and trim(delimitador) <> '''') then
        delim_spec := delim_spec || 'OPTIONALLY ENCLOSED BY ''' || trim(delimitador) ||  ''' ';
    end if;
    org := 'ORGANIZATION EXTERNAL '
        || '( '
        || 'TYPE ORACLE_LOADER '
        || 'DEFAULT DIRECTORY MHZAP201_ATTACHMENTS '
        || 'ACCESS PARAMETERS '
        || '( '
        || record_format_info
        || delim_spec
        || 'LRTRIM '
        || 'MISSING FIELD VALUES ARE NULL '
        || 'REJECT ROWS WITH ALL NULL FIELDS '
        || ') '
        || 'LOCATION (  ''' || archivo ||  ''' ) '
        || ') ';
--  dbms_output.put_line('archivo='||archivo);
--  dbms_output.put_line('conjunto='||conjunto);
--  dbms_output.put_line('ignorados='||ignorados);
--  dbms_output.put_line('separador='||separador);
--  dbms_output.put_line('delimitador='||delimitador);
    dbms_output.put_line(org);
    return org;
end;
