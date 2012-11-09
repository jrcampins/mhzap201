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
import com.egt.base.persistence.facade.FuncionParametroFacadeBase;
import com.egt.ejb.persistence.entity.FuncionParametro;
import java.util.List;
import javax.ejb.Local;

@Local
public interface FuncionParametroFacadeLocal extends FuncionParametroFacadeBase {

    @Override
    FuncionParametro find(Object id);

    @Override
    FuncionParametro find(Object id, boolean refresh);

    @Override
    List<FuncionParametro> findAll();

    @Override
    List<FuncionParametro> findAll(boolean refresh);

    @Override
    List<FuncionParametro> findByQuery(String query);

    @Override
    List<FuncionParametro> findByQuery(String query, boolean refresh);

    @Override
    List<FuncionParametro> findByQuery(String query, EnumTipoQuery tipo);

    @Override
    List<FuncionParametro> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    @Override
    List<FuncionParametro> findByQuery(String query, EnumTipoQuery tipo, int max);

    @Override
    List<FuncionParametro> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);

    void flush();

    void merge(FuncionParametro funcionParametro);

    void persist(FuncionParametro funcionParametro);

    void refresh(FuncionParametro funcionParametro);

    void remove(FuncionParametro funcionParametro);
}
