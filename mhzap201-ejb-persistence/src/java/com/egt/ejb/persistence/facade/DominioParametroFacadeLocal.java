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
import com.egt.base.persistence.facade.DominioParametroFacadeBase;
import com.egt.ejb.persistence.entity.DominioParametro;
import java.util.List;
import javax.ejb.Local;

@Local
public interface DominioParametroFacadeLocal extends DominioParametroFacadeBase {

    @Override
    DominioParametro find(Object id);

    @Override
    DominioParametro find(Object id, boolean refresh);

    @Override
    List<DominioParametro> findAll();

    @Override
    List<DominioParametro> findAll(boolean refresh);

    @Override
    List<DominioParametro> findByQuery(String query);

    @Override
    List<DominioParametro> findByQuery(String query, boolean refresh);

    @Override
    List<DominioParametro> findByQuery(String query, EnumTipoQuery tipo);

    @Override
    List<DominioParametro> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    @Override
    List<DominioParametro> findByQuery(String query, EnumTipoQuery tipo, int max);

    @Override
    List<DominioParametro> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);

    void flush();

    void merge(DominioParametro dominioParametro);

    void persist(DominioParametro dominioParametro);

    void refresh(DominioParametro dominioParametro);

    void remove(DominioParametro dominioParametro);
}
