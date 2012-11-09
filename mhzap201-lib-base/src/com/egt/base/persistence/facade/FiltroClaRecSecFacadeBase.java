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

import com.egt.base.persistence.entity.FiltroClaRecSecBase;
import com.egt.base.persistence.enums.EnumTipoQuery;
import java.util.List;

public interface FiltroClaRecSecFacadeBase {

    FiltroClaRecSecBase find(Object id);

    FiltroClaRecSecBase find(Object id, boolean refresh);

    List<? extends FiltroClaRecSecBase> findAll();

    List<? extends FiltroClaRecSecBase> findAll(boolean refresh);

    List<? extends FiltroClaRecSecBase> findByQuery(String query);

    List<? extends FiltroClaRecSecBase> findByQuery(String query, boolean refresh);

    List<? extends FiltroClaRecSecBase> findByQuery(String query, EnumTipoQuery tipo);

    List<? extends FiltroClaRecSecBase> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    List<? extends FiltroClaRecSecBase> findByQuery(String query, EnumTipoQuery tipo, int max);

    List<? extends FiltroClaRecSecBase> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);
//
//  void flush();
//
//  void merge(FiltroClaRecSecBase filtroClaRecSec);
//
//  void persist(FiltroClaRecSecBase filtroClaRecSec);
//
//  void refresh(FiltroClaRecSecBase filtroClaRecSec);
//
//  void remove(FiltroClaRecSecBase filtroClaRecSec);
}
