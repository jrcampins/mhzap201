--
-- US7ASCII     = ASCII
-- UTF8         = UTF-8 
-- WE8ISO8859P1 = Western European 8-bit ISO 8859 Part 1
-- WE8ISO8859P9 = Western European 8-bit ISO 8859 Part 9
--
exec sp$archivo_datos_ext.create_csv_log_imp_deu('deu.csv', 'WE8ISO8859P1', '0', ',', '"');
exec sp$archivo_datos_ext.create_csv_log_imp_emp('emp.csv', 'WE8ISO8859P1', '0', ',', '"');
exec sp$archivo_datos_ext.create_csv_log_imp_fal('fal.csv', 'WE8ISO8859P1', '0', ',', '"');
exec sp$archivo_datos_ext.create_csv_log_imp_hog('hog.csv', 'WE8ISO8859P1', '0', ',', '"');
exec sp$archivo_datos_ext.create_csv_log_imp_ids('ids.csv', 'WE8ISO8859P1', '0', ',', '"');
exec sp$archivo_datos_ext.create_csv_log_imp_jub('jub.csv', 'WE8ISO8859P1', '0', ',', '"');
exec sp$archivo_datos_ext.create_csv_log_imp_pen('pen.csv', 'WE8ISO8859P1', '0', ',', '"');
exec sp$archivo_datos_ext.create_csv_log_imp_per('per.csv', 'WE8ISO8859P1', '0', ',', '"');
exec sp$archivo_datos_ext.create_csv_log_imp_pot('pot.csv', 'WE8ISO8859P1', '0', ',', '"');
exec sp$archivo_datos_ext.create_csv_log_imp_sub('sub.csv', 'WE8ISO8859P1', '0', ',', '"');
exec sp$archivo_datos_ext.create_csv_log_imp_ubi('ubi.csv', 'WE8ISO8859P1', '0', ',', '"');
