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
import com.egt.base.persistence.facade.OpcionBinariaFacadeBase;
import com.egt.ejb.persistence.entity.OpcionBinaria;
import java.util.List;
import javax.ejb.Local;

@Local
public interface OpcionBinariaFacadeLocal extends OpcionBinariaFacadeBase {

    @Override
    OpcionBinaria find(Object id);

    @Override
    OpcionBinaria find(Object id, boolean refresh);

    @Override
    OpcionBinaria findByCodigo(String codigo);

    @Override
    OpcionBinaria findByCodigo(String codigo, boolean refresh);

    @Override
    List<OpcionBinaria> findAll();

    @Override
    List<OpcionBinaria> findAll(boolean refresh);

    @Override
    List<OpcionBinaria> findByQuery(String query);

    @Override
    List<OpcionBinaria> findByQuery(String query, boolean refresh);

    @Override
    List<OpcionBinaria> findByQuery(String query, EnumTipoQuery tipo);

    @Override
    List<OpcionBinaria> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    @Override
    List<OpcionBinaria> findByQuery(String query, EnumTipoQuery tipo, int max);

    @Override
    List<OpcionBinaria> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);

    void flush();

    void merge(OpcionBinaria opcionBinaria);

    void persist(OpcionBinaria opcionBinaria);

    void refresh(OpcionBinaria opcionBinaria);

    void remove(OpcionBinaria opcionBinaria);
}
