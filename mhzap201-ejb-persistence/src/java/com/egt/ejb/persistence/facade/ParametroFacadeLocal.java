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
import com.egt.base.persistence.facade.ParametroFacadeBase;
import com.egt.ejb.persistence.entity.Parametro;
import java.util.List;
import javax.ejb.Local;

@Local
public interface ParametroFacadeLocal extends ParametroFacadeBase {

    @Override
    Parametro find(Object id);

    @Override
    Parametro find(Object id, boolean refresh);

    @Override
    Parametro findByCodigo(String codigo);

    @Override
    Parametro findByCodigo(String codigo, boolean refresh);

    @Override
    List<Parametro> findAll();

    @Override
    List<Parametro> findAll(boolean refresh);

    @Override
    List<Parametro> findByQuery(String query);

    @Override
    List<Parametro> findByQuery(String query, boolean refresh);

    @Override
    List<Parametro> findByQuery(String query, EnumTipoQuery tipo);

    @Override
    List<Parametro> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    @Override
    List<Parametro> findByQuery(String query, EnumTipoQuery tipo, int max);

    @Override
    List<Parametro> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);

    void flush();

    void merge(Parametro parametro);

    void persist(Parametro parametro);

    void refresh(Parametro parametro);

    void remove(Parametro parametro);
}
