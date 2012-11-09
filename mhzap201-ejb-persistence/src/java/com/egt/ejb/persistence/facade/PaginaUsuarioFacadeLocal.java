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
import com.egt.base.persistence.facade.PaginaUsuarioFacadeBase;
import com.egt.ejb.persistence.entity.PaginaUsuario;
import java.util.List;
import javax.ejb.Local;

@Local
public interface PaginaUsuarioFacadeLocal extends PaginaUsuarioFacadeBase {

    @Override
    PaginaUsuario find(Object id);

    @Override
    PaginaUsuario find(Object id, boolean refresh);

    @Override
    List<PaginaUsuario> findAll();

    @Override
    List<PaginaUsuario> findAll(boolean refresh);

    @Override
    List<PaginaUsuario> findByQuery(String query);

    @Override
    List<PaginaUsuario> findByQuery(String query, boolean refresh);

    @Override
    List<PaginaUsuario> findByQuery(String query, EnumTipoQuery tipo);

    @Override
    List<PaginaUsuario> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    @Override
    List<PaginaUsuario> findByQuery(String query, EnumTipoQuery tipo, int max);

    @Override
    List<PaginaUsuario> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);

    void flush();

    void merge(PaginaUsuario paginaUsuario);

    void persist(PaginaUsuario paginaUsuario);

    void refresh(PaginaUsuario paginaUsuario);

    void remove(PaginaUsuario paginaUsuario);
}
