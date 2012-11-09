-- delimiter ??
create or replace function indexof(intarray int[], item int) returns int as $$
declare
    lb int := 0;
    ub int := 0;
    ix int := 0;
begin
    raise notice 'intarray=%, item=%', intarray, item;
    lb = array_lower(intarray, 1);
    ub = array_upper(intarray, 1);
    ix = lb;
    raise notice 'lb=%, ub=%', lb, ub;
    for ix in lb..ub by 1 loop
        if intarray[ix] = item then
            return ix;
        end if;
    end loop;
    return 0;
end;
$$ language 'plpgsql' volatile;
-- ??
