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
import com.egt.base.persistence.facade.TipoRolFacadeBase;
import com.egt.ejb.persistence.entity.TipoRol;
import java.util.List;
import javax.ejb.Local;

@Local
public interface TipoRolFacadeLocal extends TipoRolFacadeBase {

    @Override
    TipoRol find(Object id);

    @Override
    TipoRol find(Object id, boolean refresh);

    @Override
    TipoRol findByCodigo(String codigo);

    @Override
    TipoRol findByCodigo(String codigo, boolean refresh);

    @Override
    List<TipoRol> findAll();

    @Override
    List<TipoRol> findAll(boolean refresh);

    @Override
    List<TipoRol> findByQuery(String query);

    @Override
    List<TipoRol> findByQuery(String query, boolean refresh);

    @Override
    List<TipoRol> findByQuery(String query, EnumTipoQuery tipo);

    @Override
    List<TipoRol> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    @Override
    List<TipoRol> findByQuery(String query, EnumTipoQuery tipo, int max);

    @Override
    List<TipoRol> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);

    void flush();

    void merge(TipoRol tipoRol);

    void persist(TipoRol tipoRol);

    void refresh(TipoRol tipoRol);

    void remove(TipoRol tipoRol);
}
