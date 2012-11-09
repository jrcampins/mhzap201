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
import com.egt.ejb.business.message.PropagarFavoritosRolMessage;
import com.egt.ejb.business.message.PropagarFiltrosRolMessage;
import com.egt.ejb.persistence.entity.Rol;
import javax.ejb.EJBException;
import javax.ejb.Stateless;

@Stateless
public class RolBusinessProcessLogicBean implements RolBusinessProcessLogicLocal {

    @Override
    public void copiarRol(CopiarRolMessage message, Rol rol) throws Exception {
        if (message == null) {
            throw new EJBException(CopiarRolMessage.class.getSimpleName());
        }
        if (rol == null) {
            throw new EJBException(Rol.class.getSimpleName());
        }
        //
        // TODO: codificar la logica del proceso de negocio
        //
    }

    @Override
    public void modificarConjuntoRol(ModificarConjuntoRolMessage message, Rol rol) throws Exception {
        if (message == null) {
            throw new EJBException(ModificarConjuntoRolMessage.class.getSimpleName());
        }
        if (rol == null) {
            throw new EJBException(Rol.class.getSimpleName());
        }
        //
        // TODO: codificar la logica del proceso de negocio
        //
    }

    @Override
    public void propagarFiltrosRol(PropagarFiltrosRolMessage message, Rol rol) throws Exception {
        if (message == null) {
            throw new EJBException(PropagarFiltrosRolMessage.class.getSimpleName());
        }
        if (rol == null) {
            throw new EJBException(Rol.class.getSimpleName());
        }
        //
        // TODO: codificar la logica del proceso de negocio
        //
    }

    @Override
    public void propagarFavoritosRol(PropagarFavoritosRolMessage message, Rol rol) throws Exception {
        if (message == null) {
            throw new EJBException(PropagarFavoritosRolMessage.class.getSimpleName());
        }
        if (rol == null) {
            throw new EJBException(Rol.class.getSimpleName());
        }
        //
        // TODO: codificar la logica del proceso de negocio
        //
    }

}
