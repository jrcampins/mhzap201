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
import com.egt.base.persistence.facade.RolFiltroFuncionFacadeBase;
import com.egt.ejb.persistence.entity.RolFiltroFuncion;
import java.util.List;
import javax.ejb.Local;

@Local
public interface RolFiltroFuncionFacadeLocal extends RolFiltroFuncionFacadeBase {

    @Override
    RolFiltroFuncion find(Object id);

    @Override
    RolFiltroFuncion find(Object id, boolean refresh);

    @Override
    List<RolFiltroFuncion> findAll();

    @Override
    List<RolFiltroFuncion> findAll(boolean refresh);

    @Override
    List<RolFiltroFuncion> findByQuery(String query);

    @Override
    List<RolFiltroFuncion> findByQuery(String query, boolean refresh);

    @Override
    List<RolFiltroFuncion> findByQuery(String query, EnumTipoQuery tipo);

    @Override
    List<RolFiltroFuncion> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    @Override
    List<RolFiltroFuncion> findByQuery(String query, EnumTipoQuery tipo, int max);

    @Override
    List<RolFiltroFuncion> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);

    void flush();

    void merge(RolFiltroFuncion rolFiltroFuncion);

    void persist(RolFiltroFuncion rolFiltroFuncion);

    void refresh(RolFiltroFuncion rolFiltroFuncion);

    void remove(RolFiltroFuncion rolFiltroFuncion);
}
