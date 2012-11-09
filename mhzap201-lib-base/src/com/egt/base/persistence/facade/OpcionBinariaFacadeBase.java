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

import com.egt.base.persistence.entity.OpcionBinariaBase;
import com.egt.base.persistence.enums.EnumTipoQuery;
import java.util.List;

public interface OpcionBinariaFacadeBase {

    OpcionBinariaBase find(Object id);

    OpcionBinariaBase find(Object id, boolean refresh);

    OpcionBinariaBase findByCodigo(String codigo);

    OpcionBinariaBase findByCodigo(String codigo, boolean refresh);

    List<? extends OpcionBinariaBase> findAll();

    List<? extends OpcionBinariaBase> findAll(boolean refresh);

    List<? extends OpcionBinariaBase> findByQuery(String query);

    List<? extends OpcionBinariaBase> findByQuery(String query, boolean refresh);

    List<? extends OpcionBinariaBase> findByQuery(String query, EnumTipoQuery tipo);

    List<? extends OpcionBinariaBase> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    List<? extends OpcionBinariaBase> findByQuery(String query, EnumTipoQuery tipo, int max);

    List<? extends OpcionBinariaBase> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);
//
//  void flush();
//
//  void merge(OpcionBinariaBase opcionBinaria);
//
//  void persist(OpcionBinariaBase opcionBinaria);
//
//  void refresh(OpcionBinariaBase opcionBinaria);
//
//  void remove(OpcionBinariaBase opcionBinaria);
}
