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

import com.egt.base.constants.EAB;
import com.egt.base.enums.EnumTipoPagina;
import com.egt.base.util.BundleInformes;
import com.egt.core.db.util.DB;
import com.egt.core.util.STP;
import com.egt.ejb.core.sqlagent.SqlAgentBrokerLocal;
import com.egt.ejb.persistence.entity.Aplicacion;
import com.egt.ejb.persistence.entity.ClaseRecursoPar;
import com.egt.ejb.persistence.entity.Pagina;
import com.egt.ejb.persistence.entity.TipoPagina;
import com.egt.ejb.persistence.entity.catalog.SystemColumn;
import com.egt.ejb.persistence.entity.catalog.SystemColumnConstraint;
import com.egt.ejb.persistence.facade.DominioFacadeLocal;
import com.egt.ejb.persistence.facade.catalog.SystemTableFacadeLocal;
import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.commons.lang.StringEscapeUtils;
import org.apache.commons.lang.StringUtils;

public class ToolKitUtils {

    public static final String PREFIJO_PAQUETE = "com.egt";

    public static boolean mkdir(String dirs) {
        File file = new File(dirs);
        return file.mkdir();
    }

    public static boolean mkdirs(String dirs) {
        File file = new File(dirs);
        return file.mkdirs();
    }

    public static String mkEjbSrcDir(String root, String project) {
        return mkEjbSrcDir(root, project, null);
    }

    public static String mkEjbSrcDir(String root, String project, String subproject) {
        String sep = System.getProperties().getProperty("file.separator");
        String com = PREFIJO_PAQUETE.replace(".", sep);
        String ejb = getEjbPackageName(project).replace(".", sep);
        String sub = StringUtils.isBlank(subproject) ? "" : sep + subproject.replace("-", sep).replace(".", sep);
        String dir = StringUtils.chomp(root, sep) + sep + project + sep + "src" + sep + "java" + sep + com + sep + ejb + sub;
        mkdirs(dir);
        return dir + sep;
    }

    public static String mkLibSrcDir(String root, String project) {
        return mkLibSrcDir(root, project, null);
    }

    public static String mkLibSrcDir(String root, String project, String subproject) {
        String sep = System.getProperties().getProperty("file.separator");
        String com = PREFIJO_PAQUETE.replace(".", sep);
        String lib = getLibPackageName(project).replace(".", sep);
        String sub = StringUtils.isBlank(subproject) ? "" : sep + subproject.replace("-", sep).replace(".", sep);
        String dir = StringUtils.chomp(root, sep) + sep + project + sep + "src" + sep + com + sep + lib + sub;
        mkdirs(dir);
        return dir + sep;
    }

    public static String mkLibDir(String root, String project) {
        return mkLibDir(root, project, null);
    }

    public static String mkLibDir(String root, String project, String subproject) {
        String sep = System.getProperties().getProperty("file.separator");
        String sub = StringUtils.isBlank(subproject) ? "" : sep + subproject.replace("-", sep).replace(".", sep);
        String dir = StringUtils.chomp(root, sep) + sep + project + sub;
        mkdirs(dir);
        return dir + sep;
    }

    public static String makeNetBeansWebProjectDirectoryTree(String root, String project) {
        String sep = System.getProperties().getProperty("file.separator");
        String com = PREFIJO_PAQUETE.replace(".", sep);
        String web = getWebPackageName(project).replace(".", sep);
        String dir = StringUtils.chomp(root, sep) + sep + project + sep;
        mkdirs(dir + "nbproject" + sep + "private");
        mkdirs(dir + "setup");
        mkdirs(dir + "src" + sep + "conf");
        mkdirs(dir + "src" + sep + "java" + sep + com + sep + web);
        mkdirs(dir + "test");
        mkdirs(dir + "web" + sep + "resources");
        mkdirs(dir + "web" + sep + "WEB-INF");
        return dir;
    }

    public static String getenv(String name) {
        String var = EAB.ENTERPRISE_APPLICATION_CODE.toUpperCase() + "_" + name;
        return StringUtils.trimToEmpty(System.getenv(var));
    }

    public static String getWebTmpPrj() {
        String var = EAB.ENTERPRISE_APPLICATION_CODE.toUpperCase() + "_" + "WEB_TEMPLATE_PROJECT_NAME";
        return System.getenv(var);
    }

    public static String getWebTmpPrjDir() {
        String var = EAB.ENTERPRISE_APPLICATION_CODE.toUpperCase() + "_" + "WEB_TEMPLATE_PROJECT_ROOT";
        String sep = System.getProperties().getProperty("file.separator");
        String dir = System.getenv(var);
        return dir + sep + getWebTmpPrj() + sep;
    }

    public static String getWorkspaceDir() {
        String var = EAB.ENTERPRISE_APPLICATION_CODE.toUpperCase() + "_" + "WORKSPACE";
        String sep = System.getProperties().getProperty("file.separator");
        String dir = System.getenv(var);
        return dir + sep;
    }

    public static String getWebPrjDir(String root, String project) {
        String sep = System.getProperties().getProperty("file.separator");
        String dir = StringUtils.chomp(root, sep) + sep + project;
        return dir + sep;
    }

    public static String getWebDir(String root, String project) {
        String sep = System.getProperties().getProperty("file.separator");
        String dir = StringUtils.chomp(root, sep) + sep + project + sep + "web";
        return dir + sep;
    }

    public static String getWebInfDir(String root, String project) {
        String sep = System.getProperties().getProperty("file.separator");
        String dir = StringUtils.chomp(root, sep) + sep + project + sep + "web" + sep + "WEB-INF";
        return dir + sep;
    }

    public static String getWebSrcDir(String root, String project) {
        String sep = System.getProperties().getProperty("file.separator");
        String com = PREFIJO_PAQUETE.replace(".", sep);
        String web = getWebPackageName(project).replace(".", sep);
        String dir = StringUtils.chomp(root, sep) + sep + project + sep + "src" + sep + "java" + sep + com + sep + web;
        return dir + sep;
    }

    public static String getCamelCase(String string) {
        return STP.getCamelCase(string);
    }

    public static String getLowerCamelCase(String string) {
        return STP.getCamelCase(string);
    }

    public static String getUpperCamelCase(String string) {
        return STP.getCamelCase('_' + string.trim());
    }

    public static String getSpaceCamelCase(String string) {
        return STP.getCamelCase('_' + string.trim(), " ");
    }

    public static String getEjbPackageName(String string) {
        return getPackageName(string, "ejb");
    }

    public static String getLibPackageName(String string) {
        return getPackageName(string, "lib").replace("lib.", "");
    }

    public static String getWebPackageName(String string) {
        return getPackageName(string, "web");
    }

    public static String getPackageName(String string, String keyword) {
        if (string == null) {
            return null;
        }
        String x = string.trim();
        String y = x.replace('-', '.');
        int i;
        if (y.endsWith('.' + keyword)) {
            i = y.indexOf('.' + keyword);
        } else {
            i = y.indexOf('.' + keyword + '.');
        }
        if (i > 0) {
            y = y.substring(i + 1);
        }
        return y;
    }

    public static String getToken(String string) {
        return getToken(string, 0);
    }

    public static String getToken(String string, int index) {
        if (string == null) {
            return null;
        }
        String[] tokens = string.split("_");
        return tokens == null || tokens.length == 0 ? string : index < tokens.length ? tokens[index] : tokens[tokens.length - 1];
    }

    public static String getIdless(String string) {
        if (string == null) {
            return null;
        }
        if (string.startsWith("id_")) {
            return string.substring(3);
        }
        return string;
    }

    public static String getUnderscoreless(String string) {
        if (string == null) {
            return null;
        }
        return string.replace('_', ' ').trim();
    }

    public static String getStringAscii(String string) {
        return STP.getStringAscii(string);
    }

    public static String getStringUtf8(String string) {
        return STP.getStringUtf8(string);
    }

    public static String getStringHtml(String string) {
        return StringEscapeUtils.escapeHtml(string);
    }

    public static String getStringJava(String string) {
        String s = StringEscapeUtils.escapeJava(string);
        return s == null ? null : s.replace("\\/", "/");
    }

    public static String getStringXml(String string) {
        return StringEscapeUtils.escapeXml(string);
    }

    public static String concatenate(String string1, String string2) {
        String s1 = StringUtils.trimToEmpty(string1);
        String s2 = StringUtils.trimToEmpty(string2);
        if (StringUtils.isEmpty(s1)) {
            return s2;
        } else if (StringUtils.isEmpty(s2)) {
            return s1;
        } else {
            return s1 + ' ' + s2;
        }
    }

    public static Collection sortApplicationPagesCollection(Collection c) {
        List<Pagina> list = (List<Pagina>) c;
        return ColUtils.sort(list, applicationPagesComparator());
    }

    private static Comparator<Pagina> applicationPagesComparator() {
        return new Comparator<Pagina>() {

            @Override
            public int compare(Pagina x, Pagina y) {
                String nx = StringUtils.trimToEmpty(x.getNombrePagina());
                String ny = StringUtils.trimToEmpty(y.getNombrePagina());
                int c = nx.compareToIgnoreCase(ny);
                return c == 0 ? x.compareTo(y) : c;
            }

        };
    }

    public static Collection sortCollection(Collection c) {
        return ColUtils.sort(c);
    }

    public static Collection sortIncludedFieldsMap(Map map) {
        List<ClaseRecursoPar> list = new ArrayList<>(map.values());
        return ColUtils.sort(list, includedFieldsComparator());
    }

    private static Comparator<ClaseRecursoPar> includedFieldsComparator() {
        return new Comparator<ClaseRecursoPar>() {

            @Override
            public int compare(ClaseRecursoPar x, ClaseRecursoPar y) {
                int c = x.getClaseRecursoIdClaseRecurso().compareTo(y.getClaseRecursoIdClaseRecurso());
                if (c == 0) {
                    int opsx = 0;
                    long idsx = 0;
                    if (x.getClaseRecursoSecIdClaseRecursoSec() != null) {
                        opsx = x.getClaseRecursoSecIdClaseRecursoSec().getOrdenPresentacion();
                        idsx = x.getClaseRecursoSecIdClaseRecursoSec().getIdClaseRecursoSec();
                    }
                    int opsy = 0;
                    long idsy = 0;
                    if (y.getClaseRecursoSecIdClaseRecursoSec() != null) {
                        opsy = y.getClaseRecursoSecIdClaseRecursoSec().getOrdenPresentacion();
                        idsy = y.getClaseRecursoSecIdClaseRecursoSec().getIdClaseRecursoSec();
                    }
                    c = opsx - opsy;
                    if (c == 0) {
                        c = idsx > idsy ? 1 : idsx < idsy ? -1 : 0;
                        if (c == 0) {
                            c = x.getOrdenPresentacion() - y.getOrdenPresentacion();
                            if (c == 0) {
                                return x.getIdClaseRecursoPar().compareTo(y.getIdClaseRecursoPar());
                            }
                        }
                    }
                }
                return c;
            }

        };
    }

    public static String getLowerJavaIdentifier(String string) {
        if (string == null) {
            return null;
        }
        return STP.getIdentificadorJava(string.trim());
    }

    public static String getUpperJavaIdentifier(String string) {
        if (string == null) {
            return null;
        }
        return STP.getIdentificadorJava('_' + string.trim());
    }

    public static String getLowerCaseSqlIdentifier(String string) {
        if (string == null) {
            return null;
        }
        return STP.getIdentificadorSql(string).toLowerCase();
    }

    public static String getUpperCaseSqlIdentifier(String string) {
        if (string == null) {
            return null;
        }
        return STP.getIdentificadorSql(string).toUpperCase();
    }

    public static String getLowerCaseEnumOptionIdentifier(String string) {
        if (string == null) {
            return null;
        }
        String s;
        s = STP.getIdentificadorSql(string);
        s = StringUtils.removeStart(s, "_");
        s = StringUtils.removeEnd(s, "_");
        return s.toLowerCase();
    }

    public static String getUpperCaseEnumOptionIdentifier(String string) {
        if (string == null) {
            return null;
        }
        return getLowerCaseEnumOptionIdentifier(string).toUpperCase();
    }

    public static String getValueRange(SystemColumn column) {
        String comp;
        String expr;
        String mini;
        String maxi;
        int t = column.getColtype();
        int p = column.getColprec();
        int s = column.getColscale();
        switch (t) {
            case 2:
                mini = "0.0";
                maxi = "1.0E" + (p > s ? p - s - 1 : 0);
                break;
            case 4:
                mini = "0";
                maxi = "1000000000";
                break;
            case 5:
                mini = "0";
                maxi = "1000000000000000000";
                break;
            default:
                mini = "";
                maxi = "";
                break;
        }
        for (SystemColumnConstraint constraint : column.getTabid().getColumnConstraints()) {
            if (constraint.getColno().equals(column.getColno())) {
                expr = constraint.getConexpr();
                comp = column.getColname() + " >= ";
                if (expr.indexOf(comp) >= 0) {
                    mini = getValueLimit(expr, comp);
                }
                comp = column.getColname() + " <= ";
                if (expr.indexOf(comp) >= 0) {
                    maxi = getValueLimit(expr, comp);
                }
            }
        }
        return mini + "_" + maxi + "_";
    }

    private static String getValueLimit(String expr, String comp) {
        String value = "";
        int i, j, k;
        i = expr.indexOf(comp);
        if (i >= 0) {
            j = expr.indexOf(")", i);
            if (j > i) {
                value = expr.substring(i + comp.length(), j);
                value = value.replace("(", "");
                k = value.indexOf(":");
                if (k >= 0) {
                    value = value.substring(0, k);
                }
            }
        }
        return value;
    }

    public static String getCodigoFuncionAlterno(String codigoFuncion, String codigoDominio) {
        String alterno = StringUtils.trimToEmpty(codigoFuncion).toLowerCase();
        String dominio = StringUtils.trimToEmpty(codigoDominio).toLowerCase();
        alterno = StringUtils.removeStart(alterno, dominio);
        alterno = StringUtils.chomp(alterno, dominio);
        alterno = alterno.replace("_" + dominio + "_", "_");
        alterno = StringUtils.removeStart(alterno, "_");
        alterno = StringUtils.chomp(alterno, "_");
        alterno = dominio + "_" + alterno;
        return alterno;
    }

    public static String getCodigoArchivoInforme(String codigoFuncion, String codigoDominio) {
        String alterno = StringUtils.trimToEmpty(codigoFuncion).toLowerCase();
        String dominio = StringUtils.trimToEmpty(codigoDominio).toLowerCase();
        alterno = StringUtils.removeStart(alterno, "emitir_");
        alterno = StringUtils.removeStart(alterno, "informar_");
        alterno = StringUtils.removeStart(alterno, "exportar_");
        alterno = StringUtils.removeStart(alterno, dominio);
        alterno = StringUtils.chomp(alterno, dominio);
        alterno = alterno.replace("_" + dominio + "_", "_");
        alterno = StringUtils.removeStart(alterno, "_");
        alterno = StringUtils.chomp(alterno, "_");
        alterno = dominio + "_" + alterno;
        return alterno;
    }

    public static String getPatronParametrizado(String string) {
        String patron = StringUtils.trimToEmpty(string);
        String[] subs = StringUtils.substringsBetween(patron, "{", "}");
        if (subs != null) {
            int i = 0;
            for (String sub : subs) {
                patron = patron.replace("{" + sub + "}", "{" + i++ + "}");
            }
        }
        return patron;
    }

    public static String[] getParametros(String string) {
//      Bitacora.trace(ToolKitUtils.class, "getParametros", string);
        String trimToEmpty = StringUtils.trimToEmpty(string);
        String[] substringsBetween = StringUtils.substringsBetween(trimToEmpty, "{", "}");
        String[] substringsToEmpty = substringsBetween == null ? new String[]{} : substringsBetween;
//      Bitacora.trace(substringsToEmpty.toString());
        return substringsToEmpty;
    }

    public static String getFuncionSelectInforme(String informe) {
        return StringUtils.trimToEmpty(BundleInformes.getFuncionSelect(informe));
    }

    public static Map newMap() {
        return new LinkedHashMap();
    }

    public static String getCopyright(Integer cr) {
        long l = cr == null ? -1L : cr.longValue();
        return getCopyright(l);
    }

    public static String getCopyright(Long cr) {
        long l = cr == null ? -1L : cr.longValue();
        return l < 0
                ? Bundle.getString("copyright.default")
                : l < 20000
                ? Bundle.getString("copyright.general")
                : l < 30000
                ? Bundle.getString("copyright.generic")
                : Bundle.getString("copyright.cliente");
    }

    public static String xmltranslabel(String label) {
        return getStringXml(translabel(label));
    }

    public static String translabel(String label) {
        if (StringUtils.isBlank(label)) {
            return "";
        }
        String key;
        Set<String> keySet = BundlePalabras.getKeySet();
        String[] tokens = StringUtils.split(StringUtils.trimToEmpty(label));
        for (int i = 0; i < tokens.length; i++) {
            key = tokens[i].toLowerCase();
            if (keySet.contains(key)) {
                tokens[i] = BundlePalabras.getString(key);
            }
            tokens[i] = StringUtils.trimToEmpty(tokens[i]);
            // acentuar la última sílaba
            if (tokens[i].length() > 3 && tokens[i].endsWith("on")) {
                tokens[i] = tokens[i].substring(0, tokens[i].length() - 2) + "ón";
            }
        }
        key = StringUtils.join(StringUtils.split(StringUtils.join(tokens, ' ')), ' ');
        String string = BundleEtiquetas.getString(key);
        return string.trim();
    }

    private ToolKitBeanLocator locator;

    public ToolKitUtils(ToolKitBeanLocator locator) {
        this.locator = locator;
    }

    public ToolKitBeanLocator getLocator() {
        return locator;
    }

    public long getCurrentTimeMillis() {
        return System.currentTimeMillis();
    }

    public DominioFacadeLocal getDominioFacade() {
        return locator.getDominioFacade();
    }

    public SystemTableFacadeLocal getSystemTableFacade() {
        return locator.getSystemTableFacade();
    }

    public SqlAgentBrokerLocal getSqlAgent() {
        return locator.getSqlAgent();
    }

    private Map pageMap1;

    private Map pageMap2;

    private Map pageMap3;

    private Map pageMap4;

    private Map pageMap5;

    private Map pageMap6;

    private Map pageMap7;

    public Map getPageMap1() {
        return pageMap1;
    }

    public Map getPageMap2() {
        return pageMap2;
    }

    public Map getPageMap3() {
        return pageMap3;
    }

    public Map getPageMap4() {
        return pageMap4;
    }

    public Map getPageMap5() {
        return pageMap5;
    }

    public Map getPageMap6() {
        return pageMap6;
    }

    public Map getPageMap7() {
        return pageMap7;
    }

    public void setPageMaps(List<Aplicacion> aplicaciones) {
        pageMap1 = newMap();
        pageMap2 = newMap();
        pageMap3 = newMap();
        pageMap4 = newMap();
        pageMap5 = newMap();
        pageMap6 = newMap();
        pageMap7 = newMap();
        Collections.sort(aplicaciones);
        for (Aplicacion aplicacion : aplicaciones) {
            Collection<Pagina> paginas = (Collection<Pagina>) sortCollection(aplicacion.getPaginaIdAplicacionCollection());
            for (Pagina pagina : paginas) {
                TipoPagina tipoPagina = pagina.getTipoPaginaNumeroTipoPagina();
                if (tipoPagina != null) {
                    if (pagina.getDominioIdDominio() != null && pagina.getDominioIdDominioMaestro() == null) {
                        EnumTipoPagina tp = EnumTipoPagina.valueOf(tipoPagina.getNumeroTipoPagina());
                        switch (tp) {
                            case TABLA:
                                pageMap1.put(pagina.getDominioIdDominio().getCodigoDominio(), pagina);
                                break;
                            case DETALLE:
                                pageMap2.put(pagina.getDominioIdDominio().getCodigoDominio(), pagina);
                                break;
                            case ARBOL:
                                pageMap3.put(pagina.getDominioIdDominio().getCodigoDominio(), pagina);
                                break;
                            case COMANDO:
                                pageMap4.put(pagina.getIdPagina().toString(), pagina);
                                break;
                            case CONSULTA_TABLA:
                                pageMap5.put(pagina.getDominioIdDominio().getCodigoDominio(), pagina);
                                break;
                            case CONSULTA_DETALLE:
                                pageMap6.put(pagina.getDominioIdDominio().getCodigoDominio(), pagina);
                                break;
                            case CONSULTA_ARBOL:
                                pageMap7.put(pagina.getDominioIdDominio().getCodigoDominio(), pagina);
                                break;
                            default:
                                break;
                        }
                    }
                }
            }
        }
    }

    public Map enumMap(String tabname) {
        Map map = newMap();
        if (StringUtils.isNotBlank(tabname)) {
            String tabla = tabname.trim();
            String numero = "numero_" + tabla;
            String codigo = tabla.equals("opcion_binaria") ? "codigo_opcion_si_no" : "codigo_" + tabla;
            String comando = "SELECT " + numero + ", " + codigo + " FROM " + tabla + " ORDER BY " + numero;
            String sql1 = comando;
            Object resultado1;
            ResultSet resultSet1 = null;
            Object objeto1;
            String objeto2;
            try {
                if (this.getSqlAgent().connected()) {
                    resultado1 = this.getSqlAgent().executeQuery(sql1);
                    if (resultado1 != null && resultado1 instanceof ResultSet) {
                        resultSet1 = (ResultSet) resultado1;
                        while (resultSet1.next()) {
                            objeto1 = resultSet1.getObject(1);
                            objeto2 = resultSet1.getString(2);
                            if (objeto1 instanceof Integer && objeto2 instanceof String) {
                                map.put(objeto1.toString(), getLowerCaseEnumOptionIdentifier(objeto2));
                            }
                        }
                    }
                }
            } catch (SQLException e) {
//              TLC.getBitacora().fatal(e);
            } finally {
                DB.close(resultSet1);
            }
        }
        return map;
    }

    public Map enumLabelsMap(String tabname) {
        Map map = newMap();
        if (StringUtils.isNotBlank(tabname)) {
            String tabla = tabname.trim();
            String numero = "numero_" + tabla;
            String codigo = tabla.equals("opcion_binaria") ? "codigo_opcion_si_no" : "codigo_" + tabla;
            String comando = "SELECT " + numero + ", " + codigo + " FROM " + tabla + " ORDER BY " + numero;
            String sql1 = comando;
            Object resultado1;
            ResultSet resultSet1 = null;
            Object objeto1;
            String objeto2;
            try {
                if (this.getSqlAgent().connected()) {
                    resultado1 = this.getSqlAgent().executeQuery(sql1);
                    if (resultado1 != null && resultado1 instanceof ResultSet) {
                        resultSet1 = (ResultSet) resultado1;
                        while (resultSet1.next()) {
                            objeto1 = resultSet1.getObject(1);
                            objeto2 = resultSet1.getString(2);
                            if (objeto1 instanceof Integer && objeto2 instanceof String) {
                                map.put(objeto1.toString(), objeto2);
                            }
                        }
                    }
                }
            } catch (SQLException e) {
//              TLC.getBitacora().fatal(e);
            } finally {
                DB.close(resultSet1);
            }
        }
        return map;
    }

    public Object put(Map map, Object key, Object value) {
        Object put = map.put(key, value);
        return put == null ? key : put;
    }

}
