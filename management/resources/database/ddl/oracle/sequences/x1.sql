exec xsp.dropone('sequence', 'x1');
create  sequence x1
        start with 1
        increment by 1
        minvalue 1
        maxvalue 10000000000
        cache 2
        cycle;
