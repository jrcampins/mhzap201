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

import com.egt.base.persistence.entity.ProcesoBase;
import com.egt.base.persistence.enums.EnumTipoQuery;
import java.util.List;

public interface ProcesoFacadeBase {

    ProcesoBase find(Object id);

    ProcesoBase find(Object id, boolean refresh);

    ProcesoBase findByCodigo(String codigo);

    ProcesoBase findByCodigo(String codigo, boolean refresh);

    List<? extends ProcesoBase> findAll();

    List<? extends ProcesoBase> findAll(boolean refresh);

    List<? extends ProcesoBase> findByQuery(String query);

    List<? extends ProcesoBase> findByQuery(String query, boolean refresh);

    List<? extends ProcesoBase> findByQuery(String query, EnumTipoQuery tipo);

    List<? extends ProcesoBase> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    List<? extends ProcesoBase> findByQuery(String query, EnumTipoQuery tipo, int max);

    List<? extends ProcesoBase> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);
//
//  void flush();
//
//  void merge(ProcesoBase proceso);
//
//  void persist(ProcesoBase proceso);
//
//  void refresh(ProcesoBase proceso);
//
//  void remove(ProcesoBase proceso);
}
