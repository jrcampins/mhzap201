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

import com.egt.base.persistence.entity.UsuarioBase;
import com.egt.base.persistence.enums.EnumTipoQuery;
import java.util.List;

public interface UsuarioFacadeBase {

    UsuarioBase find(Object id);

    UsuarioBase find(Object id, boolean refresh);

    UsuarioBase findByCodigo(String codigo);

    UsuarioBase findByCodigo(String codigo, boolean refresh);

    List<? extends UsuarioBase> findAll();

    List<? extends UsuarioBase> findAll(boolean refresh);

    List<? extends UsuarioBase> findByQuery(String query);

    List<? extends UsuarioBase> findByQuery(String query, boolean refresh);

    List<? extends UsuarioBase> findByQuery(String query, EnumTipoQuery tipo);

    List<? extends UsuarioBase> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    List<? extends UsuarioBase> findByQuery(String query, EnumTipoQuery tipo, int max);

    List<? extends UsuarioBase> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);
//
//  void flush();
//
//  void merge(UsuarioBase usuario);
//
//  void persist(UsuarioBase usuario);
//
//  void refresh(UsuarioBase usuario);
//
//  void remove(UsuarioBase usuario);
}
