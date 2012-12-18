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

import com.egt.base.persistence.entity.LogImpHogBase;
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
@Table(name = "log_imp_hog")
public class LogImpHog implements LogImpHogBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "id_log_imp_hog")
    private Long idLogImpHog;

    @Basic(optional = false)
    @Column(name = "version_log_imp_hog")
    private long versionLogImpHog;

    @Column(name = "p20d")
    private String p20d;

    @Column(name = "p20m")
    private String p20m;

    @Column(name = "p20a")
    private String p20a;

    @Column(name = "p17")
    private String p17;

    @Column(name = "p18")
    private String p18;

    @Column(name = "var00001")
    private String var00001;

    @Column(name = "p19")
    private String p19;

    @Column(name = "observaciones")
    private String observaciones;

    @Column(name = "utm")
    private String utm;

    @Column(name = "gps")
    private String gps;

    @Column(name = "orden")
    private String orden;

    @Column(name = "coordx")
    private String coordx;

    @Column(name = "p01a")
    private String p01a;

    @Column(name = "p01b")
    private String p01b;

    @Column(name = "p01c")
    private String p01c;

    @Column(name = "p01d")
    private String p01d;

    @Column(name = "p02")
    private String p02;

    @Column(name = "p03")
    private String p03;

    @Column(name = "p04")
    private String p04;

    @Column(name = "p05")
    private String p05;

    @Column(name = "p06")
    private String p06;

    @Column(name = "p08")
    private String p08;

    @Column(name = "p07")
    private String p07;

    @Column(name = "p09")
    private String p09;

    @Column(name = "p14")
    private String p14;

    @Column(name = "p15")
    private String p15;

    @Column(name = "p16")
    private String p16;

    @Column(name = "p24")
    private String p24;

    @Column(name = "p25")
    private String p25;

    @Column(name = "p26")
    private String p26;

    @Column(name = "p27")
    private String p27;

    @Column(name = "p27e")
    private String p27e;

    @Column(name = "p28a")
    private String p28a;

    @Column(name = "p28b")
    private String p28b;

    @Column(name = "p29")
    private String p29;

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

    @Column(name = "p36")
    private String p36;

    @Column(name = "p37")
    private String p37;

    @Column(name = "nro_celular")
    private String nroCelular;

    @Column(name = "p38")
    private String p38;

    @Column(name = "nro_linea_baja")
    private String nroLineaBaja;

    @Column(name = "p391")
    private String p391;

    @Column(name = "p392")
    private String p392;

    @Column(name = "p393")
    private String p393;

    @Column(name = "p394")
    private String p394;

    @Column(name = "p395")
    private String p395;

    @Column(name = "p396")
    private String p396;

    @Column(name = "p397")
    private String p397;

    @Column(name = "p42n")
    private String p42n;

    @Column(name = "p42ci")
    private String p42ci;

    @Column(name = "letra_ci")
    private String letraCi;

    @Column(name = "p43")
    private String p43;

    @Column(name = "var00002")
    private String var00002;

    @Column(name = "var00003")
    private String var00003;

    @Column(name = "var00004")
    private String var00004;

    @Column(name = "p104")
    private String p104;

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

    public LogImpHog() {
    }

    @Override
    public Long getIdLogImpHog() {
        return this.idLogImpHog;
    }

    public void setIdLogImpHog(Long idLogImpHog) {
        this.idLogImpHog = idLogImpHog;
    }

    @Override
    public long getVersionLogImpHog() {
        return this.versionLogImpHog;
    }

    public void setVersionLogImpHog(long versionLogImpHog) {
        this.versionLogImpHog = versionLogImpHog;
    }

    @Override
    public String getP20d() {
        return this.p20d;
    }

    public void setP20d(String p20d) {
        this.p20d = p20d;
    }

    @Override
    public String getP20m() {
        return this.p20m;
    }

    public void setP20m(String p20m) {
        this.p20m = p20m;
    }

    @Override
    public String getP20a() {
        return this.p20a;
    }

    public void setP20a(String p20a) {
        this.p20a = p20a;
    }

    @Override
    public String getP17() {
        return this.p17;
    }

    public void setP17(String p17) {
        this.p17 = p17;
    }

    @Override
    public String getP18() {
        return this.p18;
    }

    public void setP18(String p18) {
        this.p18 = p18;
    }

    @Override
    public String getVar00001() {
        return this.var00001;
    }

    public void setVar00001(String var00001) {
        this.var00001 = var00001;
    }

    @Override
    public String getP19() {
        return this.p19;
    }

    public void setP19(String p19) {
        this.p19 = p19;
    }

    @Override
    public String getObservaciones() {
        return this.observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public String getUtm() {
        return this.utm;
    }

    public void setUtm(String utm) {
        this.utm = utm;
    }

    @Override
    public String getGps() {
        return this.gps;
    }

    public void setGps(String gps) {
        this.gps = gps;
    }

    @Override
    public String getOrden() {
        return this.orden;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }

    @Override
    public String getCoordx() {
        return this.coordx;
    }

    public void setCoordx(String coordx) {
        this.coordx = coordx;
    }

    @Override
    public String getP01a() {
        return this.p01a;
    }

    public void setP01a(String p01a) {
        this.p01a = p01a;
    }

    @Override
    public String getP01b() {
        return this.p01b;
    }

    public void setP01b(String p01b) {
        this.p01b = p01b;
    }

    @Override
    public String getP01c() {
        return this.p01c;
    }

    public void setP01c(String p01c) {
        this.p01c = p01c;
    }

    @Override
    public String getP01d() {
        return this.p01d;
    }

    public void setP01d(String p01d) {
        this.p01d = p01d;
    }

    @Override
    public String getP02() {
        return this.p02;
    }

    public void setP02(String p02) {
        this.p02 = p02;
    }

    @Override
    public String getP03() {
        return this.p03;
    }

    public void setP03(String p03) {
        this.p03 = p03;
    }

    @Override
    public String getP04() {
        return this.p04;
    }

    public void setP04(String p04) {
        this.p04 = p04;
    }

    @Override
    public String getP05() {
        return this.p05;
    }

    public void setP05(String p05) {
        this.p05 = p05;
    }

    @Override
    public String getP06() {
        return this.p06;
    }

    public void setP06(String p06) {
        this.p06 = p06;
    }

    @Override
    public String getP08() {
        return this.p08;
    }

    public void setP08(String p08) {
        this.p08 = p08;
    }

    @Override
    public String getP07() {
        return this.p07;
    }

    public void setP07(String p07) {
        this.p07 = p07;
    }

    @Override
    public String getP09() {
        return this.p09;
    }

    public void setP09(String p09) {
        this.p09 = p09;
    }

    @Override
    public String getP14() {
        return this.p14;
    }

    public void setP14(String p14) {
        this.p14 = p14;
    }

    @Override
    public String getP15() {
        return this.p15;
    }

    public void setP15(String p15) {
        this.p15 = p15;
    }

    @Override
    public String getP16() {
        return this.p16;
    }

    public void setP16(String p16) {
        this.p16 = p16;
    }

    @Override
    public String getP24() {
        return this.p24;
    }

    public void setP24(String p24) {
        this.p24 = p24;
    }

    @Override
    public String getP25() {
        return this.p25;
    }

    public void setP25(String p25) {
        this.p25 = p25;
    }

    @Override
    public String getP26() {
        return this.p26;
    }

    public void setP26(String p26) {
        this.p26 = p26;
    }

    @Override
    public String getP27() {
        return this.p27;
    }

    public void setP27(String p27) {
        this.p27 = p27;
    }

    @Override
    public String getP27e() {
        return this.p27e;
    }

    public void setP27e(String p27e) {
        this.p27e = p27e;
    }

    @Override
    public String getP28a() {
        return this.p28a;
    }

    public void setP28a(String p28a) {
        this.p28a = p28a;
    }

    @Override
    public String getP28b() {
        return this.p28b;
    }

    public void setP28b(String p28b) {
        this.p28b = p28b;
    }

    @Override
    public String getP29() {
        return this.p29;
    }

    public void setP29(String p29) {
        this.p29 = p29;
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
    public String getP36() {
        return this.p36;
    }

    public void setP36(String p36) {
        this.p36 = p36;
    }

    @Override
    public String getP37() {
        return this.p37;
    }

    public void setP37(String p37) {
        this.p37 = p37;
    }

    @Override
    public String getNroCelular() {
        return this.nroCelular;
    }

    public void setNroCelular(String nroCelular) {
        this.nroCelular = nroCelular;
    }

    @Override
    public String getP38() {
        return this.p38;
    }

    public void setP38(String p38) {
        this.p38 = p38;
    }

    @Override
    public String getNroLineaBaja() {
        return this.nroLineaBaja;
    }

    public void setNroLineaBaja(String nroLineaBaja) {
        this.nroLineaBaja = nroLineaBaja;
    }

    @Override
    public String getP391() {
        return this.p391;
    }

    public void setP391(String p391) {
        this.p391 = p391;
    }

    @Override
    public String getP392() {
        return this.p392;
    }

    public void setP392(String p392) {
        this.p392 = p392;
    }

    @Override
    public String getP393() {
        return this.p393;
    }

    public void setP393(String p393) {
        this.p393 = p393;
    }

    @Override
    public String getP394() {
        return this.p394;
    }

    public void setP394(String p394) {
        this.p394 = p394;
    }

    @Override
    public String getP395() {
        return this.p395;
    }

    public void setP395(String p395) {
        this.p395 = p395;
    }

    @Override
    public String getP396() {
        return this.p396;
    }

    public void setP396(String p396) {
        this.p396 = p396;
    }

    @Override
    public String getP397() {
        return this.p397;
    }

    public void setP397(String p397) {
        this.p397 = p397;
    }

    @Override
    public String getP42n() {
        return this.p42n;
    }

    public void setP42n(String p42n) {
        this.p42n = p42n;
    }

    @Override
    public String getP42ci() {
        return this.p42ci;
    }

    public void setP42ci(String p42ci) {
        this.p42ci = p42ci;
    }

    @Override
    public String getLetraCi() {
        return this.letraCi;
    }

    public void setLetraCi(String letraCi) {
        this.letraCi = letraCi;
    }

    @Override
    public String getP43() {
        return this.p43;
    }

    public void setP43(String p43) {
        this.p43 = p43;
    }

    @Override
    public String getVar00002() {
        return this.var00002;
    }

    public void setVar00002(String var00002) {
        this.var00002 = var00002;
    }

    @Override
    public String getVar00003() {
        return this.var00003;
    }

    public void setVar00003(String var00003) {
        this.var00003 = var00003;
    }

    @Override
    public String getVar00004() {
        return this.var00004;
    }

    public void setVar00004(String var00004) {
        this.var00004 = var00004;
    }

    @Override
    public String getP104() {
        return this.p104;
    }

    public void setP104(String p104) {
        this.p104 = p104;
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
        if (object instanceof LogImpHog) {
            LogImpHog that = (LogImpHog) object;
            return idLogImpHog == null ? that.idLogImpHog == null ? 0 : -1
                    : idLogImpHog.compareTo(that.idLogImpHog);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += idLogImpHog == null ? 0 : idLogImpHog.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof LogImpHog) {
            LogImpHog that = (LogImpHog) object;
            return ((idLogImpHog == null && that.idLogImpHog == null) ||
                    (idLogImpHog != null && idLogImpHog.equals(that.idLogImpHog)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + idLogImpHog;
    }
}
