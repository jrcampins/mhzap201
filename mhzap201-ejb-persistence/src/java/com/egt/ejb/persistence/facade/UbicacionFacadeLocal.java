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
import com.egt.base.persistence.facade.UbicacionFacadeBase;
import com.egt.ejb.persistence.entity.Ubicacion;
import java.util.List;
import javax.ejb.Local;

@Local
public interface UbicacionFacadeLocal extends UbicacionFacadeBase {

    @Override
    Ubicacion find(Object id);

    @Override
    Ubicacion find(Object id, boolean refresh);

    @Override
    Ubicacion findByCodigo(String codigo);

    @Override
    Ubicacion findByCodigo(String codigo, boolean refresh);

    @Override
    List<Ubicacion> findAll();

    @Override
    List<Ubicacion> findAll(boolean refresh);

    @Override
    List<Ubicacion> findByQuery(String query);

    @Override
    List<Ubicacion> findByQuery(String query, boolean refresh);

    @Override
    List<Ubicacion> findByQuery(String query, EnumTipoQuery tipo);

    @Override
    List<Ubicacion> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    @Override
    List<Ubicacion> findByQuery(String query, EnumTipoQuery tipo, int max);

    @Override
    List<Ubicacion> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);

    void flush();

    void merge(Ubicacion ubicacion);

    void persist(Ubicacion ubicacion);

    void refresh(Ubicacion ubicacion);

    void remove(Ubicacion ubicacion);
}
