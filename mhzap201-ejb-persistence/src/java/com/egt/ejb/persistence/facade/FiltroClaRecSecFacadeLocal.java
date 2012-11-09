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
import com.egt.base.persistence.facade.FiltroClaRecSecFacadeBase;
import com.egt.ejb.persistence.entity.FiltroClaRecSec;
import java.util.List;
import javax.ejb.Local;

@Local
public interface FiltroClaRecSecFacadeLocal extends FiltroClaRecSecFacadeBase {

    @Override
    FiltroClaRecSec find(Object id);

    @Override
    FiltroClaRecSec find(Object id, boolean refresh);

    @Override
    List<FiltroClaRecSec> findAll();

    @Override
    List<FiltroClaRecSec> findAll(boolean refresh);

    @Override
    List<FiltroClaRecSec> findByQuery(String query);

    @Override
    List<FiltroClaRecSec> findByQuery(String query, boolean refresh);

    @Override
    List<FiltroClaRecSec> findByQuery(String query, EnumTipoQuery tipo);

    @Override
    List<FiltroClaRecSec> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    @Override
    List<FiltroClaRecSec> findByQuery(String query, EnumTipoQuery tipo, int max);

    @Override
    List<FiltroClaRecSec> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);

    void flush();

    void merge(FiltroClaRecSec filtroClaRecSec);

    void persist(FiltroClaRecSec filtroClaRecSec);

    void refresh(FiltroClaRecSec filtroClaRecSec);

    void remove(FiltroClaRecSec filtroClaRecSec);
}
