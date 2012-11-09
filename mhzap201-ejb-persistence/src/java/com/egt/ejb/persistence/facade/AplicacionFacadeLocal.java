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
import com.egt.base.persistence.facade.AplicacionFacadeBase;
import com.egt.ejb.persistence.entity.Aplicacion;
import java.util.List;
import javax.ejb.Local;

@Local
public interface AplicacionFacadeLocal extends AplicacionFacadeBase {

    @Override
    Aplicacion find(Object id);

    @Override
    Aplicacion find(Object id, boolean refresh);

    @Override
    Aplicacion findByCodigo(String codigo);

    @Override
    Aplicacion findByCodigo(String codigo, boolean refresh);

    @Override
    List<Aplicacion> findAll();

    @Override
    List<Aplicacion> findAll(boolean refresh);

    @Override
    List<Aplicacion> findByQuery(String query);

    @Override
    List<Aplicacion> findByQuery(String query, boolean refresh);

    @Override
    List<Aplicacion> findByQuery(String query, EnumTipoQuery tipo);

    @Override
    List<Aplicacion> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    @Override
    List<Aplicacion> findByQuery(String query, EnumTipoQuery tipo, int max);

    @Override
    List<Aplicacion> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);

    void flush();

    void merge(Aplicacion aplicacion);

    void persist(Aplicacion aplicacion);

    void refresh(Aplicacion aplicacion);

    void remove(Aplicacion aplicacion);
}
