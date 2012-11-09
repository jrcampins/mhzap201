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
import com.egt.base.persistence.facade.GrupoAplicacionFacadeBase;
import com.egt.ejb.persistence.entity.GrupoAplicacion;
import java.util.List;
import javax.ejb.Local;

@Local
public interface GrupoAplicacionFacadeLocal extends GrupoAplicacionFacadeBase {

    @Override
    GrupoAplicacion find(Object id);

    @Override
    GrupoAplicacion find(Object id, boolean refresh);

    @Override
    GrupoAplicacion findByCodigo(String codigo);

    @Override
    GrupoAplicacion findByCodigo(String codigo, boolean refresh);

    @Override
    List<GrupoAplicacion> findAll();

    @Override
    List<GrupoAplicacion> findAll(boolean refresh);

    @Override
    List<GrupoAplicacion> findByQuery(String query);

    @Override
    List<GrupoAplicacion> findByQuery(String query, boolean refresh);

    @Override
    List<GrupoAplicacion> findByQuery(String query, EnumTipoQuery tipo);

    @Override
    List<GrupoAplicacion> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    @Override
    List<GrupoAplicacion> findByQuery(String query, EnumTipoQuery tipo, int max);

    @Override
    List<GrupoAplicacion> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);

    void flush();

    void merge(GrupoAplicacion grupoAplicacion);

    void persist(GrupoAplicacion grupoAplicacion);

    void refresh(GrupoAplicacion grupoAplicacion);

    void remove(GrupoAplicacion grupoAplicacion);
}
