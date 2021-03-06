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

import com.egt.base.persistence.entity.FiltroClaRecVinBase;
import com.egt.base.persistence.enums.EnumTipoQuery;
import java.util.List;

public interface FiltroClaRecVinFacadeBase {

    FiltroClaRecVinBase find(Object id);

    FiltroClaRecVinBase find(Object id, boolean refresh);

    List<? extends FiltroClaRecVinBase> findAll();

    List<? extends FiltroClaRecVinBase> findAll(boolean refresh);

    List<? extends FiltroClaRecVinBase> findByQuery(String query);

    List<? extends FiltroClaRecVinBase> findByQuery(String query, boolean refresh);

    List<? extends FiltroClaRecVinBase> findByQuery(String query, EnumTipoQuery tipo);

    List<? extends FiltroClaRecVinBase> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    List<? extends FiltroClaRecVinBase> findByQuery(String query, EnumTipoQuery tipo, int max);

    List<? extends FiltroClaRecVinBase> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);
//
//  void flush();
//
//  void merge(FiltroClaRecVinBase filtroClaRecVin);
//
//  void persist(FiltroClaRecVinBase filtroClaRecVin);
//
//  void refresh(FiltroClaRecVinBase filtroClaRecVin);
//
//  void remove(FiltroClaRecVinBase filtroClaRecVin);
}
