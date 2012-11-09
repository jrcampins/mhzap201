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
@Table(name = "vista_system_sysparameters")
@NamedQueries({})
public class SystemRoutineParameter implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "parameter_key")
    private String parameterKey;

    @Column(name = "specific_catalog")
    private String specificCatalog;

    @Column(name = "specific_schema")
    private String specificSchema;

    @Column(name = "specific_name")
    private String specificName;

    @Column(name = "routine_name")
    private String routineName;

    @Column(name = "routine_data_type")
    private String routineDataType;

    @Column(name = "type_udt_name")
    private String typeUdtName;

    @Column(name = "ordinal_position")
    private Integer ordinalPosition;

    @Column(name = "parameter_mode")
    private String parameterMode;

    @Column(name = "parameter_name")
    private String parameterName;

    @Column(name = "parameter_data_type")
    private String parameterDataType;

    @Column(name = "udt_name")
    private String udtName;

    @Column(name = "function_key")
    private Long functionKey;

    @Column(name = "function_name")
    private String functionName;

    public SystemRoutineParameter() {
    }

    public String getParameterKey() {
        return parameterKey;
    }

    public void setParameterKey(String parameterKey) {
        this.parameterKey = parameterKey;
    }

    public String getSpecificCatalog() {
        return specificCatalog;
    }

    public void setSpecificCatalog(String specificCatalog) {
        this.specificCatalog = specificCatalog;
    }

    public String getSpecificSchema() {
        return specificSchema;
    }

    public void setSpecificSchema(String specificSchema) {
        this.specificSchema = specificSchema;
    }

    public String getSpecificName() {
        return specificName;
    }

    public void setSpecificName(String specificName) {
        this.specificName = specificName;
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

    public Integer getOrdinalPosition() {
        return ordinalPosition;
    }

    public void setOrdinalPosition(Integer ordinalPosition) {
        this.ordinalPosition = ordinalPosition;
    }

    public String getParameterMode() {
        return parameterMode;
    }

    public void setParameterMode(String parameterMode) {
        this.parameterMode = parameterMode;
    }

    public String getParameterName() {
        return parameterName;
    }

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    public String getParameterDataType() {
        return parameterDataType;
    }

    public void setParameterDataType(String parameterDataType) {
        this.parameterDataType = parameterDataType;
    }

    public String getUdtName() {
        return udtName;
    }

    public void setUdtName(String udtName) {
        this.udtName = udtName;
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
