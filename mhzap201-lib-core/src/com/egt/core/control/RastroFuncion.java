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

import java.util.LinkedHashSet;
import java.util.Set;

public class RastroFuncion {

    /**
     * Conserva el valor de la propiedad idRastroFuncion.
     */
    private Long idRastroFuncion;

    /**
     * Conserva el valor de la propiedad idUsuario.
     */
    private Long idUsuario;

    /**
     * Conserva el valor de la propiedad idFuncion.
     */
    private Long idFuncion;

    /**
     * Conserva el valor de la propiedad idRecurso.
     */
    private Long idRecurso;

    /**
     * Conserva el valor de la propiedad versionRecurso.
     */
    private Long versionRecurso;

    /**
     * Conserva el valor de la propiedad codigoRecurso.
     */
    private String codigoRecurso;

    /**
     * Conserva el valor de la propiedad nombreRecurso.
     */
    private String nombreRecurso;

    /**
     * Conserva el valor de la propiedad idPropietarioRecurso.
     */
    private Long idPropietarioRecurso;

    /**
     * Conserva el valor de la propiedad idSegmentoRecurso.
     */
    private Long idSegmentoRecurso;

    /**
     * Conserva el valor de la propiedad numeroError.
     */
    private Integer numeroError;

    /**
     * Conserva el valor de la propiedad descripcionError.
     */
    private String descripcionError;

    /**
     * Conserva el valor de la propiedad parametros.
     */
    private Set parametros;

    /** Creates a new instance of RastroFuncion */
    public RastroFuncion() {
        idRastroFuncion = null;
        idUsuario = null;
        idFuncion = null;
        idRecurso = null;
        versionRecurso = null;
        codigoRecurso = null;
        nombreRecurso = null;
        idPropietarioRecurso = null;
        idSegmentoRecurso = null;
        numeroError = null;
        descripcionError = null;
        parametros = new LinkedHashSet();
    }

    /**
     * Getter para propiedad idRastroFuncion.
     * 
     * @return Valor de la propiedad idRastroFuncion.
     */
    public Long getIdRastroFuncion() {
        return idRastroFuncion;
    }

    /**
     * Setter para propiedad idRastroFuncion.
     * 
     * @param idRastroFuncion
     *            Nuevo valor de la propiedad idRastroFuncion.
     */
    public void setIdRastroFuncion(Long idRastroFuncion) {
        this.idRastroFuncion = idRastroFuncion;
    }

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
     * @param idUsuario
     *            Nuevo valor de la propiedad idUsuario.
     */
    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * Getter para propiedad idFuncion.
     * 
     * @return Valor de la propiedad idFuncion.
     */
    public Long getIdFuncion() {
        return idFuncion;
    }

    /**
     * Setter para propiedad idFuncion.
     * 
     * @param idFuncion
     *            Nuevo valor de la propiedad idFuncion.
     */
    public void setIdFuncion(Long idFuncion) {
        this.idFuncion = idFuncion;
    }

    /**
     * Getter para propiedad idRecurso.
     * 
     * @return Valor de la propiedad idRecurso.
     */
    public Long getIdRecurso() {
        return idRecurso;
    }

    /**
     * Setter para propiedad idRecurso.
     * 
     * @param idRecurso
     *            Nuevo valor de la propiedad idRecurso.
     */
    public void setIdRecurso(Long idRecurso) {
        this.idRecurso = idRecurso;
    }

    /**
     * Getter para propiedad versionRecurso.
     * 
     * @return Valor de la propiedad versionRecurso.
     */
    public Long getVersionRecurso() {
        return versionRecurso;
    }

    /**
     * Setter para propiedad versionRecurso.
     * 
     * @param versionRecurso
     *            Nuevo valor de la propiedad versionRecurso.
     */
    public void setVersionRecurso(Long versionRecurso) {
        this.versionRecurso = versionRecurso;
    }

    /**
     * Getter para propiedad codigoRecurso.
     * 
     * @return Valor de la propiedad codigoRecurso.
     */
    public String getCodigoRecurso() {
        return codigoRecurso;
    }

    /**
     * Setter para propiedad codigoRecurso.
     * 
     * @param codigoRecurso
     *            Nuevo valor de la propiedad codigoRecurso.
     */
    public void setCodigoRecurso(String codigoRecurso) {
        this.codigoRecurso = codigoRecurso;
    }

    /**
     * Getter para propiedad nombreRecurso.
     * 
     * @return Valor de la propiedad nombreRecurso.
     */
    public String getNombreRecurso() {
        return nombreRecurso;
    }

    /**
     * Setter para propiedad nombreRecurso.
     * 
     * @param nombreRecurso
     *            Nuevo valor de la propiedad nombreRecurso.
     */
    public void setNombreRecurso(String nombreRecurso) {
        this.nombreRecurso = nombreRecurso;
    }

    /**
     * Getter para propiedad idPropietarioRecurso.
     * 
     * @return Valor de la propiedad idPropietarioRecurso.
     */
    public Long getIdPropietarioRecurso() {
        return idPropietarioRecurso;
    }

    /**
     * Setter para propiedad idPropietarioRecurso.
     * 
     * @param idPropietarioRecurso
     *            Nuevo valor de la propiedad idPropietarioRecurso.
     */
    public void setIdPropietarioRecurso(Long idPropietarioRecurso) {
        this.idPropietarioRecurso = idPropietarioRecurso;
    }

    /**
     * Getter para propiedad idSegmentoRecurso.
     * 
     * @return Valor de la propiedad idSegmentoRecurso.
     */
    public Long getIdSegmentoRecurso() {
        return idSegmentoRecurso;
    }

    /**
     * Setter para propiedad idSegmentoRecurso.
     * 
     * @param idSegmentoRecurso
     *            Nuevo valor de la propiedad idSegmentoRecurso.
     */
    public void setIdSegmentoRecurso(Long idSegmentoRecurso) {
        this.idSegmentoRecurso = idSegmentoRecurso;
    }

    /**
     * Getter para propiedad numeroError.
     * 
     * @return Valor de la propiedad numeroError.
     */
    public Integer getNumeroError() {
        return numeroError;
    }

    /**
     * Setter para propiedad numeroError.
     * 
     * @param numeroError
     *            Nuevo valor de la propiedad numeroError.
     */
    public void setNumeroError(Integer numeroError) {
        this.numeroError = numeroError;
    }

    /**
     * Getter para propiedad descripcionError.
     * 
     * @return Valor de la propiedad descripcionError.
     */
    public String getDescripcionError() {
        return descripcionError;
    }

    /**
     * Setter para propiedad descripcionError.
     * 
     * @param descripcionError
     *            Nuevo valor de la propiedad descripcionError.
     */
    public void setDescripcionError(String descripcionError) {
        this.descripcionError = descripcionError;
    }

    /**
     * Getter para propiedad parametros.
     * 
     * @return Valor de la propiedad parametros.
     */
    public Set getParametros() {
        return parametros;
    }

    public boolean addParametro(Long parametro, Object valor) {
        boolean result = false;

        if (parametro != null) {
            RastroFuncionPar rastroFuncionPar = new RastroFuncionPar(parametro, valor);
            result = parametros.add(rastroFuncionPar);
        }

        return result;
    }
}
