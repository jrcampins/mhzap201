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

import com.egt.base.persistence.entity.FiltroFuncionBase;
import com.egt.base.persistence.enums.EnumTipoQuery;
import java.util.List;

public interface FiltroFuncionFacadeBase {

    FiltroFuncionBase find(Object id);

    FiltroFuncionBase find(Object id, boolean refresh);

    FiltroFuncionBase findByCodigo(String codigo);

    FiltroFuncionBase findByCodigo(String codigo, boolean refresh);

    List<? extends FiltroFuncionBase> findAll();

    List<? extends FiltroFuncionBase> findAll(boolean refresh);

    List<? extends FiltroFuncionBase> findByQuery(String query);

    List<? extends FiltroFuncionBase> findByQuery(String query, boolean refresh);

    List<? extends FiltroFuncionBase> findByQuery(String query, EnumTipoQuery tipo);

    List<? extends FiltroFuncionBase> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    List<? extends FiltroFuncionBase> findByQuery(String query, EnumTipoQuery tipo, int max);

    List<? extends FiltroFuncionBase> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);
//
//  void flush();
//
//  void merge(FiltroFuncionBase filtroFuncion);
//
//  void persist(FiltroFuncionBase filtroFuncion);
//
//  void refresh(FiltroFuncionBase filtroFuncion);
//
//  void remove(FiltroFuncionBase filtroFuncion);
}
