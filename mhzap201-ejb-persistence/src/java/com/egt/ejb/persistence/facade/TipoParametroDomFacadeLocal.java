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
import com.egt.base.persistence.facade.TipoParametroDomFacadeBase;
import com.egt.ejb.persistence.entity.TipoParametroDom;
import java.util.List;
import javax.ejb.Local;

@Local
public interface TipoParametroDomFacadeLocal extends TipoParametroDomFacadeBase {

    @Override
    TipoParametroDom find(Object id);

    @Override
    TipoParametroDom find(Object id, boolean refresh);

    @Override
    TipoParametroDom findByCodigo(String codigo);

    @Override
    TipoParametroDom findByCodigo(String codigo, boolean refresh);

    @Override
    List<TipoParametroDom> findAll();

    @Override
    List<TipoParametroDom> findAll(boolean refresh);

    @Override
    List<TipoParametroDom> findByQuery(String query);

    @Override
    List<TipoParametroDom> findByQuery(String query, boolean refresh);

    @Override
    List<TipoParametroDom> findByQuery(String query, EnumTipoQuery tipo);

    @Override
    List<TipoParametroDom> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    @Override
    List<TipoParametroDom> findByQuery(String query, EnumTipoQuery tipo, int max);

    @Override
    List<TipoParametroDom> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);

    void flush();

    void merge(TipoParametroDom tipoParametroDom);

    void persist(TipoParametroDom tipoParametroDom);

    void refresh(TipoParametroDom tipoParametroDom);

    void remove(TipoParametroDom tipoParametroDom);
}
