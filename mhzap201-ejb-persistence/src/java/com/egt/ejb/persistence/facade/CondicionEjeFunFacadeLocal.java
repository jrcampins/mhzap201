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
import com.egt.base.persistence.facade.CondicionEjeFunFacadeBase;
import com.egt.ejb.persistence.entity.CondicionEjeFun;
import java.util.List;
import javax.ejb.Local;

@Local
public interface CondicionEjeFunFacadeLocal extends CondicionEjeFunFacadeBase {

    @Override
    CondicionEjeFun find(Object id);

    @Override
    CondicionEjeFun find(Object id, boolean refresh);

    @Override
    CondicionEjeFun findByCodigo(String codigo);

    @Override
    CondicionEjeFun findByCodigo(String codigo, boolean refresh);

    @Override
    List<CondicionEjeFun> findAll();

    @Override
    List<CondicionEjeFun> findAll(boolean refresh);

    @Override
    List<CondicionEjeFun> findByQuery(String query);

    @Override
    List<CondicionEjeFun> findByQuery(String query, boolean refresh);

    @Override
    List<CondicionEjeFun> findByQuery(String query, EnumTipoQuery tipo);

    @Override
    List<CondicionEjeFun> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    @Override
    List<CondicionEjeFun> findByQuery(String query, EnumTipoQuery tipo, int max);

    @Override
    List<CondicionEjeFun> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);

    void flush();

    void merge(CondicionEjeFun condicionEjeFun);

    void persist(CondicionEjeFun condicionEjeFun);

    void refresh(CondicionEjeFun condicionEjeFun);

    void remove(CondicionEjeFun condicionEjeFun);
}
