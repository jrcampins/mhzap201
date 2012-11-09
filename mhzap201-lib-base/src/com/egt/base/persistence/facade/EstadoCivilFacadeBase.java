/*
 * Copyright (C) 2009, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 *
 */
package com.egt.base.persistence.facade;

import com.egt.base.persistence.entity.EstadoCivilBase;
import com.egt.base.persistence.enums.EnumTipoQuery;
import java.util.List;

public interface EstadoCivilFacadeBase {

    EstadoCivilBase find(Object id);

    EstadoCivilBase find(Object id, boolean refresh);

    EstadoCivilBase findByCodigo(String codigo);

    EstadoCivilBase findByCodigo(String codigo, boolean refresh);

    List<? extends EstadoCivilBase> findAll();

    List<? extends EstadoCivilBase> findAll(boolean refresh);

    List<? extends EstadoCivilBase> findByQuery(String query);

    List<? extends EstadoCivilBase> findByQuery(String query, boolean refresh);

    List<? extends EstadoCivilBase> findByQuery(String query, EnumTipoQuery tipo);

    List<? extends EstadoCivilBase> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    List<? extends EstadoCivilBase> findByQuery(String query, EnumTipoQuery tipo, int max);

    List<? extends EstadoCivilBase> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);
//
//  void flush();
//
//  void merge(EstadoCivilBase estadoCivil);
//
//  void persist(EstadoCivilBase estadoCivil);
//
//  void refresh(EstadoCivilBase estadoCivil);
//
//  void remove(EstadoCivilBase estadoCivil);
}
