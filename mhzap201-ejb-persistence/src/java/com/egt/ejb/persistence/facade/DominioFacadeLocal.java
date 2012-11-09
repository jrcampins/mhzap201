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
import com.egt.base.persistence.facade.DominioFacadeBase;
import com.egt.ejb.persistence.entity.Dominio;
import java.util.List;
import javax.ejb.Local;

@Local
public interface DominioFacadeLocal extends DominioFacadeBase {

    @Override
    Dominio find(Object id);

    @Override
    Dominio find(Object id, boolean refresh);

    @Override
    Dominio findByCodigo(String codigo);

    @Override
    Dominio findByCodigo(String codigo, boolean refresh);

    @Override
    List<Dominio> findAll();

    @Override
    List<Dominio> findAll(boolean refresh);

    @Override
    List<Dominio> findByQuery(String query);

    @Override
    List<Dominio> findByQuery(String query, boolean refresh);

    @Override
    List<Dominio> findByQuery(String query, EnumTipoQuery tipo);

    @Override
    List<Dominio> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    @Override
    List<Dominio> findByQuery(String query, EnumTipoQuery tipo, int max);

    @Override
    List<Dominio> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);

    void flush();

    void merge(Dominio dominio);

    void persist(Dominio dominio);

    void refresh(Dominio dominio);

    void remove(Dominio dominio);
}
