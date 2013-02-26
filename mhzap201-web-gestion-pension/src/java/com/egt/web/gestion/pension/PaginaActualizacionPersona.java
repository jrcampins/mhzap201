/*
 * Copyright (C) 2009, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 *
 */
package com.egt.web.gestion.pension;

import com.egt.data.generic.xdp2.PersonaCachedRowSetDataProvider2;
import com.egt.data.specific.xdp2.EtniaIndigenaCachedRowSetDataProvider2;
import com.egt.data.generic.xdp2.UbicacionCachedRowSetDataProvider2;
import com.egt.data.specific.xdp2.FichaPersonaCachedRowSetDataProvider2;
import com.egt.core.aplicacion.web.PaginaActualizacion;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.component.TextArea;
import com.sun.webui.jsf.component.TextField;
import com.sun.webui.jsf.component.Upload;

public interface PaginaActualizacionPersona extends PaginaActualizacion {

    TextField getCampoIdPersona1();

    TextField getCampoCodigoPersona1();

    TextField getCampoNombrePersona1();

    TextField getCampoNumeroCedula1();

    TextField getCampoLetraCedula1();

    TextField getTextFieldCampoFechaExpedicionCedula1();

    TextField getTextFieldCampoFechaVencimientoCedula1();

    TextField getCampoPrimerNombre1();

    TextField getCampoSegundoNombre1();

    TextField getCampoPrimerApellido1();

    TextField getCampoSegundoApellido1();

    TextField getCampoApellidoCasada1();

    TextField getCampoApodo1();

    TextField getTextFieldCampoFechaNacimiento1();

    DropDown getListaNumeroSexoPersona1();

    DropDown getListaNumeroEstadoCivil1();

    DropDown getListaEsParaguayoNatural1();

    DropDown getListaEsIndigena1();

    TextField getCampoIdEtniaIndigena1();

    TextField getCampoNombreComunidadIndigena1();

    TextField getCampoIdDepartamento1();

    TextField getCampoIdDistrito1();

    DropDown getListaNumeroTipoArea1();

    TextField getCampoIdBarrio1();

    TextArea getCampoDireccion1();

    TextField getCampoNumeroTelefonoLineaBaja1();

    TextField getCampoNumeroTelefonoCelular1();

    TextField getCampoCertificadoVida1();

    TextField getTextFieldCampoFechaCertificadoVida1();

    DropDown getListaEsCertificadoVidaAnulado1();

    TextArea getCampoComentariosAnulCerVida1();

    TextField getCampoCertificadoDefuncion1();

    TextField getTextFieldCampoFechaCertificadoDefuncion1();

    DropDown getListaEsCerDefuncionAnulado1();

    TextArea getCampoComentariosAnulCerDefuncion1();

    DropDown getListaEsPersonaConEmpleo1();

    DropDown getListaEsPersonaConJubilacion1();

    DropDown getListaEsPersonaConPension1();

    DropDown getListaEsPersonaConSubsidio1();

    DropDown getListaEsPersonaConDeuda1();

    DropDown getListaEsPersonaConPenaJudicial1();

    DropDown getListaEsPersonaConCerVida1();

    DropDown getListaEsPersonaConCartaRenuncia1();

    DropDown getListaEsPersonaElegibleParaPen1();

    DropDown getListaEsPersonaAcreditadaParaPen1();

    DropDown getListaEsPersonaConCopiaCedula1();

    DropDown getListaEsPersonaConDeclaracionJur1();

    TextField getCampoMontoPension1();

    DropDown getListaNumeroCondicionPension1();

    TextField getTextFieldCampoFechaSolicitudPension1();

    TextArea getCampoComentariosSolicitudPension1();

    TextField getTextFieldCampoFechaAprobacionPension1();

    TextArea getCampoComentariosAprobacionPension1();

    TextField getTextFieldCampoFechaOtorgamientoPen1();

    TextField getCampoNumeroResolucionOtorPen1();

    TextField getTextFieldCampoFechaResolucionOtorPen1();

    TextArea getCampoComentariosOtorgamientoPen1();

    TextField getTextFieldCampoFechaObjecionPension1();

    DropDown getListaNumeroCausaDenPension1();

    TextField getCampoOtraCausaDenPension1();

    TextArea getCampoComentariosObjecionPension1();

    TextField getTextFieldCampoFechaDenegacionPension1();

    TextField getCampoNumeroResolucionDenPen1();

    TextField getTextFieldCampoFechaResolucionDenPen1();

    TextArea getCampoComentariosDenegacionPension1();

    TextField getTextFieldCampoFechaRevocacionPension1();

    DropDown getListaNumeroCausaRevPension1();

    TextField getCampoOtraCausaRevPension1();

    TextArea getCampoComentariosRevocacionPension1();

    DropDown getListaNumeroCondicionRecoPen1();

    TextField getTextFieldCampoFechaSolicitudRecoPen1();

    TextArea getCampoComentariosSolicitudRecoPen1();

    TextField getTextFieldCampoFechaAprobacionRecoPen1();

    TextArea getCampoComentariosAprRecoPen1();

    TextField getTextFieldCampoFechaDenegacionRecoPen1();

    DropDown getListaNumeroCausaDenRecoPen1();

    TextField getCampoOtraCausaDenRecoPen1();

    TextArea getCampoComentariosDenRecoPen1();

    DropDown getListaNumeroCondicionDenuPen1();

    TextField getTextFieldCampoFechaRegistroDenunciaPen1();

    TextArea getCampoComentariosRegistroDenuPen1();

    TextField getTextFieldCampoFechaConfirmacionDenuPen1();

    TextArea getCampoComentariosConfDenuPen1();

    TextField getTextFieldCampoFechaDesmentidoDenunciaPen1();

    TextArea getCampoComentariosDesDenuPen1();

    TextField getCampoIdFichaPersona1();

    TextField getTextFieldCampoFechaFichaPersona1();

    TextField getCampoIndiceCalidadVida1();

    TextField getTextFieldCampoFechaUltimoCobroPension1();

    TextArea getCampoNotasAnulFecUltCobPen1();

    DropDown getListaNumeroTipoActJupe1();

    TextField getTextFieldCampoFechaHoraUltActJupe1();

    TextField getCampoLote1();

    TextField getCampoCodigoSime1();

    Button getBotonAplicar1();

    PersonaCachedRowSetDataProvider2 getPersonaDataProvider();

    EtniaIndigenaCachedRowSetDataProvider2 getEtniaIndigenaReferenceDataProvider();

    UbicacionCachedRowSetDataProvider2 getUbicacionReferenceDataProvider();

    FichaPersonaCachedRowSetDataProvider2 getFichaPersonaReferenceDataProvider();

    Object getPersonaBusinessProcess();

    Object getMessenger();

    Object getReporter();
}
