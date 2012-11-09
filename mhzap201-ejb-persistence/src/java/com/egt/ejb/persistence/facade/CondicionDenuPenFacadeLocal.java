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
import com.egt.base.persistence.facade.CondicionDenuPenFacadeBase;
import com.egt.ejb.persistence.entity.CondicionDenuPen;
import java.util.List;
import javax.ejb.Local;

@Local
public interface CondicionDenuPenFacadeLocal extends CondicionDenuPenFacadeBase {

    @Override
    CondicionDenuPen find(Object id);

    @Override
    CondicionDenuPen find(Object id, boolean refresh);

    @Override
    CondicionDenuPen findByCodigo(String codigo);

    @Override
    CondicionDenuPen findByCodigo(String codigo, boolean refresh);

    @Override
    List<CondicionDenuPen> findAll();

    @Override
    List<CondicionDenuPen> findAll(boolean refresh);

    @Override
    List<CondicionDenuPen> findByQuery(String query);

    @Override
    List<CondicionDenuPen> findByQuery(String query, boolean refresh);

    @Override
    List<CondicionDenuPen> findByQuery(String query, EnumTipoQuery tipo);

    @Override
    List<CondicionDenuPen> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    @Override
    List<CondicionDenuPen> findByQuery(String query, EnumTipoQuery tipo, int max);

    @Override
    List<CondicionDenuPen> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);

    void flush();

    void merge(CondicionDenuPen condicionDenuPen);

    void persist(CondicionDenuPen condicionDenuPen);

    void refresh(CondicionDenuPen condicionDenuPen);

    void remove(CondicionDenuPen condicionDenuPen);
}
