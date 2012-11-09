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
import com.egt.base.persistence.facade.TipoNodoFacadeBase;
import com.egt.ejb.persistence.entity.TipoNodo;
import java.util.List;
import javax.ejb.Local;

@Local
public interface TipoNodoFacadeLocal extends TipoNodoFacadeBase {

    @Override
    TipoNodo find(Object id);

    @Override
    TipoNodo find(Object id, boolean refresh);

    @Override
    TipoNodo findByCodigo(String codigo);

    @Override
    TipoNodo findByCodigo(String codigo, boolean refresh);

    @Override
    List<TipoNodo> findAll();

    @Override
    List<TipoNodo> findAll(boolean refresh);

    @Override
    List<TipoNodo> findByQuery(String query);

    @Override
    List<TipoNodo> findByQuery(String query, boolean refresh);

    @Override
    List<TipoNodo> findByQuery(String query, EnumTipoQuery tipo);

    @Override
    List<TipoNodo> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    @Override
    List<TipoNodo> findByQuery(String query, EnumTipoQuery tipo, int max);

    @Override
    List<TipoNodo> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);

    void flush();

    void merge(TipoNodo tipoNodo);

    void persist(TipoNodo tipoNodo);

    void refresh(TipoNodo tipoNodo);

    void remove(TipoNodo tipoNodo);
}
