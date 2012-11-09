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
package com.egt.base.persistence.facade;

import com.egt.base.persistence.entity.PersonaBase;
import com.egt.base.persistence.enums.EnumTipoQuery;
import java.util.List;

public interface PersonaFacadeBase {

    PersonaBase find(Object id);

    PersonaBase find(Object id, boolean refresh);

    PersonaBase findByCodigo(String codigo);

    PersonaBase findByCodigo(String codigo, boolean refresh);

    List<? extends PersonaBase> findAll();

    List<? extends PersonaBase> findAll(boolean refresh);

    List<? extends PersonaBase> findByQuery(String query);

    List<? extends PersonaBase> findByQuery(String query, boolean refresh);

    List<? extends PersonaBase> findByQuery(String query, EnumTipoQuery tipo);

    List<? extends PersonaBase> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    List<? extends PersonaBase> findByQuery(String query, EnumTipoQuery tipo, int max);

    List<? extends PersonaBase> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);
//
//  void flush();
//
//  void merge(PersonaBase persona);
//
//  void persist(PersonaBase persona);
//
//  void refresh(PersonaBase persona);
//
//  void remove(PersonaBase persona);
}
