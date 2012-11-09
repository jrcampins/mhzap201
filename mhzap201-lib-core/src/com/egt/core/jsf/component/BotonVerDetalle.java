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

import org.apache.commons.lang.StringUtils;

public class BotonVerDetalle extends Boton {

    public BotonVerDetalle() {
        super();
    }

    /** {@inheritDoc} */
    @Override
    public boolean isRendered() {
        return super.isRendered() && this.isRenderedToo();
    }

    private boolean isRenderedToo() {
//      if (this.getSibling() instanceof TextField) {
//          TextField textField = (TextField) this.getSibling();
//          if (textField.isRendered()) {
//              return StringUtils.isNotBlank(textField.getToolTip());
//          } else if (textField instanceof CampoTexto) {
//              CampoTexto campo = (CampoTexto) textField;
//              TextoEstaticoAlternativo texto = campo.getSibling();
//              return texto != null && texto.isRendered() && StringUtils.isNotBlank(campo.getToolTip());
//          }
//          return false;
//      }
        String script = this.getOnClick();
        if (StringUtils.isBlank(script)) {
            return false;
        }
        if (this.getSibling() instanceof CampoTexto) {
            CampoTexto campo = (CampoTexto) this.getSibling();
            ComponenteComplementario sidekick = campo.getSidekick();
            if (sidekick != null) {
                return sidekick.isRendered() && sidekick.getText() != null;
            }
        }
        return true;
    }

    /** {@inheritDoc} */
    @Override
    public Object getText() {
        Object object = super.getText();
        return object != null ? object : this.getString("text");
    }

    /** {@inheritDoc} */
    @Override
    public String getToolTip() {
        String string = super.getToolTip();
        return string != null ? string : this.getString("toolTip");
    }
}
