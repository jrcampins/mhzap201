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
package com.egt.web.gestion.censo;

import com.egt.data.specific.xdp2.PotencialBenCachedRowSetDataProvider2;
import com.egt.data.generic.xdp2.PersonaCachedRowSetDataProvider2;
import com.egt.data.specific.xdp2.EtniaIndigenaCachedRowSetDataProvider2;
import com.egt.data.generic.xdp2.UbicacionCachedRowSetDataProvider2;
import com.egt.data.specific.xdp2.FuncionarioCachedRowSetDataProvider2;
import com.egt.data.specific.xdp2.FichaPersonaCachedRowSetDataProvider2;
import com.egt.data.general.xdp3.UsuarioCachedRowSetDataProvider3;
import com.egt.core.aplicacion.web.PaginaActualizacion;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.component.TextArea;
import com.sun.webui.jsf.component.TextField;
import com.sun.webui.jsf.component.Upload;

public interface PaginaActualizacionPotencialBen extends PaginaActualizacion {

    TextField getCampoIdPotencialBen1();

    TextField getCampoCodigoPotencialBen1();

    TextField getCampoNombrePotencialBen1();

    DropDown getListaNumeroTipoRegPotBen1();

    TextField getCampoIdPersona1();

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

    TextField getCampoEdad1();

    DropDown getListaEsParaguayoNatural1();

    DropDown getListaEsIndigena1();

    TextField getCampoIdEtniaIndigena1();

    TextField getCampoNombreComunidadIndigena1();

    TextField getCampoIdDepartamento1();

    TextField getCampoIdDistrito1();

    DropDown getListaNumeroTipoArea1();

    TextField getCampoIdBarrio1();

    TextField getCampoManzana1();

    TextField getCampoCompania1();

    TextArea getCampoDireccion1();

    TextField getCampoNombreResponsableHogar1();

    TextField getCampoNumeroTelefonoRespHogar1();

    DropDown getListaEsPersonaConJubilacion1();

    DropDown getListaEsPersonaConPension1();

    DropDown getListaEsPersonaConSubsidio1();

    TextField getCampoNombreReferente1();

    TextField getCampoNumeroTelefonoReferente1();

    DropDown getListaNumeroCondicionCenso1();

    TextField getTextFieldCampoFechaValidacionCenso1();

    TextField getCampoIdFuncionarioValidacionCen1();

    DropDown getListaNumeroCausaInvCenso1();

    TextField getCampoOtraCausaInvCenso1();

    TextArea getCampoComentariosValidacionCenso1();

    TextField getCampoIdFichaPersona1();

    DropDown getListaNumeroCondicionReclCen1();

    TextField getTextFieldCampoFechaReclamoCenso1();

    TextArea getCampoComentariosReclamoCenso1();

    TextField getTextFieldCampoFechaAprobacionReclamoCenso1();

    TextArea getCampoComentariosAprReclCen1();

    TextField getTextFieldCampoFechaDenegacionReclamoCenso1();

    DropDown getListaNumeroCausaDenReclCen1();

    TextField getCampoOtraCausaDenReclCen1();

    TextArea getCampoComentariosDenReclCen1();

    TextField getTextFieldCampoFechaRegistroPotBen1();

    TextField getCampoIdUsuarioRegPotBen1();

    DropDown getListaEsPotencialBenInactivo1();

    TextField getTextFieldCampoFechaUltimaVisitaCenso1();

    TextArea getCampoObservacionesUltVisitaCen1();

    TextField getCampoIdFuncionarioUltVisitaCen1();

    TextArea getCampoReferenciaDireccion1();

    TextField getCampoIndiceCalidadVida1();

    DropDown getListaEsPotencialBenMigrado1();

    Button getBotonAplicar1();

    PotencialBenCachedRowSetDataProvider2 getPotencialBenDataProvider();

    PersonaCachedRowSetDataProvider2 getPersonaReferenceDataProvider();

    EtniaIndigenaCachedRowSetDataProvider2 getEtniaIndigenaReferenceDataProvider();

    UbicacionCachedRowSetDataProvider2 getUbicacionReferenceDataProvider();

    FuncionarioCachedRowSetDataProvider2 getFuncionarioReferenceDataProvider();

    FichaPersonaCachedRowSetDataProvider2 getFichaPersonaReferenceDataProvider();

    UsuarioCachedRowSetDataProvider3 getUsuarioReferenceDataProvider();

    Object getPotencialBenBusinessProcess();

    Object getMessenger();

    Object getReporter();
}
