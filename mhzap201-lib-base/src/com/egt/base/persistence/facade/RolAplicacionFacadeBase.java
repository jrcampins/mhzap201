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

import com.egt.base.persistence.entity.RolAplicacionBase;
import com.egt.base.persistence.enums.EnumTipoQuery;
import java.util.List;

public interface RolAplicacionFacadeBase {

    RolAplicacionBase find(Object id);

    RolAplicacionBase find(Object id, boolean refresh);

    List<? extends RolAplicacionBase> findAll();

    List<? extends RolAplicacionBase> findAll(boolean refresh);

    List<? extends RolAplicacionBase> findByQuery(String query);

    List<? extends RolAplicacionBase> findByQuery(String query, boolean refresh);

    List<? extends RolAplicacionBase> findByQuery(String query, EnumTipoQuery tipo);

    List<? extends RolAplicacionBase> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    List<? extends RolAplicacionBase> findByQuery(String query, EnumTipoQuery tipo, int max);

    List<? extends RolAplicacionBase> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);
//
//  void flush();
//
//  void merge(RolAplicacionBase rolAplicacion);
//
//  void persist(RolAplicacionBase rolAplicacion);
//
//  void refresh(RolAplicacionBase rolAplicacion);
//
//  void remove(RolAplicacionBase rolAplicacion);
}
