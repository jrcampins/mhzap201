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
package com.egt.ejb.persistence.facade;

import com.egt.base.persistence.enums.EnumTipoQuery;
import com.egt.base.persistence.facade.CausaDenPensionFacadeBase;
import com.egt.ejb.persistence.entity.CausaDenPension;
import java.util.List;
import javax.ejb.Local;

@Local
public interface CausaDenPensionFacadeLocal extends CausaDenPensionFacadeBase {

    @Override
    CausaDenPension find(Object id);

    @Override
    CausaDenPension find(Object id, boolean refresh);

    @Override
    CausaDenPension findByCodigo(String codigo);

    @Override
    CausaDenPension findByCodigo(String codigo, boolean refresh);

    @Override
    List<CausaDenPension> findAll();

    @Override
    List<CausaDenPension> findAll(boolean refresh);

    @Override
    List<CausaDenPension> findByQuery(String query);

    @Override
    List<CausaDenPension> findByQuery(String query, boolean refresh);

    @Override
    List<CausaDenPension> findByQuery(String query, EnumTipoQuery tipo);

    @Override
    List<CausaDenPension> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    @Override
    List<CausaDenPension> findByQuery(String query, EnumTipoQuery tipo, int max);

    @Override
    List<CausaDenPension> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);

    void flush();

    void merge(CausaDenPension causaDenPension);

    void persist(CausaDenPension causaDenPension);

    void refresh(CausaDenPension causaDenPension);

    void remove(CausaDenPension causaDenPension);
}
