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

import com.egt.base.persistence.entity.TipoValorBase;
import com.egt.base.persistence.enums.EnumTipoQuery;
import java.util.List;

public interface TipoValorFacadeBase {

    TipoValorBase find(Object id);

    TipoValorBase find(Object id, boolean refresh);

    TipoValorBase findByCodigo(String codigo);

    TipoValorBase findByCodigo(String codigo, boolean refresh);

    List<? extends TipoValorBase> findAll();

    List<? extends TipoValorBase> findAll(boolean refresh);

    List<? extends TipoValorBase> findByQuery(String query);

    List<? extends TipoValorBase> findByQuery(String query, boolean refresh);

    List<? extends TipoValorBase> findByQuery(String query, EnumTipoQuery tipo);

    List<? extends TipoValorBase> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    List<? extends TipoValorBase> findByQuery(String query, EnumTipoQuery tipo, int max);

    List<? extends TipoValorBase> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);
//
//  void flush();
//
//  void merge(TipoValorBase tipoValor);
//
//  void persist(TipoValorBase tipoValor);
//
//  void refresh(TipoValorBase tipoValor);
//
//  void remove(TipoValorBase tipoValor);
}
