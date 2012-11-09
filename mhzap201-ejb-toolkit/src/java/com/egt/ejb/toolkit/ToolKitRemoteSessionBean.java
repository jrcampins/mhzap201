/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 * 
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 * 
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 */
package com.egt.ejb.toolkit;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ToolKitRemoteSessionBean implements ToolKitRemoteSessionRemote {

    @EJB
    private ToolKitSessionLocal toolKit;

    @Override
    public void generarEntityClass() {
        toolKit.generarEntityClass();
    }

    @Override
    public void generarFacade() {
        toolKit.generarFacade();
    }

    @Override
    public void generarJasperReport() {
        toolKit.generarJasperReport();
    }

    @Override
    public void generarJasperViews() {
        toolKit.generarJasperViews();
    }

    @Override
    public void generarURX() {
        toolKit.generarURX();
    }

    @Override
    public void generarAplicacion() {
        toolKit.generarAplicacion();
    }
}
