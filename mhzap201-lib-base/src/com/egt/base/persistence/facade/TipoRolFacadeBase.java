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

import com.egt.base.persistence.entity.TipoRolBase;
import com.egt.base.persistence.enums.EnumTipoQuery;
import java.util.List;

public interface TipoRolFacadeBase {

    TipoRolBase find(Object id);

    TipoRolBase find(Object id, boolean refresh);

    TipoRolBase findByCodigo(String codigo);

    TipoRolBase findByCodigo(String codigo, boolean refresh);

    List<? extends TipoRolBase> findAll();

    List<? extends TipoRolBase> findAll(boolean refresh);

    List<? extends TipoRolBase> findByQuery(String query);

    List<? extends TipoRolBase> findByQuery(String query, boolean refresh);

    List<? extends TipoRolBase> findByQuery(String query, EnumTipoQuery tipo);

    List<? extends TipoRolBase> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    List<? extends TipoRolBase> findByQuery(String query, EnumTipoQuery tipo, int max);

    List<? extends TipoRolBase> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);
//
//  void flush();
//
//  void merge(TipoRolBase tipoRol);
//
//  void persist(TipoRolBase tipoRol);
//
//  void refresh(TipoRolBase tipoRol);
//
//  void remove(TipoRolBase tipoRol);
}
