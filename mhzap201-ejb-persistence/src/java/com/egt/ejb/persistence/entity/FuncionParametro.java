/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 *
 */
package com.egt.ejb.persistence.entity;

import com.egt.base.persistence.entity.FuncionParametroBase;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "funcion_parametro")
public class FuncionParametro implements FuncionParametroBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "id_funcion_parametro")
    private Long idFuncionParametro;

    @Basic(optional = false)
    @Column(name = "version_funcion_parametro")
    private long versionFuncionParametro;

    @Column(name = "id_lista_valor")
    private Long idListaValor;

    @Column(name = "id_clase_objeto_valor")
    private Long idClaseObjetoValor;

    @Column(name = "valor_minimo")
    private String valorMinimo;

    @Column(name = "valor_maximo")
    private String valorMaximo;

    @Column(name = "valor_omision")
    private String valorOmision;

    @Basic(optional = false)
    @Column(name = "es_parametro_sin_rastro")
    private int esParametroSinRastro;

    @Basic(optional = false)
    @Column(name = "es_parametro_segmento")
    private int esParametroSegmento;

    @JoinColumn(name = "id_funcion", referencedColumnName = "id_funcion")
    @ManyToOne
    private Funcion funcionIdFuncion;

    @JoinColumn(name = "id_parametro", referencedColumnName = "id_parametro")
    @ManyToOne
    private Parametro parametroIdParametro;

    @JoinColumn(name = "numero_tipo_parametro", referencedColumnName = "numero_tipo_parametro")
    @ManyToOne
    private TipoParametro tipoParametroNumeroTipoParametro;

    @JoinColumn(name = "numero_tipo_comparacion", referencedColumnName = "numero_tipo_comparacion")
    @ManyToOne
    private TipoComparacion tipoComparacionNumeroTipoComparacion;

    @JoinColumn(name = "id_funcion_referencia", referencedColumnName = "id_funcion")
    @ManyToOne
    private Funcion funcionIdFuncionReferencia;

    @JoinColumn(name = "numero_tipo_valor", referencedColumnName = "numero_tipo_valor")
    @ManyToOne
    private TipoValor tipoValorNumeroTipoValor;

    @JoinColumn(name = "id_clase_recurso_valor", referencedColumnName = "id_clase_recurso")
    @ManyToOne
    private ClaseRecurso claseRecursoIdClaseRecursoValor;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "funcionParametroIdFuncionParametro")
    private Collection<FiltroFuncionPar> filtroFuncionParIdFuncionParametroCollection;

    public FuncionParametro() {
    }

    @Override
    public Long getIdFuncionParametro() {
        return this.idFuncionParametro;
    }

    public void setIdFuncionParametro(Long idFuncionParametro) {
        this.idFuncionParametro = idFuncionParametro;
    }

    @Override
    public long getVersionFuncionParametro() {
        return this.versionFuncionParametro;
    }

    public void setVersionFuncionParametro(long versionFuncionParametro) {
        this.versionFuncionParametro = versionFuncionParametro;
    }

    @Override
    public Long getIdListaValor() {
        return this.idListaValor;
    }

    public void setIdListaValor(Long idListaValor) {
        this.idListaValor = idListaValor;
    }

    @Override
    public Long getIdClaseObjetoValor() {
        return this.idClaseObjetoValor;
    }

    public void setIdClaseObjetoValor(Long idClaseObjetoValor) {
        this.idClaseObjetoValor = idClaseObjetoValor;
    }

    @Override
    public String getValorMinimo() {
        return this.valorMinimo;
    }

    public void setValorMinimo(String valorMinimo) {
        this.valorMinimo = valorMinimo;
    }

    @Override
    public String getValorMaximo() {
        return this.valorMaximo;
    }

    public void setValorMaximo(String valorMaximo) {
        this.valorMaximo = valorMaximo;
    }

    @Override
    public String getValorOmision() {
        return this.valorOmision;
    }

    public void setValorOmision(String valorOmision) {
        this.valorOmision = valorOmision;
    }

    @Override
    public int getEsParametroSinRastro() {
        return this.esParametroSinRastro;
    }

    public void setEsParametroSinRastro(int esParametroSinRastro) {
        this.esParametroSinRastro = esParametroSinRastro;
    }

    @Override
    public int getEsParametroSegmento() {
        return this.esParametroSegmento;
    }

    public void setEsParametroSegmento(int esParametroSegmento) {
        this.esParametroSegmento = esParametroSegmento;
    }

    @Override
    public Funcion getFuncionIdFuncion() {
        return this.funcionIdFuncion;
    }

    public void setFuncionIdFuncion(Funcion funcion) {
        this.funcionIdFuncion = funcion;
    }

    @Override
    public Parametro getParametroIdParametro() {
        return this.parametroIdParametro;
    }

    public void setParametroIdParametro(Parametro parametro) {
        this.parametroIdParametro = parametro;
    }

    @Override
    public TipoParametro getTipoParametroNumeroTipoParametro() {
        return this.tipoParametroNumeroTipoParametro;
    }

    public void setTipoParametroNumeroTipoParametro(TipoParametro tipoParametro) {
        this.tipoParametroNumeroTipoParametro = tipoParametro;
    }

    @Override
    public TipoComparacion getTipoComparacionNumeroTipoComparacion() {
        return this.tipoComparacionNumeroTipoComparacion;
    }

    public void setTipoComparacionNumeroTipoComparacion(TipoComparacion tipoComparacion) {
        this.tipoComparacionNumeroTipoComparacion = tipoComparacion;
    }

    @Override
    public Funcion getFuncionIdFuncionReferencia() {
        return this.funcionIdFuncionReferencia;
    }

    public void setFuncionIdFuncionReferencia(Funcion funcion) {
        this.funcionIdFuncionReferencia = funcion;
    }

    @Override
    public TipoValor getTipoValorNumeroTipoValor() {
        return this.tipoValorNumeroTipoValor;
    }

    public void setTipoValorNumeroTipoValor(TipoValor tipoValor) {
        this.tipoValorNumeroTipoValor = tipoValor;
    }

    @Override
    public ClaseRecurso getClaseRecursoIdClaseRecursoValor() {
        return this.claseRecursoIdClaseRecursoValor;
    }

    public void setClaseRecursoIdClaseRecursoValor(ClaseRecurso claseRecurso) {
        this.claseRecursoIdClaseRecursoValor = claseRecurso;
    }

    @Override
    public Collection<FiltroFuncionPar> getFiltroFuncionParIdFuncionParametroCollection() {
        return this.filtroFuncionParIdFuncionParametroCollection;
    }

    public void setFiltroFuncionParIdFuncionParametroCollection(Collection<FiltroFuncionPar> collection) {
        this.filtroFuncionParIdFuncionParametroCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof FuncionParametro) {
            FuncionParametro that = (FuncionParametro) object;
            return idFuncionParametro == null ? that.idFuncionParametro == null ? 0 : -1
                    : idFuncionParametro.compareTo(that.idFuncionParametro);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += idFuncionParametro == null ? 0 : idFuncionParametro.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof FuncionParametro) {
            FuncionParametro that = (FuncionParametro) object;
            return ((idFuncionParametro == null && that.idFuncionParametro == null) ||
                    (idFuncionParametro != null && idFuncionParametro.equals(that.idFuncionParametro)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + idFuncionParametro;
    }
}
