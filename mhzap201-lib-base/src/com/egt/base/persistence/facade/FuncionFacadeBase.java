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

import com.egt.base.persistence.entity.FuncionBase;
import com.egt.base.persistence.enums.EnumTipoQuery;
import java.util.List;

public interface FuncionFacadeBase {

    FuncionBase find(Object id);

    FuncionBase find(Object id, boolean refresh);

    FuncionBase findByCodigo(String codigo);

    FuncionBase findByCodigo(String codigo, boolean refresh);

    List<? extends FuncionBase> findAll();

    List<? extends FuncionBase> findAll(boolean refresh);

    List<? extends FuncionBase> findByQuery(String query);

    List<? extends FuncionBase> findByQuery(String query, boolean refresh);

    List<? extends FuncionBase> findByQuery(String query, EnumTipoQuery tipo);

    List<? extends FuncionBase> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    List<? extends FuncionBase> findByQuery(String query, EnumTipoQuery tipo, int max);

    List<? extends FuncionBase> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);
//
//  void flush();
//
//  void merge(FuncionBase funcion);
//
//  void persist(FuncionBase funcion);
//
//  void refresh(FuncionBase funcion);
//
//  void remove(FuncionBase funcion);
}
