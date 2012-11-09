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
import com.egt.base.persistence.facade.OpcionSistemaFacadeBase;
import com.egt.ejb.persistence.entity.OpcionSistema;
import java.util.List;
import javax.ejb.Local;

@Local
public interface OpcionSistemaFacadeLocal extends OpcionSistemaFacadeBase {

    @Override
    OpcionSistema find(Object id);

    @Override
    OpcionSistema find(Object id, boolean refresh);

    @Override
    List<OpcionSistema> findAll();

    @Override
    List<OpcionSistema> findAll(boolean refresh);

    @Override
    List<OpcionSistema> findByQuery(String query);

    @Override
    List<OpcionSistema> findByQuery(String query, boolean refresh);

    @Override
    List<OpcionSistema> findByQuery(String query, EnumTipoQuery tipo);

    @Override
    List<OpcionSistema> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    @Override
    List<OpcionSistema> findByQuery(String query, EnumTipoQuery tipo, int max);

    @Override
    List<OpcionSistema> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);

    void flush();

    void merge(OpcionSistema opcionSistema);

    void persist(OpcionSistema opcionSistema);

    void refresh(OpcionSistema opcionSistema);

    void remove(OpcionSistema opcionSistema);
}
