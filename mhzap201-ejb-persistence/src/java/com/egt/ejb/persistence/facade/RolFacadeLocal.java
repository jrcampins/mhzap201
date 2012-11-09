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
import com.egt.base.persistence.facade.RolFacadeBase;
import com.egt.ejb.persistence.entity.Rol;
import java.util.List;
import javax.ejb.Local;

@Local
public interface RolFacadeLocal extends RolFacadeBase {

    @Override
    Rol find(Object id);

    @Override
    Rol find(Object id, boolean refresh);

    @Override
    Rol findByCodigo(String codigo);

    @Override
    Rol findByCodigo(String codigo, boolean refresh);

    @Override
    List<Rol> findAll();

    @Override
    List<Rol> findAll(boolean refresh);

    @Override
    List<Rol> findByQuery(String query);

    @Override
    List<Rol> findByQuery(String query, boolean refresh);

    @Override
    List<Rol> findByQuery(String query, EnumTipoQuery tipo);

    @Override
    List<Rol> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    @Override
    List<Rol> findByQuery(String query, EnumTipoQuery tipo, int max);

    @Override
    List<Rol> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);

    void flush();

    void merge(Rol rol);

    void persist(Rol rol);

    void refresh(Rol rol);

    void remove(Rol rol);
}
