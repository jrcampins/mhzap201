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
import com.egt.base.persistence.facade.RastroProcesoFacadeBase;
import com.egt.ejb.persistence.entity.RastroProceso;
import java.util.List;
import javax.ejb.Local;

@Local
public interface RastroProcesoFacadeLocal extends RastroProcesoFacadeBase {

    @Override
    RastroProceso find(Object id);

    @Override
    RastroProceso find(Object id, boolean refresh);

    @Override
    List<RastroProceso> findAll();

    @Override
    List<RastroProceso> findAll(boolean refresh);

    @Override
    List<RastroProceso> findByQuery(String query);

    @Override
    List<RastroProceso> findByQuery(String query, boolean refresh);

    @Override
    List<RastroProceso> findByQuery(String query, EnumTipoQuery tipo);

    @Override
    List<RastroProceso> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    @Override
    List<RastroProceso> findByQuery(String query, EnumTipoQuery tipo, int max);

    @Override
    List<RastroProceso> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);

    void flush();

    void merge(RastroProceso rastroProceso);

    void persist(RastroProceso rastroProceso);

    void refresh(RastroProceso rastroProceso);

    void remove(RastroProceso rastroProceso);
}
