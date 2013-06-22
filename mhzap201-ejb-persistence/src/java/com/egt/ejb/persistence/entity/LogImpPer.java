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

import com.egt.base.persistence.entity.LogImpPerBase;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "log_imp_per")
public class LogImpPer implements LogImpPerBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "id_log_imp_per")
    private Long idLogImpPer;

    @Basic(optional = false)
    @Column(name = "version_log_imp_per")
    private long versionLogImpPer;

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

    @Column(name = "p104")
    private String p104;

    @Column(name = "p43")
    private String p43;

    @Column(name = "p45a")
    private String p45a;

    @Column(name = "p45b")
    private String p45b;

    @Column(name = "p44a")
    private String p44a;

    @Column(name = "p44b")
    private String p44b;

    @Column(name = "var00001")
    private String var00001;

    @Column(name = "var00002")
    private String var00002;

    @Column(name = "p46")
    private String p46;

    @Column(name = "p47")
    private String p47;

    @Column(name = "var00030")
    private String var00030;

    @Column(name = "p48")
    private String p48;

    @Column(name = "p49")
    private String p49;

    @Column(name = "p50a")
    private String p50a;

    @Column(name = "p50b")
    private String p50b;

    @Column(name = "p50c")
    private String p50c;

    @Column(name = "p51")
    private String p51;

    @Column(name = "var00003")
    private String var00003;

    @Column(name = "var00004")
    private String var00004;

    @Column(name = "p52d")
    private String p52d;

    @Column(name = "p52m")
    private String p52m;

    @Column(name = "p52a")
    private String p52a;

    @Column(name = "p53a")
    private String p53a;

    @Column(name = "p53b")
    private String p53b;

    @Column(name = "p53c")
    private String p53c;

    @Column(name = "p53z")
    private String p53z;

    @Column(name = "p54")
    private String p54;

    @Column(name = "p54e")
    private String p54e;

    @Column(name = "p56")
    private String p56;

    @Column(name = "p58")
    private String p58;

    @Column(name = "p58e")
    private String p58e;

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

    @Column(name = "p64")
    private String p64;

    @Column(name = "p65")
    private String p65;

    @Column(name = "p65e")
    private String p65e;

    @Column(name = "p66")
    private String p66;

    @Column(name = "p66e")
    private String p66e;

    @Column(name = "p67")
    private String p67;

    @Column(name = "p68")
    private String p68;

    @Column(name = "p68e")
    private String p68e;

    @Column(name = "p73")
    private String p73;

    @Column(name = "p74")
    private String p74;

    @Column(name = "var00006")
    private String var00006;

    @Column(name = "var00007")
    private String var00007;

    @Column(name = "var00008")
    private String var00008;

    @Column(name = "var00009")
    private String var00009;

    @Column(name = "var00010")
    private String var00010;

    @Column(name = "var00011")
    private String var00011;

    @Column(name = "var00031")
    private String var00031;

    @Column(name = "var00012")
    private String var00012;

    @Column(name = "var00013")
    private String var00013;

    @Column(name = "p86")
    private String p86;

    @Column(name = "p87")
    private String p87;

    @Column(name = "p87e")
    private String p87e;

    @Column(name = "p88")
    private String p88;

    @Column(name = "p88e")
    private String p88e;

    @Column(name = "p91")
    private String p91;

    @Column(name = "var00017")
    private String var00017;

    @Column(name = "var00018")
    private String var00018;

    @Column(name = "var00019")
    private String var00019;

    @Column(name = "var00020")
    private String var00020;

    @Column(name = "var00021")
    private String var00021;

    @Column(name = "var00022")
    private String var00022;

    @Column(name = "var00023")
    private String var00023;

    @Column(name = "var00024")
    private String var00024;

    @Column(name = "var00025")
    private String var00025;

    @Column(name = "var00026")
    private String var00026;

    @Column(name = "var00027")
    private String var00027;

    @Column(name = "var00028")
    private String var00028;

    @Column(name = "p92")
    private String p92;

    @Column(name = "icv")
    private String icv;

    @Column(name = "ficha_activa")
    private String fichaActiva;

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

    @JoinColumn(name = "id_ficha_persona", referencedColumnName = "id_ficha_persona")
    @ManyToOne
    private FichaPersona fichaPersonaIdFichaPersona;

    public LogImpPer() {
    }

    @Override
    public Long getIdLogImpPer() {
        return this.idLogImpPer;
    }

    public void setIdLogImpPer(Long idLogImpPer) {
        this.idLogImpPer = idLogImpPer;
    }

    @Override
    public long getVersionLogImpPer() {
        return this.versionLogImpPer;
    }

    public void setVersionLogImpPer(long versionLogImpPer) {
        this.versionLogImpPer = versionLogImpPer;
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
    public String getP104() {
        return this.p104;
    }

    public void setP104(String p104) {
        this.p104 = p104;
    }

    @Override
    public String getP43() {
        return this.p43;
    }

    public void setP43(String p43) {
        this.p43 = p43;
    }

    @Override
    public String getP45a() {
        return this.p45a;
    }

    public void setP45a(String p45a) {
        this.p45a = p45a;
    }

    @Override
    public String getP45b() {
        return this.p45b;
    }

    public void setP45b(String p45b) {
        this.p45b = p45b;
    }

    @Override
    public String getP44a() {
        return this.p44a;
    }

    public void setP44a(String p44a) {
        this.p44a = p44a;
    }

    @Override
    public String getP44b() {
        return this.p44b;
    }

    public void setP44b(String p44b) {
        this.p44b = p44b;
    }

    @Override
    public String getVar00001() {
        return this.var00001;
    }

    public void setVar00001(String var00001) {
        this.var00001 = var00001;
    }

    @Override
    public String getVar00002() {
        return this.var00002;
    }

    public void setVar00002(String var00002) {
        this.var00002 = var00002;
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
    public String getVar00030() {
        return this.var00030;
    }

    public void setVar00030(String var00030) {
        this.var00030 = var00030;
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
    public String getP50a() {
        return this.p50a;
    }

    public void setP50a(String p50a) {
        this.p50a = p50a;
    }

    @Override
    public String getP50b() {
        return this.p50b;
    }

    public void setP50b(String p50b) {
        this.p50b = p50b;
    }

    @Override
    public String getP50c() {
        return this.p50c;
    }

    public void setP50c(String p50c) {
        this.p50c = p50c;
    }

    @Override
    public String getP51() {
        return this.p51;
    }

    public void setP51(String p51) {
        this.p51 = p51;
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
    public String getP52d() {
        return this.p52d;
    }

    public void setP52d(String p52d) {
        this.p52d = p52d;
    }

    @Override
    public String getP52m() {
        return this.p52m;
    }

    public void setP52m(String p52m) {
        this.p52m = p52m;
    }

    @Override
    public String getP52a() {
        return this.p52a;
    }

    public void setP52a(String p52a) {
        this.p52a = p52a;
    }

    @Override
    public String getP53a() {
        return this.p53a;
    }

    public void setP53a(String p53a) {
        this.p53a = p53a;
    }

    @Override
    public String getP53b() {
        return this.p53b;
    }

    public void setP53b(String p53b) {
        this.p53b = p53b;
    }

    @Override
    public String getP53c() {
        return this.p53c;
    }

    public void setP53c(String p53c) {
        this.p53c = p53c;
    }

    @Override
    public String getP53z() {
        return this.p53z;
    }

    public void setP53z(String p53z) {
        this.p53z = p53z;
    }

    @Override
    public String getP54() {
        return this.p54;
    }

    public void setP54(String p54) {
        this.p54 = p54;
    }

    @Override
    public String getP54e() {
        return this.p54e;
    }

    public void setP54e(String p54e) {
        this.p54e = p54e;
    }

    @Override
    public String getP56() {
        return this.p56;
    }

    public void setP56(String p56) {
        this.p56 = p56;
    }

    @Override
    public String getP58() {
        return this.p58;
    }

    public void setP58(String p58) {
        this.p58 = p58;
    }

    @Override
    public String getP58e() {
        return this.p58e;
    }

    public void setP58e(String p58e) {
        this.p58e = p58e;
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
    public String getP64() {
        return this.p64;
    }

    public void setP64(String p64) {
        this.p64 = p64;
    }

    @Override
    public String getP65() {
        return this.p65;
    }

    public void setP65(String p65) {
        this.p65 = p65;
    }

    @Override
    public String getP65e() {
        return this.p65e;
    }

    public void setP65e(String p65e) {
        this.p65e = p65e;
    }

    @Override
    public String getP66() {
        return this.p66;
    }

    public void setP66(String p66) {
        this.p66 = p66;
    }

    @Override
    public String getP66e() {
        return this.p66e;
    }

    public void setP66e(String p66e) {
        this.p66e = p66e;
    }

    @Override
    public String getP67() {
        return this.p67;
    }

    public void setP67(String p67) {
        this.p67 = p67;
    }

    @Override
    public String getP68() {
        return this.p68;
    }

    public void setP68(String p68) {
        this.p68 = p68;
    }

    @Override
    public String getP68e() {
        return this.p68e;
    }

    public void setP68e(String p68e) {
        this.p68e = p68e;
    }

    @Override
    public String getP73() {
        return this.p73;
    }

    public void setP73(String p73) {
        this.p73 = p73;
    }

    @Override
    public String getP74() {
        return this.p74;
    }

    public void setP74(String p74) {
        this.p74 = p74;
    }

    @Override
    public String getVar00006() {
        return this.var00006;
    }

    public void setVar00006(String var00006) {
        this.var00006 = var00006;
    }

    @Override
    public String getVar00007() {
        return this.var00007;
    }

    public void setVar00007(String var00007) {
        this.var00007 = var00007;
    }

    @Override
    public String getVar00008() {
        return this.var00008;
    }

    public void setVar00008(String var00008) {
        this.var00008 = var00008;
    }

    @Override
    public String getVar00009() {
        return this.var00009;
    }

    public void setVar00009(String var00009) {
        this.var00009 = var00009;
    }

    @Override
    public String getVar00010() {
        return this.var00010;
    }

    public void setVar00010(String var00010) {
        this.var00010 = var00010;
    }

    @Override
    public String getVar00011() {
        return this.var00011;
    }

    public void setVar00011(String var00011) {
        this.var00011 = var00011;
    }

    @Override
    public String getVar00031() {
        return this.var00031;
    }

    public void setVar00031(String var00031) {
        this.var00031 = var00031;
    }

    @Override
    public String getVar00012() {
        return this.var00012;
    }

    public void setVar00012(String var00012) {
        this.var00012 = var00012;
    }

    @Override
    public String getVar00013() {
        return this.var00013;
    }

    public void setVar00013(String var00013) {
        this.var00013 = var00013;
    }

    @Override
    public String getP86() {
        return this.p86;
    }

    public void setP86(String p86) {
        this.p86 = p86;
    }

    @Override
    public String getP87() {
        return this.p87;
    }

    public void setP87(String p87) {
        this.p87 = p87;
    }

    @Override
    public String getP87e() {
        return this.p87e;
    }

    public void setP87e(String p87e) {
        this.p87e = p87e;
    }

    @Override
    public String getP88() {
        return this.p88;
    }

    public void setP88(String p88) {
        this.p88 = p88;
    }

    @Override
    public String getP88e() {
        return this.p88e;
    }

    public void setP88e(String p88e) {
        this.p88e = p88e;
    }

    @Override
    public String getP91() {
        return this.p91;
    }

    public void setP91(String p91) {
        this.p91 = p91;
    }

    @Override
    public String getVar00017() {
        return this.var00017;
    }

    public void setVar00017(String var00017) {
        this.var00017 = var00017;
    }

    @Override
    public String getVar00018() {
        return this.var00018;
    }

    public void setVar00018(String var00018) {
        this.var00018 = var00018;
    }

    @Override
    public String getVar00019() {
        return this.var00019;
    }

    public void setVar00019(String var00019) {
        this.var00019 = var00019;
    }

    @Override
    public String getVar00020() {
        return this.var00020;
    }

    public void setVar00020(String var00020) {
        this.var00020 = var00020;
    }

    @Override
    public String getVar00021() {
        return this.var00021;
    }

    public void setVar00021(String var00021) {
        this.var00021 = var00021;
    }

    @Override
    public String getVar00022() {
        return this.var00022;
    }

    public void setVar00022(String var00022) {
        this.var00022 = var00022;
    }

    @Override
    public String getVar00023() {
        return this.var00023;
    }

    public void setVar00023(String var00023) {
        this.var00023 = var00023;
    }

    @Override
    public String getVar00024() {
        return this.var00024;
    }

    public void setVar00024(String var00024) {
        this.var00024 = var00024;
    }

    @Override
    public String getVar00025() {
        return this.var00025;
    }

    public void setVar00025(String var00025) {
        this.var00025 = var00025;
    }

    @Override
    public String getVar00026() {
        return this.var00026;
    }

    public void setVar00026(String var00026) {
        this.var00026 = var00026;
    }

    @Override
    public String getVar00027() {
        return this.var00027;
    }

    public void setVar00027(String var00027) {
        this.var00027 = var00027;
    }

    @Override
    public String getVar00028() {
        return this.var00028;
    }

    public void setVar00028(String var00028) {
        this.var00028 = var00028;
    }

    @Override
    public String getP92() {
        return this.p92;
    }

    public void setP92(String p92) {
        this.p92 = p92;
    }

    @Override
    public String getIcv() {
        return this.icv;
    }

    public void setIcv(String icv) {
        this.icv = icv;
    }

    @Override
    public String getFichaActiva() {
        return this.fichaActiva;
    }

    public void setFichaActiva(String fichaActiva) {
        this.fichaActiva = fichaActiva;
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
    public FichaPersona getFichaPersonaIdFichaPersona() {
        return this.fichaPersonaIdFichaPersona;
    }

    public void setFichaPersonaIdFichaPersona(FichaPersona fichaPersona) {
        this.fichaPersonaIdFichaPersona = fichaPersona;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof LogImpPer) {
            LogImpPer that = (LogImpPer) object;
            return idLogImpPer == null ? that.idLogImpPer == null ? 0 : -1
                    : idLogImpPer.compareTo(that.idLogImpPer);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += idLogImpPer == null ? 0 : idLogImpPer.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof LogImpPer) {
            LogImpPer that = (LogImpPer) object;
            return ((idLogImpPer == null && that.idLogImpPer == null) ||
                    (idLogImpPer != null && idLogImpPer.equals(that.idLogImpPer)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + idLogImpPer;
    }
}
