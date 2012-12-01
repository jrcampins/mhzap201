select object_type, status, count(*)
from user_objects
group by object_type, status
order by object_type, status;

exec xsp.dropall();

select object_type, status, count(*)
from user_objects
group by object_type, status
order by object_type, status;

select object_type, timestamp, status, object_name
from user_objects
order by object_type, object_name;
