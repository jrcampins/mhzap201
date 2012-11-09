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
package com.egt.base.persistence.facade;

import com.egt.base.persistence.entity.TipoNodoBase;
import com.egt.base.persistence.enums.EnumTipoQuery;
import java.util.List;

public interface TipoNodoFacadeBase {

    TipoNodoBase find(Object id);

    TipoNodoBase find(Object id, boolean refresh);

    TipoNodoBase findByCodigo(String codigo);

    TipoNodoBase findByCodigo(String codigo, boolean refresh);

    List<? extends TipoNodoBase> findAll();

    List<? extends TipoNodoBase> findAll(boolean refresh);

    List<? extends TipoNodoBase> findByQuery(String query);

    List<? extends TipoNodoBase> findByQuery(String query, boolean refresh);

    List<? extends TipoNodoBase> findByQuery(String query, EnumTipoQuery tipo);

    List<? extends TipoNodoBase> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    List<? extends TipoNodoBase> findByQuery(String query, EnumTipoQuery tipo, int max);

    List<? extends TipoNodoBase> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);
//
//  void flush();
//
//  void merge(TipoNodoBase tipoNodo);
//
//  void persist(TipoNodoBase tipoNodo);
//
//  void refresh(TipoNodoBase tipoNodo);
//
//  void remove(TipoNodoBase tipoNodo);
}
