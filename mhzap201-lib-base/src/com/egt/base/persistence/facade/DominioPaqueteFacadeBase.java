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

import com.egt.base.persistence.entity.DominioPaqueteBase;
import com.egt.base.persistence.enums.EnumTipoQuery;
import java.util.List;

public interface DominioPaqueteFacadeBase {

    DominioPaqueteBase find(Object id);

    DominioPaqueteBase find(Object id, boolean refresh);

    List<? extends DominioPaqueteBase> findAll();

    List<? extends DominioPaqueteBase> findAll(boolean refresh);

    List<? extends DominioPaqueteBase> findByQuery(String query);

    List<? extends DominioPaqueteBase> findByQuery(String query, boolean refresh);

    List<? extends DominioPaqueteBase> findByQuery(String query, EnumTipoQuery tipo);

    List<? extends DominioPaqueteBase> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    List<? extends DominioPaqueteBase> findByQuery(String query, EnumTipoQuery tipo, int max);

    List<? extends DominioPaqueteBase> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);
//
//  void flush();
//
//  void merge(DominioPaqueteBase dominioPaquete);
//
//  void persist(DominioPaqueteBase dominioPaquete);
//
//  void refresh(DominioPaqueteBase dominioPaquete);
//
//  void remove(DominioPaqueteBase dominioPaquete);
}
