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
import com.egt.base.persistence.facade.DominioPaqueteFacadeBase;
import com.egt.ejb.persistence.entity.DominioPaquete;
import java.util.List;
import javax.ejb.Local;

@Local
public interface DominioPaqueteFacadeLocal extends DominioPaqueteFacadeBase {

    @Override
    DominioPaquete find(Object id);

    @Override
    DominioPaquete find(Object id, boolean refresh);

    @Override
    List<DominioPaquete> findAll();

    @Override
    List<DominioPaquete> findAll(boolean refresh);

    @Override
    List<DominioPaquete> findByQuery(String query);

    @Override
    List<DominioPaquete> findByQuery(String query, boolean refresh);

    @Override
    List<DominioPaquete> findByQuery(String query, EnumTipoQuery tipo);

    @Override
    List<DominioPaquete> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    @Override
    List<DominioPaquete> findByQuery(String query, EnumTipoQuery tipo, int max);

    @Override
    List<DominioPaquete> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);

    void flush();

    void merge(DominioPaquete dominioPaquete);

    void persist(DominioPaquete dominioPaquete);

    void refresh(DominioPaquete dominioPaquete);

    void remove(DominioPaquete dominioPaquete);
}
