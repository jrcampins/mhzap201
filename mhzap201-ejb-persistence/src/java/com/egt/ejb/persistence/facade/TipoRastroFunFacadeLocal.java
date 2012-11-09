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
import com.egt.base.persistence.facade.TipoRastroFunFacadeBase;
import com.egt.ejb.persistence.entity.TipoRastroFun;
import java.util.List;
import javax.ejb.Local;

@Local
public interface TipoRastroFunFacadeLocal extends TipoRastroFunFacadeBase {

    @Override
    TipoRastroFun find(Object id);

    @Override
    TipoRastroFun find(Object id, boolean refresh);

    @Override
    TipoRastroFun findByCodigo(String codigo);

    @Override
    TipoRastroFun findByCodigo(String codigo, boolean refresh);

    @Override
    List<TipoRastroFun> findAll();

    @Override
    List<TipoRastroFun> findAll(boolean refresh);

    @Override
    List<TipoRastroFun> findByQuery(String query);

    @Override
    List<TipoRastroFun> findByQuery(String query, boolean refresh);

    @Override
    List<TipoRastroFun> findByQuery(String query, EnumTipoQuery tipo);

    @Override
    List<TipoRastroFun> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    @Override
    List<TipoRastroFun> findByQuery(String query, EnumTipoQuery tipo, int max);

    @Override
    List<TipoRastroFun> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);

    void flush();

    void merge(TipoRastroFun tipoRastroFun);

    void persist(TipoRastroFun tipoRastroFun);

    void refresh(TipoRastroFun tipoRastroFun);

    void remove(TipoRastroFun tipoRastroFun);
}
