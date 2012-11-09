/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 * 
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 * 
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 */
package com.egt.ejb.persistence.entity.catalog;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.Table;

@Entity
@Table(name = "vista_system_sysroutines")
@NamedQueries({})
public class SystemRoutine implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "routine_key")
    private String routineKey;

    @Column(name = "routine_name")
    private String routineName;

    @Column(name = "routine_data_type")
    private String routineDataType;

    @Column(name = "type_udt_name")
    private String typeUdtName;

    @Column(name = "function_key")
    private Long functionKey;

    @Column(name = "function_name")
    private String functionName;

    public SystemRoutine() {
    }

    public String getRoutineKey() {
        return routineKey;
    }

    public void setRoutineKey(String routineKey) {
        this.routineKey = routineKey;
    }

    public String getRoutineName() {
        return routineName;
    }

    public void setRoutineName(String routineName) {
        this.routineName = routineName;
    }

    public String getRoutineDataType() {
        return routineDataType;
    }

    public void setRoutineDataType(String routineDataType) {
        this.routineDataType = routineDataType;
    }

    public String getTypeUdtName() {
        return typeUdtName;
    }

    public void setTypeUdtName(String typeUdtName) {
        this.typeUdtName = typeUdtName;
    }

    public Long getFunctionKey() {
        return functionKey;
    }

    public void setFunctionKey(Long functionKey) {
        this.functionKey = functionKey;
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }
}
