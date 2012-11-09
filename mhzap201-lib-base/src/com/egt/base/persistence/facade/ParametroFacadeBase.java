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

import com.egt.base.persistence.entity.ParametroBase;
import com.egt.base.persistence.enums.EnumTipoQuery;
import java.util.List;

public interface ParametroFacadeBase {

    ParametroBase find(Object id);

    ParametroBase find(Object id, boolean refresh);

    ParametroBase findByCodigo(String codigo);

    ParametroBase findByCodigo(String codigo, boolean refresh);

    List<? extends ParametroBase> findAll();

    List<? extends ParametroBase> findAll(boolean refresh);

    List<? extends ParametroBase> findByQuery(String query);

    List<? extends ParametroBase> findByQuery(String query, boolean refresh);

    List<? extends ParametroBase> findByQuery(String query, EnumTipoQuery tipo);

    List<? extends ParametroBase> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    List<? extends ParametroBase> findByQuery(String query, EnumTipoQuery tipo, int max);

    List<? extends ParametroBase> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);
//
//  void flush();
//
//  void merge(ParametroBase parametro);
//
//  void persist(ParametroBase parametro);
//
//  void refresh(ParametroBase parametro);
//
//  void remove(ParametroBase parametro);
}
