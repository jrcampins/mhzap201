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

import com.egt.commons.util.IntUtils;

public class Columna {

    public Columna(String nombre) {
        this.setNombre(nombre);
        this.setDescripcion("");
        this.setTipo(null);
        this.setLongitud(null);
        this.setPrecision(null);
        this.setEscala(null);
        this.setAnulable(IntUtils.FALSE);
        this.setAutonumerica(IntUtils.FALSE);
        this.setDominio(0L);
        this.setPropiedad(0L);
        this.setSincronizada(IntUtils.FALSE);
        this.setDuplicados(0);
    }

    /**
     * Conserva el valor de la propiedad nombre.
     */
    private String nombre;

    /**
     * Getter para propiedad nombre.
     * @return Valor de la propiedad nombre.
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Setter para propiedad nombre.
     * @param nombre Nuevo valor de la propiedad nombre.
     */
    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Conserva el valor de la propiedad descripcion.
     */
    private String descripcion;

    /**
     * Getter para propiedad descripcion.
     * @return Valor de la propiedad descripcion.
     */
    public String getDescripcion() {
        return this.descripcion;
    }

    /**
     * Setter para propiedad descripcion.
     * @param descripcion Nuevo valor de la propiedad descripcion.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Conserva el valor de la propiedad tipo.
     */
    private Integer tipo;

    /**
     * Getter para propiedad tipo.
     * @return Valor de la propiedad tipo.
     */
    public Integer getTipo() {
        return this.tipo;
    }

    /**
     * Setter para propiedad tipo.
     * @param tipo Nuevo valor de la propiedad tipo.
     */
    public void setTipo(Integer tipo) {
        this.tipo = tipo == null ? 0 : tipo;
    }

    /**
     * Conserva el valor de la propiedad longitud.
     */
    private Integer longitud;

    /**
     * Getter para propiedad longitud.
     * @return Valor de la propiedad longitud.
     */
    public Integer getLongitud() {
        return this.longitud;
    }

    /**
     * Setter para propiedad longitud.
     * @param longitud Nuevo valor de la propiedad longitud.
     */
    public void setLongitud(Integer longitud) {
        this.longitud = longitud;
    }

    /**
     * Conserva el valor de la propiedad precision.
     */
    private Integer precision;

    /**
     * Getter para propiedad precision.
     * @return Valor de la propiedad precision.
     */
    public Integer getPrecision() {
        return this.precision;
    }

    /**
     * Setter para propiedad precision.
     * @param precision Nuevo valor de la propiedad precision.
     */
    public void setPrecision(Integer precision) {
        this.precision = precision;
    }

    /**
     * Conserva el valor de la propiedad escala.
     */
    private Integer escala;

    /**
     * Getter para propiedad escala.
     * @return Valor de la propiedad escala.
     */
    public Integer getEscala() {
        return this.escala;
    }

    /**
     * Setter para propiedad escala.
     * @param escala Nuevo valor de la propiedad escala.
     */
    public void setEscala(Integer escala) {
        this.escala = escala;
    }

    /**
     * Conserva el valor de la propiedad anulable.
     */
    private Integer anulable;

    /**
     * Getter para propiedad anulable.
     * @return Valor de la propiedad anulable.
     */
    public Integer getAnulable() {
        return this.anulable;
    }

    /**
     * Setter para propiedad anulable.
     * @param anulable Nuevo valor de la propiedad anulable.
     */
    public void setAnulable(Integer anulable) {
        this.anulable = anulable;
    }

    /**
     * Conserva el valor de la propiedad autonumerica.
     */
    private Integer autonumerica;

    /**
     * Getter para propiedad autonumerica.
     * @return Valor de la propiedad autonumerica.
     */
    public Integer getAutonumerica() {
        return this.autonumerica;
    }

    /**
     * Setter para propiedad autonumerica.
     * @param autonumerica Nuevo valor de la propiedad autonumerica.
     */
    public void setAutonumerica(Integer autonumerica) {
        this.autonumerica = autonumerica;
    }

    /**
     * Conserva el valor de la propiedad dominio.
     */
    private Long dominio;

    /**
     * Getter para propiedad dominio.
     * @return Valor de la propiedad dominio.
     */
    public Long getDominio() {
        return this.dominio;
    }

    /**
     * Setter para propiedad dominio.
     * @param dominio Nuevo valor de la propiedad dominio.
     */
    public void setDominio(Long dominio) {
        this.dominio = dominio;
    }

    /**
     * Conserva el valor de la propiedad propiedad.
     */
    private Long propiedad;

    /**
     * Getter para propiedad propiedad.
     * @return Valor de la propiedad propiedad.
     */
    public Long getPropiedad() {
        return this.propiedad;
    }

    /**
     * Setter para propiedad propiedad.
     * @param propiedad Nuevo valor de la propiedad propiedad.
     */
    public void setPropiedad(Long propiedad) {
        this.propiedad = propiedad;
    }

    /**
     * Conserva el valor de la propiedad sincronizada.
     */
    private Integer sincronizada;

    /**
     * Getter para propiedad sincronizada.
     * @return Valor de la propiedad sincronizada.
     */
    public Integer getSincronizada() {
        return this.sincronizada;
    }

    /**
     * Setter para propiedad sincronizada.
     * @param sincronizada Nuevo valor de la propiedad sincronizada.
     */
    public void setSincronizada(Integer sincronizada) {
        this.sincronizada = sincronizada;
    }

    /**
     * Conserva el valor de la propiedad duplicados.
     */
    private int duplicados;

    /**
     * Getter para propiedad duplicados.
     * @return Valor de la propiedad duplicados.
     */
    public int getDuplicados() {
        return this.duplicados;
    }

    /**
     * Setter para propiedad duplicados.
     * @param duplicados Nuevo valor de la propiedad duplicados.
     */
    public void setDuplicados(int duplicados) {
        this.duplicados = duplicados;
    }
}
