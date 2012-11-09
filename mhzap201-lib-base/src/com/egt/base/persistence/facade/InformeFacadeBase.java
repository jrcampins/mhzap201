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

import com.egt.base.persistence.entity.InformeBase;
import com.egt.base.persistence.enums.EnumTipoQuery;
import java.util.List;

public interface InformeFacadeBase {

    InformeBase find(Object id);

    InformeBase find(Object id, boolean refresh);

    List<? extends InformeBase> findAll();

    List<? extends InformeBase> findAll(boolean refresh);

    List<? extends InformeBase> findByQuery(String query);

    List<? extends InformeBase> findByQuery(String query, boolean refresh);

    List<? extends InformeBase> findByQuery(String query, EnumTipoQuery tipo);

    List<? extends InformeBase> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    List<? extends InformeBase> findByQuery(String query, EnumTipoQuery tipo, int max);

    List<? extends InformeBase> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);
//
//  void flush();
//
//  void merge(InformeBase informe);
//
//  void persist(InformeBase informe);
//
//  void refresh(InformeBase informe);
//
//  void remove(InformeBase informe);
}
