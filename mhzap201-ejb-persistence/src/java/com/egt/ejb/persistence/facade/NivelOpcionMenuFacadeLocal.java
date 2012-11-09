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
import com.egt.base.persistence.facade.NivelOpcionMenuFacadeBase;
import com.egt.ejb.persistence.entity.NivelOpcionMenu;
import java.util.List;
import javax.ejb.Local;

@Local
public interface NivelOpcionMenuFacadeLocal extends NivelOpcionMenuFacadeBase {

    @Override
    NivelOpcionMenu find(Object id);

    @Override
    NivelOpcionMenu find(Object id, boolean refresh);

    @Override
    NivelOpcionMenu findByCodigo(String codigo);

    @Override
    NivelOpcionMenu findByCodigo(String codigo, boolean refresh);

    @Override
    List<NivelOpcionMenu> findAll();

    @Override
    List<NivelOpcionMenu> findAll(boolean refresh);

    @Override
    List<NivelOpcionMenu> findByQuery(String query);

    @Override
    List<NivelOpcionMenu> findByQuery(String query, boolean refresh);

    @Override
    List<NivelOpcionMenu> findByQuery(String query, EnumTipoQuery tipo);

    @Override
    List<NivelOpcionMenu> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    @Override
    List<NivelOpcionMenu> findByQuery(String query, EnumTipoQuery tipo, int max);

    @Override
    List<NivelOpcionMenu> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);

    void flush();

    void merge(NivelOpcionMenu nivelOpcionMenu);

    void persist(NivelOpcionMenu nivelOpcionMenu);

    void refresh(NivelOpcionMenu nivelOpcionMenu);

    void remove(NivelOpcionMenu nivelOpcionMenu);
}
