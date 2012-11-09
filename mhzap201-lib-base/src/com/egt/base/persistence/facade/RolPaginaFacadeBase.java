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

import com.egt.base.persistence.entity.RolPaginaBase;
import com.egt.base.persistence.enums.EnumTipoQuery;
import java.util.List;

public interface RolPaginaFacadeBase {

    RolPaginaBase find(Object id);

    RolPaginaBase find(Object id, boolean refresh);

    List<? extends RolPaginaBase> findAll();

    List<? extends RolPaginaBase> findAll(boolean refresh);

    List<? extends RolPaginaBase> findByQuery(String query);

    List<? extends RolPaginaBase> findByQuery(String query, boolean refresh);

    List<? extends RolPaginaBase> findByQuery(String query, EnumTipoQuery tipo);

    List<? extends RolPaginaBase> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    List<? extends RolPaginaBase> findByQuery(String query, EnumTipoQuery tipo, int max);

    List<? extends RolPaginaBase> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);
//
//  void flush();
//
//  void merge(RolPaginaBase rolPagina);
//
//  void persist(RolPaginaBase rolPagina);
//
//  void refresh(RolPaginaBase rolPagina);
//
//  void remove(RolPaginaBase rolPagina);
}
