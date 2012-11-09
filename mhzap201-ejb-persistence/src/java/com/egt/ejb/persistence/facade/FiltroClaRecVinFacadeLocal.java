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
import com.egt.base.persistence.facade.FiltroClaRecVinFacadeBase;
import com.egt.ejb.persistence.entity.FiltroClaRecVin;
import java.util.List;
import javax.ejb.Local;

@Local
public interface FiltroClaRecVinFacadeLocal extends FiltroClaRecVinFacadeBase {

    @Override
    FiltroClaRecVin find(Object id);

    @Override
    FiltroClaRecVin find(Object id, boolean refresh);

    @Override
    List<FiltroClaRecVin> findAll();

    @Override
    List<FiltroClaRecVin> findAll(boolean refresh);

    @Override
    List<FiltroClaRecVin> findByQuery(String query);

    @Override
    List<FiltroClaRecVin> findByQuery(String query, boolean refresh);

    @Override
    List<FiltroClaRecVin> findByQuery(String query, EnumTipoQuery tipo);

    @Override
    List<FiltroClaRecVin> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    @Override
    List<FiltroClaRecVin> findByQuery(String query, EnumTipoQuery tipo, int max);

    @Override
    List<FiltroClaRecVin> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);

    void flush();

    void merge(FiltroClaRecVin filtroClaRecVin);

    void persist(FiltroClaRecVin filtroClaRecVin);

    void refresh(FiltroClaRecVin filtroClaRecVin);

    void remove(FiltroClaRecVin filtroClaRecVin);
}
