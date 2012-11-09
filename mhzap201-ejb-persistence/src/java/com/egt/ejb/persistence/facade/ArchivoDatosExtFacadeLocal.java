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
import com.egt.base.persistence.facade.ArchivoDatosExtFacadeBase;
import com.egt.ejb.persistence.entity.ArchivoDatosExt;
import java.util.List;
import javax.ejb.Local;

@Local
public interface ArchivoDatosExtFacadeLocal extends ArchivoDatosExtFacadeBase {

    @Override
    ArchivoDatosExt find(Object id);

    @Override
    ArchivoDatosExt find(Object id, boolean refresh);

    @Override
    ArchivoDatosExt findByCodigo(String codigo);

    @Override
    ArchivoDatosExt findByCodigo(String codigo, boolean refresh);

    @Override
    List<ArchivoDatosExt> findAll();

    @Override
    List<ArchivoDatosExt> findAll(boolean refresh);

    @Override
    List<ArchivoDatosExt> findByQuery(String query);

    @Override
    List<ArchivoDatosExt> findByQuery(String query, boolean refresh);

    @Override
    List<ArchivoDatosExt> findByQuery(String query, EnumTipoQuery tipo);

    @Override
    List<ArchivoDatosExt> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    @Override
    List<ArchivoDatosExt> findByQuery(String query, EnumTipoQuery tipo, int max);

    @Override
    List<ArchivoDatosExt> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);

    void flush();

    void merge(ArchivoDatosExt archivoDatosExt);

    void persist(ArchivoDatosExt archivoDatosExt);

    void refresh(ArchivoDatosExt archivoDatosExt);

    void remove(ArchivoDatosExt archivoDatosExt);
}
