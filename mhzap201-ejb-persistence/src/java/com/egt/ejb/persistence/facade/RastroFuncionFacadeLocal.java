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
import com.egt.base.persistence.facade.RastroFuncionFacadeBase;
import com.egt.ejb.persistence.entity.RastroFuncion;
import java.util.List;
import javax.ejb.Local;

@Local
public interface RastroFuncionFacadeLocal extends RastroFuncionFacadeBase {

    @Override
    RastroFuncion find(Object id);

    @Override
    RastroFuncion find(Object id, boolean refresh);

    @Override
    List<RastroFuncion> findAll();

    @Override
    List<RastroFuncion> findAll(boolean refresh);

    @Override
    List<RastroFuncion> findByQuery(String query);

    @Override
    List<RastroFuncion> findByQuery(String query, boolean refresh);

    @Override
    List<RastroFuncion> findByQuery(String query, EnumTipoQuery tipo);

    @Override
    List<RastroFuncion> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    @Override
    List<RastroFuncion> findByQuery(String query, EnumTipoQuery tipo, int max);

    @Override
    List<RastroFuncion> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);

    void flush();

    void merge(RastroFuncion rastroFuncion);

    void persist(RastroFuncion rastroFuncion);

    void refresh(RastroFuncion rastroFuncion);

    void remove(RastroFuncion rastroFuncion);
}
