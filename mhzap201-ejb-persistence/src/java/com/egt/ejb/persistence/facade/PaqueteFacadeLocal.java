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
import com.egt.base.persistence.facade.PaqueteFacadeBase;
import com.egt.ejb.persistence.entity.Paquete;
import java.util.List;
import javax.ejb.Local;

@Local
public interface PaqueteFacadeLocal extends PaqueteFacadeBase {

    @Override
    Paquete find(Object id);

    @Override
    Paquete find(Object id, boolean refresh);

    @Override
    Paquete findByCodigo(String codigo);

    @Override
    Paquete findByCodigo(String codigo, boolean refresh);

    @Override
    List<Paquete> findAll();

    @Override
    List<Paquete> findAll(boolean refresh);

    @Override
    List<Paquete> findByQuery(String query);

    @Override
    List<Paquete> findByQuery(String query, boolean refresh);

    @Override
    List<Paquete> findByQuery(String query, EnumTipoQuery tipo);

    @Override
    List<Paquete> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    @Override
    List<Paquete> findByQuery(String query, EnumTipoQuery tipo, int max);

    @Override
    List<Paquete> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);

    void flush();

    void merge(Paquete paquete);

    void persist(Paquete paquete);

    void refresh(Paquete paquete);

    void remove(Paquete paquete);
}
