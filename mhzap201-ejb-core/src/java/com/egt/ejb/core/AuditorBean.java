/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 * 
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 * 
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 */
package com.egt.ejb.core;

import com.egt.base.enums.EnumCondicionEjeFun;
import com.egt.base.jms.messages.AbstractMessage;
import com.egt.commons.util.LongUtils;
import com.egt.commons.util.TimeUtils;
import com.egt.core.aplicacion.Bitacora;
import com.egt.ejb.persistence.entity.CondicionEjeFun;
import com.egt.ejb.persistence.entity.RastroProceso;
import com.egt.ejb.persistence.facade.CondicionEjeFunFacadeLocal;
import com.egt.ejb.persistence.facade.FuncionFacadeLocal;
import com.egt.ejb.persistence.facade.RastroProcesoFacadeLocal;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.ejb.Stateless;

@Stateless
public class AuditorBean implements AuditorLocal {
//
//  @EJB
//  RastroFuncionFacadeLocal rastroFuncionFacade;
//
//  @EJB
//  RastroInformeFacadeLocal rastroInformeFacade;
//

    @EJB
    RastroProcesoFacadeLocal rastroProcesoFacade;
//
//  @EJB
//  UsuarioFacadeLocal usuarioFacade;
//

    @EJB
    FuncionFacadeLocal funcionFacade;
//
//  @EJB
//  ParametroFacadeLocal parametroFacade;
//

    @EJB
    CondicionEjeFunFacadeLocal condicionEjeFunFacade;
//  
//  @Override
//    public void grabarRastroFuncion(RastroFuncion rastro) {
//      rastroFuncionFacade.persist(rastro);
//  }
//  
//  @Override
//    private void grabarRastroInforme(RastroInforme rastro) {
//      rastroInformeFacade.persist(rastro);
//  }
//  
//  @Override

    private void grabarRastroProceso(RastroProceso rastro) {
        rastroProcesoFacade.persist(rastro);
    }
//  
//  @Override
//    public AbstractMessage grabarRastroInforme(AbstractMessage message) {
//      message.setRastro(LongUtils.getNewId());
//      RastroInforme rastro = getRastroInforme(message);
//      grabarRastroInforme(rastro);
//      return message;
//  }
//  

    @Override
    public AbstractMessage grabarRastroProceso(AbstractMessage message) {
        message.setRastro(LongUtils.getNewId());
        RastroProceso rastro = getRastroProceso(message);
        grabarRastroProceso(rastro);
        return message;
    }
//  
//  @Override
//    public void grabarRastroInforme(Long rastro, EnumCondicionEjeFun condicion, String archivo, String mensaje) {
//      String metodo = "grabarRastroInforme";
//      Bitacora.trace(this.getClass(), metodo, rastro, condicion, archivo, mensaje);
//      if (rastro != null && rastro != 0) {
//          RastroInforme rastroInforme = rastroInformeFacade.find(rastro);
//          if (rastroInforme != null) {
//              int c = rastroInforme.getCondicionEjeFunNumeroCondicionEjeFun().getNumeroCondicionEjeFun();
//              if (c < condicion.intValue()) {
//                  CondicionEjeFun condicionEjeFun = condicionEjeFunFacade.find(condicion.intValue());
//                  rastroInforme.setCondicionEjeFunNumeroCondicionEjeFun(condicionEjeFun);
//                  rastroInforme.setNombreArchivo(archivo);
//                  rastroInforme.setDescripcionError(mensaje);
//                  if (condicion.intValue() > 20) {
//                      rastroInforme.setFechaHoraFinEjecucion(TimeUtils.getTimestamp());
//                  }
//                  rastroInformeFacade.flush();
//              } else {
//                  throw new EJBException(Bitacora.getTextoMensaje(Bundle.getString("rastro.no.previo"), rastro, condicion));
//              }
//          } else {
//              throw new EJBException(Bitacora.getTextoMensaje(Bundle.getString("rastro.no.existe"), rastro));
//          }
//      }
//  }
//  

    @Override
    public void grabarRastroProceso(Long rastro, EnumCondicionEjeFun condicion, String archivo, String mensaje) {
        String metodo = "grabarRastroProceso";
        Bitacora.trace(this.getClass(), metodo, rastro, condicion, archivo, mensaje);
        if (rastro != null && rastro != 0) {
            RastroProceso rastroProceso = rastroProcesoFacade.find(rastro);
            if (rastroProceso != null) {
                int c = rastroProceso.getCondicionEjeFunNumeroCondicionEjeFun().getNumeroCondicionEjeFun();
                if (c < condicion.intValue()) {
                    CondicionEjeFun condicionEjeFun = condicionEjeFunFacade.find(condicion.intValue());
                    rastroProceso.setCondicionEjeFunNumeroCondicionEjeFun(condicionEjeFun);
                    rastroProceso.setNombreArchivo(archivo);
                    rastroProceso.setDescripcionError(mensaje);
                    if (condicion.intValue() > 12) {
                        rastroProceso.setFechaHoraFinEjecucion(TimeUtils.getTimestamp());
                    }
                    rastroProcesoFacade.flush();
                } else {
                    throw new EJBException(Bitacora.getTextoMensaje(Bundle.getString("rastro.no.previo"), rastro, condicion));
                }
            } else {
                throw new EJBException(Bitacora.getTextoMensaje(Bundle.getString("rastro.no.existe"), rastro));
            }
        }
    }

    @Override
    public void grabarRastroProceso(Long rastro, int subprocesos, String procedimiento) {
        String metodo = "grabarRastroProceso";
        Bitacora.trace(this.getClass(), metodo, rastro, subprocesos, procedimiento);
        if (rastro != null && rastro != 0) {
            RastroProceso rastroProceso = rastroProcesoFacade.find(rastro);
            if (rastroProceso != null) {
                rastroProceso.setSubprocesos(subprocesos);
                rastroProceso.setSubprocesosPendientes(subprocesos);
                rastroProceso.setProcedimientoAfterUpdate(procedimiento);
                rastroProcesoFacade.flush();
            } else {
                throw new EJBException(Bitacora.getTextoMensaje(Bundle.getString("rastro.no.existe"), rastro));
            }
        }
    }
//  
//  @Override
//    public RastroFuncion getRastroFuncion(AbstractMessage message) {
//      RastroFuncion rastro = new RastroFuncion();
//      rastro.setIdRastroFuncion(message.getRastro());
//      rastro.setIdUsuario(message.getUsuario());
//      rastro.setFuncionIdFuncion(funcionFacade.find(message.getFuncion()));
////    rastro.setIdRecurso(message.getRecurso());
////    rastro.setVersionRecurso(message.getVersionRecurso());
////    rastro.setCodigoRecurso(message.getCodigoRecurso());
////    rastro.setNombreRecurso(message.getNombreRecurso());
////    rastro.setIdPropietarioRecurso(message.getPropietarioRecurso());
////    rastro.setIdSegmentoRecurso(message.getSegmentoRecurso());
//      rastro.setNumeroError(message.getCondicion().intValue());
//      rastro.setDescripcionError(message.getMensaje());
//      return rastro;
//  }
//  
//  @Override
//    public RastroFuncionPar getRastroFuncionPar(long parametro, String valor) {
//      RastroFuncionPar rastro = new RastroFuncionPar();
//      rastro.setIdRastroFuncionPar(LongUtils.getNewId());
////    rastro.setRastroFuncionIdRastroFuncion(rastroFuncion);
//      rastro.setParametroIdParametro(parametroFacade.find(parametro));
//      rastro.setValorParametro(valor);
//      return rastro;
//  }
//  
//  @Override
//    private RastroInforme getRastroInforme(AbstractMessage message) {
//      RastroInforme rastro = new RastroInforme();
//      rastro.setIdRastroInforme(message.getRastro());
//      rastro.setFechaHoraInicioEjecucion(TimeUtils.getTimestamp());
//      rastro.setIdUsuario(message.getUsuario());
//      rastro.setFuncionIdFuncion(funcionFacade.find(message.getFuncion()));
//      rastro.setCondicionEjeFunNumeroCondicionEjeFun(condicionEjeFunFacade.find(message.getCondicion().intValue()));
//      rastro.setNombreArchivo(message.getArchivo());
//      rastro.setDescripcionError(message.getMensaje());
//      return rastro;
//  }
//  
//  @Override

    private RastroProceso getRastroProceso(AbstractMessage message) {
        RastroProceso rastro = new RastroProceso();
        rastro.setIdRastroProceso(message.getRastro());
        rastro.setFechaHoraInicioEjecucion(TimeUtils.getTimestamp());
        rastro.setIdUsuario(message.getUsuario());
        rastro.setFuncionIdFuncion(funcionFacade.find(message.getFuncion()));
        rastro.setCondicionEjeFunNumeroCondicionEjeFun(condicionEjeFunFacade.find(message.getCondicion().intValue()));
        rastro.setNombreArchivo(message.getArchivo());
        rastro.setDescripcionError(message.getMensaje());
        Long gp = rastro.getFuncionIdFuncion() == null
                ? message.getGrupo()
                : rastro.getFuncionIdFuncion().getGrupoProcesoIdGrupoProceso() == null
                ? message.getGrupo()
                : rastro.getFuncionIdFuncion().getGrupoProcesoIdGrupoProceso().getIdGrupoProceso();
        rastro.setIdGrupoProceso(gp);
        rastro.setIdRastroProcesoSuperior(message.getSuperior());
        rastro.setSubprocesos(message.getSubprocesos());
        return rastro;
    }
}
