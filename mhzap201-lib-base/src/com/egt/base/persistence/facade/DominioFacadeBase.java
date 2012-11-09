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
package com.egt.base.persistence.facade;

import com.egt.base.persistence.entity.DominioBase;
import com.egt.base.persistence.enums.EnumTipoQuery;
import java.util.List;

public interface DominioFacadeBase {

    DominioBase find(Object id);

    DominioBase find(Object id, boolean refresh);

    DominioBase findByCodigo(String codigo);

    DominioBase findByCodigo(String codigo, boolean refresh);

    List<? extends DominioBase> findAll();

    List<? extends DominioBase> findAll(boolean refresh);

    List<? extends DominioBase> findByQuery(String query);

    List<? extends DominioBase> findByQuery(String query, boolean refresh);

    List<? extends DominioBase> findByQuery(String query, EnumTipoQuery tipo);

    List<? extends DominioBase> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    List<? extends DominioBase> findByQuery(String query, EnumTipoQuery tipo, int max);

    List<? extends DominioBase> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);
//
//  void flush();
//
//  void merge(DominioBase dominio);
//
//  void persist(DominioBase dominio);
//
//  void refresh(DominioBase dominio);
//
//  void remove(DominioBase dominio);
}
