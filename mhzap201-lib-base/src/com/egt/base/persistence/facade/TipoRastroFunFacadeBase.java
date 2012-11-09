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

import com.egt.base.persistence.entity.TipoRastroFunBase;
import com.egt.base.persistence.enums.EnumTipoQuery;
import java.util.List;

public interface TipoRastroFunFacadeBase {

    TipoRastroFunBase find(Object id);

    TipoRastroFunBase find(Object id, boolean refresh);

    TipoRastroFunBase findByCodigo(String codigo);

    TipoRastroFunBase findByCodigo(String codigo, boolean refresh);

    List<? extends TipoRastroFunBase> findAll();

    List<? extends TipoRastroFunBase> findAll(boolean refresh);

    List<? extends TipoRastroFunBase> findByQuery(String query);

    List<? extends TipoRastroFunBase> findByQuery(String query, boolean refresh);

    List<? extends TipoRastroFunBase> findByQuery(String query, EnumTipoQuery tipo);

    List<? extends TipoRastroFunBase> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    List<? extends TipoRastroFunBase> findByQuery(String query, EnumTipoQuery tipo, int max);

    List<? extends TipoRastroFunBase> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);
//
//  void flush();
//
//  void merge(TipoRastroFunBase tipoRastroFun);
//
//  void persist(TipoRastroFunBase tipoRastroFun);
//
//  void refresh(TipoRastroFunBase tipoRastroFun);
//
//  void remove(TipoRastroFunBase tipoRastroFun);
}
