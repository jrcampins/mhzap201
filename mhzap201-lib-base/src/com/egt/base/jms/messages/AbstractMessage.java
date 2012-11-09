/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 */

package com.egt.base.jms.messages;

import com.egt.base.enums.EnumCondicionEjeFun;
import com.egt.commons.util.LongUtils;
import java.io.Serializable;

public abstract class AbstractMessage implements Serializable {

    protected Long id;

    protected Long rastro;

    protected Long usuario;

    protected String codigoUsuario;

    protected String nombreUsuario;

    protected Long funcion;

    protected EnumCondicionEjeFun condicion;

    protected String archivo;

    protected String mensaje;

    /**
     * id del grupo de procesos al que pertenece la función.
     */
    protected Long grupo;

    /**
     * id del rastro del proceso padre (superior inmediato).
     */
    protected Long superior;

    /**
     * id del rastro del proceso raíz.
     */
    protected Long raiz;

    /**
     * número de subprocesos directamente dependientes.
     */
    protected int subprocesos;

    /**
     * nombre del stored procedure que se debe ejecutar al cambiar la condición
     */
    protected String procedimiento;

    /**
     * propiedad que determina si el broker graba el rastro al terminar la ejecución del proceso
     */
    protected boolean grabarRastroPendiente;

    protected void init() {
        id = LongUtils.getNewId();
        rastro = null;
        usuario = null;
        codigoUsuario = null;
        nombreUsuario = null;
        funcion = null;
        condicion = EnumCondicionEjeFun.EJECUCION_PENDIENTE;
        archivo = null;
        mensaje = null;
        grupo = null;
        superior = null;
        raiz = null;
        subprocesos = 0;
        procedimiento = null;
        grabarRastroPendiente = false;
    }

    public Long getId() {
        return id;
    }

    public Long getIdRastro() {
        return rastro == null ? id : rastro;
    }

    public Long getRastro() {
        return rastro;
    }

    public void setRastro(Long rastro) {
        this.rastro = rastro;
    }

    public Long getUsuario() {
        return usuario;
    }

    public void setUsuario(Long usuario) {
        this.usuario = usuario;
    }

    public String getCodigoUsuario() {
        return this.codigoUsuario;
    }

    public void setCodigoUsuario(String codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public String getNombreUsuario() {
        return this.nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public Long getFuncion() {
        return funcion;
    }

    public void setFuncion(Long funcion) {
        this.funcion = funcion;
    }

    public EnumCondicionEjeFun getCondicion() {
        return condicion;
    }

    public void setCondicion(EnumCondicionEjeFun condicion) {
        this.condicion = condicion;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Long getGrupo() {
        return grupo;
    }

    public void setGrupo(Long grupo) {
        this.grupo = grupo;
    }

    public Long getSuperior() {
        return superior;
    }

    public void setSuperior(Long superior) {
        this.superior = superior;
    }

    public Long getRaiz() {
        return raiz;
    }

    public void setRaiz(Long raiz) {
        this.raiz = raiz;
    }

    public int getSubprocesos() {
        return subprocesos;
    }

    public void setSubprocesos(int subprocesos) {
        this.subprocesos = subprocesos;
    }

    public String getProcedimiento() {
        return procedimiento;
    }

    public void setProcedimiento(String procedimiento) {
        this.procedimiento = procedimiento;
    }

    public boolean isGrabarRastroPendiente() {
        return grabarRastroPendiente;
    }

    public void setGrabarRastroPendiente(boolean grabarRastroPendiente) {
        this.grabarRastroPendiente = grabarRastroPendiente;
    }

    public void copyUsuario(AbstractMessage message) {
        this.setUsuario(message.getUsuario());
        this.setCodigoUsuario(message.getCodigoUsuario());
        this.setNombreUsuario(message.getNombreUsuario());
    }

    @Override
    public int hashCode() {
        return (int) (id / 1471L);
    }

    @Override
    public boolean equals(Object object) {
        AbstractMessage that = object instanceof AbstractMessage ? (AbstractMessage) object : null;
        return that != null && that.id == this.id;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "(" + id + ", " + funcion + ", " + condicion.name() + ")";
    }

}
