SELECT distinct routine_name --, length(routine_name)
FROM information_schema.routines
WHERE routine_schema='public'
AND routine_name not like'grupo_proceso%'
AND routine_name not like'rastro_proceso%'
AND routine_name not like'setup%'
AND data_type='trigger'
--AND length(routine_name)>30
order by 1;
