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
package com.egt.core.control;

import com.egt.base.enums.EnumTipoFuncion;
import com.egt.base.persistence.entity.ConjuntoSegmentoBase;
import com.egt.base.persistence.entity.ElementoSegmentoBase;
import com.egt.base.persistence.entity.FuncionBase;
import com.egt.base.persistence.entity.RolBase;
import com.egt.base.persistence.entity.RolFuncionBase;
import com.egt.base.persistence.entity.RolUsuarioBase;
import com.egt.base.persistence.entity.UsuarioBase;
import com.egt.commons.util.BitUtils;
import com.egt.commons.util.ThrowableUtils;
import com.egt.core.aplicacion.Bitacora;
import com.egt.core.aplicacion.web.EJBL;
import com.egt.core.constants.EAC;
import com.egt.core.jsf.JSF;
import com.egt.core.util.EA;
import java.beans.Beans;
import java.io.Serializable;
import java.security.Principal;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class UsuarioAutenticado implements Principal, Serializable {

    private static final String CODIGO_USUARIO_DESCONOCIDO = "invitado";

    private static final String NOMBRE_USUARIO_DESCONOCIDO = "Invitado";

    private static final String ROL_SUPER_GESTOR = "SuperGestor";

    private static final String ROL_SUPER_LECTOR = "SuperLector";

    private static final String ROL_OPERADOR = "Operador";

    static {
        init();
    }

    private static void init() {
        Bitacora.stamp(UsuarioAutenticado.class.getSimpleName());
        _funciones = null;
        if (Beans.isDesignTime()) {
            Bitacora.trace("Beans.isDesignTime");
        } else if (FacesContext.getCurrentInstance() == null) {
            Bitacora.trace("FacesContext.getCurrentInstance is null");
        } else {
            getFunciones();
        }
        Bitacora.trace(UsuarioAutenticado.class, "init", "funciones=" + (_funciones == null ? "?" : _funciones.size()));
    }

    private static List<? extends FuncionBase> _funciones;

    private static List<? extends FuncionBase> getFunciones() {
        if (_funciones == null) {
            try {
                _funciones = EJBL.getFuncionFacade().findAll();
            } catch (Throwable throwable) {
                Bitacora.logError(ThrowableUtils.getString(throwable));
            }
        }
        return _funciones;
    }

    static String getPrincipalName() {
        Principal principal = JSF.getPrincipal();
        return principal == null ? CODIGO_USUARIO_DESCONOCIDO : principal.getName();
    }

    static long getSessionCreationTime() {
        HttpSession session = JSF.getSession();
        return session == null ? -1L : session.getCreationTime();
    }

    static boolean isUserInRoleSuperGestor() {
        return isUserInRole(ROL_SUPER_GESTOR);
    }

    static boolean isUserInRoleSuperLector() {
        return isUserInRole(ROL_SUPER_LECTOR);
    }

    static boolean isUserInRoleOperador() {
        return isUserInRole(ROL_OPERADOR);
    }

    static boolean isUserInRole(String role) {
        HttpServletRequest request = JSF.getRequest();
        return request != null && request.isUserInRole(role);
    }

    private void stamp() {
        Bitacora.stamp(this);
    }

    /**
     * Creates a new instance of UsuarioAutenticado
     */
    public UsuarioAutenticado() {
        designing = true;
        filterFragmentRendered = true;
        helpInlineRendered = true;
        filasPorPagina = 0;
        idUsuario = 0L;
        codigoUsuario = CODIGO_USUARIO_DESCONOCIDO;
        nombreUsuario = NOMBRE_USUARIO_DESCONOCIDO;
        this.stamp();
        this.clear();
    }

    /**
     * Creates a new instance of UsuarioAutenticado
     */
    UsuarioAutenticado(String codigo) {
        this();
        if (codigo != null) {
            codigoUsuario = codigo;
            nombreUsuario = codigo;
        }
        this.setCredencialesUsuario();
    }

    private void clear() {
        funcionesAutorizadas.clear();
        segmentosAutorizados.clear();
        modificado = false;
        fechaHoraModificacion = getSessionCreationTime();
    }

    /**
     * Conserva el valor de la propiedad designing.
     */
    private boolean designing;

    /**
     * Conserva el valor de la propiedad filterFragmentRendered.
     */
    boolean filterFragmentRendered;

    public boolean isFilterFragmentRendered() {
        return filterFragmentRendered;
    }

    public void setFilterFragmentRendered(boolean filterFragmentRendered) {
        this.filterFragmentRendered = filterFragmentRendered;
    }

    /**
     * Conserva el valor de la propiedad helpInlineRendered.
     */
    boolean helpInlineRendered;

    public boolean isHelpInlineRendered() {
        return helpInlineRendered;
    }

    public void setHelpInlineRendered(boolean helpInlineRendered) {
        this.helpInlineRendered = helpInlineRendered;
    }

    /**
     * Conserva el valor de la propiedad filasPorPagina.
     */
    int filasPorPagina;

    public int getFilasPorPagina() {
        return filasPorPagina;
    }

    public void setFilasPorPagina(int filasPorPagina) {
        this.filasPorPagina = filasPorPagina;
    }

    /**
     * Conserva el valor de la propiedad idUsuario.
     */
    private Long idUsuario;

    /**
     * Getter para propiedad idUsuario.
     *
     * @return Valor de la propiedad idUsuario.
     */
    public Long getIdUsuario() {
        return idUsuario;
    }

    /**
     * Setter para propiedad idUsuario.
     *
     * @param idUsuario Nuevo valor de la propiedad idUsuario.
     */
    void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * Conserva el valor de la propiedad codigoUsuario.
     */
    private String codigoUsuario;

    /**
     * Getter para propiedad codigoUsuario.
     *
     * @return Valor de la propiedad codigoUsuario.
     */
    public String getCodigoUsuario() {
        return codigoUsuario;
    }

    /**
     * Setter para propiedad codigoUsuario.
     *
     * @param codigoUsuario Nuevo valor de la propiedad codigoUsuario.
     */
    void setCodigoUsuario(String codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    /**
     * Conserva el valor de la propiedad nombreUsuario.
     */
    private String nombreUsuario;

    /**
     * Getter para propiedad nombreUsuario.
     *
     * @return Valor de la propiedad nombreUsuario.
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * Setter para propiedad nombreUsuario.
     *
     * @param nombreUsuario Nuevo valor de la propiedad nombreUsuario.
     */
    void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    /**
     * Conserva el valor de la colección funcionesAutorizadas.
     */
    private Set<FuncionAutorizada> funcionesAutorizadas = new LinkedHashSet();

    /**
     * Getter para colección funcionesAutorizadas.
     *
     * @return Valor de la colección funcionesAutorizadas.
     */
    Set<FuncionAutorizada> getFuncionesAutorizadas() {
        return funcionesAutorizadas;
    }

    /**
     * Conserva el valor de la colección segmentosAutorizados.
     */
    private Set<SegmentoAutorizado> segmentosAutorizados = new LinkedHashSet();

    /**
     * Getter para colección segmentosAutorizados.
     *
     * @return Valor de la colección segmentosAutorizados.
     */
    Set<SegmentoAutorizado> getSegmentosAutorizados() {
        return segmentosAutorizados;
    }

    /**
     * Conserva el valor de la propiedad modificado.
     */
    private boolean modificado;

    /**
     * Getter para propiedad modificado.
     *
     * @return Valor de la propiedad modificado.
     */
    public boolean isModificado() {
        return modificado;
    }

    /**
     * Setter para propiedad modificado.
     *
     * @param modificado Nuevo valor de la propiedad modificado.
     */
    public void setModificado(boolean modificado) {
        this.modificado = modificado;
        this.fechaHoraModificacion = modificado ? System.currentTimeMillis() : -1;
    }

    /**
     * Conserva el valor de la propiedad fechaHoraModificacion.
     */
    private long fechaHoraModificacion;

    long getFechaHoraModificacion() {
        return fechaHoraModificacion;
    }

    /**
     * Getter para propiedad name.
     *
     * @return Valor de la propiedad name.
     */
    @Override
    public String getName() {
        return codigoUsuario;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof UsuarioAutenticado) {
            UsuarioAutenticado that = (UsuarioAutenticado) obj;
            if (this.getName().equals(that.getName())) {
                return true;
            }
        }
        return false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return codigoUsuario + "(" + nombreUsuario + ")";
    }

    final void setCredencialesUsuario() {
        Bitacora.trace(this.getClass(), "setCredencialesUsuario", codigoUsuario);
        this.track(false);
        this.clear();
        if (isUserInRoleSuperGestor() || isUserInRoleSuperLector() || isUserInRoleOperador()) {
//          UsuarioBase usuario = EJBL.getUsuarioFacade().findByCodigo(codigoUsuario, true);
            UsuarioBase usuario = findUsuario(codigoUsuario);
//
            // <editor-fold defaultstate="collapsed" desc="add new user">
            /* TODO: add new user */
//          if (usuario == null) {
//              usuario = new Usuario();
//              usuario.setIdUsuario(LongUtils.getNewId());
//              usuario.setCodigoUsuario(codigoUsuario);
//              usuario.setNombreUsuario(codigoUsuario);
//              EJBL.getUsuarioFacade().persist(usuario);
//              EJBL.getUsuarioFacade().flush();
//          }
            // </editor-fold>
            idUsuario = usuario.getIdUsuario();
            nombreUsuario = usuario.getNombreUsuario();
            this.setFuncionesAutorizadas(usuario);
            // <editor-fold defaultstate="collapsed" desc="update user">
            /* TODO: update user */
//          if (BitUtils.valueOf(usuario.getEsUsuarioModificado())) {
//              usuario.setEsUsuarioModificado(IntUtils.FALSE);
//              EJBL.getUsuarioFacade().flush();
//          }
            // </editor-fold>
        }
        this.track(true);
    }

    private void setFuncionesAutorizadas(UsuarioBase usuario) {
        Long id;
        boolean esPublica;
        boolean esProgramatica;
        boolean esPersonalizada;
        boolean esSegmentada;
        boolean esLectura;
        boolean esLecturaAutorizada;
        boolean esAutorizada;
        boolean es;
        Collection<? extends FuncionBase> funciones;
        Collection<? extends RolBase> roles;
        Collection<? extends ConjuntoSegmentoBase> conjuntos;
        Collection<? extends RolUsuarioBase> rolesPorUsuario;
        Collection<? extends RolFuncionBase> funcionesPorRol;
        FuncionAutorizada funcionAutorizada;
        this.getFuncionesAutorizadas().clear();
        this.getSegmentosAutorizados().clear();
        if (isUserInRoleSuperGestor()) {
            return;
        }
        funciones = getFunciones();
        if (funciones == null || funciones.isEmpty()) {
            return;
        }
        boolean dynrbac = EA.getLcc().equals(EA.getString(EAC.RBAC));
//      roles = dynrbac ? null : EJBL.getRolFacade().findAll(true);
        roles = findRoles();
        conjuntos = findConjuntos();
        Bitacora.trace(EAC.RBAC + "=" + dynrbac);
        Bitacora.trace("roles=" + (roles == null ? null : roles.size()));
        Bitacora.trace("conjuntos=" + (conjuntos == null ? null : conjuntos.size()));
//
        Bitacora.trace("funciones=" + funciones.size());
        for (FuncionBase f : funciones) {
            id = f.getIdFuncion();
            esPublica = BitUtils.valueOf(f.getEsPublica());
            esProgramatica = BitUtils.valueOf(f.getEsProgramatica());
            esPersonalizada = BitUtils.valueOf(f.getEsPersonalizada());
            esSegmentada = BitUtils.valueOf(f.getEsSegmentada());
            esLectura = esFuncionLectura(f);
            esLecturaAutorizada = esLectura && isUserInRoleSuperLector();
            esAutorizada = false;
            if (dynrbac) {
                rolesPorUsuario = usuario.getRolUsuarioIdUsuarioCollection();
                if (rolesPorUsuario != null && !rolesPorUsuario.isEmpty()) {
                    //Bitacora.trace("rolesPorUsuario=" + rolesPorUsuario.size());
                    for (RolUsuarioBase ru : rolesPorUsuario) {
                        //Bitacora.trace("rol=" + ru.getRolIdRol());
//                      funcionesPorRol = ru.getRolIdRol().getRolFuncionIdRolCollection();
                        RolBase r = findRol(ru.getRolIdRol().getIdRol(), roles);
                        funcionesPorRol = r == null ? null : r.getRolFuncionIdRolCollection();
//
                        if (funcionesPorRol != null && !funcionesPorRol.isEmpty()) {
                            es = esFuncionAutorizada(id, esSegmentada, funcionesPorRol, conjuntos);
                            esAutorizada |= es;
                        }
                    }
                }
            } else if (roles != null && !roles.isEmpty()) {
                for (RolBase rol : roles) {
                    funcionesPorRol = isUserInRole(rol.getCodigoRol()) ? rol.getRolFuncionIdRolCollection() : null;
                    if (funcionesPorRol != null && !funcionesPorRol.isEmpty()) {
                        es = esFuncionAutorizada(id, esSegmentada, funcionesPorRol, conjuntos);
                        esAutorizada |= es;
                    }
                }
            }
            if (esPublica || esProgramatica || esLecturaAutorizada || esAutorizada) {
                funcionAutorizada = new FuncionAutorizada();
                funcionAutorizada.setFuncion(id);
                funcionAutorizada.setPublica(esPublica);
                funcionAutorizada.setProgramatica(esProgramatica);
                funcionAutorizada.setPersonalizada(esPersonalizada);
                funcionAutorizada.setSegmentada(esSegmentada);
                funcionAutorizada.setLectura(esLectura);
                this.getFuncionesAutorizadas().add(funcionAutorizada);
            }
        }
    }

    private boolean esFuncionLectura(FuncionBase f) {
        int i = f.getTipoFuncionNumeroTipoFuncion().getNumeroTipoFuncion();
        EnumTipoFuncion e = EnumTipoFuncion.valueOf(i);
        return EnumTipoFuncion.CONSULTA.equals(e) || EnumTipoFuncion.INFORME.equals(e) || EnumTipoFuncion.ARCHIVO.equals(e);
    }

    private boolean esFuncionAutorizada(Long id, boolean esSegmentada, Collection<? extends RolFuncionBase> funcionesPorRol, Collection<? extends ConjuntoSegmentoBase> conjuntos) {
        //Bitacora.trace(this.getClass(), "esFuncionAutorizada", id, esSegmentada);
        Collection<? extends ElementoSegmentoBase> segmentos;
        //Bitacora.trace("funcionesPorRol=" + funcionesPorRol.size());
        for (RolFuncionBase rf : funcionesPorRol) {
            if (id.equals(rf.getFuncionIdFuncion().getIdFuncion())) {
                if (esSegmentada) {
                    if (rf.getConjuntoSegmentoIdConjuntoSegmento() == null) {
                        this.addSegmento(id, null);
                    } else {
//                      segmentos = rf.getConjuntoSegmentoIdConjuntoSegmento().getElementoSegmentoIdConjuntoSegmentoCollection();
                        ConjuntoSegmentoBase c = findConjunto(rf.getConjuntoSegmentoIdConjuntoSegmento().getIdConjuntoSegmento(), conjuntos);
                        segmentos = c == null ? null : c.getElementoSegmentoIdConjuntoSegmentoCollection();
//
                        if (segmentos != null && !segmentos.isEmpty()) {
                            //Bitacora.trace("segmentos=" + segmentos.size());
                            for (ElementoSegmentoBase es : segmentos) {
                                this.addSegmento(id, es.getIdSegmento());
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    private void addSegmento(Long idFuncion, Long idSegmento) {
        SegmentoAutorizado segmentoAutorizado = new SegmentoAutorizado();
        segmentoAutorizado.setFuncion(idFuncion);
        segmentoAutorizado.setSegmento(idSegmento);
        if (this.getSegmentosAutorizados().contains(segmentoAutorizado)) {
        } else {
            this.getSegmentosAutorizados().add(segmentoAutorizado);
        }
    }

    private UsuarioBase findUsuario(String codigo) {
//      String query = "select o from Usuario as o where o.codigoUsuario = :codigo";
//      String query = "select a from Usuario as a "
//              + "join fetch a.rolUsuarioIdUsuarioCollection as b "
//              + "join fetch b.rolIdRol as c "
//              + "join fetch c.rolFuncionIdRolCollection as d "
//              + "join fetch d.conjuntoSegmentoIdConjuntoSegmento as e "
//              + "join fetch e.elementoSegmentoIdConjuntoSegmentoCollection as f "
//              + "where a.codigoUsuario = '" + codigo + "'";
        String query = "select a from Usuario as a "
                + "left join fetch a.rolUsuarioIdUsuarioCollection as b "
                + "where a.codigoUsuario = '" + codigo + "'";
        Bitacora.trace(query);
        List<? extends UsuarioBase> list = EJBL.getUsuarioFacade().findByQuery(query, true);
        UsuarioBase element = list == null || list.isEmpty() ? null : list.get(0);
        return element;
    }

    private Collection<? extends RolBase> findRoles() {
//      String query = "select o from Rol as o where o.idRol = :id";
//      String query = "select a from Rol as a "
//              + "join fetch a.rolFuncionIdRolCollection as d "
//              + "join fetch d.conjuntoSegmentoIdConjuntoSegmento as e "
//              + "join fetch e.elementoSegmentoIdConjuntoSegmentoCollection as f "
//              + "order by a.idRol";
        String query = "select a from Rol as a "
                + "left join fetch a.rolFuncionIdRolCollection as d "
                + "order by a.idRol";
        Bitacora.trace(query);
        List<? extends RolBase> list = EJBL.getRolFacade().findByQuery(query, true);
        return list;
    }

//  private RolBase findRol(long id) {
////    String query = "select o from Rol as o where o.idRol = :id";
//      String query = "select a from Rol as a "
//              + "left join fetch a.rolFuncionIdRolCollection as b "
//              + "where a.idRol = " + id;
//      Bitacora.trace(query);
//      List<? extends RolBase> list = EJBL.getRolFacade().findByQuery(query, true);
//      RolBase element = list == null || list.isEmpty() ? null : list.get(0);
//      return element;
//  }
//
//
    private RolBase findRol(Long id, Collection<? extends RolBase> roles) {
        if (roles != null && !roles.isEmpty()) {
            for (RolBase element : roles) {
                if (id.equals(element.getIdRol())) {
                    return element;
                }
            }
        }
        Bitacora.trace("*** rol " + id + " not found ***");
        return null;
    }

    private Collection<? extends ConjuntoSegmentoBase> findConjuntos() {
//      String query = "select o from ConjuntoSegmento as o where o.idConjuntoSegmento = :id";
        String query = "select a from ConjuntoSegmento as a "
                + "join fetch a.elementoSegmentoIdConjuntoSegmentoCollection as b "
                + "order by a.idConjuntoSegmento";
        Bitacora.trace(query);
        List<? extends ConjuntoSegmentoBase> list = EJBL.getConjuntoSegmentoFacade().findByQuery(query, true);
        return list;
    }

//  private ConjuntoSegmentoBase findConjunto(long id) {
////    String query = "select o from ConjuntoSegmento as o where o.idConjuntoSegmento = :id";
//      String query = "select a from ConjuntoSegmento as a "
//              + "join fetch a.elementoSegmentoIdConjuntoSegmentoCollection as b "
//              + "where a.idConjuntoSegmento = " + id;
//      Bitacora.trace(query);
//      List<? extends ConjuntoSegmentoBase> list = EJBL.getConjuntoSegmentoFacade().findByQuery(query, true);
//      ConjuntoSegmentoBase element = list == null || list.isEmpty() ? null : list.get(0);
//      return element;
//  }
//
    private ConjuntoSegmentoBase findConjunto(Long id, Collection<? extends ConjuntoSegmentoBase> conjuntos) {
        if (conjuntos != null && !conjuntos.isEmpty()) {
            for (ConjuntoSegmentoBase element : conjuntos) {
                if (id.equals(element.getIdConjuntoSegmento())) {
                    return element;
                }
            }
        }
        Bitacora.trace("*** conjunto " + id + " not found ***");
        return null;
    }

    private void track(boolean b) {
        Bitacora.trace("idUsuario=" + idUsuario);
        Bitacora.trace("codigoUsuario=" + codigoUsuario);
        Bitacora.trace("nombreUsuario=" + nombreUsuario);
        Bitacora.trace("SuperGestor=" + isUserInRoleSuperGestor());
        Bitacora.trace("SuperLector=" + isUserInRoleSuperLector());
        Bitacora.trace("Operador=" + isUserInRoleOperador());
        Bitacora.trace("funcionesAutorizadas=" + funcionesAutorizadas.size());
        Bitacora.trace("segmentosAutorizados=" + segmentosAutorizados.size());
        Bitacora.trace("modificado=" + modificado);
        Bitacora.trace("fechaHoraModificacion=" + fechaHoraModificacion);
        Bitacora.trace("fechaHoraModificacion<fechaHoraInicioSesion=" + (fechaHoraModificacion < getSessionCreationTime()));
        if (b) {
            List<? extends RolBase> roles;
            roles = EJBL.getRolFacade().findAll();
            if (roles != null && !roles.isEmpty()) {
                for (RolBase rol : roles) {
                    Bitacora.trace(rol.getCodigoRol() + "," + isUserInRole(rol.getCodigoRol()));
                }
            }
            for (FuncionAutorizada f : funcionesAutorizadas) {
                Bitacora.trace(f.toString());
            }
            for (SegmentoAutorizado s : segmentosAutorizados) {
                Bitacora.trace(s.toString());
            }
        }
    }

}
