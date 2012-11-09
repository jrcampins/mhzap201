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

import com.egt.base.persistence.entity.RolUsuarioBase;
import com.egt.base.persistence.enums.EnumTipoQuery;
import java.util.List;

public interface RolUsuarioFacadeBase {

    RolUsuarioBase find(Object id);

    RolUsuarioBase find(Object id, boolean refresh);

    List<? extends RolUsuarioBase> findAll();

    List<? extends RolUsuarioBase> findAll(boolean refresh);

    List<? extends RolUsuarioBase> findByQuery(String query);

    List<? extends RolUsuarioBase> findByQuery(String query, boolean refresh);

    List<? extends RolUsuarioBase> findByQuery(String query, EnumTipoQuery tipo);

    List<? extends RolUsuarioBase> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    List<? extends RolUsuarioBase> findByQuery(String query, EnumTipoQuery tipo, int max);

    List<? extends RolUsuarioBase> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);
//
//  void flush();
//
//  void merge(RolUsuarioBase rolUsuario);
//
//  void persist(RolUsuarioBase rolUsuario);
//
//  void refresh(RolUsuarioBase rolUsuario);
//
//  void remove(RolUsuarioBase rolUsuario);
}
