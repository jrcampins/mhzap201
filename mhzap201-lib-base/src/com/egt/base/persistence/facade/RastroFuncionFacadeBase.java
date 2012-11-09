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

import com.egt.base.persistence.entity.RastroFuncionBase;
import com.egt.base.persistence.enums.EnumTipoQuery;
import java.util.List;

public interface RastroFuncionFacadeBase {

    RastroFuncionBase find(Object id);

    RastroFuncionBase find(Object id, boolean refresh);

    List<? extends RastroFuncionBase> findAll();

    List<? extends RastroFuncionBase> findAll(boolean refresh);

    List<? extends RastroFuncionBase> findByQuery(String query);

    List<? extends RastroFuncionBase> findByQuery(String query, boolean refresh);

    List<? extends RastroFuncionBase> findByQuery(String query, EnumTipoQuery tipo);

    List<? extends RastroFuncionBase> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    List<? extends RastroFuncionBase> findByQuery(String query, EnumTipoQuery tipo, int max);

    List<? extends RastroFuncionBase> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);
//
//  void flush();
//
//  void merge(RastroFuncionBase rastroFuncion);
//
//  void persist(RastroFuncionBase rastroFuncion);
//
//  void refresh(RastroFuncionBase rastroFuncion);
//
//  void remove(RastroFuncionBase rastroFuncion);
}
