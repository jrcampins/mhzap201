/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los términos
 * de la licencia "GNU General Public License" publicada por la Fundación "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser útil, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas información.
 *
 */
package com.egt.eac.toolkit;

import com.egt.core.aplicacion.TLC;
import com.egt.ejb.toolkit.ToolKitRemoteSessionRemote;
import javax.ejb.EJB;

public class ToolKit {

    @EJB
    private static ToolKitRemoteSessionRemote toolKit;

    public static void main(String[] args) {
        TLC.getBitacora().info(Bundle.getString("application.client.codigo.aplicacion"));
        TLC.getBitacora().info(Bundle.getString("application.client.nombre.aplicacion"));
        toolKit.generarEntityClass();
        toolKit.generarFacade();
//      toolKit.generarJasperReport();
//      toolKit.generarJasperViews();
//      toolKit.generarURX();
//      toolKit.generarAplicacion();
        Runtime.getRuntime().exit(0);
    }
}
