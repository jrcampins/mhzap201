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
import com.egt.base.persistence.facade.TipoParametroFacadeBase;
import com.egt.ejb.persistence.entity.TipoParametro;
import java.util.List;
import javax.ejb.Local;

@Local
public interface TipoParametroFacadeLocal extends TipoParametroFacadeBase {

    @Override
    TipoParametro find(Object id);

    @Override
    TipoParametro find(Object id, boolean refresh);

    @Override
    TipoParametro findByCodigo(String codigo);

    @Override
    TipoParametro findByCodigo(String codigo, boolean refresh);

    @Override
    List<TipoParametro> findAll();

    @Override
    List<TipoParametro> findAll(boolean refresh);

    @Override
    List<TipoParametro> findByQuery(String query);

    @Override
    List<TipoParametro> findByQuery(String query, boolean refresh);

    @Override
    List<TipoParametro> findByQuery(String query, EnumTipoQuery tipo);

    @Override
    List<TipoParametro> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    @Override
    List<TipoParametro> findByQuery(String query, EnumTipoQuery tipo, int max);

    @Override
    List<TipoParametro> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);

    void flush();

    void merge(TipoParametro tipoParametro);

    void persist(TipoParametro tipoParametro);

    void refresh(TipoParametro tipoParametro);

    void remove(TipoParametro tipoParametro);
}
