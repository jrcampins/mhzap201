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
import com.egt.base.persistence.facade.InformeAuditoriaFacadeBase;
import com.egt.ejb.persistence.entity.InformeAuditoria;
import java.util.List;
import javax.ejb.Local;

@Local
public interface InformeAuditoriaFacadeLocal extends InformeAuditoriaFacadeBase {

    @Override
    InformeAuditoria find(Object id);

    @Override
    InformeAuditoria find(Object id, boolean refresh);

    @Override
    InformeAuditoria findByCodigo(String codigo);

    @Override
    InformeAuditoria findByCodigo(String codigo, boolean refresh);

    @Override
    List<InformeAuditoria> findAll();

    @Override
    List<InformeAuditoria> findAll(boolean refresh);

    @Override
    List<InformeAuditoria> findByQuery(String query);

    @Override
    List<InformeAuditoria> findByQuery(String query, boolean refresh);

    @Override
    List<InformeAuditoria> findByQuery(String query, EnumTipoQuery tipo);

    @Override
    List<InformeAuditoria> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    @Override
    List<InformeAuditoria> findByQuery(String query, EnumTipoQuery tipo, int max);

    @Override
    List<InformeAuditoria> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);

    void flush();

    void merge(InformeAuditoria informeAuditoria);

    void persist(InformeAuditoria informeAuditoria);

    void refresh(InformeAuditoria informeAuditoria);

    void remove(InformeAuditoria informeAuditoria);
}
