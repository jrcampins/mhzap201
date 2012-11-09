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

import com.egt.base.persistence.entity.RastroInformeBase;
import com.egt.base.persistence.enums.EnumTipoQuery;
import java.util.List;

public interface RastroInformeFacadeBase {

    RastroInformeBase find(Object id);

    RastroInformeBase find(Object id, boolean refresh);

    List<? extends RastroInformeBase> findAll();

    List<? extends RastroInformeBase> findAll(boolean refresh);

    List<? extends RastroInformeBase> findByQuery(String query);

    List<? extends RastroInformeBase> findByQuery(String query, boolean refresh);

    List<? extends RastroInformeBase> findByQuery(String query, EnumTipoQuery tipo);

    List<? extends RastroInformeBase> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    List<? extends RastroInformeBase> findByQuery(String query, EnumTipoQuery tipo, int max);

    List<? extends RastroInformeBase> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);
//
//  void flush();
//
//  void merge(RastroInformeBase rastroInforme);
//
//  void persist(RastroInformeBase rastroInforme);
//
//  void refresh(RastroInformeBase rastroInforme);
//
//  void remove(RastroInformeBase rastroInforme);
}
