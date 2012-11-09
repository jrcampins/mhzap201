/*
 * Copyright (C) 2008, EGT Consultores, C.A.
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
import com.egt.base.persistence.facade.ConjuntoSegmentoFacadeBase;
import com.egt.ejb.persistence.entity.ConjuntoSegmento;
import java.util.List;
import javax.ejb.Local;

@Local
public interface ConjuntoSegmentoFacadeLocal extends ConjuntoSegmentoFacadeBase {

    @Override
    ConjuntoSegmento find(Object id);

    @Override
    ConjuntoSegmento find(Object id, boolean refresh);

    @Override
    ConjuntoSegmento findByCodigo(String codigo);

    @Override
    ConjuntoSegmento findByCodigo(String codigo, boolean refresh);

    @Override
    List<ConjuntoSegmento> findAll();

    @Override
    List<ConjuntoSegmento> findAll(boolean refresh);

    @Override
    List<ConjuntoSegmento> findByQuery(String query);

    @Override
    List<ConjuntoSegmento> findByQuery(String query, boolean refresh);

    @Override
    List<ConjuntoSegmento> findByQuery(String query, EnumTipoQuery tipo);

    @Override
    List<ConjuntoSegmento> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    @Override
    List<ConjuntoSegmento> findByQuery(String query, EnumTipoQuery tipo, int max);

    @Override
    List<ConjuntoSegmento> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);

    void flush();

    void merge(ConjuntoSegmento conjuntoSegmento);

    void persist(ConjuntoSegmento conjuntoSegmento);

    void refresh(ConjuntoSegmento conjuntoSegmento);

    void remove(ConjuntoSegmento conjuntoSegmento);
}
