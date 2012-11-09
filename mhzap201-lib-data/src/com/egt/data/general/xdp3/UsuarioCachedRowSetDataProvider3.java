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

package com.egt.data.general.xdp3;

import com.egt.commons.util.BitUtils;
import com.egt.core.aplicacion.TLC;
import com.egt.core.util.Utils;
import com.egt.data.general.xdp2.UsuarioCachedRowSetDataProvider2;
import com.sun.data.provider.RowKey;
import javax.sql.rowset.CachedRowSet;

public class UsuarioCachedRowSetDataProvider3 extends UsuarioCachedRowSetDataProvider2 {

    public UsuarioCachedRowSetDataProvider3() {
        super();
    }

    public UsuarioCachedRowSetDataProvider3(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    @Override
    public String getPasswordUsuario() {
//      return (String) super.getValue(COLUMNA_PASSWORD_USUARIO);
        return null;
    }

    @Override
    public String getPasswordUsuario(RowKey rowKey) {
//      return (String) super.getValue(COLUMNA_PASSWORD_USUARIO, rowKey);
        return null;
    }

    @Override
    public void setPasswordUsuario(String valor) {
        if (valor != null && !valor.equals("")) {
            super.setValue(COLUMNA_PASSWORD_USUARIO, Utils.Digest(valor));
        }
    }

    @Override
    public void setPasswordUsuario(RowKey rowKey, String valor) {
        if (valor != null && !valor.equals("")) {
            super.setValue(COLUMNA_PASSWORD_USUARIO, rowKey, Utils.Digest(valor));
        }
    }

    @Override
    protected boolean esFilaEliminableConEliminarUsuario(RowKey rowKey) {
        boolean ok;
        boolean es = super.esFilaEliminableConEliminarUsuario(rowKey);
        if (es) {
            ok = !this.getIdUsuario().equals(TLC.getControlador().getUsuario().getIdUsuario());
            if (!ok) {
                es = false;
                String clave = "no es posible eliminar el usuario {0} porque es el usuario actual";
                TLC.getBitacora().error(clave, this.getEtiquetaRecurso(rowKey));
            }
            ok = !BitUtils.valueOf(this.getEsSuperUsuario(rowKey));
            if (!ok) {
                es = false;
                String clave = "no es posible eliminar el usuario {0} porque es un super-usuario";
                TLC.getBitacora().error(clave, this.getEtiquetaRecurso(rowKey));
            }
        }
        return es;
    }

}
