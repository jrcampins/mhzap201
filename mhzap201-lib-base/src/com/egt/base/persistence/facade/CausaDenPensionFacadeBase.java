/*
 * Copyright (C) 2010, EGT Consultores, C.A.
 *
 * Este archivo fue totalmente generado utilizando herramientas de software de EGT Consultores, C.A.
 * En consecuencia, partes del archivo podrian ser similares o hasta iguales a las de archivos de
 * programas de otros clientes, generados por las mismas herramientas; por lo tanto, esta similitud
 * no podra ser considerada como violacion del copyright.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 *
 */
package com.egt.base.persistence.facade;

import com.egt.base.persistence.entity.CausaDenPensionBase;
import com.egt.base.persistence.enums.EnumTipoQuery;
import java.util.List;

public interface CausaDenPensionFacadeBase {

    CausaDenPensionBase find(Object id);

    CausaDenPensionBase find(Object id, boolean refresh);

    CausaDenPensionBase findByCodigo(String codigo);

    CausaDenPensionBase findByCodigo(String codigo, boolean refresh);

    List<? extends CausaDenPensionBase> findAll();

    List<? extends CausaDenPensionBase> findAll(boolean refresh);

    List<? extends CausaDenPensionBase> findByQuery(String query);

    List<? extends CausaDenPensionBase> findByQuery(String query, boolean refresh);

    List<? extends CausaDenPensionBase> findByQuery(String query, EnumTipoQuery tipo);

    List<? extends CausaDenPensionBase> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    List<? extends CausaDenPensionBase> findByQuery(String query, EnumTipoQuery tipo, int max);

    List<? extends CausaDenPensionBase> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);
//
//  void flush();
//
//  void merge(CausaDenPensionBase causaDenPension);
//
//  void persist(CausaDenPensionBase causaDenPension);
//
//  void refresh(CausaDenPensionBase causaDenPension);
//
//  void remove(CausaDenPensionBase causaDenPension);
}
