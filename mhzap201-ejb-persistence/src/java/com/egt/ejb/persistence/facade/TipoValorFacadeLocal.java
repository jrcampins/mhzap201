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
import com.egt.base.persistence.facade.TipoValorFacadeBase;
import com.egt.ejb.persistence.entity.TipoValor;
import java.util.List;
import javax.ejb.Local;

@Local
public interface TipoValorFacadeLocal extends TipoValorFacadeBase {

    @Override
    TipoValor find(Object id);

    @Override
    TipoValor find(Object id, boolean refresh);

    @Override
    TipoValor findByCodigo(String codigo);

    @Override
    TipoValor findByCodigo(String codigo, boolean refresh);

    @Override
    List<TipoValor> findAll();

    @Override
    List<TipoValor> findAll(boolean refresh);

    @Override
    List<TipoValor> findByQuery(String query);

    @Override
    List<TipoValor> findByQuery(String query, boolean refresh);

    @Override
    List<TipoValor> findByQuery(String query, EnumTipoQuery tipo);

    @Override
    List<TipoValor> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    @Override
    List<TipoValor> findByQuery(String query, EnumTipoQuery tipo, int max);

    @Override
    List<TipoValor> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);

    void flush();

    void merge(TipoValor tipoValor);

    void persist(TipoValor tipoValor);

    void refresh(TipoValor tipoValor);

    void remove(TipoValor tipoValor);
}
