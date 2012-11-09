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
package com.egt.ejb.persistence.facade;

import com.egt.base.persistence.enums.EnumTipoQuery;
import com.egt.base.persistence.facade.ClaseRecursoParFacadeBase;
import com.egt.ejb.persistence.entity.ClaseRecursoPar;
import java.util.List;
import javax.ejb.Local;

@Local
public interface ClaseRecursoParFacadeLocal extends ClaseRecursoParFacadeBase {

    @Override
    ClaseRecursoPar find(Object id);

    @Override
    ClaseRecursoPar find(Object id, boolean refresh);

    @Override
    List<ClaseRecursoPar> findAll();

    @Override
    List<ClaseRecursoPar> findAll(boolean refresh);

    @Override
    List<ClaseRecursoPar> findByQuery(String query);

    @Override
    List<ClaseRecursoPar> findByQuery(String query, boolean refresh);

    @Override
    List<ClaseRecursoPar> findByQuery(String query, EnumTipoQuery tipo);

    @Override
    List<ClaseRecursoPar> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    @Override
    List<ClaseRecursoPar> findByQuery(String query, EnumTipoQuery tipo, int max);

    @Override
    List<ClaseRecursoPar> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);

    void flush();

    void merge(ClaseRecursoPar claseRecursoPar);

    void persist(ClaseRecursoPar claseRecursoPar);

    void refresh(ClaseRecursoPar claseRecursoPar);

    void remove(ClaseRecursoPar claseRecursoPar);
}
