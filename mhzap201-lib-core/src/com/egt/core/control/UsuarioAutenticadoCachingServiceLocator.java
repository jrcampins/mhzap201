/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los términos
 * de la licencia "GNU General Public License" publicada por la Fundación "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser útil, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener cursor informacion.
 *
 */
package com.egt.core.control;

import com.egt.core.aplicacion.Bitacora;
import java.util.HashMap;

public class UsuarioAutenticadoCachingServiceLocator {

    private static HashMap instances = new HashMap();

    public static synchronized UsuarioAutenticado getInstance() {
        Bitacora.trace(UsuarioAutenticadoCachingServiceLocator.class, "getInstance");
        UsuarioAutenticado instance;
        String name = UsuarioAutenticado.getPrincipalName();
        if (instances.containsKey(name)) {
            instance = (UsuarioAutenticado) instances.get(name);
            if (instance.isModificado() && instance.getFechaHoraModificacion() < UsuarioAutenticado.getSessionCreationTime()) {
                instance.setCredencialesUsuario();
            }
        } else {
            instance = new UsuarioAutenticado(name);
            instances.put(name, instance);
        }
        return instance;
    }

    public static UsuarioAutenticado getInstance(String name) {
        Bitacora.trace(UsuarioAutenticadoCachingServiceLocator.class, "getInstance", name);
        return instances.containsKey(name) ? (UsuarioAutenticado) instances.get(name) : null;
    }
}
