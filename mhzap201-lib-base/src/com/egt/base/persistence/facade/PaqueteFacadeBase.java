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

import com.egt.base.persistence.entity.PaqueteBase;
import com.egt.base.persistence.enums.EnumTipoQuery;
import java.util.List;

public interface PaqueteFacadeBase {

    PaqueteBase find(Object id);

    PaqueteBase find(Object id, boolean refresh);

    PaqueteBase findByCodigo(String codigo);

    PaqueteBase findByCodigo(String codigo, boolean refresh);

    List<? extends PaqueteBase> findAll();

    List<? extends PaqueteBase> findAll(boolean refresh);

    List<? extends PaqueteBase> findByQuery(String query);

    List<? extends PaqueteBase> findByQuery(String query, boolean refresh);

    List<? extends PaqueteBase> findByQuery(String query, EnumTipoQuery tipo);

    List<? extends PaqueteBase> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    List<? extends PaqueteBase> findByQuery(String query, EnumTipoQuery tipo, int max);

    List<? extends PaqueteBase> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);
//
//  void flush();
//
//  void merge(PaqueteBase paquete);
//
//  void persist(PaqueteBase paquete);
//
//  void refresh(PaqueteBase paquete);
//
//  void remove(PaqueteBase paquete);
}
