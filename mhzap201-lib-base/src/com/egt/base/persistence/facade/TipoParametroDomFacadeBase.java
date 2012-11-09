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

import com.egt.base.persistence.entity.TipoParametroDomBase;
import com.egt.base.persistence.enums.EnumTipoQuery;
import java.util.List;

public interface TipoParametroDomFacadeBase {

    TipoParametroDomBase find(Object id);

    TipoParametroDomBase find(Object id, boolean refresh);

    TipoParametroDomBase findByCodigo(String codigo);

    TipoParametroDomBase findByCodigo(String codigo, boolean refresh);

    List<? extends TipoParametroDomBase> findAll();

    List<? extends TipoParametroDomBase> findAll(boolean refresh);

    List<? extends TipoParametroDomBase> findByQuery(String query);

    List<? extends TipoParametroDomBase> findByQuery(String query, boolean refresh);

    List<? extends TipoParametroDomBase> findByQuery(String query, EnumTipoQuery tipo);

    List<? extends TipoParametroDomBase> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    List<? extends TipoParametroDomBase> findByQuery(String query, EnumTipoQuery tipo, int max);

    List<? extends TipoParametroDomBase> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);
//
//  void flush();
//
//  void merge(TipoParametroDomBase tipoParametroDom);
//
//  void persist(TipoParametroDomBase tipoParametroDom);
//
//  void refresh(TipoParametroDomBase tipoParametroDom);
//
//  void remove(TipoParametroDomBase tipoParametroDom);
}
