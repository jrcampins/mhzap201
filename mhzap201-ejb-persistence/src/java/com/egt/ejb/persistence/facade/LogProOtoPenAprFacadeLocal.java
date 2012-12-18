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
import com.egt.base.persistence.facade.LogProOtoPenAprFacadeBase;
import com.egt.ejb.persistence.entity.LogProOtoPenApr;
import java.util.List;
import javax.ejb.Local;

@Local
public interface LogProOtoPenAprFacadeLocal extends LogProOtoPenAprFacadeBase {

    @Override
    LogProOtoPenApr find(Object id);

    @Override
    LogProOtoPenApr find(Object id, boolean refresh);

    @Override
    List<LogProOtoPenApr> findAll();

    @Override
    List<LogProOtoPenApr> findAll(boolean refresh);

    @Override
    List<LogProOtoPenApr> findByQuery(String query);

    @Override
    List<LogProOtoPenApr> findByQuery(String query, boolean refresh);

    @Override
    List<LogProOtoPenApr> findByQuery(String query, EnumTipoQuery tipo);

    @Override
    List<LogProOtoPenApr> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    @Override
    List<LogProOtoPenApr> findByQuery(String query, EnumTipoQuery tipo, int max);

    @Override
    List<LogProOtoPenApr> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);

    void flush();

    void merge(LogProOtoPenApr logProOtoPenApr);

    void persist(LogProOtoPenApr logProOtoPenApr);

    void refresh(LogProOtoPenApr logProOtoPenApr);

    void remove(LogProOtoPenApr logProOtoPenApr);
}
