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

import com.egt.base.persistence.entity.MensajeBase;
import com.egt.base.persistence.enums.EnumTipoQuery;
import java.util.List;

public interface MensajeFacadeBase {

    MensajeBase find(Object id);

    MensajeBase find(Object id, boolean refresh);

    MensajeBase findByCodigo(String codigo);

    MensajeBase findByCodigo(String codigo, boolean refresh);

    List<? extends MensajeBase> findAll();

    List<? extends MensajeBase> findAll(boolean refresh);

    List<? extends MensajeBase> findByQuery(String query);

    List<? extends MensajeBase> findByQuery(String query, boolean refresh);

    List<? extends MensajeBase> findByQuery(String query, EnumTipoQuery tipo);

    List<? extends MensajeBase> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    List<? extends MensajeBase> findByQuery(String query, EnumTipoQuery tipo, int max);

    List<? extends MensajeBase> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);
//
//  void flush();
//
//  void merge(MensajeBase mensaje);
//
//  void persist(MensajeBase mensaje);
//
//  void refresh(MensajeBase mensaje);
//
//  void remove(MensajeBase mensaje);
}
