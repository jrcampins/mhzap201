/*
 * Copyright (C) 2009, EGT Consultores, C.A.
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
import com.egt.base.persistence.facade.ProcesoFacadeBase;
import com.egt.ejb.persistence.entity.Proceso;
import java.util.List;
import javax.ejb.Local;

@Local
public interface ProcesoFacadeLocal extends ProcesoFacadeBase {

    @Override
    Proceso find(Object id);

    @Override
    Proceso find(Object id, boolean refresh);

    @Override
    Proceso findByCodigo(String codigo);

    @Override
    Proceso findByCodigo(String codigo, boolean refresh);

    @Override
    List<Proceso> findAll();

    @Override
    List<Proceso> findAll(boolean refresh);

    @Override
    List<Proceso> findByQuery(String query);

    @Override
    List<Proceso> findByQuery(String query, boolean refresh);

    @Override
    List<Proceso> findByQuery(String query, EnumTipoQuery tipo);

    @Override
    List<Proceso> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    @Override
    List<Proceso> findByQuery(String query, EnumTipoQuery tipo, int max);

    @Override
    List<Proceso> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);

    void flush();

    void merge(Proceso proceso);

    void persist(Proceso proceso);

    void refresh(Proceso proceso);

    void remove(Proceso proceso);
}
