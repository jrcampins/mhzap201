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
import javax.ejb.Local;

@Local
public interface AuditorLocal {
//
//  public void grabarRastroFuncion(RastroFuncion rastro);
//
//  public void grabarRastroInforme(RastroInforme rastro);
//
//  public void grabarRastroProceso(RastroProceso rastro);
//
//  public AbstractMessage grabarRastroInforme(AbstractMessage message);
//
    public AbstractMessage grabarRastroProceso(AbstractMessage message);

//  public void grabarRastroInforme(Long rastro, EnumCondicionEjeFun condicion, String archivo, String mensaje);
//
    public void grabarRastroProceso(Long rastro, EnumCondicionEjeFun condicion, String archivo, String mensaje);

    public void grabarRastroProceso(Long rastro, int subprocesos, String procedimiento);
//
//  public RastroFuncion getRastroFuncion(AbstractMessage message);
//
//  public RastroFuncionPar getRastroFuncionPar(long parametro, String valorParametro);
//
//  public RastroInforme getRastroInforme(AbstractMessage message);
//
//  public RastroProceso getRastroProceso(AbstractMessage message);
}
