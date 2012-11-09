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
import com.egt.base.persistence.facade.RolPaginaFacadeBase;
import com.egt.ejb.persistence.entity.RolPagina;
import java.util.List;
import javax.ejb.Local;

@Local
public interface RolPaginaFacadeLocal extends RolPaginaFacadeBase {

    @Override
    RolPagina find(Object id);

    @Override
    RolPagina find(Object id, boolean refresh);

    @Override
    List<RolPagina> findAll();

    @Override
    List<RolPagina> findAll(boolean refresh);

    @Override
    List<RolPagina> findByQuery(String query);

    @Override
    List<RolPagina> findByQuery(String query, boolean refresh);

    @Override
    List<RolPagina> findByQuery(String query, EnumTipoQuery tipo);

    @Override
    List<RolPagina> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    @Override
    List<RolPagina> findByQuery(String query, EnumTipoQuery tipo, int max);

    @Override
    List<RolPagina> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);

    void flush();

    void merge(RolPagina rolPagina);

    void persist(RolPagina rolPagina);

    void refresh(RolPagina rolPagina);

    void remove(RolPagina rolPagina);
}
