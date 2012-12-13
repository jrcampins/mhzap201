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

import com.egt.base.persistence.entity.InformeAuditoriaBase;
import com.egt.base.persistence.enums.EnumTipoQuery;
import java.util.List;

public interface InformeAuditoriaFacadeBase {

    InformeAuditoriaBase find(Object id);

    InformeAuditoriaBase find(Object id, boolean refresh);

    InformeAuditoriaBase findByCodigo(String codigo);

    InformeAuditoriaBase findByCodigo(String codigo, boolean refresh);

    List<? extends InformeAuditoriaBase> findAll();

    List<? extends InformeAuditoriaBase> findAll(boolean refresh);

    List<? extends InformeAuditoriaBase> findByQuery(String query);

    List<? extends InformeAuditoriaBase> findByQuery(String query, boolean refresh);

    List<? extends InformeAuditoriaBase> findByQuery(String query, EnumTipoQuery tipo);

    List<? extends InformeAuditoriaBase> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    List<? extends InformeAuditoriaBase> findByQuery(String query, EnumTipoQuery tipo, int max);

    List<? extends InformeAuditoriaBase> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);
//
//  void flush();
//
//  void merge(InformeAuditoriaBase informeAuditoria);
//
//  void persist(InformeAuditoriaBase informeAuditoria);
//
//  void refresh(InformeAuditoriaBase informeAuditoria);
//
//  void remove(InformeAuditoriaBase informeAuditoria);
}
