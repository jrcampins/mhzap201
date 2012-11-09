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

import com.egt.base.persistence.entity.UsuarioBase;
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
@Table(name = "usuario")
public class Usuario implements UsuarioBase, Comparable, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "id_usuario")
    private Long idUsuario;

    @Basic(optional = false)
    @Column(name = "version_usuario")
    private long versionUsuario;

    @Basic(optional = false)
    @Column(name = "codigo_usuario")
    private String codigoUsuario;

    @Column(name = "nombre_usuario")
    private String nombreUsuario;

    @Column(name = "password_usuario")
    private String passwordUsuario;

    @Column(name = "correo_electronico")
    private String correoElectronico;

    @Basic(optional = false)
    @Column(name = "es_super_usuario")
    private int esSuperUsuario;

    @Basic(optional = false)
    @Column(name = "es_usuario_especial")
    private int esUsuarioEspecial;

    @Basic(optional = false)
    @Column(name = "es_usuario_inactivo")
    private int esUsuarioInactivo;

    @Basic(optional = false)
    @Column(name = "es_usuario_modificado")
    private int esUsuarioModificado;

    @JoinColumn(name = "id_usuario_supervisor", referencedColumnName = "id_usuario")
    @ManyToOne
    private Usuario usuarioIdUsuarioSupervisor;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "usuarioIdUsuarioUltimaCarga")
    private Collection<ArchivoDatosExt> archivoDatosExtIdUsuarioUltimaCargaCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "usuarioIdUsuarioUltimaImportacion")
    private Collection<ArchivoDatosExt> archivoDatosExtIdUsuarioUltimaImportacionCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "usuarioIdUsuario")
    private Collection<FiltroFuncion> filtroFuncionIdUsuarioCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "usuarioIdUsuario")
    private Collection<PaginaUsuario> paginaUsuarioIdUsuarioCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "usuarioIdUsuario")
    private Collection<RolUsuario> rolUsuarioIdUsuarioCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "usuarioIdUsuarioSupervisor")
    private Collection<Usuario> usuarioIdUsuarioSupervisorCollection;

    public Usuario() {
    }

    @Override
    public Long getIdUsuario() {
        return this.idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public long getVersionUsuario() {
        return this.versionUsuario;
    }

    public void setVersionUsuario(long versionUsuario) {
        this.versionUsuario = versionUsuario;
    }

    @Override
    public String getCodigoUsuario() {
        return this.codigoUsuario;
    }

    public void setCodigoUsuario(String codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    @Override
    public String getNombreUsuario() {
        return this.nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    @Override
    public String getPasswordUsuario() {
        return this.passwordUsuario;
    }

    public void setPasswordUsuario(String passwordUsuario) {
        this.passwordUsuario = passwordUsuario;
    }

    @Override
    public String getCorreoElectronico() {
        return this.correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    @Override
    public int getEsSuperUsuario() {
        return this.esSuperUsuario;
    }

    public void setEsSuperUsuario(int esSuperUsuario) {
        this.esSuperUsuario = esSuperUsuario;
    }

    @Override
    public int getEsUsuarioEspecial() {
        return this.esUsuarioEspecial;
    }

    public void setEsUsuarioEspecial(int esUsuarioEspecial) {
        this.esUsuarioEspecial = esUsuarioEspecial;
    }

    @Override
    public int getEsUsuarioInactivo() {
        return this.esUsuarioInactivo;
    }

    public void setEsUsuarioInactivo(int esUsuarioInactivo) {
        this.esUsuarioInactivo = esUsuarioInactivo;
    }

    @Override
    public int getEsUsuarioModificado() {
        return this.esUsuarioModificado;
    }

    public void setEsUsuarioModificado(int esUsuarioModificado) {
        this.esUsuarioModificado = esUsuarioModificado;
    }

    @Override
    public Usuario getUsuarioIdUsuarioSupervisor() {
        return this.usuarioIdUsuarioSupervisor;
    }

    public void setUsuarioIdUsuarioSupervisor(Usuario usuario) {
        this.usuarioIdUsuarioSupervisor = usuario;
    }

    @Override
    public Collection<ArchivoDatosExt> getArchivoDatosExtIdUsuarioUltimaCargaCollection() {
        return this.archivoDatosExtIdUsuarioUltimaCargaCollection;
    }

    public void setArchivoDatosExtIdUsuarioUltimaCargaCollection(Collection<ArchivoDatosExt> collection) {
        this.archivoDatosExtIdUsuarioUltimaCargaCollection = collection;
    }

    @Override
    public Collection<ArchivoDatosExt> getArchivoDatosExtIdUsuarioUltimaImportacionCollection() {
        return this.archivoDatosExtIdUsuarioUltimaImportacionCollection;
    }

    public void setArchivoDatosExtIdUsuarioUltimaImportacionCollection(Collection<ArchivoDatosExt> collection) {
        this.archivoDatosExtIdUsuarioUltimaImportacionCollection = collection;
    }

    @Override
    public Collection<FiltroFuncion> getFiltroFuncionIdUsuarioCollection() {
        return this.filtroFuncionIdUsuarioCollection;
    }

    public void setFiltroFuncionIdUsuarioCollection(Collection<FiltroFuncion> collection) {
        this.filtroFuncionIdUsuarioCollection = collection;
    }

    @Override
    public Collection<PaginaUsuario> getPaginaUsuarioIdUsuarioCollection() {
        return this.paginaUsuarioIdUsuarioCollection;
    }

    public void setPaginaUsuarioIdUsuarioCollection(Collection<PaginaUsuario> collection) {
        this.paginaUsuarioIdUsuarioCollection = collection;
    }

    @Override
    public Collection<RolUsuario> getRolUsuarioIdUsuarioCollection() {
        return this.rolUsuarioIdUsuarioCollection;
    }

    public void setRolUsuarioIdUsuarioCollection(Collection<RolUsuario> collection) {
        this.rolUsuarioIdUsuarioCollection = collection;
    }

    @Override
    public Collection<Usuario> getUsuarioIdUsuarioSupervisorCollection() {
        return this.usuarioIdUsuarioSupervisorCollection;
    }

    public void setUsuarioIdUsuarioSupervisorCollection(Collection<Usuario> collection) {
        this.usuarioIdUsuarioSupervisorCollection = collection;
    }

    @Override
    public int compareTo(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof Usuario) {
            Usuario that = (Usuario) object;
            return idUsuario == null ? that.idUsuario == null ? 0 : -1
                    : idUsuario.compareTo(that.idUsuario);
        }
        throw new ClassCastException(object == null ? "null" : object.getClass().getName());
    }

    @Override
    public int hashCode() {
        // Warning - this method won't work properly in the case the id fields are not set
        int hash = 0;
        hash += idUsuario == null ? 0 : idUsuario.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Warning - this method won't work properly in the case the id fields are not set
        if (object instanceof Usuario) {
            Usuario that = (Usuario) object;
            return ((idUsuario == null && that.idUsuario == null)
                    || (idUsuario != null && idUsuario.equals(that.idUsuario)));
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + idUsuario;
    }

}
