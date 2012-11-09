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
import com.egt.base.persistence.facade.TipoFuncionFacadeBase;
import com.egt.ejb.persistence.entity.TipoFuncion;
import java.util.List;
import javax.ejb.Local;

@Local
public interface TipoFuncionFacadeLocal extends TipoFuncionFacadeBase {

    @Override
    TipoFuncion find(Object id);

    @Override
    TipoFuncion find(Object id, boolean refresh);

    @Override
    TipoFuncion findByCodigo(String codigo);

    @Override
    TipoFuncion findByCodigo(String codigo, boolean refresh);

    @Override
    List<TipoFuncion> findAll();

    @Override
    List<TipoFuncion> findAll(boolean refresh);

    @Override
    List<TipoFuncion> findByQuery(String query);

    @Override
    List<TipoFuncion> findByQuery(String query, boolean refresh);

    @Override
    List<TipoFuncion> findByQuery(String query, EnumTipoQuery tipo);

    @Override
    List<TipoFuncion> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    @Override
    List<TipoFuncion> findByQuery(String query, EnumTipoQuery tipo, int max);

    @Override
    List<TipoFuncion> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);

    void flush();

    void merge(TipoFuncion tipoFuncion);

    void persist(TipoFuncion tipoFuncion);

    void refresh(TipoFuncion tipoFuncion);

    void remove(TipoFuncion tipoFuncion);
}
