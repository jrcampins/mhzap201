/*
 * Copyright (C) 2009, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 *
 */
package com.egt.base.persistence.facade;

import com.egt.base.persistence.entity.UbicacionBase;
import com.egt.base.persistence.enums.EnumTipoQuery;
import java.util.List;

public interface UbicacionFacadeBase {

    UbicacionBase find(Object id);

    UbicacionBase find(Object id, boolean refresh);

    UbicacionBase findByCodigo(String codigo);

    UbicacionBase findByCodigo(String codigo, boolean refresh);

    List<? extends UbicacionBase> findAll();

    List<? extends UbicacionBase> findAll(boolean refresh);

    List<? extends UbicacionBase> findByQuery(String query);

    List<? extends UbicacionBase> findByQuery(String query, boolean refresh);

    List<? extends UbicacionBase> findByQuery(String query, EnumTipoQuery tipo);

    List<? extends UbicacionBase> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    List<? extends UbicacionBase> findByQuery(String query, EnumTipoQuery tipo, int max);

    List<? extends UbicacionBase> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);
//
//  void flush();
//
//  void merge(UbicacionBase ubicacion);
//
//  void persist(UbicacionBase ubicacion);
//
//  void refresh(UbicacionBase ubicacion);
//
//  void remove(UbicacionBase ubicacion);
}
