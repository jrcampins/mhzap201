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
import com.egt.base.persistence.facade.FiltroClaRecParFacadeBase;
import com.egt.ejb.persistence.entity.FiltroClaRecPar;
import java.util.List;
import javax.ejb.Local;

@Local
public interface FiltroClaRecParFacadeLocal extends FiltroClaRecParFacadeBase {

    @Override
    FiltroClaRecPar find(Object id);

    @Override
    FiltroClaRecPar find(Object id, boolean refresh);

    @Override
    List<FiltroClaRecPar> findAll();

    @Override
    List<FiltroClaRecPar> findAll(boolean refresh);

    @Override
    List<FiltroClaRecPar> findByQuery(String query);

    @Override
    List<FiltroClaRecPar> findByQuery(String query, boolean refresh);

    @Override
    List<FiltroClaRecPar> findByQuery(String query, EnumTipoQuery tipo);

    @Override
    List<FiltroClaRecPar> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    @Override
    List<FiltroClaRecPar> findByQuery(String query, EnumTipoQuery tipo, int max);

    @Override
    List<FiltroClaRecPar> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);

    void flush();

    void merge(FiltroClaRecPar filtroClaRecPar);

    void persist(FiltroClaRecPar filtroClaRecPar);

    void refresh(FiltroClaRecPar filtroClaRecPar);

    void remove(FiltroClaRecPar filtroClaRecPar);
}
