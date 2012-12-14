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

import com.egt.base.util.BundleParametros;
import com.egt.core.jsf.JSF;
import com.sun.webui.jsf.component.Calendar;
import java.sql.Timestamp;
import java.util.Date;
import org.apache.commons.lang.StringUtils;

public class Calendario extends Calendar {

    public Calendario() {
        super();
    }

    private boolean unaware = true;

    private TextoEstaticoAlternativo sibling = null;

    synchronized protected TextoEstaticoAlternativo getSibling() {
        if (unaware && sibling == null && this.getId() != null) {
            unaware = false;
            sibling = JSF.getTextoEstaticoAlternativo(this);
        }
        return sibling;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isRendered() {
        return this.getSibling() == null
                ? super.isRendered()
                : super.isRendered() && !super.isReadOnly();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setValue(Object arg0) {
        Date arg1 = this.obj2Date(arg0);
        super.setValue(arg1);
    }

    private Date obj2Date(Object arg0) {
        if (arg0 instanceof Timestamp) {
            return (Timestamp) arg0;
        } else if (arg0 instanceof Date) {
            Date date = (Date) arg0;
            java.util.Calendar calendar = java.util.Calendar.getInstance();
            calendar.setTime(date);
            return new Timestamp(calendar.getTimeInMillis());
        } else {
            return null;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getToolTip() {
        String superstr = super.getToolTip();
        if (StringUtils.isNotBlank(superstr) && getValueExpression("toolTip") == null) {
            if (superstr.startsWith("BundleParametros.")) {
                int i = superstr.indexOf('.');
                String key = superstr.substring(i + 1);
                return BundleParametros.getToolTip(key);
            }
        }
        return superstr;
    }

}
