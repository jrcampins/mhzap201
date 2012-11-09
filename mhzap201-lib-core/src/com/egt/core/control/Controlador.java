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

import com.egt.base.constants.CBM2;
import com.egt.base.enums.EnumCondicionEjeFun;
import com.egt.base.enums.EnumOperadorCom;
import com.egt.base.jms.messages.AbstractMessage;
import com.egt.base.util.BundleProcedimientos;
import com.egt.commons.util.BitUtils;
import com.egt.commons.util.ThrowableUtils;
import com.egt.core.aplicacion.FiltroBusqueda;
import com.egt.core.aplicacion.TLC;
import com.egt.core.db.util.DB;
import com.egt.core.aplicacion.Bitacora;
import com.egt.core.aplicacion.ExcepcionAplicacion;
import com.egt.core.enums.EnumTipoResultadoSQL;
import java.io.Serializable;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import org.apache.commons.lang.StringUtils;

public class Controlador implements Serializable {

    private static final String RASTRO_PROCESO_CHECK_UPDATE = "rastro_proceso_check_update";

    /**
     * Crea una instancia de Controlador
     */
    public Controlador() {
        Bitacora.stamp(this);
        usuarioAutenticado = UsuarioAutenticadoCachingServiceLocator.getInstance();
    }

    private UsuarioAutenticado usuarioAutenticado;

    /**
     * Getter para propiedad usuario.
     *
     * @return Valor de la propiedad usuario.
     */
    public UsuarioAutenticado getUsuario() {
        return usuarioAutenticado;
    }

    /**
     * Getter para propiedad superUsuario.
     *
     * @return True, si el usuario ejecutante es un "super-usuario".
     */
    public boolean esSuperUsuario() {
//      return usuarioAutenticado == null ? false : usuarioAutenticado.isSuperUsuario();
        return UsuarioAutenticado.isUserInRoleSuperGestor();
    }

    /**
     * Getter para propiedad funcionAutorizada.
     *
     * @param funcion Identificacion de la funcion.
     * @return true, si el usuario ejecutante esta autorizado para ejecutar la funcion.
     */
    public boolean esFuncionAutorizada(long funcion) {
//      return UsuarioAutenticado.esFuncionAutorizada(funcion);
        if (this.esSuperUsuario()) {
            return true;
        }
        for (FuncionAutorizada funcionAutorizada : usuarioAutenticado.getFuncionesAutorizadas()) {
            if (funcionAutorizada.getFuncion() == funcion) {
                return true;
            }
        }
        Bitacora.trace(CBM2.FUNCION_NO_AUTORIZADA, funcion);
        return false;
    }

    /**
     * Getter para propiedad segmentoAutorizado.
     *
     * @param segmento Identificacion del segmento de recursos.
     * @param funcion Identificacion de la funcion.
     * @return true, si el usuario ejecutante esta autorizado para ejecutar la funcion sobre los recursos del
     * segmento o si el segmento es nulo.
     */
    public boolean esSegmentoAutorizado(Long segmento, long funcion) {
        if (segmento == null || this.esSuperUsuario()) {
            return true;
        }
        for (FuncionAutorizada funcionAutorizada : usuarioAutenticado.getFuncionesAutorizadas()) {
            if (funcionAutorizada.getFuncion() == funcion) {
                if (funcionAutorizada.isSegmentada()) {
                    for (SegmentoAutorizado segmentoAutorizado : usuarioAutenticado.getSegmentosAutorizados()) {
                        if (segmentoAutorizado.getFuncion() == funcion) {
                            if (segmentoAutorizado.getSegmento() == null || segmentoAutorizado.getSegmento().equals(segmento)) {
                                return true;
                            }
                        }
                    }
                } else {
                    return true;
                }
                break;
            }
        }
        Bitacora.trace(CBM2.SEGMENTO_NO_AUTORIZADO, segmento, funcion);
        return false;
    }

    /**
     * Getter para propiedad referenciaAutorizada.
     *
     * @param recurso Identificacion del recurso.
     * @param funcion Identificacion de la funcion.
     * @param strings Vector de nombres: [0] Tabla, [1] Columna Identificacion, [2] Columna Propietario, [3]
     * Columna Segmento.
     * @return true, si el usuario ejecutante esta autorizado para ejecutar la funcion sobre el recurso o si
     * el recurso es nulo.
     */
    public boolean esReferenciaAutorizada(Object recurso, long funcion, String[] strings) {
        if (recurso == null || this.esSuperUsuario()) {
            return true;
        }
        String comando = this.getComandoSelectReferencia(recurso, funcion, strings);
        Bitacora.trace("comando" + "=" + comando);
        if (comando == null) {
            return false;
        }
        boolean es = false;
        String sql1 = comando;
        Object resultado1;
        ResultSet resultSet1 = null;
        Object objeto1;
        if (TLC.getAgenteSql().connected()) {
            try {
                resultado1 = TLC.getAgenteSql().executeQuery(sql1);
                if (resultado1 != null && resultado1 instanceof ResultSet) {
                    resultSet1 = (ResultSet) resultado1;
                    if (resultSet1.next()) {
                        objeto1 = resultSet1.getObject(1);
                        if (objeto1 != null) {
                            es = true;
                        } else {
                            /* TODO: error handling */
                        }
                    } else {
                        /* TODO: error handling */
                    }
                } else {
                    /* TODO: error handling */
                }
            } catch (SQLException e) {
                TLC.getBitacora().fatal(e);
            } finally {
                DB.close(resultSet1);
            }
        } else {
            /* TODO: error handling */
        }
        return es;
    }

    private String getComandoSelectReferencia(Object recurso, long funcion, String[] strings) {
        if (recurso == null || strings == null || StringUtils.isBlank(strings[0]) || StringUtils.isBlank(strings[1])) {
            return null;
        }
        FiltroBusqueda filtro = new FiltroBusqueda();
        filtro.addCriterio(strings[1], EnumOperadorCom.ES_IGUAL, recurso);
        if (!StringUtils.isBlank(strings[2])) {
            Long propietario = this.getPropietarioAutorizado();
            if (propietario != null) {
                filtro.addCriterio(strings[2], EnumOperadorCom.ES_NULO_O_ES_IGUAL, propietario);
            }
        }
        if (!StringUtils.isBlank(strings[3])) {
            String segmentos = this.getSegmentosAutorizados(funcion);
            if (segmentos != null) {
                filtro.addCriterio(strings[3], EnumOperadorCom.ES_NULO_O_ESTA_ENTRE, segmentos);
            }
        }
        String comando = "SELECT 1 FROM " + strings[0] + " WHERE ";
        String criterios = filtro.toString();
        if (StringUtils.isBlank(criterios)) {
            comando += "(0=1)";
        } else {
            comando += "(" + criterios + ")";
        }
        return comando;
    }

    /**
     * Getter para propiedad propietarioRecurso.
     *
     * @param usuario Identificacion del propietario del recurso.
     * @return true, si la Identificacion del usuario ejecutante coincide con la del propietario del recurso o
     * si el propietario es nulo.
     */
    public boolean esPropietarioRecurso(Long usuario) {
        if (usuario == null || this.esSuperUsuario() || usuarioAutenticado.getIdUsuario().equals(usuario)) {
            return true;
        }
        Bitacora.trace(CBM2.USUARIO_NO_PROPIETARIO, usuario);
        return false;
    }

    public boolean esPropietarioRecurso(Long usuario, long funcion) {
        if (usuario == null || this.esSuperUsuario() || usuarioAutenticado.getIdUsuario().equals(usuario)) {
            return true;
        }
        for (FuncionAutorizada funcionAutorizada : usuarioAutenticado.getFuncionesAutorizadas()) {
            if (funcionAutorizada.getFuncion() == funcion) {
                if (funcionAutorizada.isPersonalizada()) {
                    break;
                } else {
                    return true;
                }
            }
        }
        Bitacora.trace(CBM2.USUARIO_NO_PROPIETARIO, usuario);
        return false;
    }

    /**
     * Getter para propiedad segmentosAutorizados. Obtiene la lista de segmentos que el usuario ejecutante
     * puede utilizar con una funcion.
     *
     * @param funcion Identificacion de la funcion.
     * @return Valor de la propiedad segmentosAutorizados, con los segmentos separados por una coma. Si el
     * usuario ejecutante es un "super-usuario", entonces retorna nulo.
     */
    public String getSegmentosAutorizados(long funcion) {
        if (this.esSuperUsuario()) {
            return null;
        }
        String segmentosAutorizados = StringUtils.EMPTY;
        for (SegmentoAutorizado segmentoAutorizado : usuarioAutenticado.getSegmentosAutorizados()) {
            if (segmentoAutorizado.getFuncion() == funcion) {
                if (segmentoAutorizado.getSegmento() == null) {
                    return null; /* esta autorizado a todos los segmentos */
                }
                segmentosAutorizados += ", " + segmentoAutorizado.getSegmento().toString();
            }
        }
        return StringUtils.isBlank(segmentosAutorizados) ? null : segmentosAutorizados.substring(2);
    }

    /**
     * Getter para propiedad propietarioAutorizado. Obtiene la Identificacion del usuario ejecutante.
     *
     * @return Valor de la propiedad propietarioAutorizado. Si el usuario ejecutante es un "super-usuario",
     * entonces retorna nulo.
     */
    public Long getPropietarioAutorizado() {
        if (this.esSuperUsuario() || usuarioAutenticado == null) {
            return null;
        } else {
            return usuarioAutenticado.getIdUsuario();
        }
    }

    public Long grabarRastroFuncion(RastroFuncion rastro) {
        return Auditor.grabarRastroFuncion(rastro);
    }

    public Long ponerInformePendiente(long funcion) throws ExcepcionAplicacion, Exception {
        return Auditor.grabarRastroInforme(funcion, usuarioAutenticado.getIdUsuario());
    }

    public Long ponerProcesoPendiente(long funcion) throws ExcepcionAplicacion, Exception {
        return Auditor.grabarRastroProceso(funcion, usuarioAutenticado.getIdUsuario());
    }

//  public AbstractMessage ponerInformePendiente(AbstractMessage message) throws ExcepcionAplicacion, SQLException {
//      ponerUsuarioEnMensaje(message);
//      return Auditor.grabarRastroInforme(message);
//  }
//
    public AbstractMessage ponerProcesoPendiente(AbstractMessage message) throws Exception {
        ponerUsuarioEnMensaje(message);
        return Auditor.grabarRastroProceso(message);
    }

    public static AbstractMessage ponerProcesoEnEjecucion(AbstractMessage message) {
        Bitacora.trace(Controlador.class, "ponerProcesoEnEjecucion", message.getRastro(), message);
        if (BitUtils.valueOf(message.getRastro())) {
            if (TLC.getAgenteSql().connected()) {
                try {
                    Object[] args = new Object[1];
                    args[0] = message.getRastro();
                    TLC.getAgenteSql().executeProcedure(RASTRO_PROCESO_CHECK_UPDATE, args);
                    message.setCondicion(EnumCondicionEjeFun.EJECUCION_EN_PROGRESO);
                    message.setMensaje(TLC.getBitacora().info(CBM2.PROCESS_EXECUTION_BEGIN, message.getRastro()));
                } catch (SQLException ex) {
                    message.setCondicion(EnumCondicionEjeFun.EJECUCION_CANCELADA);
                    message.setMensaje(ThrowableUtils.getString(ex));
                    Auditor.grabarRastroProceso(message.getRastro(), message.getCondicion(), message.getArchivo(), message.getMensaje());
                    TLC.getBitacora().fatal(message.getMensaje());
                    TLC.getBitacora().fatal(CBM2.PROCESS_EXECUTION_ABEND, message.getRastro());
                }
            } else {
                message.setCondicion(EnumCondicionEjeFun.EJECUCION_CANCELADA);
                message.setMensaje(TLC.getBitacora().error(CBM2.RECURSO_NO_DISPONIBLE, Connection.class.getName()));
            }
        } else {
            message.setCondicion(EnumCondicionEjeFun.EJECUCION_EN_PROGRESO);
        }
        return message;
    }

    public void ponerUsuarioEnMensaje(AbstractMessage message) {
        message.setUsuario(usuarioAutenticado.getIdUsuario());
        message.setCodigoUsuario(usuarioAutenticado.getCodigoUsuario());
        message.setNombreUsuario(usuarioAutenticado.getNombreUsuario());
    }

    public void close() {
        Bitacora.trace(this.getClass(), "close");
        this.usuarioAutenticado = null;
    }

}
