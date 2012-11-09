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

import com.egt.base.persistence.entity.GrupoProcesoBase;
import com.egt.base.persistence.enums.EnumTipoQuery;
import java.util.List;

public interface GrupoProcesoFacadeBase {

    GrupoProcesoBase find(Object id);

    GrupoProcesoBase find(Object id, boolean refresh);

    GrupoProcesoBase findByCodigo(String codigo);

    GrupoProcesoBase findByCodigo(String codigo, boolean refresh);

    List<? extends GrupoProcesoBase> findAll();

    List<? extends GrupoProcesoBase> findAll(boolean refresh);

    List<? extends GrupoProcesoBase> findByQuery(String query);

    List<? extends GrupoProcesoBase> findByQuery(String query, boolean refresh);

    List<? extends GrupoProcesoBase> findByQuery(String query, EnumTipoQuery tipo);

    List<? extends GrupoProcesoBase> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    List<? extends GrupoProcesoBase> findByQuery(String query, EnumTipoQuery tipo, int max);

    List<? extends GrupoProcesoBase> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);
//
//  void flush();
//
//  void merge(GrupoProcesoBase grupoProceso);
//
//  void persist(GrupoProcesoBase grupoProceso);
//
//  void refresh(GrupoProcesoBase grupoProceso);
//
//  void remove(GrupoProcesoBase grupoProceso);
}
