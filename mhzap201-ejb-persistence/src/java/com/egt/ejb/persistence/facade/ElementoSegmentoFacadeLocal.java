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
import com.egt.base.persistence.facade.ElementoSegmentoFacadeBase;
import com.egt.ejb.persistence.entity.ElementoSegmento;
import java.util.List;
import javax.ejb.Local;

@Local
public interface ElementoSegmentoFacadeLocal extends ElementoSegmentoFacadeBase {

    @Override
    ElementoSegmento find(Object id);

    @Override
    ElementoSegmento find(Object id, boolean refresh);

    @Override
    List<ElementoSegmento> findAll();

    @Override
    List<ElementoSegmento> findAll(boolean refresh);

    @Override
    List<ElementoSegmento> findByQuery(String query);

    @Override
    List<ElementoSegmento> findByQuery(String query, boolean refresh);

    @Override
    List<ElementoSegmento> findByQuery(String query, EnumTipoQuery tipo);

    @Override
    List<ElementoSegmento> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    @Override
    List<ElementoSegmento> findByQuery(String query, EnumTipoQuery tipo, int max);

    @Override
    List<ElementoSegmento> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);

    void flush();

    void merge(ElementoSegmento elementoSegmento);

    void persist(ElementoSegmento elementoSegmento);

    void refresh(ElementoSegmento elementoSegmento);

    void remove(ElementoSegmento elementoSegmento);
}
