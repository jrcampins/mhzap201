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
import com.egt.base.persistence.facade.SexoPersonaFacadeBase;
import com.egt.ejb.persistence.entity.SexoPersona;
import java.util.List;
import javax.ejb.Local;

@Local
public interface SexoPersonaFacadeLocal extends SexoPersonaFacadeBase {

    @Override
    SexoPersona find(Object id);

    @Override
    SexoPersona find(Object id, boolean refresh);

    @Override
    SexoPersona findByCodigo(String codigo);

    @Override
    SexoPersona findByCodigo(String codigo, boolean refresh);

    @Override
    List<SexoPersona> findAll();

    @Override
    List<SexoPersona> findAll(boolean refresh);

    @Override
    List<SexoPersona> findByQuery(String query);

    @Override
    List<SexoPersona> findByQuery(String query, boolean refresh);

    @Override
    List<SexoPersona> findByQuery(String query, EnumTipoQuery tipo);

    @Override
    List<SexoPersona> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    @Override
    List<SexoPersona> findByQuery(String query, EnumTipoQuery tipo, int max);

    @Override
    List<SexoPersona> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);

    void flush();

    void merge(SexoPersona sexoPersona);

    void persist(SexoPersona sexoPersona);

    void refresh(SexoPersona sexoPersona);

    void remove(SexoPersona sexoPersona);
}
