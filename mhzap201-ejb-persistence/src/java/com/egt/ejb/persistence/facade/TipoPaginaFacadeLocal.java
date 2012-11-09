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
import com.egt.base.persistence.facade.TipoPaginaFacadeBase;
import com.egt.ejb.persistence.entity.TipoPagina;
import java.util.List;
import javax.ejb.Local;

@Local
public interface TipoPaginaFacadeLocal extends TipoPaginaFacadeBase {

    @Override
    TipoPagina find(Object id);

    @Override
    TipoPagina find(Object id, boolean refresh);

    @Override
    TipoPagina findByCodigo(String codigo);

    @Override
    TipoPagina findByCodigo(String codigo, boolean refresh);

    @Override
    List<TipoPagina> findAll();

    @Override
    List<TipoPagina> findAll(boolean refresh);

    @Override
    List<TipoPagina> findByQuery(String query);

    @Override
    List<TipoPagina> findByQuery(String query, boolean refresh);

    @Override
    List<TipoPagina> findByQuery(String query, EnumTipoQuery tipo);

    @Override
    List<TipoPagina> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    @Override
    List<TipoPagina> findByQuery(String query, EnumTipoQuery tipo, int max);

    @Override
    List<TipoPagina> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);

    void flush();

    void merge(TipoPagina tipoPagina);

    void persist(TipoPagina tipoPagina);

    void refresh(TipoPagina tipoPagina);

    void remove(TipoPagina tipoPagina);
}
