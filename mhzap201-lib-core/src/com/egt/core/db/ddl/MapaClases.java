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
package com.egt.core.db.ddl;

import com.egt.commons.util.BitUtils;
import com.egt.core.db.util.DB;
import com.egt.core.aplicacion.TLC;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.Map;
import org.apache.commons.lang.StringUtils;

public class MapaClases {

    private ResultSet resultSet = null;

    public MapaClases() {
    }

    /**
     * Getter para propiedad connected
     * @return Valor de la propiedad connected
     */
    public boolean connected() {
        return TLC.getAgenteSql().connected();
    }

    public Map getMap() throws SQLException {
        String filtro = null;
        return this.addClases(filtro);
    }

    public Map getMap(Long clase) throws SQLException {
        String filtro = clase == null || clase.equals("") ? null : "id_clase_objeto=" + clase;
        return this.addClases(filtro);
    }

    public Map getMap(String clase) throws SQLException {
        String filtro = clase == null || clase.equals("") ? null : "codigo_clase_objeto='" + clase + "'";
        return this.addClases(filtro);
    }

    private Map addClases(String filtro) throws SQLException {
        LinkedHashMap clases = new LinkedHashMap();
        LinkedHashMap tablas = new LinkedHashMap();
        String sql = "SELECT * FROM vista_script_tablas ";
        if (filtro != null && !filtro.equals("")) {
            sql += "WHERE (" + filtro + ")";
        }
//      sql += "ORDER BY codigo_clase_objeto, tabname, numero_seccion_clase, numero_propiedad_clase, colid";
        sql += "ORDER BY codigo_clase_objeto, tabname, id_propiedad_clase, colid";
        this.resultSet = TLC.getAgenteSql().executeQuery(sql);
        if (this.resultSet.next()) {
            String tabname = null;
            String tabdescription = null;
            Integer colid = null;
            String colname = null;
            String coldescription = null;
            Integer coltype = null;
            Integer length = null;
            Integer prec = null;
            Integer scale = null;
            Integer isnullable = null;
            Integer autonumber = null;
            Long clase = null;
            String codigoClase = null;
            Integer esClaseSincronizada = null;
            Long seccion = null;
            String codigoSeccion = null;
            Integer esSeccionMultiple = null;
            String sufijoSeccion = null;
            Integer esSeccionSincronizada = null;
            Long propiedad = null;
            String codigoPropiedad = null;
            Integer esPropiedadMultiple = null;
            String sufijoPropiedad = null;
            Integer esPropiedadSincronizada = null;
            Long tipoValor = null;
            String claseAnterior = null;
            String tablaAnterior = null;
            Clase s = null;
            Tabla t = null;
            Columna c = null;
            do {
                tabname = this.resultSet.getString("tabname");
                tabdescription = this.resultSet.getString("tabdescription");
                colid = (Integer) this.resultSet.getObject("colid");
                colname = this.resultSet.getString("colname");
                coldescription = this.resultSet.getString("coldescription");
                coltype = (Integer) this.resultSet.getObject("coltype");
                length = (Integer) this.resultSet.getObject("length");
                prec = (Integer) this.resultSet.getObject("prec");
                scale = (Integer) this.resultSet.getObject("scale");
                isnullable = (Integer) this.resultSet.getObject("isnullable");
                autonumber = (Integer) this.resultSet.getObject("autonumber");
                clase = (Long) this.resultSet.getObject("id_clase_objeto");
                codigoClase = this.resultSet.getString("codigo_clase_objeto");
                esClaseSincronizada = (Integer) this.resultSet.getObject("es_clase_sincronizada");
                seccion = (Long) this.resultSet.getObject("id_seccion_clase");
                codigoSeccion = this.resultSet.getString("codigo_seccion_clase");
                esSeccionMultiple = (Integer) this.resultSet.getObject("es_seccion_multiple");
                sufijoSeccion = this.resultSet.getString("sufijo_tabla_seccion_clase");
                esSeccionSincronizada = (Integer) this.resultSet.getObject("es_seccion_sincronizada");
                propiedad = (Long) this.resultSet.getObject("id_propiedad_clase");
                codigoPropiedad = this.resultSet.getString("codigo_propiedad");
                esPropiedadMultiple = (Integer) this.resultSet.getObject("es_propiedad_multiple");
                sufijoPropiedad = this.resultSet.getString("sufijo_tabla_propiedad_clase");
                esPropiedadSincronizada = (Integer) this.resultSet.getObject("es_propiedad_sincronizada");
                tipoValor = (Long) this.resultSet.getObject("id_tipo_valor");
                if (!codigoClase.equals(claseAnterior)) {
                    claseAnterior = codigoClase;
                    tablaAnterior = null;
                    s = new Clase(clase, codigoClase);
                    clases.put(codigoClase, s);
                }
                if (!tabname.equals(tablaAnterior)) {
                    tablaAnterior = tabname;
                    t = s.addTabla(tabname, this.getNombreTabla(tabname, seccion, esSeccionMultiple, codigoSeccion, sufijoSeccion, codigoPropiedad, sufijoPropiedad));
                    t.setDescripcion(tabdescription);
                    t.setSincronizada(this.getTablaSincronizada(seccion, esSeccionMultiple, esClaseSincronizada, esSeccionSincronizada, esPropiedadSincronizada));
                    tablas.put(tabname, t);
                }
                if (BitUtils.valueOf(esSeccionMultiple)) {
                    t.setSeccion(seccion);
                } else if (BitUtils.valueOf(esPropiedadMultiple)) {
                    t.setPropiedad(propiedad);
                }
                c = t.addColumna(colname, propiedad);
                c.setDescripcion(coldescription);
                c.setTipo(coltype);
                c.setLongitud(length);
                c.setPrecision(prec);
                c.setEscala(scale);
                c.setAnulable(isnullable);
                c.setAutonumerica(autonumber);
                c.setDominio(tipoValor);
                c.setPropiedad(propiedad);
                c.setSincronizada(this.getColumnaSincronizada(colid, t.getSincronizada(), esPropiedadSincronizada));
            } while (this.resultSet.next());
        }
        this.resultSet.close();
        if (tablas.size() > 0) {
            this.addClavesPrimarias(tablas);
            this.addClavesForaneas(tablas);
            this.addClavesUnicas(tablas);
            this.addClavesDuplicadas(tablas);
        }
        return clases;
    }

    private String getNombreTabla(String nombre, Long seccion, Integer esSeccionMultiple, String codigoSeccion, String sufijoSeccion, String codigoPropiedad, String sufijoPropiedad) {
        String altname = nombre;
        int i = altname.indexOf("$");
        if (i > 0) {
            String prefijo = altname.substring(0, i);
            if (seccion != 0) { /* seccion o propiedad multiple */
                if (esSeccionMultiple == 1) { /* seccion multiple */
                    if (StringUtils.isNotBlank(sufijoSeccion)) {
                        altname = prefijo + "_" + sufijoSeccion.trim();
                    } else {
                        altname = prefijo + "_" + codigoSeccion.trim();
                    }
                } else { /* propiedad multiple */
                    if (StringUtils.isNotBlank(sufijoPropiedad)) {
                        altname = prefijo + "_" + sufijoPropiedad.trim();
                    } else {
                        altname = prefijo + "_" + codigoPropiedad.trim();
                    }
                }
            }
        }
        return altname;
    }

    private Integer getTablaSincronizada(Long seccion, Integer esSeccionMultiple, Integer esClaseSincronizada, Integer esSeccionSincronizada, Integer esPropiedadSincronizada) {
        Integer es = null;
        if (seccion > 0) { /* seccion o propiedad multiple */
            if (esSeccionMultiple == 1) { /* seccion multiple */
                es = esSeccionSincronizada;
            } else { /* propiedad multiple */
                es = esPropiedadSincronizada;
            }
        } else {
            es = esClaseSincronizada;
        }
        return es;
    }

    private Integer getColumnaSincronizada(Integer colid, Integer esTablaSincronizada, Integer esPropiedadSincronizada) {
        return colid < 0 ? esTablaSincronizada : esPropiedadSincronizada;
    }

    private void addClavesPrimarias(LinkedHashMap tablas) throws SQLException {
        String sql = "SELECT 1 AS keytype, tabname, NULL AS refname, keyname, colid, colname, ";
        sql += "NULL AS deleterule, NULL AS updaterule, id_propiedad_clase AS property ";
        sql += "FROM vista_script_claves_primarias ORDER BY tabname, keyname, colid";
        this.addClaves(tablas, sql);
    }

    private void addClavesForaneas(LinkedHashMap tablas) throws SQLException {
        String sql = "SELECT 2 AS keytype, tabname, refname, keyname, colid, colname, deleterule, updaterule, id_propiedad_clase AS property ";
        sql += "FROM vista_script_claves_foraneas ORDER BY tabname, keyname, colid";
        this.addClaves(tablas, sql);
    }

    private void addClavesUnicas(LinkedHashMap tablas) throws SQLException {
        String sql = "SELECT 3 AS keytype, tabname, NULL AS refname, indname AS keyname, colid, colname, ";
        sql += "NULL AS deleterule, NULL AS updaterule, id_propiedad_clase AS property ";
        sql += "FROM vista_script_indices_unicos ORDER BY tabname, indname, colid";
        this.addClaves(tablas, sql);
    }

    private void addClavesDuplicadas(LinkedHashMap tablas) throws SQLException {
        String sql = "SELECT 4 AS keytype, tabname, NULL AS refname, indname AS keyname, colid, colname, ";
        sql += "NULL AS deleterule, NULL AS updaterule, id_propiedad_clase AS property ";
        sql += "FROM vista_script_indices ORDER BY tabname, indname, colid";
        this.addClaves(tablas, sql);
    }

    private void addClaves(LinkedHashMap tablas, String sql) throws SQLException {
        this.resultSet = TLC.getAgenteSql().executeQuery(sql);
        if (this.resultSet.next()) {
            Integer keytype = null;
            String tabname = null;
            String refname = null;
            String keyname = null;
            Integer colid = null;
            String colname = null;
            String deleterule = null;
            String updaterule = null;
            Long property = null;
            String tabla_anterior = null;
            String clave_anterior = null;
            Tabla t = null;
            Clave k = null;
            do {
                keytype = (Integer) this.resultSet.getObject("keytype");
                tabname = this.resultSet.getString("tabname");
                refname = this.resultSet.getString("refname");
                keyname = this.resultSet.getString("keyname");
                colid = (Integer) this.resultSet.getObject("colid");
                colname = this.resultSet.getString("colname");
                deleterule = this.resultSet.getString("deleterule");
                updaterule = this.resultSet.getString("updaterule");
                property = (Long) this.resultSet.getObject("property");
                if (!tabname.equals(tabla_anterior)) {
                    tabla_anterior = tabname;
                    clave_anterior = null;
                    t = (Tabla) tablas.get(tabname);
                }
                if (t != null) {
                    if (!keyname.equals(clave_anterior)) {
                        clave_anterior = keyname;
                        k = t.addClave(keyname, keytype);
                        if (refname != null) {
                            Tabla r = (Tabla) tablas.get(refname);
                            if (r == null) {
                                k.setNombreTablaReferenciada(refname);
                            } else {
                                k.setNombreTablaReferenciada(r.getNombre());
                            }
                            k.setReglaDelete(deleterule);
                            k.setReglaUpdate(updaterule);
                        }
                    }
                    k.addColumna(t.getColumna(colname, property));
                }
            } while (this.resultSet.next());
        }
        this.resultSet.close();
    }

    public void close() {
        DB.close(this.resultSet);
    }
}
