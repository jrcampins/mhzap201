/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 * 
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 * 
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 */
package com.egt.ejb.persistence.facade.catalog;

import com.egt.ejb.persistence.entity.catalog.SystemTable;
import com.egt.base.persistence.enums.EnumTipoQuery;
import java.util.List;
import javax.ejb.Local;

@Local
public interface SystemTableFacadeLocal {

    SystemTable find(Object id);

    List<SystemTable> findAll();

    SystemTable findByCodigo(String codigo);

    List<SystemTable> findByQuery(String query);

    List<SystemTable> findByQuery(String query, boolean refresh);

    List<SystemTable> findByQuery(String query, EnumTipoQuery tipo);

    List<SystemTable> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    List<SystemTable> findByQuery(String query, EnumTipoQuery tipo, int max);

    List<SystemTable> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);
}
