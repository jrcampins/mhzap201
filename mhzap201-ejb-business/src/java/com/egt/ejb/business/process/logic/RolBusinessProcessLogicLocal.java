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
package com.egt.ejb.business.process.logic;

import com.egt.ejb.business.message.CopiarRolMessage;
import com.egt.ejb.business.message.ModificarConjuntoRolMessage;
import com.egt.ejb.business.message.PropagarFiltrosRolMessage;
import com.egt.ejb.business.message.PropagarFavoritosRolMessage;
import com.egt.ejb.persistence.entity.Rol;
import javax.ejb.Local;

@Local
public interface RolBusinessProcessLogicLocal {

    public void copiarRol(CopiarRolMessage message, Rol rol) throws Exception;

    public void modificarConjuntoRol(ModificarConjuntoRolMessage message, Rol rol) throws Exception;

    public void propagarFiltrosRol(PropagarFiltrosRolMessage message, Rol rol) throws Exception;

    public void propagarFavoritosRol(PropagarFavoritosRolMessage message, Rol rol) throws Exception;
}
