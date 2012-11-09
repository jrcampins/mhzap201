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
import com.egt.base.persistence.facade.UsuarioFacadeBase;
import com.egt.ejb.persistence.entity.Usuario;
import java.util.List;
import javax.ejb.Local;

@Local
public interface UsuarioFacadeLocal extends UsuarioFacadeBase {

    @Override
    Usuario find(Object id);

    @Override
    Usuario find(Object id, boolean refresh);

    @Override
    Usuario findByCodigo(String codigo);

    @Override
    Usuario findByCodigo(String codigo, boolean refresh);

    @Override
    List<Usuario> findAll();

    @Override
    List<Usuario> findAll(boolean refresh);

    @Override
    List<Usuario> findByQuery(String query);

    @Override
    List<Usuario> findByQuery(String query, boolean refresh);

    @Override
    List<Usuario> findByQuery(String query, EnumTipoQuery tipo);

    @Override
    List<Usuario> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    @Override
    List<Usuario> findByQuery(String query, EnumTipoQuery tipo, int max);

    @Override
    List<Usuario> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);

    void flush();

    void merge(Usuario usuario);

    void persist(Usuario usuario);

    void refresh(Usuario usuario);

    void remove(Usuario usuario);
}
