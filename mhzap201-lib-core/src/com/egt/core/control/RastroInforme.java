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

public class RastroInforme {

    /**
     * Conserva el valor de la propiedad idRastroInforme.
     */
    private Long idRastroInforme;

    /**
     * Conserva el valor de la propiedad idUsuario.
     */
    private Long idUsuario;

    /**
     * Conserva el valor de la propiedad idFuncion.
     */
    private Long idFuncion;

    /**
     * Conserva el valor de la propiedad numeroCondicionEjeFun.
     */
    private Integer numeroCondicionEjeFun;

    /**
     * Conserva el valor de la propiedad nombreArchivo.
     */
    private String nombreArchivo;

    /**
     * Conserva el valor de la propiedad descripcionError.
     */
    private String descripcionError;

    /** Creates a new instance of RastroInforme */
    public RastroInforme() {
        idRastroInforme = null;
        idUsuario = null;
        idFuncion = null;
        numeroCondicionEjeFun = null;
        nombreArchivo = null;
        descripcionError = null;
    }

    /**
     * Getter para propiedad idRastroInforme.
     * 
     * @return Valor de la propiedad idRastroInforme.
     */
    public Long getIdRastroInforme() {
        return idRastroInforme;
    }

    /**
     * Setter para propiedad idRastroInforme.
     * 
     * @param idRastroInforme
     *            Nuevo valor de la propiedad idRastroInforme.
     */
    public void setIdRastroInforme(Long idRastroInforme) {
        this.idRastroInforme = idRastroInforme;
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
     * Getter para propiedad numeroCondicionEjeFun.
     * 
     * @return Valor de la propiedad numeroCondicionEjeFun.
     */
    public Integer getNumeroCondicionEjeFun() {
        return numeroCondicionEjeFun;
    }

    /**
     * Setter para propiedad numeroCondicionEjeFun.
     * 
     * @param numeroCondicionEjeFun
     *            Nuevo valor de la propiedad numeroCondicionEjeFun.
     */
    public void setNumeroCondicionEjeFun(Integer numeroCondicionEjeFun) {
        this.numeroCondicionEjeFun = numeroCondicionEjeFun;
    }

    /**
     * Getter para propiedad nombreArchivo.
     * 
     * @return Valor de la propiedad nombreArchivo.
     */
    public String getNombreArchivo() {
        return nombreArchivo;
    }

    /**
     * Setter para propiedad nombreArchivo.
     * 
     * @param nombreArchivo
     *            Nuevo valor de la propiedad nombreArchivo.
     */
    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
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
}
