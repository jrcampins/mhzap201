/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 * 
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 * 
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 */
package com.egt.core.jsf.component;

public class CampoArchivo extends com.sun.webui.jsf.component.Upload {

    public CampoArchivo() {
        super();
    }

    private String clientFileName;

    /**
     * @return the client file name
     */
    public String getClientFileName() {
        return clientFileName;
    }

    /**
     * @param clientFileName the client file name to set
     */
    public void setClientFileName(String clientFileName) {
        this.clientFileName = clientFileName;
    }

    private String serverFileName;

    /**
     * @return the server file name
     */
    public String getServerFileName() {
        return serverFileName;
    }

    /**
     * @param serverFileName the server file name to set
     */
    public void setServerFileName(String serverFileName) {
        this.serverFileName = serverFileName;
    }

}
