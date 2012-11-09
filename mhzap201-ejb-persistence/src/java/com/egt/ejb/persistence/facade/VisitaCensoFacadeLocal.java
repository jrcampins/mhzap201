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
import com.egt.base.persistence.facade.VisitaCensoFacadeBase;
import com.egt.ejb.persistence.entity.VisitaCenso;
import java.util.List;
import javax.ejb.Local;

@Local
public interface VisitaCensoFacadeLocal extends VisitaCensoFacadeBase {

    @Override
    VisitaCenso find(Object id);

    @Override
    VisitaCenso find(Object id, boolean refresh);

    @Override
    List<VisitaCenso> findAll();

    @Override
    List<VisitaCenso> findAll(boolean refresh);

    @Override
    List<VisitaCenso> findByQuery(String query);

    @Override
    List<VisitaCenso> findByQuery(String query, boolean refresh);

    @Override
    List<VisitaCenso> findByQuery(String query, EnumTipoQuery tipo);

    @Override
    List<VisitaCenso> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    @Override
    List<VisitaCenso> findByQuery(String query, EnumTipoQuery tipo, int max);

    @Override
    List<VisitaCenso> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);

    void flush();

    void merge(VisitaCenso visitaCenso);

    void persist(VisitaCenso visitaCenso);

    void refresh(VisitaCenso visitaCenso);

    void remove(VisitaCenso visitaCenso);
}
