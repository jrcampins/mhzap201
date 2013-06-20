function acreditar_pot_ben(ubicacion number,fecha_registro_desde timestamp, fecha_registro_hasta timestamp, lote number, edad_desde number, edad_hasta number) return varchar2;
function verificar_ele_pen(ubicacion_consultada number, codigo_sime varchar2) return varchar2;
function asignar_mesa(lote number,sime varchar2) return varchar2;
function preparar_prox_pago_pen(ubicacion_consultada number,fecha_solicitud_desde timestamp, fecha_solicitud_hasta timestamp, codigo_sime varchar2) return varchar2;
function otorgar_pensiones_apr(ubicacion_consultada number,numero_resolucion varchar2, fecha_resolucion timestamp, sime varchar2, cedula_desde varchar2, cedula_hasta varchar2) return varchar2 ;
function denegar_pensiones_obj(ubicacion_consultada number,numero_resolucion varchar2, fecha_resolucion timestamp, sime varchar2, cedula_desde varchar2, cedula_hasta varchar2) return varchar2 ;
function actualizar_pen_en_jupe(param varchar2, sime varchar2) return varchar2;
function importar_archivos_ext(param varchar2) return varchar2;
function f_ws_existe_a_ben(p_cedula varchar2) return VARCHAR2;
function f_ws_existe_a_emp(p_cedula varchar2) return VARCHAR2;
function f_ws_existe_a_mov(p_cedula varchar2) return VARCHAR2 ;
function f_ws_existe_a_per(p_cedula varchar2) return VARCHAR2;
function f_ws_existe_cedula(p_cedula varchar2) return VARCHAR2;
function f_ws_inserta_a_ben(vCED_NROCEDULA       VARCHAR2,
                                              vBEN_NRO_BENEF       NUMBER,
                                              vFPG_CODIGO          NUMBER,
                                              vCON_COD_CONCEPTO    NUMBER,
                                              vPOL_COD_POLICIA     NUMBER,
                                              vTJU_COD_JUBILACION  NUMBER,
                                              vMIL_COD_MILITAR     NUMBER,
                                              vPLA_COD_PLANILLA    NUMBER,
                                              vBEN_NRO_DECRETO     VARCHAR2,
                                              vBEN_FECHA_DECRETO   VARCHAR2,
                                              vBEN_NRO_CAJA        NUMBER,
                                              vBEN_ANNO_SERVICIO   NUMBER,
                                              vBEN_MES_SERVICIO    NUMBER,
                                              vBEN_DIA_SERVICIO    NUMBER,
                                              vBEN_ANNO_RECONOCIDO NUMBER,
                                              vBEN_MES_RECONOCIDO  NUMBER,
                                              vBEN_DIA_RECONOCIDO  NUMBER,
                                              vBEN_CARGO           VARCHAR2,
                                              vBEN_LETRA_CARNET    VARCHAR2,
                                              vBEN_NRO_CARNET      NUMBER,
                                              vBEN_SERIE_CARNET    VARCHAR2,
                                              vBEN_PORCENTAJE      NUMBER,
                                              vGRP_CODIGO          NUMBER,
                                              vBEN_CEDULA_EXT      VARCHAR2,
                                              vBEN_BENEF_EXT       NUMBER,
                                              vBEN_FECBAJA         VARCHAR2,
                                              vBEN_FECREINCOR      VARCHAR2 ,
                                              vBEN_COD_BANCO_VIG   NUMBER,
                                              vBEN_ASIGNADO_VIG    NUMBER,
                                              vBEN_COD_CIU_VIG     VARCHAR2,
                                              vBEN_ESTATUS         VARCHAR2,
                                              vBEN_OBSERVACION     VARCHAR2,
                                              vBEN_FCHING          VARCHAR2,
                                              vBEN_USRING          VARCHAR2,
                                              vBEN_FCHACT          VARCHAR2,
                                              vBEN_USRACT          VARCHAR2,
                                              vBEN_FEC_ULTPAGO     VARCHAR2,
                                              vCTG_CODIGO          VARCHAR2,
                                              vBEN_TIPO_CALCULO    NUMBER,
                                              vCOD_MOT_BAJA        NUMBER,
                                              vBEN_LAM_ICV         NUMBER,
                                              vEXC_ANNO            NUMBER,
                                              vEXC_NRO_EXCEPCION   NUMBER,
                                              vEXP_ANO            NUMBER,
                                              vEXP_NRO            NUMBER
) return VARCHAR2;
function f_ws_inserta_a_emp(COF_CODIGO NUMBER ,
                                              OFI_CODN1  NUMBER ,
                                              OFI_CODN2  NUMBER ,
                                              OFI_CODN3  NUMBER ,
                                              OFI_CODN4  NUMBER ,
                                              OFI_CODN5  NUMBER ,
                                              OFI_CODN6  NUMBER ,
                                              EMP_FCHING VARCHAR2      ,
                                              PER_CODCCI VARCHAR2,
                                              EMP_USRING VARCHAR2 ,
                                              EMP_FCHACT VARCHAR2        ,
                                              EMP_USRACT VARCHAR2 ,
                                              TFU_CODIGO NUMBER   ,
                                              EMP_ACTIVO VARCHAR2,
                                              EMP_PXB    VARCHAR2 ,
                                              EMP_FCHPXB VARCHAR2        ,
                                              EMP_USRPXB VARCHAR2
) return VARCHAR2;
function f_ws_inserta_a_mov(vMOV_ANNO             NUMBER,
                                              vMOV_MES              NUMBER,
                                              vMOV_SECUENCIA        NUMBER,
                                              vDEP_COD_DEPARTAMENTO NUMBER,
                                              vCIU_COD_CIU          VARCHAR2,
                                              vBAN_COD_BANCO        NUMBER,
                                              vCED_NROCEDULA        VARCHAR2,
                                              vBEN_NRO_BENEF        NUMBER,
                                              vTAS_COD_ASIGNADO     NUMBER,
                                              vMOV_ASIGNADO_MENSUAL NUMBER,
                                              vMOV_BONIFICACION     NUMBER,
                                              vMOV_DESCUENTOS       NUMBER,
                                              vMOV_ESTADO           VARCHAR2,
                                              vMOV_FCHPAGO          VARCHAR2,
                                              vMOV_FCHBAJA          VARCHAR2,
                                              vMOV_FCHING           VARCHAR2,
                                              vMOV_USRING           VARCHAR2,
                                              vMOV_FCHACT           VARCHAR2,
                                              vMOV_USRACT           VARCHAR2,
                                              vPLA_COD_PLANILLA     NUMBER,
                                              vCON_COD_CONCEPTO     NUMBER,
                                              vTJU_COD_JUBILACION   NUMBER,
                                              vPOL_COD_POLICIA      NUMBER,
                                              vMIL_COD_MILITAR      NUMBER
) return VARCHAR2;
function f_ws_inserta_a_per(PER_CODCCI     VARCHAR2 ,
                                              PER_APYNOM     VARCHAR2,
                                              PER_NOMBRES    VARCHAR2,
                                              PER_APENAC     VARCHAR2,
                                              PER_APECAS     VARCHAR2,
                                              PER_CODSEXO    VARCHAR2,
                                              PER_LUGNAC     VARCHAR2,
                                              PER_FCHNACI    VARCHAR2 ,
                                              NAC_CODPAIS    NUMBER ,
                                              CIV_CODECIV    NUMBER,
                                              PER_FCHINGR    VARCHAR2,
                                              PER_FCHBAJA    VARCHAR2,
                                              PER_DESDOMI    VARCHAR2,
                                              LOC_CODLOCA    NUMBER,
                                              DEP_CODDEPTO   NUMBER,
                                              PER_CODPOST    NUMBER,
                                              DIS_CODDIST    NUMBER,
                                              OPE_CODOPER    NUMBER,
                                              FIN_CODEFIN    NUMBER,
                                              CTA_CODCTA     NUMBER,
                                              PER_CELULAR    VARCHAR2,
                                              PER_REGCOND    NUMBER,
                                              PER_DESCTA     VARCHAR2,
                                              PER_TELEFONO   VARCHAR2,
                                              PER_TIPREG     NUMBER,
                                              PER_DESCTA_OLD VARCHAR2,
                                              PER_MUNICIPIO  VARCHAR2,
                                              PER_GRPOSANG   VARCHAR2,
                                              PER_PROFESION  VARCHAR2,
                                              PER_REGPROF    VARCHAR2,
                                              PER_NRORUC     VARCHAR2,
                                              TFU_CODIGO     NUMBER,
                                              PER_USUNOM     VARCHAR2,
                                              PER_USUFCH     VARCHAR2,
                                              DISCAPACIDAD   VARCHAR2
) return VARCHAR2;
function f_ws_inserta_cedula(vCED_NROCEDULA   VARCHAR2,
                                                vEST_CODIGO      NUMBER,
                                                vCED_APYNOM      VARCHAR2,
                                                vCED_NOMBRES     VARCHAR2,
                                                vCED_APEL_PAT    VARCHAR2,
                                                vCED_APE_MATERNO VARCHAR2,
                                                vCED_APEL_CASADA VARCHAR2,
                                                vCED_DIRECCION   VARCHAR2,
                                                vCED_TELEFONO    VARCHAR2,
                                                vCED_SEXO        VARCHAR2,
                                                vCED_CONYUGE     VARCHAR2,
                                                vCED_FECHA_NAC   VARCHAR2,
                                                vCED_ESTATUS     VARCHAR2,
                                                vCED_OBSERVACION VARCHAR2,
                                                vCED_FECHING     VARCHAR2,
                                                vCED_USRING      VARCHAR2,
                                                vCED_FECHACT     VARCHAR2,
                                                vCED_USRACT      VARCHAR2,
                                                vPAI_COD_PAIS    NUMBER,
                                                vETN_COD_ETNIA   NUMBER
) return VARCHAR2;
function exportar_pen_apr(nombre_archivo varchar2, codigo_sime varchar2) return varchar2;
function exportar_pen_den(nombre_archivo varchar2, codigo_sime varchar2) return varchar2;
function asignar_monto_pension(sime varchar2,monto number) return varchar2;
function verificar_ele_pen_jupe return varchar2;
function aprobar_exclusion_pen(sime varchar2) return varchar2;
function exportar_pen_rev(nombre_archivo varchar2, codigo_sime varchar2) return varchar2;
function revocar_pensiones_apr(sime varchar2, fecha_resolucion timestamp, numero_resolucion varchar2,  cedula_desde varchar2, cedula_hasta varchar2) return varchar2;