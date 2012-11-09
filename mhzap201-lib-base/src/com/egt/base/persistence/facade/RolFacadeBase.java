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

import com.egt.base.persistence.entity.RolBase;
import com.egt.base.persistence.enums.EnumTipoQuery;
import java.util.List;

public interface RolFacadeBase {

    RolBase find(Object id);

    RolBase find(Object id, boolean refresh);

    RolBase findByCodigo(String codigo);

    RolBase findByCodigo(String codigo, boolean refresh);

    List<? extends RolBase> findAll();

    List<? extends RolBase> findAll(boolean refresh);

    List<? extends RolBase> findByQuery(String query);

    List<? extends RolBase> findByQuery(String query, boolean refresh);

    List<? extends RolBase> findByQuery(String query, EnumTipoQuery tipo);

    List<? extends RolBase> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    List<? extends RolBase> findByQuery(String query, EnumTipoQuery tipo, int max);

    List<? extends RolBase> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);
//
//  void flush();
//
//  void merge(RolBase rol);
//
//  void persist(RolBase rol);
//
//  void refresh(RolBase rol);
//
//  void remove(RolBase rol);
}
