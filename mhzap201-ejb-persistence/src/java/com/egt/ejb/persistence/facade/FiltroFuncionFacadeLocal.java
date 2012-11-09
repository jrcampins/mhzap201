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
import com.egt.base.persistence.facade.FiltroFuncionFacadeBase;
import com.egt.ejb.persistence.entity.FiltroFuncion;
import java.util.List;
import javax.ejb.Local;

@Local
public interface FiltroFuncionFacadeLocal extends FiltroFuncionFacadeBase {

    @Override
    FiltroFuncion find(Object id);

    @Override
    FiltroFuncion find(Object id, boolean refresh);

    @Override
    FiltroFuncion findByCodigo(String codigo);

    @Override
    FiltroFuncion findByCodigo(String codigo, boolean refresh);

    @Override
    List<FiltroFuncion> findAll();

    @Override
    List<FiltroFuncion> findAll(boolean refresh);

    @Override
    List<FiltroFuncion> findByQuery(String query);

    @Override
    List<FiltroFuncion> findByQuery(String query, boolean refresh);

    @Override
    List<FiltroFuncion> findByQuery(String query, EnumTipoQuery tipo);

    @Override
    List<FiltroFuncion> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    @Override
    List<FiltroFuncion> findByQuery(String query, EnumTipoQuery tipo, int max);

    @Override
    List<FiltroFuncion> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);

    void flush();

    void merge(FiltroFuncion filtroFuncion);

    void persist(FiltroFuncion filtroFuncion);

    void refresh(FiltroFuncion filtroFuncion);

    void remove(FiltroFuncion filtroFuncion);
}
