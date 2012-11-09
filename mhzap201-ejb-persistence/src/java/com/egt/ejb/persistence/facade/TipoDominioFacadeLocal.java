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
import com.egt.base.persistence.facade.TipoDominioFacadeBase;
import com.egt.ejb.persistence.entity.TipoDominio;
import java.util.List;
import javax.ejb.Local;

@Local
public interface TipoDominioFacadeLocal extends TipoDominioFacadeBase {

    @Override
    TipoDominio find(Object id);

    @Override
    TipoDominio find(Object id, boolean refresh);

    @Override
    TipoDominio findByCodigo(String codigo);

    @Override
    TipoDominio findByCodigo(String codigo, boolean refresh);

    @Override
    List<TipoDominio> findAll();

    @Override
    List<TipoDominio> findAll(boolean refresh);

    @Override
    List<TipoDominio> findByQuery(String query);

    @Override
    List<TipoDominio> findByQuery(String query, boolean refresh);

    @Override
    List<TipoDominio> findByQuery(String query, EnumTipoQuery tipo);

    @Override
    List<TipoDominio> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    @Override
    List<TipoDominio> findByQuery(String query, EnumTipoQuery tipo, int max);

    @Override
    List<TipoDominio> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);

    void flush();

    void merge(TipoDominio tipoDominio);

    void persist(TipoDominio tipoDominio);

    void refresh(TipoDominio tipoDominio);

    void remove(TipoDominio tipoDominio);
}
