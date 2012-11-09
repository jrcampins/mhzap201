/*
 * Copyright (C) 2009, EGT Consultores, C.A.
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
import com.egt.base.persistence.facade.NivelUbicacionFacadeBase;
import com.egt.ejb.persistence.entity.NivelUbicacion;
import java.util.List;
import javax.ejb.Local;

@Local
public interface NivelUbicacionFacadeLocal extends NivelUbicacionFacadeBase {

    @Override
    NivelUbicacion find(Object id);

    @Override
    NivelUbicacion find(Object id, boolean refresh);

    @Override
    NivelUbicacion findByCodigo(String codigo);

    @Override
    NivelUbicacion findByCodigo(String codigo, boolean refresh);

    @Override
    List<NivelUbicacion> findAll();

    @Override
    List<NivelUbicacion> findAll(boolean refresh);

    @Override
    List<NivelUbicacion> findByQuery(String query);

    @Override
    List<NivelUbicacion> findByQuery(String query, boolean refresh);

    @Override
    List<NivelUbicacion> findByQuery(String query, EnumTipoQuery tipo);

    @Override
    List<NivelUbicacion> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    @Override
    List<NivelUbicacion> findByQuery(String query, EnumTipoQuery tipo, int max);

    @Override
    List<NivelUbicacion> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);

    void flush();

    void merge(NivelUbicacion nivelUbicacion);

    void persist(NivelUbicacion nivelUbicacion);

    void refresh(NivelUbicacion nivelUbicacion);

    void remove(NivelUbicacion nivelUbicacion);
}
