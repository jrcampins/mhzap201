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
import com.egt.base.persistence.facade.OpcionMenuFacadeBase;
import com.egt.ejb.persistence.entity.OpcionMenu;
import java.util.List;
import javax.ejb.Local;

@Local
public interface OpcionMenuFacadeLocal extends OpcionMenuFacadeBase {

    @Override
    OpcionMenu find(Object id);

    @Override
    OpcionMenu find(Object id, boolean refresh);

    @Override
    OpcionMenu findByCodigo(String codigo);

    @Override
    OpcionMenu findByCodigo(String codigo, boolean refresh);

    @Override
    List<OpcionMenu> findAll();

    @Override
    List<OpcionMenu> findAll(boolean refresh);

    @Override
    List<OpcionMenu> findByQuery(String query);

    @Override
    List<OpcionMenu> findByQuery(String query, boolean refresh);

    @Override
    List<OpcionMenu> findByQuery(String query, EnumTipoQuery tipo);

    @Override
    List<OpcionMenu> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    @Override
    List<OpcionMenu> findByQuery(String query, EnumTipoQuery tipo, int max);

    @Override
    List<OpcionMenu> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);

    void flush();

    void merge(OpcionMenu opcionMenu);

    void persist(OpcionMenu opcionMenu);

    void refresh(OpcionMenu opcionMenu);

    void remove(OpcionMenu opcionMenu);
}
