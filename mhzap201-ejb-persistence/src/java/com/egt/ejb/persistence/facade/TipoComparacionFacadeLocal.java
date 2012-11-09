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
package com.egt.ejb.persistence.facade;

import com.egt.base.persistence.enums.EnumTipoQuery;
import com.egt.base.persistence.facade.TipoComparacionFacadeBase;
import com.egt.ejb.persistence.entity.TipoComparacion;
import java.util.List;
import javax.ejb.Local;

@Local
public interface TipoComparacionFacadeLocal extends TipoComparacionFacadeBase {

    @Override
    TipoComparacion find(Object id);

    @Override
    TipoComparacion find(Object id, boolean refresh);

    @Override
    TipoComparacion findByCodigo(String codigo);

    @Override
    TipoComparacion findByCodigo(String codigo, boolean refresh);

    @Override
    List<TipoComparacion> findAll();

    @Override
    List<TipoComparacion> findAll(boolean refresh);

    @Override
    List<TipoComparacion> findByQuery(String query);

    @Override
    List<TipoComparacion> findByQuery(String query, boolean refresh);

    @Override
    List<TipoComparacion> findByQuery(String query, EnumTipoQuery tipo);

    @Override
    List<TipoComparacion> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    @Override
    List<TipoComparacion> findByQuery(String query, EnumTipoQuery tipo, int max);

    @Override
    List<TipoComparacion> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);

    void flush();

    void merge(TipoComparacion tipoComparacion);

    void persist(TipoComparacion tipoComparacion);

    void refresh(TipoComparacion tipoComparacion);

    void remove(TipoComparacion tipoComparacion);
}
