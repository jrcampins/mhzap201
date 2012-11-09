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

import com.egt.base.persistence.entity.TipoParametroBase;
import com.egt.base.persistence.enums.EnumTipoQuery;
import java.util.List;

public interface TipoParametroFacadeBase {

    TipoParametroBase find(Object id);

    TipoParametroBase find(Object id, boolean refresh);

    TipoParametroBase findByCodigo(String codigo);

    TipoParametroBase findByCodigo(String codigo, boolean refresh);

    List<? extends TipoParametroBase> findAll();

    List<? extends TipoParametroBase> findAll(boolean refresh);

    List<? extends TipoParametroBase> findByQuery(String query);

    List<? extends TipoParametroBase> findByQuery(String query, boolean refresh);

    List<? extends TipoParametroBase> findByQuery(String query, EnumTipoQuery tipo);

    List<? extends TipoParametroBase> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    List<? extends TipoParametroBase> findByQuery(String query, EnumTipoQuery tipo, int max);

    List<? extends TipoParametroBase> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);
//
//  void flush();
//
//  void merge(TipoParametroBase tipoParametro);
//
//  void persist(TipoParametroBase tipoParametro);
//
//  void refresh(TipoParametroBase tipoParametro);
//
//  void remove(TipoParametroBase tipoParametro);
}
