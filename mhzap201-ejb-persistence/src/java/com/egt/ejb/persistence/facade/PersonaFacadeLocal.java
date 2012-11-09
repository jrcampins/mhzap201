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
import com.egt.base.persistence.facade.PersonaFacadeBase;
import com.egt.ejb.persistence.entity.Persona;
import java.util.List;
import javax.ejb.Local;

@Local
public interface PersonaFacadeLocal extends PersonaFacadeBase {

    @Override
    Persona find(Object id);

    @Override
    Persona find(Object id, boolean refresh);

    @Override
    Persona findByCodigo(String codigo);

    @Override
    Persona findByCodigo(String codigo, boolean refresh);

    @Override
    List<Persona> findAll();

    @Override
    List<Persona> findAll(boolean refresh);

    @Override
    List<Persona> findByQuery(String query);

    @Override
    List<Persona> findByQuery(String query, boolean refresh);

    @Override
    List<Persona> findByQuery(String query, EnumTipoQuery tipo);

    @Override
    List<Persona> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    @Override
    List<Persona> findByQuery(String query, EnumTipoQuery tipo, int max);

    @Override
    List<Persona> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);

    void flush();

    void merge(Persona persona);

    void persist(Persona persona);

    void refresh(Persona persona);

    void remove(Persona persona);
}
