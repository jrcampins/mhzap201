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

import com.egt.base.persistence.entity.FuncionParametroBase;
import com.egt.base.persistence.enums.EnumTipoQuery;
import java.util.List;

public interface FuncionParametroFacadeBase {

    FuncionParametroBase find(Object id);

    FuncionParametroBase find(Object id, boolean refresh);

    List<? extends FuncionParametroBase> findAll();

    List<? extends FuncionParametroBase> findAll(boolean refresh);

    List<? extends FuncionParametroBase> findByQuery(String query);

    List<? extends FuncionParametroBase> findByQuery(String query, boolean refresh);

    List<? extends FuncionParametroBase> findByQuery(String query, EnumTipoQuery tipo);

    List<? extends FuncionParametroBase> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    List<? extends FuncionParametroBase> findByQuery(String query, EnumTipoQuery tipo, int max);

    List<? extends FuncionParametroBase> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);
//
//  void flush();
//
//  void merge(FuncionParametroBase funcionParametro);
//
//  void persist(FuncionParametroBase funcionParametro);
//
//  void refresh(FuncionParametroBase funcionParametro);
//
//  void remove(FuncionParametroBase funcionParametro);
}
