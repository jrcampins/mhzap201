CREATE OR REPLACE FUNCTION xcopy1 (tablename varchar, filename varchar) RETURNS integer AS $$
declare
	comando varchar := 'copy {0} from ''{1}''';
begin
--	SET CLIENT_ENCODING TO LATIN1;
	comando = replace(comando, '{0}', tablename);
	comando = replace(comando, '{1}', filename);
	raise notice 'execute "%"', comando;
	execute comando;
	return 0;
end;
$$ LANGUAGE 'plpgsql' VOLATILE;
