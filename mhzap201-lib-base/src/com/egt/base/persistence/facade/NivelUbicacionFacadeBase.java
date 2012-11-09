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

import com.egt.base.persistence.entity.NivelUbicacionBase;
import com.egt.base.persistence.enums.EnumTipoQuery;
import java.util.List;

public interface NivelUbicacionFacadeBase {

    NivelUbicacionBase find(Object id);

    NivelUbicacionBase find(Object id, boolean refresh);

    NivelUbicacionBase findByCodigo(String codigo);

    NivelUbicacionBase findByCodigo(String codigo, boolean refresh);

    List<? extends NivelUbicacionBase> findAll();

    List<? extends NivelUbicacionBase> findAll(boolean refresh);

    List<? extends NivelUbicacionBase> findByQuery(String query);

    List<? extends NivelUbicacionBase> findByQuery(String query, boolean refresh);

    List<? extends NivelUbicacionBase> findByQuery(String query, EnumTipoQuery tipo);

    List<? extends NivelUbicacionBase> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    List<? extends NivelUbicacionBase> findByQuery(String query, EnumTipoQuery tipo, int max);

    List<? extends NivelUbicacionBase> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);
//
//  void flush();
//
//  void merge(NivelUbicacionBase nivelUbicacion);
//
//  void persist(NivelUbicacionBase nivelUbicacion);
//
//  void refresh(NivelUbicacionBase nivelUbicacion);
//
//  void remove(NivelUbicacionBase nivelUbicacion);
}
