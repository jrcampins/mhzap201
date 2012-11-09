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

import com.egt.base.persistence.entity.GrupoAplicacionBase;
import com.egt.base.persistence.enums.EnumTipoQuery;
import java.util.List;

public interface GrupoAplicacionFacadeBase {

    GrupoAplicacionBase find(Object id);

    GrupoAplicacionBase find(Object id, boolean refresh);

    GrupoAplicacionBase findByCodigo(String codigo);

    GrupoAplicacionBase findByCodigo(String codigo, boolean refresh);

    List<? extends GrupoAplicacionBase> findAll();

    List<? extends GrupoAplicacionBase> findAll(boolean refresh);

    List<? extends GrupoAplicacionBase> findByQuery(String query);

    List<? extends GrupoAplicacionBase> findByQuery(String query, boolean refresh);

    List<? extends GrupoAplicacionBase> findByQuery(String query, EnumTipoQuery tipo);

    List<? extends GrupoAplicacionBase> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    List<? extends GrupoAplicacionBase> findByQuery(String query, EnumTipoQuery tipo, int max);

    List<? extends GrupoAplicacionBase> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);
//
//  void flush();
//
//  void merge(GrupoAplicacionBase grupoAplicacion);
//
//  void persist(GrupoAplicacionBase grupoAplicacion);
//
//  void refresh(GrupoAplicacionBase grupoAplicacion);
//
//  void remove(GrupoAplicacionBase grupoAplicacion);
}
