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
import com.egt.base.persistence.facade.FiltroClaRecFunFacadeBase;
import com.egt.ejb.persistence.entity.FiltroClaRecFun;
import java.util.List;
import javax.ejb.Local;

@Local
public interface FiltroClaRecFunFacadeLocal extends FiltroClaRecFunFacadeBase {

    @Override
    FiltroClaRecFun find(Object id);

    @Override
    FiltroClaRecFun find(Object id, boolean refresh);

    @Override
    List<FiltroClaRecFun> findAll();

    @Override
    List<FiltroClaRecFun> findAll(boolean refresh);

    @Override
    List<FiltroClaRecFun> findByQuery(String query);

    @Override
    List<FiltroClaRecFun> findByQuery(String query, boolean refresh);

    @Override
    List<FiltroClaRecFun> findByQuery(String query, EnumTipoQuery tipo);

    @Override
    List<FiltroClaRecFun> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    @Override
    List<FiltroClaRecFun> findByQuery(String query, EnumTipoQuery tipo, int max);

    @Override
    List<FiltroClaRecFun> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);

    void flush();

    void merge(FiltroClaRecFun filtroClaRecFun);

    void persist(FiltroClaRecFun filtroClaRecFun);

    void refresh(FiltroClaRecFun filtroClaRecFun);

    void remove(FiltroClaRecFun filtroClaRecFun);
}
