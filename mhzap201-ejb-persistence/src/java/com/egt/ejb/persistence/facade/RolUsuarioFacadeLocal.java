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
import com.egt.base.persistence.facade.RolUsuarioFacadeBase;
import com.egt.ejb.persistence.entity.RolUsuario;
import java.util.List;
import javax.ejb.Local;

@Local
public interface RolUsuarioFacadeLocal extends RolUsuarioFacadeBase {

    @Override
    RolUsuario find(Object id);

    @Override
    RolUsuario find(Object id, boolean refresh);

    @Override
    List<RolUsuario> findAll();

    @Override
    List<RolUsuario> findAll(boolean refresh);

    @Override
    List<RolUsuario> findByQuery(String query);

    @Override
    List<RolUsuario> findByQuery(String query, boolean refresh);

    @Override
    List<RolUsuario> findByQuery(String query, EnumTipoQuery tipo);

    @Override
    List<RolUsuario> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    @Override
    List<RolUsuario> findByQuery(String query, EnumTipoQuery tipo, int max);

    @Override
    List<RolUsuario> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);

    void flush();

    void merge(RolUsuario rolUsuario);

    void persist(RolUsuario rolUsuario);

    void refresh(RolUsuario rolUsuario);

    void remove(RolUsuario rolUsuario);
}
