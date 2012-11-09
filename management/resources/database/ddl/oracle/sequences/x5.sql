exec xsp.dropone('sequence', 'x5');
create  sequence x5
	start with 5
	increment by 10
	minvalue 5
	maxvalue 99995
	cache 2
	cycle;
