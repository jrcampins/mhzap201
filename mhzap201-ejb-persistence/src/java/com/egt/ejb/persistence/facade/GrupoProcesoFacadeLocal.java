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
import com.egt.base.persistence.facade.GrupoProcesoFacadeBase;
import com.egt.ejb.persistence.entity.GrupoProceso;
import java.util.List;
import javax.ejb.Local;

@Local
public interface GrupoProcesoFacadeLocal extends GrupoProcesoFacadeBase {

    @Override
    GrupoProceso find(Object id);

    @Override
    GrupoProceso find(Object id, boolean refresh);

    @Override
    GrupoProceso findByCodigo(String codigo);

    @Override
    GrupoProceso findByCodigo(String codigo, boolean refresh);

    @Override
    List<GrupoProceso> findAll();

    @Override
    List<GrupoProceso> findAll(boolean refresh);

    @Override
    List<GrupoProceso> findByQuery(String query);

    @Override
    List<GrupoProceso> findByQuery(String query, boolean refresh);

    @Override
    List<GrupoProceso> findByQuery(String query, EnumTipoQuery tipo);

    @Override
    List<GrupoProceso> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    @Override
    List<GrupoProceso> findByQuery(String query, EnumTipoQuery tipo, int max);

    @Override
    List<GrupoProceso> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);

    void flush();

    void merge(GrupoProceso grupoProceso);

    void persist(GrupoProceso grupoProceso);

    void refresh(GrupoProceso grupoProceso);

    void remove(GrupoProceso grupoProceso);
}
