/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 * 
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los términos
 * de la licencia "GNU General Public License" publicada por la Fundación "Free Software Foundation".
 * 
 * Este programa se distribuye con la esperanza de que pueda ser útil, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas información.
 */
package com.egt.core.db.wrapper;

public class RecursoWrapper {

    private Object recurso;

    public RecursoWrapper() {
        this.recurso = null;
    }

    public RecursoWrapper(Object recurso) {
        this.recurso = recurso;
    }

    public Object getRecurso() {
        return recurso;
    }

    public void setRecurso(Object recurso) {
        this.recurso = recurso;
    }

    // <editor-fold defaultstate="collapsed" desc="metodos correspondientes a interfaces ">
    public boolean isRecursoIdentificable() {
        return recurso != null && this instanceof RecursoIdentificable;
    }

    public boolean isRecursoVersionable() {
        return recurso != null && this instanceof RecursoVersionable;
    }

    public boolean isRecursoCodificable() {
        return recurso != null && this instanceof RecursoCodificable;
    }

    public boolean isRecursoNombrable() {
        return recurso != null && this instanceof RecursoNombrable;
    }

    public boolean isRecursoPersonalizable() {
        return recurso != null && this instanceof RecursoPersonalizable;
    }

    public boolean isRecursoSegmentable() {
        return recurso != null && this instanceof RecursoSegmentable;
    }

    public boolean isRecursoJerarquizable() {
        return recurso != null && this instanceof RecursoJerarquizable;
    }

    public boolean isRecursoDesactivable() {
        return recurso != null && this instanceof RecursoDesactivable;
    }

    public boolean isRecursoEnumerable() {
        return recurso != null && this instanceof RecursoEnumerable;
    }

    public RecursoIdentificable getRecursoIdentificable() {
        return this.isRecursoIdentificable() ? (RecursoIdentificable) this : null;
    }

    public RecursoVersionable getRecursoVersionable() {
        return this.isRecursoVersionable() ? (RecursoVersionable) this : null;
    }

    public RecursoCodificable getRecursoCodificable() {
        return this.isRecursoCodificable() ? (RecursoCodificable) this : null;
    }

    public RecursoNombrable getRecursoNombrable() {
        return this.isRecursoNombrable() ? (RecursoNombrable) this : null;
    }

    public RecursoPersonalizable getRecursoPersonalizable() {
        return this.isRecursoPersonalizable() ? (RecursoPersonalizable) this : null;
    }

    public RecursoSegmentable getRecursoSegmentable() {
        return this.isRecursoSegmentable() ? (RecursoSegmentable) this : null;
    }

    public RecursoJerarquizable getRecursoJerarquizable() {
        return this.isRecursoJerarquizable() ? (RecursoJerarquizable) this : null;
    }

    public RecursoDesactivable getRecursoDesactivable() {
        return this.isRecursoDesactivable() ? (RecursoDesactivable) this : null;
    }

    public RecursoEnumerable getRecursoEnumerable() {
        return this.isRecursoEnumerable() ? (RecursoEnumerable) this : null;
    }

    // </editor-fold>    

    // <editor-fold defaultstate="collapsed" desc="metodos para implementar interfaces ">
//    public Long getIdentificacionRecurso() {
//      return this.getRecurso().getIdentificacionRecurso();
//  }
//
//  public void setIdentificacionRecurso(Long identificacionRecurso) {
//      this.getRecurso().setIdentificacionRecurso(identificacionRecurso);
//  }
//
//  public Long getVersionRecurso() {
//      return this.getRecurso().getVersionRecurso();
//  }
//
//  public void setVersionRecurso(Long versionRecurso) {
//      this.getRecurso().setVersionRecurso(versionRecurso);
//  }
//
//  public String getCodigoRecurso() {
//      return this.getRecurso().getCodigoRecurso();
//  }
//
//  public void setCodigoRecurso(String codigoRecurso) {
//      this.getRecurso().setCodigoRecurso(codigoRecurso);
//  }
//
//  public String getNombreRecurso() {
//      return this.getRecurso().getNombreRecurso();
//  }
//
//  public void setNombreRecurso(String nombreRecurso) {
//      this.getRecurso().setNombreRecurso(nombreRecurso);
//  }
//
//  public Long getPropietarioRecurso() {
//      return this.getRecurso().getPropietarioRecurso();
//  }
//
//  public void setPropietarioRecurso(Long propietarioRecurso) {
//      this.getRecurso().setPropietarioRecurso(propietarioRecurso);
//  }
//
//  public Long getSegmentoRecurso() {
//      return this.getRecurso().getSegmentoRecurso();
//  }
//
//  public void setSegmentoRecurso(Long segmentoRecurso) {
//      this.getRecurso().setSegmentoRecurso(segmentoRecurso);
//  }
//
//  public Long getRecursoSuperior() {
//      return this.getRecurso().getRecursoSuperior();
//  }
//
//  public void setRecursoSuperior(Long recursoSuperior) {
//      this.getRecurso().setRecursoSuperior(recursoSuperior);
//  }
//
//  public Integer getEsRecursoInactivo() {
//      return this.getRecurso().getEsRecursoInactivo();
//  }
//
//  public void setEsRecursoInactivo(Integer esRecursoInactivo) {
//      this.getRecurso().setEsRecursoInactivo(esRecursoInactivo);
//  }
//
//  public Integer getNumeroRecurso() {
//      return this.getRecurso().getNumeroRecurso();
//  }
//
//  public void setNumeroRecurso(Integer numeroRecurso) {
//      this.getRecurso().setNumeroRecurso(numeroRecurso);
//  }
    // </editor-fold>    
}
