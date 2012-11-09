CREATE OR REPLACE FUNCTION cast_varchar_as_integer(x varchar) RETURNS integer AS $$
declare
	y integer;
begin
	if x is null then
		y = null;
	else
		y = cast(cast(x as decimal) as integer);
	end if;
	/**/
	return y;
	/**/
exception
	when invalid_character_value_for_cast then
		return null;
	when others then
		return null;
end;
$$ LANGUAGE 'plpgsql' VOLATILE;
