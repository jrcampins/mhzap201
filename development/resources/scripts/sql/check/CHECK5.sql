USE MHZMD201

select * from dominio
where numero_tipo_dominio=1
and id_dominio <> 100*id_clase_recurso+1
order by 1

select * from dominio
where numero_tipo_dominio=2
and id_dominio not between 100*id_clase_recurso+50 and  100*id_clase_recurso+55
order by 1
