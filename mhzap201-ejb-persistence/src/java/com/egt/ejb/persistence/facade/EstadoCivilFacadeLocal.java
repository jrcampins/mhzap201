/*
 * Copyright (C) 2009, EGT Consultores, C.A.
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
import com.egt.base.persistence.facade.EstadoCivilFacadeBase;
import com.egt.ejb.persistence.entity.EstadoCivil;
import java.util.List;
import javax.ejb.Local;

@Local
public interface EstadoCivilFacadeLocal extends EstadoCivilFacadeBase {

    @Override
    EstadoCivil find(Object id);

    @Override
    EstadoCivil find(Object id, boolean refresh);

    @Override
    EstadoCivil findByCodigo(String codigo);

    @Override
    EstadoCivil findByCodigo(String codigo, boolean refresh);

    @Override
    List<EstadoCivil> findAll();

    @Override
    List<EstadoCivil> findAll(boolean refresh);

    @Override
    List<EstadoCivil> findByQuery(String query);

    @Override
    List<EstadoCivil> findByQuery(String query, boolean refresh);

    @Override
    List<EstadoCivil> findByQuery(String query, EnumTipoQuery tipo);

    @Override
    List<EstadoCivil> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    @Override
    List<EstadoCivil> findByQuery(String query, EnumTipoQuery tipo, int max);

    @Override
    List<EstadoCivil> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);

    void flush();

    void merge(EstadoCivil estadoCivil);

    void persist(EstadoCivil estadoCivil);

    void refresh(EstadoCivil estadoCivil);

    void remove(EstadoCivil estadoCivil);
}
