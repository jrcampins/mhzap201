alter table log_imp_per add (id_ficha_persona number);
alter table log_imp_per_eec add (id_ficha_persona number);
alter table log_imp_ids add (id_persona number);
alter table log_imp_pot add (id_potencial_ben number);
alter table log_imp_per add CONSTRAINT fk_log_imp_per_001
    FOREIGN KEY (id_ficha_persona)
    REFERENCES ficha_persona(id_ficha_persona);
alter table log_imp_per_eec add CONSTRAINT fk_log_imp_per_eec_001
    FOREIGN KEY (id_ficha_persona)
    REFERENCES ficha_persona(id_ficha_persona);
alter table log_imp_ids add CONSTRAINT fk_log_imp_ids_001
    FOREIGN KEY (id_persona)
    REFERENCES persona(id_persona);
alter table log_imp_pot add CONSTRAINT fk_log_imp_pot_001
    FOREIGN KEY (id_potencial_ben)
    REFERENCES potencial_ben(id_potencial_ben);
    