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

import com.egt.core.aplicacion.Bitacora;
import com.egt.core.aplicacion.TLC;
import com.egt.core.db.xdp.RecursoLocalizableDataProvider;
import com.egt.data.general.xdp2.OpcionMenuCachedRowSetDataProvider2;
import com.sun.data.provider.RowKey;
import javax.sql.rowset.CachedRowSet;

public class OpcionMenuCachedRowSetDataProvider3 extends OpcionMenuCachedRowSetDataProvider2 implements RecursoLocalizableDataProvider {

    public OpcionMenuCachedRowSetDataProvider3() {
        super();
    }

    public OpcionMenuCachedRowSetDataProvider3(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    public void reconstruir() {
        Bitacora.trace(this.getClass(), "reconstruir");
        String sql = "opcion_menu_rebuild";
        try {
            TLC.getAgenteSql().setAutoCommit(true);
            TLC.getAgenteSql().executeProcedure(sql);
        } catch (Exception ex) {
            TLC.getBitacora().fatal(ex);
        }
    }

    /**
     * Getter para propiedad url.
     * @return Valor de la propiedad url.
     */
    @Override
    public String getUrl() {
        return this.getUrlOpcionMenu();
    }

    /**
     * Getter para propiedad url.
     * @return Valor de la propiedad url.
     */
    @Override
    public String getUrl(RowKey rowKey) {
        return this.getUrlOpcionMenu(rowKey);
    }
}
