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
package com.egt.data.general.xdp3;

import com.egt.base.constants.CBM2;
import com.egt.base.enums.EnumTipoDatoPar;
import com.egt.base.enums.EnumTipoRecurso;
import com.egt.base.enums.EnumTipoValor;
import com.egt.base.persistence.entity.ClaseRecursoBase;
import com.egt.base.persistence.entity.DominioBase;
import com.egt.base.persistence.entity.FuncionBase;
import com.egt.base.persistence.entity.FuncionParametroBase;
import com.egt.base.persistence.entity.ParametroBase;
import com.egt.base.persistence.entity.TipoDatoParBase;
import com.egt.base.persistence.entity.TipoRecursoBase;
import com.egt.base.persistence.entity.TipoValorBase;
import com.egt.core.aplicacion.Bitacora;
import com.egt.core.aplicacion.TLC;
import com.egt.core.aplicacion.web.EJBL;
import com.egt.core.util.STP;
import com.egt.data.general.xdp2.FiltroFuncionParCachedRowSetDataProvider2;
import com.sun.data.provider.RowKey;
import javax.sql.rowset.CachedRowSet;

public class FiltroFuncionParCachedRowSetDataProvider3 extends FiltroFuncionParCachedRowSetDataProvider2 {

    public FiltroFuncionParCachedRowSetDataProvider3() {
        super();
    }

    public FiltroFuncionParCachedRowSetDataProvider3(CachedRowSet cachedRowSet) {
        super(cachedRowSet);
    }

    @Override
    public void close() {
        Bitacora.trace(this.getClass(), "close");
        super.close();
    }

    @Override
    protected boolean esFilaValidaParaCrearFiltroFuncionPar(RowKey rowKey) {
        Bitacora.trace(this.getClass(), "esFilaValidaParaCrearFiltroFuncionPar");
        boolean es = super.esFilaValidaParaCrearFiltroFuncionPar(rowKey);
        es &= this.esFilaValidaParaGuardar(rowKey);
        return es;
    }

    @Override
    protected boolean esFilaValidaParaModificarFiltroFuncionPar(RowKey rowKey) {
        Bitacora.trace(this.getClass(), "esFilaValidaParaModificarFiltroFuncionPar");
        boolean es = super.esFilaValidaParaModificarFiltroFuncionPar(rowKey);
        es &= this.esFilaValidaParaGuardar(rowKey);
        return es;
    }

    private boolean esFilaValidaParaGuardar(RowKey rowKey) {
        boolean es = true;
        if (this.getTipoValor(rowKey) == null) {
            TLC.getBitacora().error(CBM2.OPCION_VALOR_INDETERMINADA);
            es = false;
        }
        return es;
    }

    @Override
    protected void preCommitCrearFiltroFuncionPar(RowKey rowKey) {
        Bitacora.trace(this.getClass(), "preCommitCrearFiltroFuncionPar");
        this.anularColumnasValor(rowKey); /* tiene que ejecutarse antes del super (para que el log quede bien) */
        super.preCommitCrearFiltroFuncionPar(rowKey);
    }

    @Override
    protected void preCommitModificarFiltroFuncionPar(RowKey rowKey) {
        Bitacora.trace(this.getClass(), "preCommitModificarFiltroFuncionPar");
        this.anularColumnasValor(rowKey); /* tiene que ejecutarse antes del super (para que el log quede bien) */
        super.preCommitModificarFiltroFuncionPar(rowKey);
    }

    private void anularColumnasValor(RowKey rowKey) {
        EnumTipoValor tipo = this.getEnumTipoValor(rowKey);
        if (tipo == null) {
            this.setIdValorLista(rowKey, null);
            this.setIdObjetoValor(rowKey, null);
            this.setIdRecursoValor(rowKey, null);
            this.setValorParametro(rowKey, null);
            this.setSignificadoParametro(rowKey, null);
        } else {
            switch (tipo) {
                case CONTINUO:
                    this.setIdValorLista(rowKey, null);
                    this.setIdObjetoValor(rowKey, null);
                    this.setIdRecursoValor(rowKey, null);
                    break;
                case DISCRETO:
                    this.setIdObjetoValor(rowKey, null);
                    this.setIdRecursoValor(rowKey, null);
                    this.setValorParametro(rowKey, null);
                    this.setSignificadoParametro(rowKey, null);
                    break;
                case OBJETO:
                    this.setIdValorLista(rowKey, null);
                    this.setIdRecursoValor(rowKey, null);
                    this.setValorParametro(rowKey, null);
                    this.setSignificadoParametro(rowKey, null);
                    break;
                case RECURSO:
                    this.setIdValorLista(rowKey, null);
                    this.setIdObjetoValor(rowKey, null);
                    this.setValorParametro(rowKey, null);
                    this.setSignificadoParametro(rowKey, null);
                    break;
                default:
                    this.setIdValorLista(rowKey, null);
                    this.setIdObjetoValor(rowKey, null);
                    this.setIdRecursoValor(rowKey, null);
                    this.setValorParametro(rowKey, null);
                    this.setSignificadoParametro(rowKey, null);
                    break;
            }
        }
    }

    public FuncionParametroBase getFuncionParametro() {
        return this.getFuncionParametro(this.getIdFuncionParametro());
    }

    public FuncionParametroBase getFuncionParametro(RowKey rowKey) {
        return this.getFuncionParametro(this.getIdFuncionParametro(rowKey));
    }

    private FuncionParametroBase getFuncionParametro(Long idFuncionParametro) {
        if (!this.isInicializado()) {
            return null;
        }
        return idFuncionParametro == null ? null : EJBL.getFuncionParametroFacade().find(idFuncionParametro);
    }

    public TipoValorBase getTipoValor() {
        return this.getTipoValor(this.getIdFuncionParametro());
    }

    public TipoValorBase getTipoValor(RowKey rowKey) {
        return this.getTipoValor(this.getIdFuncionParametro(rowKey));
    }

    private TipoValorBase getTipoValor(Long idFuncionParametro) {
        FuncionParametroBase pojo = this.getFuncionParametro(idFuncionParametro);
        return pojo == null ? null : pojo.getTipoValorNumeroTipoValor();
    }

    public EnumTipoValor getEnumTipoValor() {
        return this.getEnumTipoValor(this.getIdFuncionParametro());
    }

    public EnumTipoValor getEnumTipoValor(RowKey rowKey) {
        return this.getEnumTipoValor(this.getIdFuncionParametro(rowKey));
    }

    private EnumTipoValor getEnumTipoValor(Long idFuncionParametro) {
        TipoValorBase pojo = this.getTipoValor(idFuncionParametro);
        return pojo == null ? null : EnumTipoValor.valueOf(pojo.getNumeroTipoValor());
    }

    public Long getIdDominioValor() {
        return this.getIdDominioValor(this.getIdFuncionParametro());
    }

    public Long getIdDominioValor(RowKey rowKey) {
        return this.getIdDominioValor(this.getIdFuncionParametro(rowKey));
    }

    private Long getIdDominioValor(Long idFuncionParametro) {
        FuncionParametroBase fp = this.getFuncionParametro(idFuncionParametro);
        TipoValorBase tv = fp == null ? null : fp.getTipoValorNumeroTipoValor();
        EnumTipoValor tipo = tv == null ? null : EnumTipoValor.valueOf(tv.getNumeroTipoValor());
        Long dominio = null;
        if (tipo == null) {
        } else {
            switch (tipo) {
                case CONTINUO:
                    break;
                case DISCRETO:
//                  ListaValor lv = fp.getListaValorIdListaValor();
//                  dominio = lv == null ? null : lv.getIdListaValor();
                    break;
                case OBJETO:
//                  ClaseObjeto co = fp.getClaseObjetoIdClaseObjetoValor();
//                  dominio = co == null ? null : co.getIdClaseObjeto();
                    break;
                case RECURSO:
                    ClaseRecursoBase cr = fp.getClaseRecursoIdClaseRecursoValor();
                    dominio = cr == null ? null : cr.getIdClaseRecurso();
                    break;
                default:
                    break;
            }
        }
        return dominio;
    }

    public ParametroBase getParametro() {
        return this.getParametro(this.getIdFuncionParametro());
    }

    public ParametroBase getParametro(RowKey rowKey) {
        return this.getParametro(this.getIdFuncionParametro(rowKey));
    }

    private ParametroBase getParametro(Long idFuncionParametro) {
        FuncionParametroBase pojo = this.getFuncionParametro(idFuncionParametro);
        return pojo == null ? null : pojo.getParametroIdParametro();
    }

    public TipoDatoParBase getTipoDatoPar() {
        return this.getTipoDatoPar(this.getIdFuncionParametro());
    }

    public TipoDatoParBase getTipoDatoPar(RowKey rowKey) {
        return this.getTipoDatoPar(this.getIdFuncionParametro(rowKey));
    }

    private TipoDatoParBase getTipoDatoPar(Long idFuncionParametro) {
        ParametroBase pojo = this.getParametro(idFuncionParametro);
        return pojo == null ? null : pojo.getTipoDatoParNumeroTipoDatoPar();
    }

    public EnumTipoDatoPar getEnumTipoDatoPar() {
        return this.getEnumTipoDatoPar(this.getIdFuncionParametro());
    }

    public EnumTipoDatoPar getEnumTipoDatoPar(RowKey rowKey) {
        return this.getEnumTipoDatoPar(this.getIdFuncionParametro(rowKey));
    }

    private EnumTipoDatoPar getEnumTipoDatoPar(Long idFuncionParametro) {
        TipoDatoParBase pojo = this.getTipoDatoPar(idFuncionParametro);
        return pojo == null ? null : EnumTipoDatoPar.valueOf(pojo.getNumeroTipoDatoPar());
    }

    public FuncionBase getFuncionReferencia() {
        return this.getFuncionReferencia(this.getIdFuncionParametro());
    }

    public FuncionBase getFuncionReferencia(RowKey rowKey) {
        return this.getFuncionReferencia(this.getIdFuncionParametro(rowKey));
    }

    private FuncionBase getFuncionReferencia(Long idFuncionParametro) {
        FuncionParametroBase pojo = this.getFuncionParametro(idFuncionParametro);
        return pojo == null ? null : pojo.getFuncionIdFuncionReferencia();
    }

    public Long getIdFuncionReferencia() {
        return this.getIdFuncionReferencia(this.getIdFuncionParametro());
    }

    public Long getIdFuncionReferencia(RowKey rowKey) {
        return this.getIdFuncionReferencia(this.getIdFuncionParametro(rowKey));
    }

    private Long getIdFuncionReferencia(Long idFuncionParametro) {
        FuncionBase pojo = this.getFuncionReferencia(idFuncionParametro);
        return pojo == null ? null : pojo.getIdFuncion();
    }

    public TipoRecursoBase getTipoRecurso() {
        return this.getTipoRecurso(this.getIdFuncionParametro());
    }

    public TipoRecursoBase getTipoRecurso(RowKey rowKey) {
        return this.getTipoRecurso(this.getIdFuncionParametro(rowKey));
    }

    private TipoRecursoBase getTipoRecurso(Long idFuncionParametro) {
        FuncionBase fr = this.getFuncionReferencia(idFuncionParametro);
        DominioBase df = fr == null ? null : fr.getDominioIdDominio();
        ClaseRecursoBase cr = df == null ? null : df.getClaseRecursoIdClaseRecurso();
        return cr == null ? null : cr.getTipoRecursoNumeroTipoRecurso();
    }

    public EnumTipoRecurso getEnumTipoRecurso() {
        return this.getEnumTipoRecurso(this.getIdFuncionParametro());
    }

    public EnumTipoRecurso getEnumTipoRecurso(RowKey rowKey) {
        return this.getEnumTipoRecurso(this.getIdFuncionParametro(rowKey));
    }

    private EnumTipoRecurso getEnumTipoRecurso(Long idFuncionParametro) {
        TipoRecursoBase pojo = this.getTipoRecurso(idFuncionParametro);
        return pojo == null ? null : EnumTipoRecurso.valueOf(pojo.getNumeroTipoRecurso());
    }

    public java.util.Date getValorParametroFechaHora() {
        String valor = this.getValorParametro();
        return valor == null ? null : (java.util.Date) STP.getObjeto(valor, EnumTipoDatoPar.FECHA_HORA);
    }

    public java.util.Date getValorParametroFechaHora(RowKey rowKey) {
        String valor = this.getValorParametro(rowKey);
        return valor == null ? null : (java.util.Date) STP.getObjeto(valor, EnumTipoDatoPar.FECHA_HORA);
    }

    public void setValorParametroFechaHora(java.util.Date valor) {
        this.setValorParametro(STP.getString(valor));
    }

    public void setValorParametroFechaHora(RowKey rowKey, java.util.Date valor) {
        this.setValorParametro(rowKey, STP.getString(valor));
    }

    public Integer getIdRecursoValorConfiguracionFija() {
        Long valor = this.getIdRecursoValor();
        return valor == null ? null : valor.intValue();
    }

    public Integer getIdRecursoValorConfiguracionFija(RowKey rowKey) {
        Long valor = this.getIdRecursoValor(rowKey);
        return valor == null ? null : valor.intValue();
    }

    public void setIdRecursoValorConfiguracionFija(Integer valor) {
        Long value = valor == null ? null : Long.valueOf(valor);
        this.setIdRecursoValor(value);
    }

    public void setIdRecursoValorConfiguracionFija(RowKey rowKey, Integer valor) {
        Long value = valor == null ? null : Long.valueOf(valor);
        this.setIdRecursoValor(rowKey, value);
    }

}
