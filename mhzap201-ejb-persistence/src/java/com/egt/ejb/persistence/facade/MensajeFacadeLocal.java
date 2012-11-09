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
import com.egt.base.persistence.facade.MensajeFacadeBase;
import com.egt.ejb.persistence.entity.Mensaje;
import java.util.List;
import javax.ejb.Local;

@Local
public interface MensajeFacadeLocal extends MensajeFacadeBase {

    @Override
    Mensaje find(Object id);

    @Override
    Mensaje find(Object id, boolean refresh);

    @Override
    Mensaje findByCodigo(String codigo);

    @Override
    Mensaje findByCodigo(String codigo, boolean refresh);

    @Override
    List<Mensaje> findAll();

    @Override
    List<Mensaje> findAll(boolean refresh);

    @Override
    List<Mensaje> findByQuery(String query);

    @Override
    List<Mensaje> findByQuery(String query, boolean refresh);

    @Override
    List<Mensaje> findByQuery(String query, EnumTipoQuery tipo);

    @Override
    List<Mensaje> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    @Override
    List<Mensaje> findByQuery(String query, EnumTipoQuery tipo, int max);

    @Override
    List<Mensaje> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);

    void flush();

    void merge(Mensaje mensaje);

    void persist(Mensaje mensaje);

    void refresh(Mensaje mensaje);

    void remove(Mensaje mensaje);
}
