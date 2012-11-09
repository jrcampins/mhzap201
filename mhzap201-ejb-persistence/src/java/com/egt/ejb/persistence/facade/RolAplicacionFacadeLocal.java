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
import com.egt.base.persistence.facade.RolAplicacionFacadeBase;
import com.egt.ejb.persistence.entity.RolAplicacion;
import java.util.List;
import javax.ejb.Local;

@Local
public interface RolAplicacionFacadeLocal extends RolAplicacionFacadeBase {

    @Override
    RolAplicacion find(Object id);

    @Override
    RolAplicacion find(Object id, boolean refresh);

    @Override
    List<RolAplicacion> findAll();

    @Override
    List<RolAplicacion> findAll(boolean refresh);

    @Override
    List<RolAplicacion> findByQuery(String query);

    @Override
    List<RolAplicacion> findByQuery(String query, boolean refresh);

    @Override
    List<RolAplicacion> findByQuery(String query, EnumTipoQuery tipo);

    @Override
    List<RolAplicacion> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    @Override
    List<RolAplicacion> findByQuery(String query, EnumTipoQuery tipo, int max);

    @Override
    List<RolAplicacion> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);

    void flush();

    void merge(RolAplicacion rolAplicacion);

    void persist(RolAplicacion rolAplicacion);

    void refresh(RolAplicacion rolAplicacion);

    void remove(RolAplicacion rolAplicacion);
}
