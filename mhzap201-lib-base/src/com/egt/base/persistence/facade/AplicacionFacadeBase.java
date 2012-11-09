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

import com.egt.base.persistence.entity.AplicacionBase;
import com.egt.base.persistence.enums.EnumTipoQuery;
import java.util.List;

public interface AplicacionFacadeBase {

    AplicacionBase find(Object id);

    AplicacionBase find(Object id, boolean refresh);

    AplicacionBase findByCodigo(String codigo);

    AplicacionBase findByCodigo(String codigo, boolean refresh);

    List<? extends AplicacionBase> findAll();

    List<? extends AplicacionBase> findAll(boolean refresh);

    List<? extends AplicacionBase> findByQuery(String query);

    List<? extends AplicacionBase> findByQuery(String query, boolean refresh);

    List<? extends AplicacionBase> findByQuery(String query, EnumTipoQuery tipo);

    List<? extends AplicacionBase> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    List<? extends AplicacionBase> findByQuery(String query, EnumTipoQuery tipo, int max);

    List<? extends AplicacionBase> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);
//
//  void flush();
//
//  void merge(AplicacionBase aplicacion);
//
//  void persist(AplicacionBase aplicacion);
//
//  void refresh(AplicacionBase aplicacion);
//
//  void remove(AplicacionBase aplicacion);
}
