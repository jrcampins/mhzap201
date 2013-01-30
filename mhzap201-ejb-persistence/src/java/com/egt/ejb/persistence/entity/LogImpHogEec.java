/*
 * Copyright (C) 2010, EGT Consultores, C.A.
 *
 * Este archivo fue totalmente generado utilizando herramientas de software de EGT Consultores, C.A.
 * En consecuencia, partes del archivo podrian ser similares o hasta iguales a las de archivos de
 * programas de otros clientes, generados por las mismas herramientas; por lo tanto, esta similitud
 * no podra ser considerada como violacion del copyright.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 *
 */
package com.egt.ejb.persistence.entity;

import com.egt.base.persistence.entity.LogImpHogEecBase;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "log_imp_hog_eec")
public class LogImpHogEec implements LogImpHogEecBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "id_log_imp_hog_eec")
    private Long idLogImpHogEec;

    @Basic(optional = false)
    @Column(name = "version_log_imp_hog_eec")
    private long versionLogImpHogEec;

    @Column(name = "dptod")
    private String dptod;

    @Column(name = "distritod")
    private String distritod;

    @Column(name = "distripg")
    private String distripg;

    @Column(name = "area")
    private String area;

    @Column(name = "barrio")
    private String barrio;

    @Column(name = "manzana")
    private String manzana;

    @Column(name = "formulario")
    private String formulario;

    @Column(name = "vivi")
    private String vivi;

    @Column(name = "hogar")
    private String hogar;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "nro_de")
    private String nroDe;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "fecha")
    private String fecha;

    @Column(name = "dia")
    private String dia;

    @Column(name = "mes")
    private String mes;

    @Column(name = "ano")
    private String ano;

    @Column(name = "v10t")
    private String v10t;

    @Column(name = "v11")
    private String v11;

    @Column(name = "v12")
    private String v12;

    @Column(name = "v13")
    private String v13;

    @Column(name = "v14")
    private String v14;

    @Column(name = "v15")
    private String v15;

    @Column(name = "v16")
    private String v16;

    @Column(name = "v16_otr")
    private String v16Otr;

    @Column(name = "v17a")
    private String v17a;

    @Column(name = "v17b")
    private String v17b;

    @Column(name = "v18")
    private String v18;

    @Column(name = "v19")
    private String v19;

    @Column(name = "v20")
    private String v20;

    @Column(name = "v21")
    private String v21;

    @Column(name = "v22")
    private String v22;

    @Column(name = "v23")
    private String v23;

    @Column(name = "v24")
    private String v24;

    @Column(name = "v25")
    private String v25;

    @Column(name = "v26")
    private String v26;

    @Column(name = "v26esp_celular")
    private String v26espCelular;

    @Column(name = "v27")
    private String v27;

    @Column(name = "v27esp_linea")
    private String v27espLinea;

    @Column(name = "v28_1")
    private String v281;

    @Column(name = "v28_2")
    private String v282;

    @Column(name = "v28_3")
    private String v283;

    @Column(name = "v28_4")
    private String v284;

    @Column(name = "v28_5")
    private String v285;

    @Column(name = "v28_6")
    private String v286;

    @Column(name = "v28_7")
    private String v287;

    @Column(name = "v28_8")
    private String v288;

    @Column(name = "v29nombre_jefe")
    private String v29nombreJefe;

    @Column(name = "cedulajefe")
    private String cedulajefe;

    @Column(name = "var00001")
    private String var00001;

    @Basic(optional = false)
    @Column(name = "es_importado")
    private int esImportado;

    @Column(name = "observacion")
    private String observacion;

    @Basic(optional = false)
    @Column(name = "fecha_hora_transaccion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHoraTransaccion;

    @Column(name = "nombre_archivo")
    private String nombreArchivo;

    @Column(name = "codigo_archivo")
    private String codigoArchivo;

    public LogImpHogEec() {
    }

    @Override
    public Long getIdLogImpHogEec() {
        return this.idLogImpHogEec;
    }

    public void setIdLogImpHogEec(Long idLogImpHogEec) {
        this.idLogImpHogEec = idLogImpHogEec;
    }

    @Override
    public long getVersionLogImpHogEec() {
        return this.versionLogImpHogEec;
    }

    public void setVersionLogImpHogEec(long versionLogImpHogEec) {
        this.versionLogImpHogEec = versionLogImpHogEec;
    }

    @Override
    public String getDptod() {
        return this.dptod;
    }

    public void setDptod(String dptod) {
        this.dptod = dptod;
    }

    @Override
    public String getDistritod() {
        return this.distritod;
    }

    public void setDistritod(String distritod) {
        this.distritod = distritod;
    }

    @Override
    public String getDistripg() {
        return this.distripg;
    }

    public void setDistripg(String distripg) {
        this.distripg = distripg;
    }

    @Override
    public String getArea() {
        return this.area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String getBarrio() {
        return this.barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    @Override
    public String getManzana() {
        return this.manzana;
    }

    public void setManzana(String manzana) {
        this.manzana = manzana;
    }

    @Override
    public String getFormulario() {
        return this.formulario;
    }

    public void setFormulario(String formulario) {
        this.formulario = formulario;
    }

    @Override
    public String getVivi() {
        return this.vivi;
    }

    public void setVivi(String vivi) {
        this.vivi = vivi;
    }

    @Override
    public String getHogar() {
        return this.hogar;
    }

    public void setHogar(String hogar) {
        this.hogar = hogar;
    }

    @Override
    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String getNroDe() {
        return this.nroDe;
    }

    public void setNroDe(String nroDe) {
        this.nroDe = nroDe;
    }

    @Override
    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String getFecha() {
        return this.fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String getDia() {
        return this.dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    @Override
    public String getMes() {
        return this.mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    @Override
    public String getAno() {
        return this.ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    @Override
    public String getV10t() {
        return this.v10t;
    }

    public void setV10t(String v10t) {
        this.v10t = v10t;
    }

    @Override
    public String getV11() {
        return this.v11;
    }

    public void setV11(String v11) {
        this.v11 = v11;
    }

    @Override
    public String getV12() {
        return this.v12;
    }

    public void setV12(String v12) {
        this.v12 = v12;
    }

    @Override
    public String getV13() {
        return this.v13;
    }

    public void setV13(String v13) {
        this.v13 = v13;
    }

    @Override
    public String getV14() {
        return this.v14;
    }

    public void setV14(String v14) {
        this.v14 = v14;
    }

    @Override
    public String getV15() {
        return this.v15;
    }

    public void setV15(String v15) {
        this.v15 = v15;
    }

    @Override
    public String getV16() {
        return this.v16;
    }

    public void setV16(String v16) {
        this.v16 = v16;
    }

    @Override
    public String getV16Otr() {
        return this.v16Otr;
    }

    public void setV16Otr(String v16Otr) {
        this.v16Otr = v16Otr;
    }

    @Override
    public String getV17a() {
        return this.v17a;
    }

    public void setV17a(String v17a) {
        this.v17a = v17a;
    }

    @Override
    public String getV17b() {
        return this.v17b;
    }

    public void setV17b(String v17b) {
        this.v17b = v17b;
    }

    @Override
    public String getV18() {
        return this.v18;
    }

    public void setV18(String v18) {
        this.v18 = v18;
    }

    @Override
    public String getV19() {
        return this.v19;
    }

    public void setV19(String v19) {
        this.v19 = v19;
    }

    @Override
    public String getV20() {
        return this.v20;
    }

    public void setV20(String v20) {
        this.v20 = v20;
    }

    @Override
    public String getV21() {
        return this.v21;
    }

    public void setV21(String v21) {
        this.v21 = v21;
    }

    @Override
    public String getV22() {
        return this.v22;
    }

    public void setV22(String v22) {
        this.v22 = v22;
    }

    @Override
    public String getV23() {
        return this.v23;
    }

    public void setV23(String v23) {
        this.v23 = v23;
    }

    @Override
    public String getV24() {
        return this.v24;
    }

    public void setV24(String v24) {
        this.v24 = v24;
    }

    @Override
    public String getV25() {
        return this.v25;
    }

    public void setV25(String v25) {
        this.v25 = v25;
    }

    @Override
    public String getV26() {
        return this.v26;
    }

    public void setV26(String v26) {
        this.v26 = v26;
    }

    @Override
    public String getV26espCelular() {
        return this.v26espCelular;
    }

    public void setV26espCelular(String v26espCelular) {
        this.v26espCelular = v26espCelular;
    }

    @Override
    public String getV27() {
        return this.v27;
    }

    public void setV27(String v27) {
        this.v27 = v27;
    }

    @Override
    public String getV27espLinea() {
        return this.v27espLinea;
    }

    public void setV27espLinea(String v27espLinea) {
        this.v27espLinea = v27espLinea;
    }

    @Override
    public String getV281() {
        return this.v281;
    }

    public void setV281(String v281) {
        this.v281 = v281;
    }

    @Override
    public String getV282() {
        return this.v282;
    }

    public void setV282(String v282) {
        this.v282 = v282;
    }

    @Override
    public String getV283() {
        return this.v283;
    }

    public void setV283(String v283) {
        this.v283 = v283;
    }

    @Override
    public String getV284() {
        return this.v284;
    }

    public void setV284(String v284) {
        this.v284 = v284;
    }

    @Override
    public String getV285() {
        return this.v285;
    }

    public void setV285(String v285) {
        this.v285 = v285;
    }

    @Override
    public String getV286() {
        return this.v286;
    }

    public void setV286(String v286) {
        this.v286 = v286;
    }

    @Override
    public String getV287() {
        return this.v287;
    }

    public void setV287(String v287) {
        this.v287 = v287;
    }

    @Override
    public String getV288() {
        return this.v288;
    }

    public void setV288(String v288) {
        this.v288 = v288;
    }

    @Override
    public String getV29nombreJefe() {
        return this.v29nombreJefe;
    }

    public void setV29nombreJefe(String v29nombreJefe) {
        this.v29nombreJefe = v29nombreJefe;
    }

    @Override
    public String getCedulajefe() {
        return this.cedulajefe;
    }

    public void setCedulajefe(String cedulajefe) {
        this.cedulajefe = cedulajefe;
    }

    @Override
    public String getVar00001() {
        return this.var00001;
    }

    public void setVar00001(String var00001) {
        this.var00001 = var00001;
    }

    @Override
    public int getEsImportado() {
        return this.esImportado;
    }

    public void setEsImportado(int esImportado) {
        this.esImportado = esImportado;
    }

    @Override
    public String getObservacion() {
        return this.observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @Override
    public Date getFechaHoraTransaccion() {
        return this.fechaHoraTransaccion;
    }

    public void setFechaHoraTransaccion(Date fechaHoraTransaccion) {
        this.fechaHoraTransaccion = fechaHoraTransaccion;
    }

    @Override
    public String getNombreArchivo() {
        return this.nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    @Override
    public String getCodigoArchivo() {
        return this.codigoArchivo;
    }

    public void setCodigoArchivo(String codigoArchivo) {
        this.codigoArchivo = codigoArchivo;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof LogImpHogEec) {
            LogImpHogEec that = (LogImpHogEec) object;
            return idLogImpHogEec == null ? that.idLogImpHogEec == null ? 0 : -1
                    : idLogImpHogEec.compareTo(that.idLogImpHogEec);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += idLogImpHogEec == null ? 0 : idLogImpHogEec.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof LogImpHogEec) {
            LogImpHogEec that = (LogImpHogEec) object;
            return ((idLogImpHogEec == null && that.idLogImpHogEec == null) ||
                    (idLogImpHogEec != null && idLogImpHogEec.equals(that.idLogImpHogEec)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + idLogImpHogEec;
    }
}
