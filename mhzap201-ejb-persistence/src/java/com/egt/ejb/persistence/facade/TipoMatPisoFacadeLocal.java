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
import com.egt.base.persistence.facade.TipoMatPisoFacadeBase;
import com.egt.ejb.persistence.entity.TipoMatPiso;
import java.util.List;
import javax.ejb.Local;

@Local
public interface TipoMatPisoFacadeLocal extends TipoMatPisoFacadeBase {

    @Override
    TipoMatPiso find(Object id);

    @Override
    TipoMatPiso find(Object id, boolean refresh);

    @Override
    TipoMatPiso findByCodigo(String codigo);

    @Override
    TipoMatPiso findByCodigo(String codigo, boolean refresh);

    @Override
    List<TipoMatPiso> findAll();

    @Override
    List<TipoMatPiso> findAll(boolean refresh);

    @Override
    List<TipoMatPiso> findByQuery(String query);

    @Override
    List<TipoMatPiso> findByQuery(String query, boolean refresh);

    @Override
    List<TipoMatPiso> findByQuery(String query, EnumTipoQuery tipo);

    @Override
    List<TipoMatPiso> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    @Override
    List<TipoMatPiso> findByQuery(String query, EnumTipoQuery tipo, int max);

    @Override
    List<TipoMatPiso> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);

    void flush();

    void merge(TipoMatPiso tipoMatPiso);

    void persist(TipoMatPiso tipoMatPiso);

    void refresh(TipoMatPiso tipoMatPiso);

    void remove(TipoMatPiso tipoMatPiso);
}
