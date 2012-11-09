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
import com.egt.base.persistence.facade.FuncionFacadeBase;
import com.egt.ejb.persistence.entity.Funcion;
import java.util.List;
import javax.ejb.Local;

@Local
public interface FuncionFacadeLocal extends FuncionFacadeBase {

    @Override
    Funcion find(Object id);

    @Override
    Funcion find(Object id, boolean refresh);

    @Override
    Funcion findByCodigo(String codigo);

    @Override
    Funcion findByCodigo(String codigo, boolean refresh);

    @Override
    List<Funcion> findAll();

    @Override
    List<Funcion> findAll(boolean refresh);

    @Override
    List<Funcion> findByQuery(String query);

    @Override
    List<Funcion> findByQuery(String query, boolean refresh);

    @Override
    List<Funcion> findByQuery(String query, EnumTipoQuery tipo);

    @Override
    List<Funcion> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    @Override
    List<Funcion> findByQuery(String query, EnumTipoQuery tipo, int max);

    @Override
    List<Funcion> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);

    void flush();

    void merge(Funcion funcion);

    void persist(Funcion funcion);

    void refresh(Funcion funcion);

    void remove(Funcion funcion);
}
