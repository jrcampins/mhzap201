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

import com.egt.base.persistence.entity.NivelOpcionMenuBase;
import com.egt.base.persistence.enums.EnumTipoQuery;
import java.util.List;

public interface NivelOpcionMenuFacadeBase {

    NivelOpcionMenuBase find(Object id);

    NivelOpcionMenuBase find(Object id, boolean refresh);

    NivelOpcionMenuBase findByCodigo(String codigo);

    NivelOpcionMenuBase findByCodigo(String codigo, boolean refresh);

    List<? extends NivelOpcionMenuBase> findAll();

    List<? extends NivelOpcionMenuBase> findAll(boolean refresh);

    List<? extends NivelOpcionMenuBase> findByQuery(String query);

    List<? extends NivelOpcionMenuBase> findByQuery(String query, boolean refresh);

    List<? extends NivelOpcionMenuBase> findByQuery(String query, EnumTipoQuery tipo);

    List<? extends NivelOpcionMenuBase> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    List<? extends NivelOpcionMenuBase> findByQuery(String query, EnumTipoQuery tipo, int max);

    List<? extends NivelOpcionMenuBase> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);
//
//  void flush();
//
//  void merge(NivelOpcionMenuBase nivelOpcionMenu);
//
//  void persist(NivelOpcionMenuBase nivelOpcionMenu);
//
//  void refresh(NivelOpcionMenuBase nivelOpcionMenu);
//
//  void remove(NivelOpcionMenuBase nivelOpcionMenu);
}
