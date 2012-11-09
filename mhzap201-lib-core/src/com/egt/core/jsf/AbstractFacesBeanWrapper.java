/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 * 
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 * 
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 */
package com.egt.core.jsf;

import com.sun.rave.web.ui.appbase.FacesBean;

public class AbstractFacesBeanWrapper {

    public AbstractFacesBeanWrapper() {
        this.bean = null;
    }

    public AbstractFacesBeanWrapper(FacesBean bean) {
        this.bean = bean;
    }

    private FacesBean bean;

    public FacesBean getBean() {
        return bean;
    }

    public boolean wrapping() {
        return bean != null;
    }

    public boolean designing() {
        return bean == null;
    }
}
