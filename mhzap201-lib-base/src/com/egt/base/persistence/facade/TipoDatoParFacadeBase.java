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

import com.egt.base.persistence.entity.TipoDatoParBase;
import com.egt.base.persistence.enums.EnumTipoQuery;
import java.util.List;

public interface TipoDatoParFacadeBase {

    TipoDatoParBase find(Object id);

    TipoDatoParBase find(Object id, boolean refresh);

    TipoDatoParBase findByCodigo(String codigo);

    TipoDatoParBase findByCodigo(String codigo, boolean refresh);

    List<? extends TipoDatoParBase> findAll();

    List<? extends TipoDatoParBase> findAll(boolean refresh);

    List<? extends TipoDatoParBase> findByQuery(String query);

    List<? extends TipoDatoParBase> findByQuery(String query, boolean refresh);

    List<? extends TipoDatoParBase> findByQuery(String query, EnumTipoQuery tipo);

    List<? extends TipoDatoParBase> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    List<? extends TipoDatoParBase> findByQuery(String query, EnumTipoQuery tipo, int max);

    List<? extends TipoDatoParBase> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);
//
//  void flush();
//
//  void merge(TipoDatoParBase tipoDatoPar);
//
//  void persist(TipoDatoParBase tipoDatoPar);
//
//  void refresh(TipoDatoParBase tipoDatoPar);
//
//  void remove(TipoDatoParBase tipoDatoPar);
}
