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

import com.egt.base.persistence.entity.TipoDominioBase;
import com.egt.base.persistence.enums.EnumTipoQuery;
import java.util.List;

public interface TipoDominioFacadeBase {

    TipoDominioBase find(Object id);

    TipoDominioBase find(Object id, boolean refresh);

    TipoDominioBase findByCodigo(String codigo);

    TipoDominioBase findByCodigo(String codigo, boolean refresh);

    List<? extends TipoDominioBase> findAll();

    List<? extends TipoDominioBase> findAll(boolean refresh);

    List<? extends TipoDominioBase> findByQuery(String query);

    List<? extends TipoDominioBase> findByQuery(String query, boolean refresh);

    List<? extends TipoDominioBase> findByQuery(String query, EnumTipoQuery tipo);

    List<? extends TipoDominioBase> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    List<? extends TipoDominioBase> findByQuery(String query, EnumTipoQuery tipo, int max);

    List<? extends TipoDominioBase> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);
//
//  void flush();
//
//  void merge(TipoDominioBase tipoDominio);
//
//  void persist(TipoDominioBase tipoDominio);
//
//  void refresh(TipoDominioBase tipoDominio);
//
//  void remove(TipoDominioBase tipoDominio);
}
