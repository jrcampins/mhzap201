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

import com.egt.data.specific.xdp2.FichaPersonaCachedRowSetDataProvider2;
import com.egt.data.specific.xdp2.FichaHogarCachedRowSetDataProvider2;
import com.egt.data.generic.xdp2.UbicacionCachedRowSetDataProvider2;
import com.egt.data.specific.xdp2.PotencialBenCachedRowSetDataProvider2;
import com.egt.core.aplicacion.web.PaginaActualizacion;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.component.TextArea;
import com.sun.webui.jsf.component.TextField;
import com.sun.webui.jsf.component.Upload;

public interface PaginaActualizacionFichaPersonaPorFichaHogar extends PaginaActualizacion {

    TextField getCampoIdFichaPersona1();

    TextField getCampoCodigoFichaPersona1();

    TextField getCampoNombreFichaPersona1();

    DropDown getListaEsRespondente1();

    TextField getCampoNumeroOrdenIdentificacion1();

    TextField getCampoPrimerNombre1();

    TextField getCampoSegundoNombre1();

    TextField getCampoPrimerApellido1();

    TextField getCampoSegundoApellido1();

    TextField getCampoApellidoCasada1();

    TextField getCampoApodo1();

    TextField getCampoEdad1();

    DropDown getListaNumeroSexoPersona1();

    DropDown getListaNumeroEstadoCivil1();

    DropDown getListaNumeroTipoPersonaHogar1();

    DropDown getListaNumeroSionoMiembroHogar1();

    TextField getCampoNumeroOrdenIdenConyuge1();

    TextField getCampoNumeroOrdenIdenPadre1();

    TextField getCampoNumeroOrdenIdenMadre1();

    TextField getCampoNumeroCedula1();

    TextField getCampoLetraCedula1();

    DropDown getListaNumeroTipoExcepcionCed1();

    TextField getTextFieldCampoFechaNacimiento1();

    TextField getCampoIdDepartamentoNacimiento1();

    TextField getCampoIdDistritoNacimiento1();

    DropDown getListaNumeroTipoAreaLugarNac1();

    DropDown getListaNumeroIdiomaHogar1();

    TextField getCampoOtroIdiomaHogar1();

    DropDown getListaNumeroSionoAsistenciaEsc1();

    DropDown getListaNumeroMotivoInaEsc1();

    TextField getCampoOtroMotivoInaEsc1();

    DropDown getListaNumeroSionoMatriculacionEsc1();

    TextField getCampoUltimoCursoAprobado1();

    DropDown getListaNumeroNivelEduUltCurAprob1();

    DropDown getListaNumeroSionoCursoNoFormal1();

    DropDown getListaNumeroTipoSeguroMedico1();

    DropDown getListaNumeroEstadoSalud1();

    DropDown getListaNumeroClaseEnfAcc1();

    TextField getCampoOtraClaseEnfAcc1();

    DropDown getListaNumeroClaseEnfCronica1();

    TextField getCampoOtraClaseEnfCronica1();

    DropDown getListaNumeroSionoAtencionMedica1();

    DropDown getListaNumeroMotivoNoAtencion1();

    TextField getCampoOtroMotivoNoAtencion1();

    DropDown getListaNumeroSionoCarnetVacunacion1();

    DropDown getListaNumeroClaseImpedimento1();

    TextField getCampoOtraClaseImpedimento1();

    DropDown getListaNumeroCausaImpedimento1();

    TextField getCampoOtraCausaImpedimento1();

    DropDown getListaNumeroSionoDifParaCaminar1();

    DropDown getListaNumeroSionoDifParaVestirse1();

    DropDown getListaNumeroSionoDifParaBanarse1();

    DropDown getListaNumeroSionoDifParaComer1();

    DropDown getListaNumeroSionoDifParaLaCama1();

    DropDown getListaNumeroSionoDifParaElBano1();

    DropDown getListaNumeroSionoTrabajo1();

    DropDown getListaNumeroMotivoNoTrabajo1();

    TextField getCampoOtroMotivoNoTrabajo1();

    TextField getCampoDescripcionOcupacionPrin1();

    TextField getCampoDescripcionDedicacionPrin1();

    DropDown getListaNumeroTipoRelacionLab1();

    TextField getCampoMontoIngresoOcupacionPrin1();

    TextField getCampoMontoIngresoOcupacionSecun1();

    TextField getCampoMontoIngresoOtrasOcup1();

    TextField getCampoMontoIngresoAlquileres1();

    TextField getCampoMontoIngresoIntereses1();

    TextField getCampoMontoIngresoAyudaFamPais1();

    TextField getCampoMontoIngresoAyudaFamExter1();

    TextField getCampoMontoIngresoJubilacion1();

    TextField getCampoMontoIngresoPensiones1();

    TextField getCampoMontoIngresoTekopora1();

    TextField getCampoMontoIngresoProgramas1();

    TextField getCampoMontoIngresoAdicional1();

    TextField getCampoTotalIngresoMensual1();

    TextField getCampoIdPotencialBen1();

    Button getBotonAplicar1();

    FichaPersonaCachedRowSetDataProvider2 getFichaPersonaDataProvider();

    FichaHogarCachedRowSetDataProvider2 getFichaHogarDataProvider();

    UbicacionCachedRowSetDataProvider2 getUbicacionReferenceDataProvider();

    PotencialBenCachedRowSetDataProvider2 getPotencialBenReferenceDataProvider();

    Object getFichaPersonaBusinessProcess();

    Object getMessenger();
}
