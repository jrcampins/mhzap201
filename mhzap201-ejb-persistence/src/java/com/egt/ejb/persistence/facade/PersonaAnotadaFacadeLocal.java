/*
 * Copyright (C) 2009, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 *
 */
package com.egt.ejb.persistence.facade;

import com.egt.base.persistence.enums.EnumTipoQuery;
import com.egt.base.persistence.facade.PersonaAnotadaFacadeBase;
import com.egt.ejb.persistence.entity.PersonaAnotada;
import java.util.List;
import javax.ejb.Local;

@Local
public interface PersonaAnotadaFacadeLocal extends PersonaAnotadaFacadeBase {

    @Override
    PersonaAnotada find(Object id);

    @Override
    PersonaAnotada find(Object id, boolean refresh);

    @Override
    List<PersonaAnotada> findAll();

    @Override
    List<PersonaAnotada> findAll(boolean refresh);

    @Override
    List<PersonaAnotada> findByQuery(String query);

    @Override
    List<PersonaAnotada> findByQuery(String query, boolean refresh);

    @Override
    List<PersonaAnotada> findByQuery(String query, EnumTipoQuery tipo);

    @Override
    List<PersonaAnotada> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    @Override
    List<PersonaAnotada> findByQuery(String query, EnumTipoQuery tipo, int max);

    @Override
    List<PersonaAnotada> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);

    void flush();

    void merge(PersonaAnotada personaAnotada);

    void persist(PersonaAnotada personaAnotada);

    void refresh(PersonaAnotada personaAnotada);

    void remove(PersonaAnotada personaAnotada);
}
