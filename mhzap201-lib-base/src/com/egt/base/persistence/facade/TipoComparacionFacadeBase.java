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

import com.egt.base.persistence.entity.TipoComparacionBase;
import com.egt.base.persistence.enums.EnumTipoQuery;
import java.util.List;

public interface TipoComparacionFacadeBase {

    TipoComparacionBase find(Object id);

    TipoComparacionBase find(Object id, boolean refresh);

    TipoComparacionBase findByCodigo(String codigo);

    TipoComparacionBase findByCodigo(String codigo, boolean refresh);

    List<? extends TipoComparacionBase> findAll();

    List<? extends TipoComparacionBase> findAll(boolean refresh);

    List<? extends TipoComparacionBase> findByQuery(String query);

    List<? extends TipoComparacionBase> findByQuery(String query, boolean refresh);

    List<? extends TipoComparacionBase> findByQuery(String query, EnumTipoQuery tipo);

    List<? extends TipoComparacionBase> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    List<? extends TipoComparacionBase> findByQuery(String query, EnumTipoQuery tipo, int max);

    List<? extends TipoComparacionBase> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);
//
//  void flush();
//
//  void merge(TipoComparacionBase tipoComparacion);
//
//  void persist(TipoComparacionBase tipoComparacion);
//
//  void refresh(TipoComparacionBase tipoComparacion);
//
//  void remove(TipoComparacionBase tipoComparacion);
}
