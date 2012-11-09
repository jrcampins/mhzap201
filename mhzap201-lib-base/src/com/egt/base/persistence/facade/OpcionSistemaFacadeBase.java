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

import com.egt.base.persistence.entity.OpcionSistemaBase;
import com.egt.base.persistence.enums.EnumTipoQuery;
import java.util.List;

public interface OpcionSistemaFacadeBase {

    OpcionSistemaBase find(Object id);

    OpcionSistemaBase find(Object id, boolean refresh);

    List<? extends OpcionSistemaBase> findAll();

    List<? extends OpcionSistemaBase> findAll(boolean refresh);

    List<? extends OpcionSistemaBase> findByQuery(String query);

    List<? extends OpcionSistemaBase> findByQuery(String query, boolean refresh);

    List<? extends OpcionSistemaBase> findByQuery(String query, EnumTipoQuery tipo);

    List<? extends OpcionSistemaBase> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    List<? extends OpcionSistemaBase> findByQuery(String query, EnumTipoQuery tipo, int max);

    List<? extends OpcionSistemaBase> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);
//
//  void flush();
//
//  void merge(OpcionSistemaBase opcionSistema);
//
//  void persist(OpcionSistemaBase opcionSistema);
//
//  void refresh(OpcionSistemaBase opcionSistema);
//
//  void remove(OpcionSistemaBase opcionSistema);
}
