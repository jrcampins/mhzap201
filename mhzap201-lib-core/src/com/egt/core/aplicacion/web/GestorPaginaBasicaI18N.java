/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 * 
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 * 
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 */
package com.egt.core.aplicacion.web;

import com.egt.core.aplicacion.Bitacora;
import com.egt.core.util.Bundle;

public class GestorPaginaBasicaI18N {

    private static GestorPaginaBasicaI18N instance;

    public static synchronized GestorPaginaBasicaI18N getInstance() {
        if (instance == null) {
            instance = new GestorPaginaBasicaI18N();
        }
        return instance;
    }

    private GestorPaginaBasicaI18N() {
        Bitacora.stamp(this);
    }

    // <editor-fold defaultstate="collapsed" desc="metodos estandar para obtener el text y el toolTip de los botones">
    public String getTextoBotonAbrirBitacoraFunciones() {
        return Bundle.getString("botonAbrirBitacoraFunciones.text");
    }

    public String getToolTipBotonAbrirBitacoraFunciones() {
        return Bundle.getString("botonAbrirBitacoraFunciones.toolTip");
    }

    public String getTextoBotonAbrirBitacoraInformes() {
        return Bundle.getString("botonAbrirBitacoraInformes.text");
    }

    public String getToolTipBotonAbrirBitacoraInformes() {
        return Bundle.getString("botonAbrirBitacoraInformes.toolTip");
    }

    public String getTextoBotonAbrirBitacoraProcesos() {
        return Bundle.getString("botonAbrirBitacoraProcesos.text");
    }

    public String getToolTipBotonAbrirBitacoraProcesos() {
        return Bundle.getString("botonAbrirBitacoraProcesos.toolTip");
    }

    public String getTextoBotonAbrirFavoritos() {
        return Bundle.getString("botonAbrirFavoritos.text");
    }

    public String getToolTipBotonAbrirFavoritos() {
        return Bundle.getString("botonAbrirFavoritos.toolTip");
    }

    public String getTextoBotonAgregarFavoritos() {
        return Bundle.getString("botonAgregarFavoritos.text");
    }

    public String getToolTipBotonAgregarFavoritos() {
        return Bundle.getString("botonAgregarFavoritos.toolTip");
    }

    public String getTextoBotonAgregar() {
        return Bundle.getString("botonAgregar.text");
    }

    public String getToolTipBotonAgregar() {
        return Bundle.getString("botonAgregar.toolTip");
    }

    public String getTextoBotonAplicar() {
        return Bundle.getString("botonAplicar.text");
    }

    public String getToolTipBotonAplicar() {
        return Bundle.getString("botonAplicar.toolTip");
    }

    public String getTextoBotonAplicarFiltro() {
        return Bundle.getString("botonAplicarFiltro.text");
    }

    public String getToolTipBotonAplicarFiltro() {
        return Bundle.getString("botonAplicarFiltro.toolTip");
    }

    public String getTextoBotonAplicarZum() {
        return Bundle.getString("botonAplicarZum.text");
    }

    public String getToolTipBotonAplicarZum() {
        return Bundle.getString("botonAplicarZum.toolTip");
    }

    public String getTextoBotonAyudar() {
        return Bundle.getString("botonAyudar.text");
    }

    public String getToolTipBotonAyudar() {
        return Bundle.getString("botonAyudar.toolTip");
    }

    public String getTextoBotonBorrarCriterio() {
        return Bundle.getString("botonBorrarCriterio.text");
    }

    public String getToolTipBotonBorrarCriterio() {
        return Bundle.getString("botonBorrarCriterio.toolTip");
    }

    public String getTextoBotonBuscarFiltro1() {
        return Bundle.getString("botonBuscarFiltro1.text");
    }

    public String getToolTipBotonBuscarFiltro1() {
        return Bundle.getString("botonBuscarFiltro1.toolTip");
    }

    public String getTextoBotonBuscarFiltro2() {
        return Bundle.getString("botonBuscarFiltro2.text");
    }

    public String getToolTipBotonBuscarFiltro2() {
        return Bundle.getString("botonBuscarFiltro2.toolTip");
    }

    public String getTextoBotonCambiarPassword() {
        return Bundle.getString("botonCambiarPassword.text");
    }

    public String getToolTipBotonCambiarPassword() {
        return Bundle.getString("botonCambiarPassword.toolTip");
    }

    public String getTextoBotonCerrar() {
        return Bundle.getString("botonCerrar.text");
    }

    public String getToolTipBotonCerrar() {
        return Bundle.getString("botonCerrar.toolTip");
    }

    public String getTextoBotonComandoAbrir() {
        return Bundle.getString("botonComandoAbrir.text");
    }

    public String getToolTipBotonComandoAbrir() {
        return Bundle.getString("botonComandoAbrir.toolTip");
    }

    public String getTextoBotonComandoGuardar() {
        return Bundle.getString("botonComandoGuardar.text");
    }

    public String getToolTipBotonComandoGuardar() {
        return Bundle.getString("botonComandoGuardar.toolTip");
    }

    public String getTextoBotonComandoVer() {
        return Bundle.getString("botonComandoVer.text");
    }

    public String getToolTipBotonComandoVer() {
        return Bundle.getString("botonComandoVer.toolTip");
    }

    public String getTextoBotonConfirmar() {
        return Bundle.getString("botonConfirmar.text");
    }

    public String getToolTipBotonConfirmar() {
        return Bundle.getString("botonConfirmar.toolTip");
    }

    public String getTextoBotonDescartar() {
        return Bundle.getString("botonDescartar.text");
    }

    public String getToolTipBotonDescartar() {
        return Bundle.getString("botonDescartar.toolTip");
    }

    public String getTextoBotonDeshacer() {
        return Bundle.getString("botonDeshacer.text");
    }

    public String getToolTipBotonDeshacer() {
        return Bundle.getString("botonDeshacer.toolTip");
    }

    public String getTextoBotonDetallarFila() {
        return Bundle.getString("botonDetallarFila.text");
    }

    public String getToolTipBotonDetallarFila() {
        return Bundle.getString("botonDetallarFila.toolTip");
    }

    public String getTextoBotonEditar() {
        return Bundle.getString("botonEditar.text");
    }

    public String getToolTipBotonEditar() {
        return Bundle.getString("botonEditar.toolTip");
    }

    public String getTextoBotonEjecutarInforme() {
        return Bundle.getString("botonEjecutarInforme.text");
    }

    public String getToolTipBotonEjecutarInforme() {
        return Bundle.getString("botonEjecutarInforme.toolTip");
    }

    public String getTextoBotonEliminar() {
        return Bundle.getString("botonEliminar.text");
    }

    public String getToolTipBotonEliminar() {
        return Bundle.getString("botonEliminar.toolTip");
    }

    public String getTextoBotonEscogerFila() {
        return Bundle.getString("botonEscogerFila.text");
    }

    public String getToolTipBotonEscogerFila() {
        return Bundle.getString("botonEscogerFila.toolTip");
    }

    public String getTextoBotonExportarArchivo() {
        return Bundle.getString("botonExportarArchivo.text");
    }

    public String getToolTipBotonExportarArchivo() {
        return Bundle.getString("botonExportarArchivo.toolTip");
    }

    public String getTextoBotonIrAlAnterior() {
        return Bundle.getString("botonIrAlAnterior.text");
    }

    public String getToolTipBotonIrAlAnterior() {
        return Bundle.getString("botonIrAlAnterior.toolTip");
    }

    public String getTextoBotonIrAlPrimero() {
        return Bundle.getString("botonIrAlPrimero.text");
    }

    public String getToolTipBotonIrAlPrimero() {
        return Bundle.getString("botonIrAlPrimero.toolTip");
    }

    public String getTextoBotonIrAlSiguiente() {
        return Bundle.getString("botonIrAlSiguiente.text");
    }

    public String getToolTipBotonIrAlSiguiente() {
        return Bundle.getString("botonIrAlSiguiente.toolTip");
    }

    public String getTextoBotonIrAlUltimo() {
        return Bundle.getString("botonIrAlUltimo.text");
    }

    public String getToolTipBotonIrAlUltimo() {
        return Bundle.getString("botonIrAlUltimo.toolTip");
    }

    public String getTextoBotonProcesar() {
        return Bundle.getString("botonProcesar.text");
    }

    public String getToolTipBotonProcesar() {
        return Bundle.getString("botonProcesar.toolTip");
    }

    public String getTextoBotonProcesarFila() {
        return Bundle.getString("botonProcesarFila.text");
    }

    public String getToolTipBotonProcesarFila() {
        return Bundle.getString("botonProcesarFila.toolTip");
    }

    public String getTextoBotonQuitarFiltro() {
        return Bundle.getString("botonQuitarFiltro.text");
    }

    public String getToolTipBotonQuitarFiltro() {
        return Bundle.getString("botonQuitarFiltro.toolTip");
    }

    public String getTextoBotonQuitarZum() {
        return Bundle.getString("botonQuitarZum.text");
    }

    public String getToolTipBotonQuitarZum() {
        return Bundle.getString("botonQuitarZum.toolTip");
    }

    public String getTextoBotonReconsultar() {
        return Bundle.getString("botonReconsultar.text");
    }

    public String getToolTipBotonReconsultar() {
        return Bundle.getString("botonReconsultar.toolTip");
    }

    public String getTextoBotonRefrescar() {
        return Bundle.getString("botonRefrescar.text");
    }

    public String getToolTipBotonRefrescar() {
        return Bundle.getString("botonRefrescar.toolTip");
    }

    public String getTextoBotonRepaginar() {
        return Bundle.getString("botonRepaginar.text");
    }

    public String getToolTipBotonRepaginar() {
        return Bundle.getString("botonRepaginar.toolTip");
    }

    public String getTextoBotonRestaurarFiltro() {
        return Bundle.getString("botonRestaurarFiltro.text");
    }

    public String getToolTipBotonRestaurarFiltro() {
        return Bundle.getString("botonRestaurarFiltro.toolTip");
    }

    public String getTextoBotonOcultarFiltro() {
        return Bundle.getString("botonOcultarFiltro.text");
    }

    public String getToolTipBotonOcultarFiltro() {
        return Bundle.getString("botonOcultarFiltro.toolTip");
    }

    public String getTextoBotonMostrarFiltro() {
        return Bundle.getString("botonMostrarFiltro.text");
    }

    public String getToolTipBotonMostrarFiltro() {
        return Bundle.getString("botonMostrarFiltro.toolTip");
    }

    public String getTextoBotonRetornar() {
        return Bundle.getString("botonRetornar.text");
    }

    public String getToolTipBotonRetornar() {
        return Bundle.getString("botonRetornar.toolTip");
    }

    public String getTextoBotonRetornarFila() {
        return Bundle.getString("botonRetornarFila.text");
    }

    public String getToolTipBotonRetornarFila() {
        return Bundle.getString("botonRetornarFila.toolTip");
    }

    public String getTextoBotonVerArbol() {
        return Bundle.getString("botonVerArbol.text");
    }

    public String getToolTipBotonVerArbol() {
        return Bundle.getString("botonVerArbol.toolTip");
    }

    public String getTextoBotonVerDetalle() {
        return Bundle.getString("botonVerDetalle.text");
    }

    public String getToolTipBotonVerDetalle() {
        return Bundle.getString("botonVerDetalle.toolTip");
    }

    public String getTextoBotonVerTabla() {
        return Bundle.getString("botonVerTabla.text");
    }

    public String getToolTipBotonVerTabla() {
        return Bundle.getString("botonVerTabla.toolTip");
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos estandar para obtener el toolTip de los checkboxes">
    public String getToolTipCheckboxSeleccionMultiple() {
        return Bundle.getString("checkboxSeleccionMultiple.toolTip");
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos estandar para obtener el text de las etiquetas">
    public String getTextoEtiquetaMigasPanDetalle() {
        return Bundle.getString("hyperlink.detalle.text");
    }

    public String getToolTipEtiquetaMigasPanDetalle() {
        return Bundle.getString("hyperlink.detalle.toolTip");
    }

    public String getTextoEtiquetaIdentificacionFila() {
        return Bundle.getString("etiquetaIdentificacionFila.text");
    }

    public String getToolTipEtiquetaIdentificacionFila() {
        return Bundle.getString("etiquetaIdentificacionFila.toolTip");
    }

    public String getTextoEtiquetaListaComandoAbrir() {
        return Bundle.getString("etiquetaListaComandoAbrir.text");
    }

    public String getTextoEtiquetaListaComandoGuardar() {
        return Bundle.getString("etiquetaListaComandoGuardar.text");
    }

    public String getTextoEtiquetaListaComandoVer() {
        return Bundle.getString("etiquetaListaComandoVer.text");
    }

    public String getTextoEtiquetaListaFiltro() {
        return Bundle.getString("etiquetaListaFiltro.text");
    }

    public String getTextoEtiquetaListaFuncionAccion() {
        return Bundle.getString("etiquetaListaFuncionAccion.text");
    }

    public String getTextoEtiquetaListaOpcionZum() {
        return Bundle.getString("etiquetaListaOpcionZum.text");
    }

    public String getTextoEtiquetaTextoFilasPorPagina() {
        return Bundle.getString("etiquetaTextoFilasPorPagina.text");
    }

    public String getTextoEtiquetaTextoFiltro1() {
        return Bundle.getString("etiquetaTextoFiltro1.text");
    }

    public String getTextoEtiquetaTextoFiltro2() {
        return Bundle.getString("etiquetaTextoFiltro2.text");
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos estandar para obtener la etiqueta de la primera opción y el toolTip de las listas">
    public String getEtiquetaSeleccioneUnaOpcionListaComandoAbrir() {
        return Bundle.getString("listaComandoAbrir.opcion1");
    }

    public String getToolTipListaComandoAbrir() {
        return Bundle.getString("listaComandoAbrir.toolTip");
    }

    public String getEtiquetaSeleccioneUnaOpcionListaComandoGuardar() {
        return Bundle.getString("listaComandoGuardar.opcion1");
    }

    public String getToolTipListaComandoGuardar() {
        return Bundle.getString("listaComandoGuardar.toolTip");
    }

    public String getEtiquetaSeleccioneUnaOpcionListaComandoVer() {
        return Bundle.getString("listaComandoVer.opcion1");
    }

    public String getToolTipListaComandoVer() {
        return Bundle.getString("listaComandoVer.toolTip");
    }

    public String getEtiquetaSeleccioneUnaOpcionListaFuncionAccion() {
        return Bundle.getString("listaFuncionAccion.opcion1");
    }

    public String getToolTipListaFuncionAccion() {
        return Bundle.getString("listaFuncionAccion.toolTip");
    }

    public String getInlineHelpListaFuncionAccion() {
        return Bundle.getString("listaFuncionAccion.inlineHelp");
    }

    public String getEtiquetaSeleccioneUnaOpcionListaFuncionEdicion() {
        return Bundle.getString("listaFuncionEdicion.opcion1");
    }

    public String getToolTipListaFuncionEdicion() {
        return Bundle.getString("listaFuncionEdicion.toolTip");
    }

    public String getInlineHelpListaFuncionEdicion() {
        return Bundle.getString("listaFuncionEdicion.inlineHelp");
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos estandar para obtener el texto y los toolTip de los tabs">
    public String getTextHiddenStaticTextTab() {
        return Bundle.getString("hiddenStaticTextTab.text");
    }
    // </editor-fold>

}
