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

import com.egt.base.persistence.entity.TipoPaginaBase;
import com.egt.base.persistence.enums.EnumTipoQuery;
import java.util.List;

public interface TipoPaginaFacadeBase {

    TipoPaginaBase find(Object id);

    TipoPaginaBase find(Object id, boolean refresh);

    TipoPaginaBase findByCodigo(String codigo);

    TipoPaginaBase findByCodigo(String codigo, boolean refresh);

    List<? extends TipoPaginaBase> findAll();

    List<? extends TipoPaginaBase> findAll(boolean refresh);

    List<? extends TipoPaginaBase> findByQuery(String query);

    List<? extends TipoPaginaBase> findByQuery(String query, boolean refresh);

    List<? extends TipoPaginaBase> findByQuery(String query, EnumTipoQuery tipo);

    List<? extends TipoPaginaBase> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    List<? extends TipoPaginaBase> findByQuery(String query, EnumTipoQuery tipo, int max);

    List<? extends TipoPaginaBase> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);
//
//  void flush();
//
//  void merge(TipoPaginaBase tipoPagina);
//
//  void persist(TipoPaginaBase tipoPagina);
//
//  void refresh(TipoPaginaBase tipoPagina);
//
//  void remove(TipoPaginaBase tipoPagina);
}
