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
import com.egt.base.persistence.facade.RastroFuncionParFacadeBase;
import com.egt.ejb.persistence.entity.RastroFuncionPar;
import java.util.List;
import javax.ejb.Local;

@Local
public interface RastroFuncionParFacadeLocal extends RastroFuncionParFacadeBase {

    @Override
    RastroFuncionPar find(Object id);

    @Override
    RastroFuncionPar find(Object id, boolean refresh);

    @Override
    List<RastroFuncionPar> findAll();

    @Override
    List<RastroFuncionPar> findAll(boolean refresh);

    @Override
    List<RastroFuncionPar> findByQuery(String query);

    @Override
    List<RastroFuncionPar> findByQuery(String query, boolean refresh);

    @Override
    List<RastroFuncionPar> findByQuery(String query, EnumTipoQuery tipo);

    @Override
    List<RastroFuncionPar> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    @Override
    List<RastroFuncionPar> findByQuery(String query, EnumTipoQuery tipo, int max);

    @Override
    List<RastroFuncionPar> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);

    void flush();

    void merge(RastroFuncionPar rastroFuncionPar);

    void persist(RastroFuncionPar rastroFuncionPar);

    void refresh(RastroFuncionPar rastroFuncionPar);

    void remove(RastroFuncionPar rastroFuncionPar);
}
