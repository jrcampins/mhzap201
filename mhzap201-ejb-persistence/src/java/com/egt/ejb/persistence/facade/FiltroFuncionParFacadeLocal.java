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
import com.egt.base.persistence.facade.FiltroFuncionParFacadeBase;
import com.egt.ejb.persistence.entity.FiltroFuncionPar;
import java.util.List;
import javax.ejb.Local;

@Local
public interface FiltroFuncionParFacadeLocal extends FiltroFuncionParFacadeBase {

    @Override
    FiltroFuncionPar find(Object id);

    @Override
    FiltroFuncionPar find(Object id, boolean refresh);

    @Override
    List<FiltroFuncionPar> findAll();

    @Override
    List<FiltroFuncionPar> findAll(boolean refresh);

    @Override
    List<FiltroFuncionPar> findByQuery(String query);

    @Override
    List<FiltroFuncionPar> findByQuery(String query, boolean refresh);

    @Override
    List<FiltroFuncionPar> findByQuery(String query, EnumTipoQuery tipo);

    @Override
    List<FiltroFuncionPar> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    @Override
    List<FiltroFuncionPar> findByQuery(String query, EnumTipoQuery tipo, int max);

    @Override
    List<FiltroFuncionPar> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);

    void flush();

    void merge(FiltroFuncionPar filtroFuncionPar);

    void persist(FiltroFuncionPar filtroFuncionPar);

    void refresh(FiltroFuncionPar filtroFuncionPar);

    void remove(FiltroFuncionPar filtroFuncionPar);
}
