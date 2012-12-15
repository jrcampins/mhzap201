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

import com.egt.base.entity.constants.AplicacionConstants;
import com.egt.base.entity.constants.OpcionMenuConstants;
import com.egt.base.enums.EnumTipoPagina;
import com.egt.base.jms.messages.AbstractMessage;
import com.egt.base.persistence.enums.EnumTipoQuery;
import com.egt.commons.util.ThrowableUtils;
import com.egt.core.aplicacion.Bitacora;
import com.egt.core.aplicacion.TLC;
import com.egt.core.util.EA;
import com.egt.core.util.Utils;
import com.egt.core.util.VelocityEngineer;
import com.egt.ejb.core.sqlagent.SqlAgentBrokerLocal;
import com.egt.ejb.persistence.entity.*;
import com.egt.ejb.persistence.entity.catalog.SystemRoutine;
import com.egt.ejb.persistence.entity.catalog.SystemTable;
import com.egt.ejb.persistence.facade.*;
import com.egt.ejb.persistence.facade.catalog.SystemRoutineFacadeLocal;
import com.egt.ejb.persistence.facade.catalog.SystemTableFacadeLocal;
import java.io.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.ejb.Stateless;
import javax.jms.JMSException;
import org.apache.commons.lang.StringEscapeUtils;
import org.apache.velocity.VelocityContext;

/*
 * @DeclareRoles({"analyst", "designer", "programmer"})
 */
@Stateless
public class ToolKitSessionBean implements ToolKitSessionLocal {

    private static final boolean REFRESH = false;

    @EJB
    private ToolKitMessengerLocal messenger;

    @EJB
    private AplicacionFacadeLocal aplicacionFacade;

    @EJB
    private DominioFacadeLocal dominioFacade;

    @EJB
    private FuncionFacadeLocal funcionFacade;

    @EJB
    private PaginaFacadeLocal paginaFacade;

    @EJB
    private RolFacadeLocal rolFacade;

    @EJB
    private SystemRoutineFacadeLocal systemRoutineFacade;

    @EJB
    private SystemTableFacadeLocal systemTableFacade;

    @EJB
    private SqlAgentBrokerLocal sqlAgent;

//  @RolesAllowed({"analyst", "designer"})
    @Override
    public void generar(ToolKitMessage message) {
        this.generarEntityClass();
        this.generarFacade();
        this.generarURX();
        this.generarBundles();
        this.generarEntityConstants();
        this.generarJasperReport();
        this.generarJasperViews();
        this.generarWebViews();
        this.generarBusinessMessage();
        this.generarBusinessProcess();
        this.generarMenu(message);
    }

//  @RolesAllowed({"analyst", "designer"})
    @Override
    public void generarEntityClass() {
        try {
            VelocityContext context = new VelocityContext();
            String query = VelocityEngineer.write(context, "sdk-query-generar-entity-class.vm").toString();
            List<SystemTable> systemTables = systemTableFacade.findByQuery(query, EnumTipoQuery.NATIVE, REFRESH);
            generarEntityClass(systemTables);
            TLC.getBitacora().info(Bundle.getString("generar.entities.ok"), systemTables.size());
        } catch (Exception ex) {
//          TLC.getBitacora().fatal(ex);
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
    }

//  @RolesAllowed({"analyst", "designer"})
    @Override
    public void generarEntityClass(Integer id) throws Exception {
        generarEntityClass(systemTableFacade.find(id));
    }

//  @RolesAllowed({"analyst", "designer"})
    @Override
    public void generarEntityClass(List<SystemTable> systemTables) throws Exception {
        for (SystemTable systemTable : systemTables) {
            generarEntityClass(systemTable);
        }
    }

//  @RolesAllowed({"analyst", "designer"})
    @Override
    public void generarEntityClass(SystemTable systemTable) throws Exception {
        String root = ToolKitUtils.getWorkspaceDir();
        String filedir = ToolKitUtils.mkEjbSrcDir(root, EA.getLowerCaseCode() + "-ejb-persistence", "entity");
        String filename = filedir + ToolKitUtils.getCamelCase('_' + systemTable.getTabname()) + ".java";
        ToolKitUtils utils = this.getToolKitUtils();
        VelocityContext context = new VelocityContext();
        context.put("utils", utils);
        context.put("systable", systemTable);
        write(context, "sdk-plantilla-entity-class.vm", filename);
//
        filedir = ToolKitUtils.mkLibSrcDir(root, EA.getLowerCaseCode() + "-lib-base", "persistence.entity");
        filename = filedir + ToolKitUtils.getCamelCase('_' + systemTable.getTabname()) + "Base.java";
        write(context, "sdk-plantilla-entity-base.vm", filename);
//
        Dominio dominio = dominioFacade.findByCodigo(systemTable.getTabname());
        String paquete = dominio.getPaqueteIdPaquete().getCodigoPaquete();
        paquete = paquete.replace("general", "comun").replace("generic", "generica").replace("specific", "especifica");
        context.put("paquete", paquete);
        filedir = ToolKitUtils.mkLibSrcDir(root, "meta", "entidad-" + paquete + "-abstracta");
        filename = filedir + ToolKitUtils.getCamelCase('_' + systemTable.getTabname()) + ".java";
        write(context, "sdk-plantilla-meta-entidad-1.vm", filename);
        filedir = ToolKitUtils.mkLibSrcDir(root, "meta", "entidad-" + paquete + "-concreta");
        filename = filedir + ToolKitUtils.getCamelCase('_' + systemTable.getTabname()) + ".java";
        write(context, "sdk-plantilla-meta-entidad-2.vm", filename);
//      filedir = ToolKitUtils.mkLibSrcDir(root, "meta", "entidad-" + paquete + "-concreta");
//      filename = filedir + ToolKitUtils.getCamelCase('_' + systemTable.getTabname()) + ".java";
//      write(context, "sdk-plantilla-meta-entidad-3.vm", filename);
    }

//  @RolesAllowed({"analyst", "designer"})
    @Override
    public void generarFacade() {
        try {
            VelocityContext context = new VelocityContext();
            String query = VelocityEngineer.write(context, "sdk-query-generar-facade.vm").toString();
            List<SystemTable> systemTables = systemTableFacade.findByQuery(query, EnumTipoQuery.NATIVE, REFRESH);
            generarFacade(systemTables);
            TLC.getBitacora().info(Bundle.getString("generar.facades.ok"), systemTables.size());
        } catch (Exception ex) {
//          TLC.getBitacora().fatal(ex);
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
    }

//  @RolesAllowed({"analyst", "designer"})
    @Override
    public void generarFacade(Integer id) throws Exception {
        generarFacade(systemTableFacade.find(id));
    }

//  @RolesAllowed({"analyst", "designer"})
    @Override
    public void generarFacade(List<SystemTable> systemTables) throws Exception {
        for (SystemTable systemTable : systemTables) {
            generarFacade(systemTable);
        }
    }

//  @RolesAllowed({"analyst", "designer"})
    @Override
    public void generarFacade(SystemTable systemTable) throws Exception {
        String root = ToolKitUtils.getWorkspaceDir();
        String filedir = ToolKitUtils.mkEjbSrcDir(root, EA.getLowerCaseCode() + "-ejb-persistence", "facade");
        String filename;
        ToolKitUtils utils = this.getToolKitUtils();
        VelocityContext context = new VelocityContext();
        context.put("utils", utils);
        context.put("systable", systemTable);
//
        filename = filedir + ToolKitUtils.getCamelCase('_' + systemTable.getTabname()) + "Facade.java";
        write(context, "sdk-plantilla-facade.vm", filename);
//
        filename = filedir + ToolKitUtils.getCamelCase('_' + systemTable.getTabname()) + "FacadeLocal.java";
        write(context, "sdk-plantilla-facade-local.vm", filename);
//
        filedir = ToolKitUtils.mkLibSrcDir(root, EA.getLowerCaseCode() + "-lib-base", "persistence.facade");
        filename = filedir + ToolKitUtils.getCamelCase('_' + systemTable.getTabname()) + "FacadeBase.java";
        write(context, "sdk-plantilla-facade-base.vm", filename);
    }

//  @RolesAllowed({"analyst", "designer"})
    @Override
    public void generarURX() {
        Utils.traceContext();
//      List<Aplicacion> aplicaciones = aplicacionFacade.findAll(REFRESH);
        List<Aplicacion> aplicaciones = aplicacionFacade.findAll(REFRESH);
        try {
            generarURX(aplicaciones);
            TLC.getBitacora().info(Bundle.getString("generar.urx.ok"));
        } catch (Exception ex) {
//          TLC.getBitacora().fatal(ex);
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
    }

//  @RolesAllowed({"analyst", "designer"})
    @Override
    public void generarURX(List<Aplicacion> aplicaciones) throws Exception {
        String root = ToolKitUtils.getWorkspaceDir();
        String filedir = ToolKitUtils.mkLibSrcDir(root, EA.getLowerCaseCode() + "-lib-base", "constants");
        String filename = filedir + "URX2.java";
        ToolKitUtils utils = this.getToolKitUtils();
        utils.setPageMaps(aplicaciones);
        VelocityContext context = new VelocityContext();
        context.put("utils", utils);
        context.put("aplicaciones", aplicaciones);
        write(context, "sdk-plantilla-urx-java.vm", filename);
    }

//  @RolesAllowed({"analyst", "designer"})
    @Override
    public void generarMenu(ToolKitMessage message) {
        try {
            String procedimiento = OpcionMenuConstants.PROCESO_FUNCION_RECONSTRUIR_OPCION_MENU;
            int index = 0;
            int length = 0;
            length++;
            Object[] args = length == 0 ? null : new Object[length];
            args[index++] = message.getRastro();
            sqlAgent.executeProcedure(procedimiento, args);
            message.setGrabarRastroPendiente(false);
            TLC.getBitacora().info(Bundle.getString("generar.menu.ok"));
        } catch (SQLException ex) {
            throw new EJBException(ex);
        }
    }

//  @RolesAllowed({"analyst", "designer"})
    @Override
    public void generarBundles() {
        Utils.traceContext();
        try {
            String root = ToolKitUtils.getWorkspaceDir();
            String filedir = ToolKitUtils.mkLibSrcDir(root, EA.getLowerCaseCode() + "-lib-base", "bundles");
            String filename;
            String query;
            ToolKitUtils utils = this.getToolKitUtils();
            VelocityContext context = new VelocityContext();
            context.put("utils", utils);
//
            List<SystemRoutine> procedimientos = systemRoutineFacade.findAll();
            context.put("procedimientos", procedimientos);
            filename = filedir + "BundleProcedimientos.properties";
            write(context, "sdk-plantilla-bundle-procedimientos-properties.vm", filename);
//
            query = VelocityEngineer.write(context, "sdk-query-generar-bundle-paginas-properties.vm").toString();
            List<Pagina> paginas = paginaFacade.findByQuery(query, EnumTipoQuery.NATIVE, REFRESH);
            context.put("paginas", paginas);
            filename = filedir + "BundlePaginas.properties";
            write(context, "sdk-plantilla-bundle-paginas-properties.vm", filename);
//
            query = VelocityEngineer.write(context, "sdk-query-generar-roles.vm").toString();
            List<Rol> roles = rolFacade.findByQuery(query, EnumTipoQuery.NATIVE, REFRESH);
            context.put("roles", roles);
            query = VelocityEngineer.write(context, "sdk-query-generar-funciones.vm").toString();
            List<Funcion> funciones = funcionFacade.findByQuery(query, EnumTipoQuery.NATIVE, REFRESH);
            context.put("funciones", funciones);
            List<Aplicacion> aplicaciones = getAplicaciones("sdk-query-generar-aplicaciones-3.vm");
            context.put("aplicaciones", aplicaciones);
            context.put(EA.class.getSimpleName(), EA.class);
            filedir = ToolKitUtils.mkLibDir(root, EA.getLowerCaseCode(), "src-conf");
            filename = filedir + "application.xml";
            write(context, "sdk-plantilla-application-xml.vm", filename);
            filename = filedir + "sun-application.xml";
            write(context, "sdk-plantilla-sun-application-xml.vm", filename);
//
            TLC.getBitacora().info(Bundle.getString("generar.bundles.ok"));
        } catch (Exception ex) {
//          TLC.getBitacora().fatal(ex);
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
    }

//  @RolesAllowed({"analyst", "designer"})
    @Override
    public void generarEntityConstants() {
        try {
            VelocityContext context = new VelocityContext();
            String query = VelocityEngineer.write(context, "sdk-query-generar-entity-constants.vm").toString();
            List<Dominio> dominios = dominioFacade.findByQuery(query, EnumTipoQuery.NATIVE, REFRESH);
            generarEntityConstants(dominios);
            TLC.getBitacora().info(Bundle.getString("generar.constants.ok"), dominios.size());
        } catch (Exception ex) {
//          TLC.getBitacora().fatal(ex);
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
    }

//  @RolesAllowed({"analyst", "designer"})
    @Override
    public void generarEntityConstants(Long id) throws Exception {
        generarEntityConstants(dominioFacade.find(id));
    }

//  @RolesAllowed({"analyst", "designer"})
    @Override
    public void generarEntityConstants(List<Dominio> dominios) throws Exception {
        for (Dominio dominio : dominios) {
            generarEntityConstants(dominio);
        }
    }

//  @RolesAllowed({"analyst", "designer"})
    @Override
    public void generarEntityConstants(Dominio dominio) throws Exception {
        String root = ToolKitUtils.getWorkspaceDir();
        String filedir;
        String filename;
        ToolKitUtils utils = this.getToolKitUtils();
        VelocityContext context = new VelocityContext();
        context.put("utils", utils);
        context.put("dominio", dominio);
//
        filedir = ToolKitUtils.mkLibSrcDir(root, EA.getLowerCaseCode() + "-lib-base", "entity-constants");
        filename = filedir + ToolKitUtils.getCamelCase('_' + dominio.getCodigoDominio()) + "Constants.java";
        write(context, "sdk-plantilla-entity-constants.vm", filename);
    }

//  @RolesAllowed({"designer", "programmer"})
    @Override
    public void generarJasperReport() {
        try {
            VelocityContext context = new VelocityContext();
            String query = VelocityEngineer.write(context, "sdk-query-generar-jasper-report.vm").toString();
            List<Dominio> dominios = dominioFacade.findByQuery(query, EnumTipoQuery.NATIVE, REFRESH);
            generarJasperReport(dominios);
            TLC.getBitacora().info(Bundle.getString("generar.informes.ok"), dominios.size());
        } catch (Exception ex) {
//          TLC.getBitacora().fatal(ex);
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
    }

//  @RolesAllowed({"designer", "programmer"})
    @Override
    public void generarJasperReport(Long id) throws Exception {
        generarJasperReport(dominioFacade.find(id, REFRESH));
    }

//  @RolesAllowed({"designer", "programmer"})
    @Override
    public void generarJasperReport(List<Dominio> dominios) throws Exception {
        for (Dominio dominio : dominios) {
            generarJasperReport(dominio);
        }
    }

//  @RolesAllowed({"designer", "programmer"})
    @Override
    public void generarJasperReport(Dominio dominio) throws Exception {
        String root = ToolKitUtils.getWorkspaceDir();
        String filedir = ToolKitUtils.mkLibDir(root, "management", "resources-jasper-reports-web");
        String filename = filedir + dominio.getCodigoDominio() + ".jrxml";
        ToolKitBeanLocator locator = this.getToolKitBeanLocator();
        ToolKitUtils utils = this.getToolKitUtils(locator);
        JasperReport jasperReport = new JasperReport(locator, dominio);
        jasperReport.designReport();
        if (jasperReport.getGroups().size() > 0) {
            VelocityContext context = new VelocityContext();
            context.put("utils", utils);
            context.put("jasperReport", jasperReport);
            write(context, "sdk-plantilla-informe-1-jrxml.vm", filename);
        }
    }

//  @RolesAllowed({"designer", "programmer"})
    @Override
    public void generarJasperViews() {
        try {
            VelocityContext context = new VelocityContext();
            String query = VelocityEngineer.write(context, "sdk-query-generar-jasper-query.vm").toString();
            List<Dominio> dominios = dominioFacade.findByQuery(query, EnumTipoQuery.NATIVE, REFRESH);
            generarJasperViews(dominios);
            TLC.getBitacora().info(Bundle.getString("generar.views.ok"), dominios.size());
        } catch (Exception ex) {
//          TLC.getBitacora().fatal(ex);
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
    }

//  @RolesAllowed({"designer", "programmer"})
    @Override
    public void generarJasperViews(List<Dominio> dominios) throws Exception {
        String root = ToolKitUtils.getWorkspaceDir();
//      String jqfiledir = ToolKitUtils.mkLibDir(root, "management", "resources-jasper-queries");
        String o9filedir = ToolKitUtils.mkLibDir(root, "management", "resources-database-ddl-oracle-views-jasper");
        String pgfiledir = ToolKitUtils.mkLibDir(root, "management", "resources-database-ddl-postgresql-views-jasper");
        String ssfiledir = ToolKitUtils.mkLibDir(root, "management", "resources-database-ddl-sqlserver-views-jasper");
        String filename;
        ToolKitBeanLocator locator = this.getToolKitBeanLocator();
        ToolKitUtils utils = this.getToolKitUtils(locator);
        VelocityContext context = new VelocityContext();
        context.put("utils", utils);
        JasperQuery query1;
//      JasperQuery query2;
//      List queries1 = new ArrayList();
//      List queries2 = new ArrayList();
        List queriesx = new ArrayList();
        for (Dominio dominio : dominios) {
            query1 = new JasperQuery(locator, dominio);
            query1.designQuery(1);
            context.put("jasperQuery", query1);
//          filename = jqfiledir + dominio.getCodigoDominio() + "_1.sql";
//          write(context, "sdk-plantilla-informe-1-sql.vm", filename);
//          queries1.add(query1);
            queriesx.clear();
            queriesx.add(query1);
            context.put("prefix", "informe_");
            context.put("suffix", "_1");
            context.put("queries", queriesx);
            filename = o9filedir + dominio.getCodigoDominio() + "_1.sql";
            write(context, "sdk-plantilla-vistas-informes-oracle.vm", filename);
            filename = pgfiledir + dominio.getCodigoDominio() + "_1.sql";
            write(context, "sdk-plantilla-vistas-informes-postgresql.vm", filename);
            filename = ssfiledir + dominio.getCodigoDominio() + "_1.sql";
            write(context, "sdk-plantilla-vistas-informes-sqlserver.vm", filename);
        }
    }

//  @RolesAllowed({"designer", "programmer"})
    @Override
    public void generarBusinessMessage() {
        try {
            VelocityContext context = new VelocityContext();
            String query = VelocityEngineer.write(context, "sdk-query-generar-mensajes.vm").toString();
            List<Funcion> funciones = funcionFacade.findByQuery(query, EnumTipoQuery.NATIVE, REFRESH);
            String root = ToolKitUtils.getWorkspaceDir();
            String filedir = ToolKitUtils.mkEjbSrcDir(root, EA.getLowerCaseCode() + "-ejb-business", "jms");
            String filename = filedir + "BusinessProcessBrokerBean.java";
            ToolKitUtils utils = this.getToolKitUtils();
            context.put("utils", utils);
            context.put("funciones", funciones);
            write(context, "sdk-plantilla-business-process-broker-java.vm", filename);
            generarBusinessMessage(funciones);
            TLC.getBitacora().info(Bundle.getString("generar.mensajes.ok"), funciones.size());
        } catch (Exception ex) {
//          TLC.getBitacora().fatal(ex);
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
    }

//  @RolesAllowed({"designer", "programmer"})
    @Override
    public void generarBusinessMessage(Long id) throws Exception {
        generarBusinessMessage(funcionFacade.find(id, REFRESH));
    }

//  @RolesAllowed({"designer", "programmer"})
    @Override
    public void generarBusinessMessage(List<Funcion> funciones) throws Exception {
        for (Funcion funcion : funciones) {
            generarBusinessMessage(funcion);
        }
    }

//  @RolesAllowed({"designer", "programmer"})
    @Override
    public void generarBusinessMessage(Funcion funcion) throws Exception {
        if (funcion.getDominioIdDominio() != null) {
            String root = ToolKitUtils.getWorkspaceDir();
            String filedir = ToolKitUtils.mkEjbSrcDir(root, EA.getLowerCaseCode() + "-ejb-business", "message");
            String filename = filedir + ToolKitUtils.getCamelCase('_' + funcion.getCodigoFuncion()) + "Message.java";
            ToolKitUtils utils = this.getToolKitUtils();
            VelocityContext context = new VelocityContext();
            context.put("utils", utils);
            context.put("funcion", funcion);
            write(context, "sdk-plantilla-business-message.vm", filename);
        }
    }

//  @RolesAllowed({"designer", "programmer"})
    @Override
    public void generarBusinessProcess() {
        try {
            VelocityContext context = new VelocityContext();
            String query = VelocityEngineer.write(context, "sdk-query-generar-procesos.vm").toString();
            List<Dominio> dominios = dominioFacade.findByQuery(query, EnumTipoQuery.NATIVE, REFRESH);
            generarBusinessProcess(dominios);
            TLC.getBitacora().info(Bundle.getString("generar.procesos.ok"), dominios.size());
        } catch (Exception ex) {
//          TLC.getBitacora().fatal(ex);
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
    }

//  @RolesAllowed({"designer", "programmer"})
    @Override
    public void generarBusinessProcess(Long id) throws Exception {
        generarBusinessProcess(dominioFacade.find(id, REFRESH));
    }

//  @RolesAllowed({"designer", "programmer"})
    @Override
    public void generarBusinessProcess(List<Dominio> dominios) throws Exception {
        for (Dominio dominio : dominios) {
            generarBusinessProcess(dominio);
        }
    }

//  @RolesAllowed({"designer", "programmer"})
    @Override
    public void generarBusinessProcess(Dominio dominio) throws Exception {
        String filedir;
        String filename;
        String root = ToolKitUtils.getWorkspaceDir();
        filedir = ToolKitUtils.mkEjbSrcDir(root, EA.getLowerCaseCode() + "-ejb-business", "process");
        ToolKitUtils utils = this.getToolKitUtils();
        VelocityContext context = new VelocityContext();
        context.put("utils", utils);
        context.put("dominio", dominio);
//
        filename = filedir + ToolKitUtils.getCamelCase('_' + dominio.getCodigoDominio()) + "BusinessProcessBean.java";
        write(context, "sdk-plantilla-business-process.vm", filename);
//
        filename = filedir + ToolKitUtils.getCamelCase('_' + dominio.getCodigoDominio()) + "BusinessProcessLocal.java";
        write(context, "sdk-plantilla-business-process-local.vm", filename);
//
        filedir = ToolKitUtils.mkEjbSrcDir(root, EA.getLowerCaseCode() + "-ejb-business", "process-logic");
//
        filename = filedir + ToolKitUtils.getCamelCase('_' + dominio.getCodigoDominio()) + "BusinessProcessLogicBean.java";
        write(context, "sdk-plantilla-business-process-logic.vm", filename);
//
        filename = filedir + ToolKitUtils.getCamelCase('_' + dominio.getCodigoDominio()) + "BusinessProcessLogicLocal.java";
        write(context, "sdk-plantilla-business-process-logic-local.vm", filename);
    }

//  @RolesAllowed({"designer", "programmer"})
    @Override
    public void generarPlantilla() {
//      List<Aplicacion> aplicaciones = aplicacionFacade.findAll(REFRESH);
        List<Aplicacion> aplicaciones = aplicacionFacade.findAll(REFRESH);
        try {
            generarPlantilla(aplicaciones);
            TLC.getBitacora().info(Bundle.getString("generar.aplicaciones.ok"), aplicaciones.size());
        } catch (Exception ex) {
//          TLC.getBitacora().fatal(ex);
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
    }

//  @RolesAllowed({"designer", "programmer"})
    @Override
    public void generarPlantilla(Long id) throws Exception {
        generarPlantilla(aplicacionFacade.find(id, REFRESH));
    }

//  @RolesAllowed({"designer", "programmer"})
    @Override
    public void generarPlantilla(List<Aplicacion> aplicaciones) throws Exception {
        for (Aplicacion aplicacion : aplicaciones) {
            copiarProyectoPlantillaAplicacionWeb(aplicacion);
            String root = ToolKitUtils.getWorkspaceDir();
            String project = aplicacion.getCodigoAplicacion();
            String filedir;
            String filename;
            ToolKitUtils.makeNetBeansWebProjectDirectoryTree(root, project);
            ToolKitUtils utils = this.getToolKitUtils();
            utils.setPageMaps(aplicaciones);
            VelocityContext context = new VelocityContext();
            context.put("utils", utils);
            context.put("aplicaciones", aplicaciones);
            context.put("aplicacion", aplicacion);
            context.put(EA.class.getSimpleName(), EA.class);
            filedir = ToolKitUtils.getWebInfDir(root, project);
            filename = filedir + "faces-config.xml";
            write(context, "sdk-plantilla-faces-config-xml.vm", filename);
            filename = filedir + "glassfish-web.xml";
            write(context, "sdk-plantilla-glassfish-web-xml.vm", filename);
//          filename = filedir + "sun-web.xml";
//          write(context, "sdk-plantilla-sun-web-xml.vm", filename);
            filename = filedir + "web.xml";
            write(context, "sdk-plantilla-web-xml.vm", filename);
        }
    }

//  @RolesAllowed({"designer", "programmer"})
    @Override
    public void generarPlantilla(Aplicacion aplicacion) throws Exception {
        copiarProyectoPlantillaAplicacionWeb(aplicacion);
    }

//  @RolesAllowed({"designer", "programmer"})
    @Override
    public void generarAplicaciones(ToolKitMessage message) throws JMSException {
//      this.generarAplicaciones(message, "sdk-query-generar-aplicaciones-1.vm");
        List<Aplicacion> aplicaciones = getAplicaciones("sdk-query-generar-aplicaciones-1.vm");
        this.generarAplicaciones(message, aplicaciones);
    }

//  @RolesAllowed({"designer", "programmer"})
    @Override
    public void generarAplicacionesEspecificas(ToolKitMessage message) throws JMSException {
//      this.generarAplicaciones(message, "sdk-query-generar-aplicaciones-2.vm");
        List<Aplicacion> aplicaciones = getAplicaciones("sdk-query-generar-aplicaciones-2.vm");
        this.generarAplicaciones(message, aplicaciones);
    }

    private void generarAplicaciones(ToolKitMessage root, List<Aplicacion> aplicaciones) throws JMSException {
        String metodo = "generarAplicaciones";
        Bitacora.trace(this.getClass(), metodo, root);
        try {
            List<AbstractMessage> messages = new ArrayList();
            ToolKitMessage message;
            for (Aplicacion aplicacion : aplicaciones) {
                message = new ToolKitMessage(EnumToolKitMessageType.GENERAR_APLICACION, AplicacionConstants.FUNCION_GENERAR_APLICACION);
                message.setRecurso(aplicacion.getIdAplicacion());
                messages.add(message);
            }
            messenger.forkRequest(root, messages);
        } catch (Exception ex) {
//          TLC.getBitacora().fatal(ex);
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
    }

//  @RolesAllowed({"designer", "programmer"})
    @Override
    public void generarWebViews() {
        try {
            VelocityContext context = new VelocityContext();
            String query = VelocityEngineer.write(context, "sdk-query-generar-web-query.vm").toString();
            List<Dominio> dominios = dominioFacade.findByQuery(query, EnumTipoQuery.NATIVE, REFRESH);
            generarWebViews(dominios);
            TLC.getBitacora().info(Bundle.getString("generar.views.ok"), dominios.size());
        } catch (Exception ex) {
//          TLC.getBitacora().fatal(ex);
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
    }

//  @RolesAllowed({"designer", "programmer"})
    @Override
    public void generarWebViews(List<Dominio> dominios) throws Exception {
        String root = ToolKitUtils.getWorkspaceDir();
//      String jqfiledir = ToolKitUtils.mkLibDir(root, "management", "resources-web-queries");
        String o9filedir = ToolKitUtils.mkLibDir(root, "management", "resources-database-ddl-oracle-views-web");
        String pgfiledir = ToolKitUtils.mkLibDir(root, "management", "resources-database-ddl-postgresql-views-web");
        String ssfiledir = ToolKitUtils.mkLibDir(root, "management", "resources-database-ddl-sqlserver-views-web");
        String filename;
        ToolKitBeanLocator locator = this.getToolKitBeanLocator();
        ToolKitUtils utils = this.getToolKitUtils(locator);
        VelocityContext context = new VelocityContext();
        context.put("utils", utils);
        JasperQuery query1;
//      JasperQuery query2;
//      List queries1 = new ArrayList();
//      List queries2 = new ArrayList();
        List queriesx = new ArrayList();
        for (Dominio dominio : dominios) {
            query1 = new JasperQuery(locator, dominio);
            query1.designQuery(1);
            context.put("jasperQuery", query1);
//          filename = jqfiledir + dominio.getCodigoDominio() + "_1.sql";
//          write(context, "sdk-plantilla-informe-1-sql.vm", filename);
//          queries1.add(query1);
            queriesx.clear();
            queriesx.add(query1);
            context.put("prefix", "consulta_");
            context.put("suffix", "_1");
            context.put("queries", queriesx);
            filename = o9filedir + dominio.getCodigoDominio() + "_1.sql";
            write(context, "sdk-plantilla-vistas-consultas-oracle.vm", filename);
            filename = pgfiledir + dominio.getCodigoDominio() + "_1.sql";
            write(context, "sdk-plantilla-vistas-consultas-postgresql.vm", filename);
            filename = ssfiledir + dominio.getCodigoDominio() + "_1.sql";
            write(context, "sdk-plantilla-vistas-consultas-sqlserver.vm", filename);
        }
    }

//  @RolesAllowed({"designer", "programmer"})
    @Override
    public void generarAplicacion() {
//      List<Aplicacion> aplicaciones = aplicacionFacade.findAll(REFRESH);
        List<Aplicacion> aplicaciones = getAplicaciones();
        try {
            generarAplicacion(aplicaciones);
            TLC.getBitacora().info(Bundle.getString("generar.aplicaciones.ok"), aplicaciones.size());
        } catch (Exception ex) {
//          TLC.getBitacora().fatal(ex);
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
    }

//  @RolesAllowed({"designer", "programmer"})
    @Override
    public void generarAplicacion(Long id) throws Exception {
        generarAplicacion(aplicacionFacade.find(id, REFRESH));
    }

//  @RolesAllowed({"designer", "programmer"})
    @Override
    public void generarAplicacion(List<Aplicacion> aplicaciones) throws Exception {
        for (Aplicacion aplicacion : aplicaciones) {
            generarAplicacion(aplicacion, aplicaciones);
        }
    }

//  @RolesAllowed({"designer", "programmer"})
    @Override
    public void generarAplicacion(Aplicacion aplicacion) throws Exception {
//      List<Aplicacion> aplicaciones = aplicacionFacade.findAll(REFRESH);
        List<Aplicacion> aplicaciones = getAplicaciones();
        generarAplicacion(aplicacion, aplicaciones);
    }

    private void generarAplicacion(Aplicacion aplicacion, List<Aplicacion> aplicaciones) throws Exception {
        copiarProyectoPlantillaAplicacionWeb(aplicacion);
        String root = ToolKitUtils.getWorkspaceDir();
        String project = aplicacion.getCodigoAplicacion();
        String filedir;
        String filename;
        ToolKitUtils.makeNetBeansWebProjectDirectoryTree(root, project);
        ToolKitUtils utils = this.getToolKitUtils();
        utils.setPageMaps(aplicaciones);
        VelocityContext context = new VelocityContext();
        context.put("utils", utils);
        context.put("aplicaciones", aplicaciones);
        context.put("aplicacion", aplicacion);
//
        filedir = ToolKitUtils.getWebSrcDir(root, project);
        filename = filedir + "Bundle.properties";
        write(context, "sdk-plantilla-bundle-properties.vm", filename);
//
//      filedir = ToolKitUtils.getWebSrcDir(root, project);
//      filename = filedir + "ApplicationBean1.java";
//      write(context, "sdk-plantilla-application-bean-1-java.vm", filename);
//
//      filedir = ToolKitUtils.getWebSrcDir(root, project);
//      filename = filedir + "RequestBean1.java";
//      write(context, "sdk-plantilla-request-bean-1-java.vm", filename);
//
        filedir = ToolKitUtils.getWebSrcDir(root, project);
        filename = filedir + "SessionBean1.java";
        write(context, "sdk-plantilla-session-bean-1-java.vm", filename);
//
        context.put(EA.class.getSimpleName(), EA.class);
        filedir = ToolKitUtils.getWebInfDir(root, project);
        filename = filedir + "faces-config.xml";
        write(context, "sdk-plantilla-faces-config-xml.vm", filename);
        filename = filedir + "glassfish-web.xml";
        write(context, "sdk-plantilla-glassfish-web-xml.vm", filename);
//      filename = filedir + "sun-web.xml";
//      write(context, "sdk-plantilla-sun-web-xml.vm", filename);
        filename = filedir + "web.xml";
        write(context, "sdk-plantilla-web-xml.vm", filename);
//
        for (Pagina pagina : aplicacion.getPaginaIdAplicacionCollection()) {
            generarPagina(pagina, aplicaciones);
        }
    }

//  @RolesAllowed({"designer", "programmer"})
    @Override
    public void generarPagina() {
//      List<Aplicacion> aplicaciones = aplicacionFacade.findAll(REFRESH);
        List<Aplicacion> aplicaciones = getAplicaciones();
        List<Pagina> paginas = paginaFacade.findAll(REFRESH);
        try {
            for (Pagina pagina : paginas) {
                generarPagina(pagina, aplicaciones);
            }
            TLC.getBitacora().info(Bundle.getString("generar.paginas.ok"), paginas.size());
        } catch (Exception ex) {
//          TLC.getBitacora().fatal(ex);
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
    }

//  @RolesAllowed({"designer", "programmer"})
    @Override
    public void generarPagina(List<Pagina> paginas) throws Exception {
//      List<Aplicacion> aplicaciones = aplicacionFacade.findAll(REFRESH);
        List<Aplicacion> aplicaciones = getAplicaciones();
        for (Pagina pagina : paginas) {
            generarPagina(pagina, aplicaciones);
        }
    }

//  @RolesAllowed({"designer", "programmer"})
    @Override
    public void generarPagina(Long id) throws Exception {
        generarPagina(paginaFacade.find(id, REFRESH));
    }

//  @RolesAllowed({"designer", "programmer"})
    @Override
    public void generarPagina(Pagina pagina) throws Exception {
//      List<Aplicacion> aplicaciones = aplicacionFacade.findAll(REFRESH);
        List<Aplicacion> aplicaciones = getAplicaciones();
        generarPagina(pagina, aplicaciones);
    }

    private void generarPagina(Pagina pagina, List<Aplicacion> aplicaciones) throws Exception {
        Aplicacion aplicacion = pagina.getAplicacionIdAplicacion();
        TipoPagina tipoPagina = pagina.getTipoPaginaNumeroTipoPagina();
        if (aplicacion == null || tipoPagina == null) {
            return;
        }
        int tipo = tipoPagina.getNumeroTipoPagina();
        Dominio dominio = pagina.getDominioIdDominio();
        Dominio maestro = pagina.getDominioIdDominioMaestro();
        Parametro joinpar = pagina.getParametroIdParametro();
        String root = ToolKitUtils.getWorkspaceDir();
        String project = pagina.getAplicacionIdAplicacion().getCodigoAplicacion();
        String filedir;
        String filename;
        ToolKitUtils.makeNetBeansWebProjectDirectoryTree(root, project);
        String tempname = this.getPlantillaPagina(tipo);
        ToolKitBeanLocator locator = this.getToolKitBeanLocator();
        ToolKitUtils utils = this.getToolKitUtils(locator);
        utils.setPageMaps(aplicaciones);
        VelocityContext context = new VelocityContext();
        context.put("utils", utils);
        context.put("aplicaciones", aplicaciones);
        context.put("pagina", pagina);
        context.put("nivel", Integer.valueOf(this.getNivelPagina(pagina)));
        if (dominio != null) {
            JasperQuery jasperQuery = new JasperQuery(locator, dominio);
            jasperQuery.designQuery(1);
            context.put("jasperQuery", jasperQuery);
        }
//
        filedir = ToolKitUtils.getWebDir(root, project);
        filename = filedir + pagina.getCodigoPagina() + ".jsp";
        write(context, tempname + "-jsp.vm", filename);
//
        filedir = ToolKitUtils.getWebSrcDir(root, project);
        filename = filedir + pagina.getCodigoPagina() + ".java";
        write(context, tempname + "-java.vm", filename);
//
        if (dominio != null && (tipo == EnumTipoPagina.TABLA.intValue() || tipo == EnumTipoPagina.CONSULTA_TABLA.intValue())) {
            filedir = ToolKitUtils.getWebSrcDir(root, project);
            filename = filedir + "PaginaActualizacion" + ToolKitUtils.getUpperCamelCase(dominio.getCodigoDominio());
            if (maestro != null && joinpar != null) {
                filename += "Por" + ToolKitUtils.getUpperCamelCase(ToolKitUtils.getIdless(joinpar.getCodigoParametro()));
            }
            filename += ".java";
            write(context, "sdk-plantilla-interfaz-pagina-actualizacion-java.vm", filename);
//
            filedir = ToolKitUtils.getWebSrcDir(root, project);
            filename = filedir + "AsistentePaginaActualizacion" + ToolKitUtils.getUpperCamelCase(dominio.getCodigoDominio());
            if (maestro != null && joinpar != null) {
                filename += "Por" + ToolKitUtils.getUpperCamelCase(ToolKitUtils.getIdless(joinpar.getCodigoParametro()));
            }
            filename += ".java";
            write(context, "sdk-plantilla-asistente-actualizacion-1-java.vm", filename);
//          /**/
//          filedir = ToolKitUtils.getWebSrcDir(root, project);
//          filename = filedir + "AsistentePaginaActualizacion" + ToolKitUtils.getUpperCamelCase(dominio.getCodigoDominio());
//          if (maestro != null && joinpar != null) {
//              filename += "Por" + ToolKitUtils.getUpperCamelCase(ToolKitUtils.getIdless(joinpar.getCodigoParametro()));
//          }
//          filename += "2.java";
//          write(context, "sdk-plantilla-asistente-actualizacion-2-java.vm", filename);
        }
    }

    private String getPlantillaPagina(int tipo) {
        int t = tipo < 5 ? tipo : tipo - 4;
        return "sdk-plantilla-pagina-" + t;
    }

    private int getNivelPagina(Pagina pagina) {
        Dominio maestro = pagina.getDominioIdDominioMaestro();
        if (maestro != null) {
            Aplicacion aplicacion = pagina.getAplicacionIdAplicacion();
            for (Pagina maestra : aplicacion.getPaginaIdAplicacionCollection()) {
                TipoPagina tipoPagina = maestra.getTipoPaginaNumeroTipoPagina();
                if (tipoPagina != null && tipoPagina.getNumeroTipoPagina().equals(EnumTipoPagina.TABLA.intValue())) {
                    Dominio dominio = maestra.getDominioIdDominio();
                    if (dominio != null && dominio.getIdDominio().equals(maestro.getIdDominio())) {
                        return 1 + this.getNivelPagina(maestra);
                    }
                }
            }
        }
        return 0;
    }

    private static final String APPL_NAME = "Gestion de Recursos Equis";

    private static final String RECURSO_X = "RecursoEquis";

    private List<Aplicacion> getAplicaciones() {
//      return getAplicaciones("sdk-query-generar-aplicaciones-1.vm");
        return getAplicaciones("sdk-query-generar-aplicaciones-2.vm");
    }

    private List<Aplicacion> getAplicaciones(String tempname) {
        try {
            VelocityContext context = new VelocityContext();
            String query = VelocityEngineer.write(context, tempname).toString();
            List<Aplicacion> aplicaciones = aplicacionFacade.findByQuery(query, EnumTipoQuery.NATIVE, REFRESH);
            return aplicaciones;
        } catch (Exception ex) {
            return null;
        }
    }

    private void copiarProyectoPlantillaAplicacionWeb(Aplicacion aplicacion) throws Exception {
        String root = ToolKitUtils.getWorkspaceDir();
        String projcode = aplicacion.getCodigoAplicacion();
        String projname = aplicacion.getNombreAplicacion();
        String sourceRoot = ToolKitUtils.getWebTmpPrjDir();
        String targetRoot = ToolKitUtils.makeNetBeansWebProjectDirectoryTree(root, projcode);
        File source = new File(sourceRoot);
        File target = new File(targetRoot);
        String sourceWebPack = ToolKitUtils.getWebPackageName(source.getName());
        String targetWebPack = ToolKitUtils.getWebPackageName(target.getName());
        String sourcePack = ToolKitUtils.PREFIJO_PAQUETE + "." + sourceWebPack;
        String targetPack = ToolKitUtils.PREFIJO_PAQUETE + "." + targetWebPack;
        Map replacements = new LinkedHashMap();
        replacements.put(source.getName(), target.getName());
        replacements.put(sourcePack, targetPack);
        replacements.put(APPL_NAME, projname);
        if (aplicacion.getGrupoAplicacionIdGrupoAplicacion() != null) {
            String equis = aplicacion.getGrupoAplicacionIdGrupoAplicacion().getCodigoGrupoAplicacion();
            replacements.put(RECURSO_X, equis);
        }
        String targetApplicationServer = ToolKitUtils.getenv("TARGET_APPLICATION_SERVER");
        if (targetApplicationServer.equalsIgnoreCase("jboss")) {
            replacements.put("//@PostConstruct", "@PostConstruct");
            replacements.put("//@PreDestroy", "@PreDestroy");
            replacements.put("//@PostActivate", "@PostActivate");
            replacements.put("//@PrePassivate", "@PrePassivate");
        }
        copydirs(source, target, source, target, replacements);
    }

    private void copydirs(File sourceProj, File targetProj, File sourceFile, File targetFile, Map replacements) {
        if (!sourceFile.exists() || sourceFile.isHidden() || !sourceFile.isDirectory()) {
            return;
        }
        if (!targetFile.exists() || targetFile.isHidden() || !targetFile.isDirectory()) {
            return;
        }
        Bitacora.trace(this.getClass(), "copydirs-source", sourceFile.getAbsolutePath(), sourceFile.getName());
        Bitacora.trace(this.getClass(), "copydirs-target", targetFile.getAbsolutePath(), targetFile.getName());
        String sep = System.getProperties().getProperty("file.separator");
        String[] filenames = sourceFile.list();
        for (String filename : filenames) {
            if (!isExcludedFile(filename)) {
                File source = new File(sourceFile.getAbsolutePath() + sep + filename);
                File target;
                String pathname = targetFile.getAbsolutePath() + sep + filename;
                if (source.exists()) {
                    if (source.isHidden()) {
                    } else if (source.isDirectory()) {
                        if (filename.equals("resources")) {
                            try {
                                String command = "xcopy.exe *.* \"" + pathname + "\" /Y";
                                Bitacora.trace(command);
                                Runtime.getRuntime().exec(command, null, source);
                            } catch (IOException ex) {
                                Bitacora.logFatal(ThrowableUtils.getString(ex));
                            }
                        } else {
                            String suffix = ToolKitUtils.getWebPackageName(sourceProj.getName()).replace(".", sep);
                            if (source.getAbsolutePath().endsWith(suffix)) {
                                pathname = ToolKitUtils.getWebSrcDir(targetProj.getParent(), targetProj.getName());
                            }
                            target = new File(pathname);
                            copydirs(sourceProj, targetProj, source, target, replacements);
                        }
                    } else if (source.isFile()) {
                        target = new File(pathname);
                        copyfile(source, target, replacements);
                    }
                }
            }
        }
    }

    private boolean isExcludedFile(String filename) {
        String[] exclnames = {
            "ant-deploy.xml",
            "build-impl.xml",
            "faces-config.NavData",
            "faces-config.xml",
            "genfiles.properties",
            "glassfish-web.xml",
            "sun-web.xml",
            "web.xml",
            "Inicio.java",
            "Inicio.jsp"
        };
        for (String exclname : exclnames) {
            if (exclname.equalsIgnoreCase(filename)) {
                return true;
            }
        }
        return false;
    }

    private void copyfile(File sourceFile, File targetFile, Map replacements) {
        if (sourceFile.getName().endsWith(".")) {
        } else if (sourceFile.getName().endsWith(".gif")) {
        } else if (sourceFile.getName().endsWith(".jpg")) {
        } else {
//          Bitacora.trace(this.getClass(), "copyfile-source", sourceFile.getAbsolutePath(), sourceFile.getName());
//          Bitacora.trace(this.getClass(), "copyfile-target", targetFile.getAbsolutePath(), targetFile.getName());
            try {
                FileOutputStream fos;
                try (FileInputStream fis = new FileInputStream(sourceFile)) {
                    InputStreamReader isr = new InputStreamReader(fis);
                    BufferedReader br = new BufferedReader(isr);
                    fos = new FileOutputStream(targetFile);
                    OutputStreamWriter osw = new OutputStreamWriter(fos);
                    BufferedWriter bw = new BufferedWriter(osw);
                    int escapeRule = getEscapeRule(sourceFile.getName());
                    String line;
                    while ((line = br.readLine()) != null) {
                        line = replaceStrings(line, replacements, escapeRule);
                        bw.write(line);
                        bw.newLine();
                        bw.flush();
                    }
                }
                fos.close();
            } catch (FileNotFoundException ex) {
//              System.out.println(ThrowableUtils.getString(ex));
                Bitacora.logFatal(ThrowableUtils.getString(ex));
            } catch (IOException ex) {
//              System.out.println(ThrowableUtils.getString(ex));
                Bitacora.logFatal(ThrowableUtils.getString(ex));
            }
        }
    }

    private int getEscapeRule(String filename) {
        int escapeRule;
        if (filename.endsWith(".html")) {
            escapeRule = 1;
        } else if (filename.endsWith(".java")) {
            escapeRule = 2;
        } else if (filename.endsWith(".js")) {
            escapeRule = 3;
        } else if (filename.endsWith(".jsp")) {
            escapeRule = 4;
        } else if (filename.endsWith(".jspf")) {
            escapeRule = 4;
        } else if (filename.endsWith(".properties")) {
            escapeRule = 2;
        } else if (filename.endsWith(".xml")) {
            escapeRule = 4;
        } else {
            escapeRule = 0;
        }
        return escapeRule;
    }

    private String replaceStrings(String line, Map replacements, int escapeRule) {
        if (line != null) {
            String clave;
            String valor;
            Object value;
            for (Object key : replacements.keySet()) {
                value = replacements.get(key);
                if (key instanceof String && value instanceof String) {
                    clave = (String) key;
                    valor = (String) value;
                    switch (escapeRule) {
                        case 1:
                            valor = StringEscapeUtils.escapeHtml(valor);
                            break;
                        case 2:
                            valor = StringEscapeUtils.escapeJava(valor);
                            break;
                        case 3:
                            valor = StringEscapeUtils.escapeJavaScript(valor);
                            break;
                        case 4:
                            valor = StringEscapeUtils.escapeXml(valor);
                            break;
                        default:
                            break;
                    }
                    line = line.replace(clave, valor);
                }
            }
        }
        return line;
    }

    private void write(VelocityContext context, String tempname, String filename) throws Exception {
        try {
            VelocityEngineer.write(context, tempname, filename);
//      } catch (ResourceNotFoundException ex) {
//          String msg = ex.getClass().getSimpleName() + "(" + tempname + "," + filename + ")";
//          Bitacora.logError(msg, ex);
        } catch (Exception ex) {
            throw ex instanceof EJBException ? (EJBException) ex : new EJBException(ex);
        }
    }

    private ToolKitBeanLocator getToolKitBeanLocator() {
        ToolKitBeanLocator locator = new ToolKitBeanLocator();
        locator.setDominioFacade(dominioFacade);
        locator.setSystemTableFacade(systemTableFacade);
        locator.setSqlAgent(sqlAgent);
        return locator;
    }

    private ToolKitUtils getToolKitUtils() {
        ToolKitBeanLocator locator = this.getToolKitBeanLocator();
        return this.getToolKitUtils(locator);
    }

    private ToolKitUtils getToolKitUtils(ToolKitBeanLocator locator) {
        ToolKitUtils utils = new ToolKitUtils(locator);
        return utils;
    }

}
