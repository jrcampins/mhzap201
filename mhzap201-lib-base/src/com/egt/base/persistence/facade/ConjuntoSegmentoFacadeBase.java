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

import com.egt.base.persistence.entity.ConjuntoSegmentoBase;
import com.egt.base.persistence.enums.EnumTipoQuery;
import java.util.List;

public interface ConjuntoSegmentoFacadeBase {

    ConjuntoSegmentoBase find(Object id);

    ConjuntoSegmentoBase find(Object id, boolean refresh);

    ConjuntoSegmentoBase findByCodigo(String codigo);

    ConjuntoSegmentoBase findByCodigo(String codigo, boolean refresh);

    List<? extends ConjuntoSegmentoBase> findAll();

    List<? extends ConjuntoSegmentoBase> findAll(boolean refresh);

    List<? extends ConjuntoSegmentoBase> findByQuery(String query);

    List<? extends ConjuntoSegmentoBase> findByQuery(String query, boolean refresh);

    List<? extends ConjuntoSegmentoBase> findByQuery(String query, EnumTipoQuery tipo);

    List<? extends ConjuntoSegmentoBase> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    List<? extends ConjuntoSegmentoBase> findByQuery(String query, EnumTipoQuery tipo, int max);

    List<? extends ConjuntoSegmentoBase> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);
//
//  void flush();
//
//  void merge(ConjuntoSegmentoBase conjuntoSegmento);
//
//  void persist(ConjuntoSegmentoBase conjuntoSegmento);
//
//  void refresh(ConjuntoSegmentoBase conjuntoSegmento);
//
//  void remove(ConjuntoSegmentoBase conjuntoSegmento);
}
