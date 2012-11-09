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
import com.egt.base.persistence.facade.RolFuncionFacadeBase;
import com.egt.ejb.persistence.entity.RolFuncion;
import java.util.List;
import javax.ejb.Local;

@Local
public interface RolFuncionFacadeLocal extends RolFuncionFacadeBase {

    @Override
    RolFuncion find(Object id);

    @Override
    RolFuncion find(Object id, boolean refresh);

    @Override
    List<RolFuncion> findAll();

    @Override
    List<RolFuncion> findAll(boolean refresh);

    @Override
    List<RolFuncion> findByQuery(String query);

    @Override
    List<RolFuncion> findByQuery(String query, boolean refresh);

    @Override
    List<RolFuncion> findByQuery(String query, EnumTipoQuery tipo);

    @Override
    List<RolFuncion> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    @Override
    List<RolFuncion> findByQuery(String query, EnumTipoQuery tipo, int max);

    @Override
    List<RolFuncion> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);

    void flush();

    void merge(RolFuncion rolFuncion);

    void persist(RolFuncion rolFuncion);

    void refresh(RolFuncion rolFuncion);

    void remove(RolFuncion rolFuncion);
}
