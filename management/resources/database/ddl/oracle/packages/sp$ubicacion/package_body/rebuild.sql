function rebuild return number is
    retcode number;
begin
    retcode := update_raices(true);
    retcode := xcopy_raices();
    return 0;
end;
