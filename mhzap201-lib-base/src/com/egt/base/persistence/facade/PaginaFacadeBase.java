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

import com.egt.base.persistence.entity.PaginaBase;
import com.egt.base.persistence.enums.EnumTipoQuery;
import java.util.List;

public interface PaginaFacadeBase {

    PaginaBase find(Object id);

    PaginaBase find(Object id, boolean refresh);

    PaginaBase findByCodigo(String codigo);

    PaginaBase findByCodigo(String codigo, boolean refresh);

    List<? extends PaginaBase> findAll();

    List<? extends PaginaBase> findAll(boolean refresh);

    List<? extends PaginaBase> findByQuery(String query);

    List<? extends PaginaBase> findByQuery(String query, boolean refresh);

    List<? extends PaginaBase> findByQuery(String query, EnumTipoQuery tipo);

    List<? extends PaginaBase> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    List<? extends PaginaBase> findByQuery(String query, EnumTipoQuery tipo, int max);

    List<? extends PaginaBase> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);
//
//  void flush();
//
//  void merge(PaginaBase pagina);
//
//  void persist(PaginaBase pagina);
//
//  void refresh(PaginaBase pagina);
//
//  void remove(PaginaBase pagina);
}
