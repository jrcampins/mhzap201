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

import com.egt.base.persistence.entity.LogImpPerEecBase;
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
@Table(name = "log_imp_per_eec")
public class LogImpPerEec implements LogImpPerEecBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "id_log_imp_per_eec")
    private Long idLogImpPerEec;

    @Basic(optional = false)
    @Column(name = "version_log_imp_per_eec")
    private long versionLogImpPerEec;

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

    @Column(name = "orden")
    private String orden;

    @Column(name = "p30")
    private String p30;

    @Column(name = "p31")
    private String p31;

    @Column(name = "p32")
    private String p32;

    @Column(name = "p33")
    private String p33;

    @Column(name = "p34")
    private String p34;

    @Column(name = "p35")
    private String p35;

    @Column(name = "p36_orden_conyugue")
    private String p36OrdenConyugue;

    @Column(name = "p36_orden_padre")
    private String p36OrdenPadre;

    @Column(name = "p36_orden_madre")
    private String p36OrdenMadre;

    @Column(name = "p37")
    private String p37;

    @Column(name = "p37_cedula")
    private String p37Cedula;

    @Column(name = "p38_dia")
    private String p38Dia;

    @Column(name = "p38_mes")
    private String p38Mes;

    @Column(name = "p38_ano")
    private String p38Ano;

    @Column(name = "p39pais")
    private String p39pais;

    @Column(name = "p39dpto")
    private String p39dpto;

    @Column(name = "p39dist")
    private String p39dist;

    @Column(name = "p39area")
    private String p39area;

    @Column(name = "p40_idioma")
    private String p40Idioma;

    @Column(name = "p40otr")
    private String p40otr;

    @Column(name = "p41")
    private String p41;

    @Column(name = "p42")
    private String p42;

    @Column(name = "p43")
    private String p43;

    @Column(name = "p44_45t")
    private String p4445t;

    @Column(name = "p44")
    private String p44;

    @Column(name = "p45")
    private String p45;

    @Column(name = "p46")
    private String p46;

    @Column(name = "p47")
    private String p47;

    @Column(name = "p48")
    private String p48;

    @Column(name = "p49")
    private String p49;

    @Column(name = "p49_otr")
    private String p49Otr;

    @Column(name = "p50")
    private String p50;

    @Column(name = "p50_otr")
    private String p50Otr;

    @Column(name = "p51")
    private String p51;

    @Column(name = "p52")
    private String p52;

    @Column(name = "p52_otr")
    private String p52Otr;

    @Column(name = "p53")
    private String p53;

    @Column(name = "p54")
    private String p54;

    @Column(name = "p54a")
    private String p54a;

    @Column(name = "p54_otr")
    private String p54Otr;

    @Column(name = "p55")
    private String p55;

    @Column(name = "p55_otr")
    private String p55Otr;

    @Column(name = "p56")
    private String p56;

    @Column(name = "p57")
    private String p57;

    @Column(name = "p58")
    private String p58;

    @Column(name = "p59")
    private String p59;

    @Column(name = "p60")
    private String p60;

    @Column(name = "p61")
    private String p61;

    @Column(name = "p62")
    private String p62;

    @Column(name = "p63")
    private String p63;

    @Column(name = "p63_especificar")
    private String p63Especificar;

    @Column(name = "p64des")
    private String p64des;

    @Column(name = "p64c")
    private String p64c;

    @Column(name = "p65des")
    private String p65des;

    @Column(name = "p65c")
    private String p65c;

    @Column(name = "p66")
    private String p66;

    @Column(name = "p67a")
    private String p67a;

    @Column(name = "p67b")
    private String p67b;

    @Column(name = "p67c")
    private String p67c;

    @Column(name = "p67d")
    private String p67d;

    @Column(name = "p67e")
    private String p67e;

    @Column(name = "p67f")
    private String p67f;

    @Column(name = "p67g")
    private String p67g;

    @Column(name = "p67h")
    private String p67h;

    @Column(name = "p67i")
    private String p67i;

    @Column(name = "p67j")
    private String p67j;

    @Column(name = "p67k")
    private String p67k;

    @Column(name = "p67l")
    private String p67l;

    @Column(name = "p67tot")
    private String p67tot;

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

    public LogImpPerEec() {
    }

    @Override
    public Long getIdLogImpPerEec() {
        return this.idLogImpPerEec;
    }

    public void setIdLogImpPerEec(Long idLogImpPerEec) {
        this.idLogImpPerEec = idLogImpPerEec;
    }

    @Override
    public long getVersionLogImpPerEec() {
        return this.versionLogImpPerEec;
    }

    public void setVersionLogImpPerEec(long versionLogImpPerEec) {
        this.versionLogImpPerEec = versionLogImpPerEec;
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
    public String getOrden() {
        return this.orden;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }

    @Override
    public String getP30() {
        return this.p30;
    }

    public void setP30(String p30) {
        this.p30 = p30;
    }

    @Override
    public String getP31() {
        return this.p31;
    }

    public void setP31(String p31) {
        this.p31 = p31;
    }

    @Override
    public String getP32() {
        return this.p32;
    }

    public void setP32(String p32) {
        this.p32 = p32;
    }

    @Override
    public String getP33() {
        return this.p33;
    }

    public void setP33(String p33) {
        this.p33 = p33;
    }

    @Override
    public String getP34() {
        return this.p34;
    }

    public void setP34(String p34) {
        this.p34 = p34;
    }

    @Override
    public String getP35() {
        return this.p35;
    }

    public void setP35(String p35) {
        this.p35 = p35;
    }

    @Override
    public String getP36OrdenConyugue() {
        return this.p36OrdenConyugue;
    }

    public void setP36OrdenConyugue(String p36OrdenConyugue) {
        this.p36OrdenConyugue = p36OrdenConyugue;
    }

    @Override
    public String getP36OrdenPadre() {
        return this.p36OrdenPadre;
    }

    public void setP36OrdenPadre(String p36OrdenPadre) {
        this.p36OrdenPadre = p36OrdenPadre;
    }

    @Override
    public String getP36OrdenMadre() {
        return this.p36OrdenMadre;
    }

    public void setP36OrdenMadre(String p36OrdenMadre) {
        this.p36OrdenMadre = p36OrdenMadre;
    }

    @Override
    public String getP37() {
        return this.p37;
    }

    public void setP37(String p37) {
        this.p37 = p37;
    }

    @Override
    public String getP37Cedula() {
        return this.p37Cedula;
    }

    public void setP37Cedula(String p37Cedula) {
        this.p37Cedula = p37Cedula;
    }

    @Override
    public String getP38Dia() {
        return this.p38Dia;
    }

    public void setP38Dia(String p38Dia) {
        this.p38Dia = p38Dia;
    }

    @Override
    public String getP38Mes() {
        return this.p38Mes;
    }

    public void setP38Mes(String p38Mes) {
        this.p38Mes = p38Mes;
    }

    @Override
    public String getP38Ano() {
        return this.p38Ano;
    }

    public void setP38Ano(String p38Ano) {
        this.p38Ano = p38Ano;
    }

    @Override
    public String getP39pais() {
        return this.p39pais;
    }

    public void setP39pais(String p39pais) {
        this.p39pais = p39pais;
    }

    @Override
    public String getP39dpto() {
        return this.p39dpto;
    }

    public void setP39dpto(String p39dpto) {
        this.p39dpto = p39dpto;
    }

    @Override
    public String getP39dist() {
        return this.p39dist;
    }

    public void setP39dist(String p39dist) {
        this.p39dist = p39dist;
    }

    @Override
    public String getP39area() {
        return this.p39area;
    }

    public void setP39area(String p39area) {
        this.p39area = p39area;
    }

    @Override
    public String getP40Idioma() {
        return this.p40Idioma;
    }

    public void setP40Idioma(String p40Idioma) {
        this.p40Idioma = p40Idioma;
    }

    @Override
    public String getP40otr() {
        return this.p40otr;
    }

    public void setP40otr(String p40otr) {
        this.p40otr = p40otr;
    }

    @Override
    public String getP41() {
        return this.p41;
    }

    public void setP41(String p41) {
        this.p41 = p41;
    }

    @Override
    public String getP42() {
        return this.p42;
    }

    public void setP42(String p42) {
        this.p42 = p42;
    }

    @Override
    public String getP43() {
        return this.p43;
    }

    public void setP43(String p43) {
        this.p43 = p43;
    }

    @Override
    public String getP4445t() {
        return this.p4445t;
    }

    public void setP4445t(String p4445t) {
        this.p4445t = p4445t;
    }

    @Override
    public String getP44() {
        return this.p44;
    }

    public void setP44(String p44) {
        this.p44 = p44;
    }

    @Override
    public String getP45() {
        return this.p45;
    }

    public void setP45(String p45) {
        this.p45 = p45;
    }

    @Override
    public String getP46() {
        return this.p46;
    }

    public void setP46(String p46) {
        this.p46 = p46;
    }

    @Override
    public String getP47() {
        return this.p47;
    }

    public void setP47(String p47) {
        this.p47 = p47;
    }

    @Override
    public String getP48() {
        return this.p48;
    }

    public void setP48(String p48) {
        this.p48 = p48;
    }

    @Override
    public String getP49() {
        return this.p49;
    }

    public void setP49(String p49) {
        this.p49 = p49;
    }

    @Override
    public String getP49Otr() {
        return this.p49Otr;
    }

    public void setP49Otr(String p49Otr) {
        this.p49Otr = p49Otr;
    }

    @Override
    public String getP50() {
        return this.p50;
    }

    public void setP50(String p50) {
        this.p50 = p50;
    }

    @Override
    public String getP50Otr() {
        return this.p50Otr;
    }

    public void setP50Otr(String p50Otr) {
        this.p50Otr = p50Otr;
    }

    @Override
    public String getP51() {
        return this.p51;
    }

    public void setP51(String p51) {
        this.p51 = p51;
    }

    @Override
    public String getP52() {
        return this.p52;
    }

    public void setP52(String p52) {
        this.p52 = p52;
    }

    @Override
    public String getP52Otr() {
        return this.p52Otr;
    }

    public void setP52Otr(String p52Otr) {
        this.p52Otr = p52Otr;
    }

    @Override
    public String getP53() {
        return this.p53;
    }

    public void setP53(String p53) {
        this.p53 = p53;
    }

    @Override
    public String getP54() {
        return this.p54;
    }

    public void setP54(String p54) {
        this.p54 = p54;
    }

    @Override
    public String getP54a() {
        return this.p54a;
    }

    public void setP54a(String p54a) {
        this.p54a = p54a;
    }

    @Override
    public String getP54Otr() {
        return this.p54Otr;
    }

    public void setP54Otr(String p54Otr) {
        this.p54Otr = p54Otr;
    }

    @Override
    public String getP55() {
        return this.p55;
    }

    public void setP55(String p55) {
        this.p55 = p55;
    }

    @Override
    public String getP55Otr() {
        return this.p55Otr;
    }

    public void setP55Otr(String p55Otr) {
        this.p55Otr = p55Otr;
    }

    @Override
    public String getP56() {
        return this.p56;
    }

    public void setP56(String p56) {
        this.p56 = p56;
    }

    @Override
    public String getP57() {
        return this.p57;
    }

    public void setP57(String p57) {
        this.p57 = p57;
    }

    @Override
    public String getP58() {
        return this.p58;
    }

    public void setP58(String p58) {
        this.p58 = p58;
    }

    @Override
    public String getP59() {
        return this.p59;
    }

    public void setP59(String p59) {
        this.p59 = p59;
    }

    @Override
    public String getP60() {
        return this.p60;
    }

    public void setP60(String p60) {
        this.p60 = p60;
    }

    @Override
    public String getP61() {
        return this.p61;
    }

    public void setP61(String p61) {
        this.p61 = p61;
    }

    @Override
    public String getP62() {
        return this.p62;
    }

    public void setP62(String p62) {
        this.p62 = p62;
    }

    @Override
    public String getP63() {
        return this.p63;
    }

    public void setP63(String p63) {
        this.p63 = p63;
    }

    @Override
    public String getP63Especificar() {
        return this.p63Especificar;
    }

    public void setP63Especificar(String p63Especificar) {
        this.p63Especificar = p63Especificar;
    }

    @Override
    public String getP64des() {
        return this.p64des;
    }

    public void setP64des(String p64des) {
        this.p64des = p64des;
    }

    @Override
    public String getP64c() {
        return this.p64c;
    }

    public void setP64c(String p64c) {
        this.p64c = p64c;
    }

    @Override
    public String getP65des() {
        return this.p65des;
    }

    public void setP65des(String p65des) {
        this.p65des = p65des;
    }

    @Override
    public String getP65c() {
        return this.p65c;
    }

    public void setP65c(String p65c) {
        this.p65c = p65c;
    }

    @Override
    public String getP66() {
        return this.p66;
    }

    public void setP66(String p66) {
        this.p66 = p66;
    }

    @Override
    public String getP67a() {
        return this.p67a;
    }

    public void setP67a(String p67a) {
        this.p67a = p67a;
    }

    @Override
    public String getP67b() {
        return this.p67b;
    }

    public void setP67b(String p67b) {
        this.p67b = p67b;
    }

    @Override
    public String getP67c() {
        return this.p67c;
    }

    public void setP67c(String p67c) {
        this.p67c = p67c;
    }

    @Override
    public String getP67d() {
        return this.p67d;
    }

    public void setP67d(String p67d) {
        this.p67d = p67d;
    }

    @Override
    public String getP67e() {
        return this.p67e;
    }

    public void setP67e(String p67e) {
        this.p67e = p67e;
    }

    @Override
    public String getP67f() {
        return this.p67f;
    }

    public void setP67f(String p67f) {
        this.p67f = p67f;
    }

    @Override
    public String getP67g() {
        return this.p67g;
    }

    public void setP67g(String p67g) {
        this.p67g = p67g;
    }

    @Override
    public String getP67h() {
        return this.p67h;
    }

    public void setP67h(String p67h) {
        this.p67h = p67h;
    }

    @Override
    public String getP67i() {
        return this.p67i;
    }

    public void setP67i(String p67i) {
        this.p67i = p67i;
    }

    @Override
    public String getP67j() {
        return this.p67j;
    }

    public void setP67j(String p67j) {
        this.p67j = p67j;
    }

    @Override
    public String getP67k() {
        return this.p67k;
    }

    public void setP67k(String p67k) {
        this.p67k = p67k;
    }

    @Override
    public String getP67l() {
        return this.p67l;
    }

    public void setP67l(String p67l) {
        this.p67l = p67l;
    }

    @Override
    public String getP67tot() {
        return this.p67tot;
    }

    public void setP67tot(String p67tot) {
        this.p67tot = p67tot;
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
        if (object instanceof LogImpPerEec) {
            LogImpPerEec that = (LogImpPerEec) object;
            return idLogImpPerEec == null ? that.idLogImpPerEec == null ? 0 : -1
                    : idLogImpPerEec.compareTo(that.idLogImpPerEec);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += idLogImpPerEec == null ? 0 : idLogImpPerEec.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof LogImpPerEec) {
            LogImpPerEec that = (LogImpPerEec) object;
            return ((idLogImpPerEec == null && that.idLogImpPerEec == null) ||
                    (idLogImpPerEec != null && idLogImpPerEec.equals(that.idLogImpPerEec)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + idLogImpPerEec;
    }
}
