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

import com.egt.base.persistence.entity.OpcionMenuBase;
import com.egt.base.persistence.enums.EnumTipoQuery;
import java.util.List;

public interface OpcionMenuFacadeBase {

    OpcionMenuBase find(Object id);

    OpcionMenuBase find(Object id, boolean refresh);

    OpcionMenuBase findByCodigo(String codigo);

    OpcionMenuBase findByCodigo(String codigo, boolean refresh);

    List<? extends OpcionMenuBase> findAll();

    List<? extends OpcionMenuBase> findAll(boolean refresh);

    List<? extends OpcionMenuBase> findByQuery(String query);

    List<? extends OpcionMenuBase> findByQuery(String query, boolean refresh);

    List<? extends OpcionMenuBase> findByQuery(String query, EnumTipoQuery tipo);

    List<? extends OpcionMenuBase> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    List<? extends OpcionMenuBase> findByQuery(String query, EnumTipoQuery tipo, int max);

    List<? extends OpcionMenuBase> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);
//
//  void flush();
//
//  void merge(OpcionMenuBase opcionMenu);
//
//  void persist(OpcionMenuBase opcionMenu);
//
//  void refresh(OpcionMenuBase opcionMenu);
//
//  void remove(OpcionMenuBase opcionMenu);
}
