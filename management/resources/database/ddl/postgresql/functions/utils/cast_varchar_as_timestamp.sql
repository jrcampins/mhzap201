CREATE OR REPLACE FUNCTION cast_varchar_as_timestamp(v varchar) RETURNS timestamp AS $$
declare
	x varchar;
	y timestamp;
	l integer;
	d2 varchar;
	m2 varchar;
	a4 varchar;
	h2 varchar := '00';
	n2 varchar := '00';
	s2 varchar := '00';
	xm varchar := '';
	xs varchar := '';
	ts varchar;
begin
	y = null;
	if v is not null then
		x = trim(both from v);
		l = char_length(x);
		if l >= 10 then
			d2 = substring(x from 1 for 2);
			m2 = substring(x from 4 for 2);
			a4 = substring(x from 7 for 4);
			ts = a4 || '-' || m2 || '-' || d2;
			if l >= 16 then
				h2 = substring(x from 12 for 2);
				n2 = substring(x from 15 for 2);
				ts = ts || ' ' || h2 || ':' || n2;
				if l >= 19 then
					s2 = substring(x from 18 for 2);
					xs = upper(s2);
					if xs = 'AM' or xs = 'PM' then
						ts = ts || ' ' || xs;
					else
						ts = ts || ':' || s2;
					end if;
					if l >= 22 then
						xm = substring(x from 21 for 2);
						ts = ts || ' ' || xm;
					end if;
				end if;
			end if;
			y = cast(ts as timestamp);
		end if;
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
