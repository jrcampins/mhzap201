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
package com.egt.web.consulta;

import com.egt.data.specific.xdp2.FichaHogarCachedRowSetDataProvider2;
import com.egt.data.specific.xdp2.FuncionarioCachedRowSetDataProvider2;
import com.egt.data.generic.xdp2.UbicacionCachedRowSetDataProvider2;
import com.egt.data.specific.xdp2.ProveedorDatExtCachedRowSetDataProvider2;
import com.egt.core.aplicacion.web.PaginaActualizacion;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.component.TextArea;
import com.sun.webui.jsf.component.TextField;
import com.sun.webui.jsf.component.Upload;

public interface PaginaActualizacionFichaHogar extends PaginaActualizacion {

    TextField getCampoIdFichaHogar1();

    TextField getCampoCodigoFichaHogar1();

    TextField getTextFieldCampoFechaEntrevista1();

    TextField getCampoIdFuncionarioCensista1();

    TextField getCampoIdFuncionarioSupervisor1();

    TextField getCampoIdFuncionarioCriticoDeco1();

    TextField getCampoIdFuncionarioDigitador1();

    TextArea getCampoObservaciones1();

    TextField getCampoHusoUtm1();

    TextField getCampoFranjaUtm1();

    TextField getCampoDistanciaEsteUtm1();

    TextField getCampoDistanciaNorteUtm1();

    TextField getCampoNumeroFormulario1();

    TextField getCampoNumeroVivienda1();

    TextField getCampoNumeroHogar1();

    TextField getCampoIdDepartamento1();

    TextField getCampoIdDistrito1();

    DropDown getListaNumeroTipoArea1();

    TextField getCampoIdBarrio1();

    TextField getCampoManzana1();

    TextArea getCampoDireccion1();

    TextField getCampoTotalPersonas1();

    TextField getCampoTotalHombres1();

    TextField getCampoTotalMujeres1();

    DropDown getListaNumeroTipoMatParedes1();

    DropDown getListaNumeroTipoMatPiso1();

    DropDown getListaNumeroTipoMatTecho1();

    DropDown getListaNumeroTipoOcupacionViv1();

    TextField getCampoOtroTipoOcupacionViv1();

    TextField getCampoCantidadPiezas1();

    TextField getCampoCantidadDormitorios1();

    DropDown getListaNumeroSionoPiezaCocina1();

    DropDown getListaNumeroTipoCombustible1();

    DropDown getListaNumeroTipoPiezaBano1();

    DropDown getListaNumeroTipoServicioSan1();

    DropDown getListaNumeroTipoServicioAgua1();

    DropDown getListaNumeroTipoAbaAgua1();

    DropDown getListaNumeroSionoCorrienteElec1();

    DropDown getListaNumeroTipoDesechoBas1();

    DropDown getListaNumeroSionoTelefonoCelular1();

    TextField getCampoNumeroTelefonoCelular1();

    DropDown getListaNumeroSionoTlfLineaBaja1();

    TextField getCampoNumeroTelefonoLineaBaja1();

    DropDown getListaNumeroSionoDispHeladera1();

    DropDown getListaNumeroSionoDispLavarropas1();

    DropDown getListaNumeroSionoDispTermo1();

    DropDown getListaNumeroSionoDispAireAcon1();

    DropDown getListaNumeroSionoDispAutomovil1();

    DropDown getListaNumeroSionoDispCamion1();

    DropDown getListaNumeroSionoDispMotocicleta1();

    TextField getCampoNombreJefeHogar1();

    TextField getCampoNumeroCedulaJefeHogar1();

    TextField getCampoLetraCedulaJefeHogar1();

    TextField getCampoNumeroOrdenIdenJefeHogar1();

    TextField getCampoNombreRespondente1();

    TextField getCampoNumeroCedulaRespondente1();

    TextField getCampoLetraCedulaRespondente1();

    TextField getCampoNumeroOrdenIdenRespondente1();

    TextField getCampoIdProveedorDatExt1();

    TextField getCampoIndiceCalidadVida1();

    DropDown getListaEsFichaHogarInactiva1();

    Button getBotonAplicar1();

    FichaHogarCachedRowSetDataProvider2 getFichaHogarDataProvider();

    FuncionarioCachedRowSetDataProvider2 getFuncionarioReferenceDataProvider();

    UbicacionCachedRowSetDataProvider2 getUbicacionReferenceDataProvider();

    ProveedorDatExtCachedRowSetDataProvider2 getProveedorDatExtReferenceDataProvider();

    Object getFichaHogarBusinessProcess();

    Object getMessenger();
}
