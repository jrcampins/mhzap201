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
import com.egt.base.persistence.facade.PaginaFuncionFacadeBase;
import com.egt.ejb.persistence.entity.PaginaFuncion;
import java.util.List;
import javax.ejb.Local;

@Local
public interface PaginaFuncionFacadeLocal extends PaginaFuncionFacadeBase {

    @Override
    PaginaFuncion find(Object id);

    @Override
    PaginaFuncion find(Object id, boolean refresh);

    @Override
    List<PaginaFuncion> findAll();

    @Override
    List<PaginaFuncion> findAll(boolean refresh);

    @Override
    List<PaginaFuncion> findByQuery(String query);

    @Override
    List<PaginaFuncion> findByQuery(String query, boolean refresh);

    @Override
    List<PaginaFuncion> findByQuery(String query, EnumTipoQuery tipo);

    @Override
    List<PaginaFuncion> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    @Override
    List<PaginaFuncion> findByQuery(String query, EnumTipoQuery tipo, int max);

    @Override
    List<PaginaFuncion> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);

    void flush();

    void merge(PaginaFuncion paginaFuncion);

    void persist(PaginaFuncion paginaFuncion);

    void refresh(PaginaFuncion paginaFuncion);

    void remove(PaginaFuncion paginaFuncion);
}
