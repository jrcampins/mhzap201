CREATE OR REPLACE FUNCTION cast_varchar_as_decimal(x varchar) RETURNS decimal AS $$
declare
	y decimal;
begin
	if x is null then
		y = null;
	else
		y = cast(x as decimal);
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
