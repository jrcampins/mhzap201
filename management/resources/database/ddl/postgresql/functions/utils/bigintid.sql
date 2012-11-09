CREATE OR REPLACE FUNCTION bigintid() RETURNS bigint AS $$
begin
    return 100000 * cast(1000 * extract(epoch from clock_timestamp()) as bigint) +  nextval('x5');
end;
$$ LANGUAGE 'plpgsql' VOLATILE;
