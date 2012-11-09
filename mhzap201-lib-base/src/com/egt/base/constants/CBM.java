/*
 * Copyright (C) 2012, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 *
 */
package com.egt.base.constants;

class CBM { // Clave Bundle Mensajes

    public static final String FUNCION_NO_EXISTE = "<funcion_no_existe>"; // funcion {0} no existe

    public static final String FUNCION_NO_AUTORIZADA = "<funcion_no_autorizada>"; // funcion {0} no autorizada

    public static final String USUARIO_NO_PROPIETARIO = "<usuario_no_propietario>"; // usuario no es propietario del recurso

    public static final String SEGMENTO_NO_AUTORIZADO = "<segmento_no_autorizado>"; // segmento {0} no autorizado

    public static final String RECURSO_NO_AUTORIZADO = "<recurso_no_autorizado>"; // recurso {0} no autorizado

    public static final String RECURSO_NO_DISPONIBLE = "<recurso_no_disponible>"; // recurso {0} no disponible

    public static final String RECURSO_NO_EXISTE = "<recurso_no_existe>"; // recurso {0} no existe

    public static final String RECURSO_NO_REFERENCIABLE = "<recurso_no_referenciable>"; // recurso "{0}" {1} no existe o no esta autorizado

    public static final String RECURSO_INACTIVO = "<recurso_inactivo>"; // recurso "{0}" {1} se encuentra inactivo

    public static final String PROCESS_ROW_EXCEPTION_0 = "<process_row_exception_0>"; // debe confirmar o descartar los cambios antes de utilizar una nueva funcion para procesar

    public static final String PROCESS_ROW_EXCEPTION_1 = "<process_row_exception_1>"; // usuario no autorizado para procesar recursos con esta funcion

    public static final String PROCESS_ROW_EXCEPTION_2 = "<process_row_exception_2>"; // usuario no autorizado para procesar el recurso {0}

    public static final String PROCESS_ROW_EXCEPTION_3 = "<process_row_exception_3>"; // no se permite procesar un recurso previamente agregado o modificado

    public static final String PROCESS_ROW_EXCEPTION_4 = "<process_row_exception_4>"; // debe confirmar o descartar los cambios antes de procesar

    public static final String PROCESS_NONE = "<process_none>"; // ningun recurso seleccionado para ser procesado

    public static final String PROCESS_CONFIRM_MESSAGE = "<process_confirm_message>"; // los recursos seleccionados seran procesados  desea continuar?

    public static final String ERROR_COMANDO_SELECT = "<error_comando_select>"; // error intentando establecer el comando de consulta

    public static final String OPCION_VALOR_INDETERMINADA = "<opcion_valor_indeterminada>"; // no es posible determinar la opcion de valor

    public static final String IDENTIFICADOR_SQL_INVALIDO = "<identificador_sql_invalido>"; // identificador {0} invalido: debe comenzar con una letra y solo puede contener letras minusculas, numeros y el caracter especial "_"

    public static final String IDENTIFICADOR_ARCHIVO_INVALIDO = "<identificador_archivo_invalido>"; // identificador {0} invalido: solo puede contener letras minusculas, numeros y el caracter especial "_"

    public static final String REPORT_EXECUTION_REQUEST = "<report_execution_request>"; // generacion del informe {0} solicitada

    public static final String REPORT_EXECUTION_BEGIN = "<report_execution_begin>"; // generacion del informe {0} en progreso

    public static final String REPORT_EXECUTION_ABEND = "<report_execution_abend>"; // generacion del informe {0} cancelada

    public static final String REPORT_EXECUTION_END = "<report_execution_end>"; // generacion del informe {0} finalizada

    public static final String PROCESS_EXECUTION_REQUEST = "<process_execution_request>"; // ejecucion del proceso {0} solicitada

    public static final String PROCESS_EXECUTION_BEGIN = "<process_execution_begin>"; // ejecucion del proceso {0} en progreso

    public static final String PROCESS_EXECUTION_ABEND = "<process_execution_abend>"; // ejecucion del proceso {0} cancelada

    public static final String PROCESS_EXECUTION_END = "<process_execution_end>"; // ejecucion del proceso {0} finalizada

    public static final String EXPORT_EXECUTION_REQUEST = "<export_execution_request>"; // generacion del archivo {0} solicitada

    public static final String EXPORT_EXECUTION_BEGIN = "<export_execution_begin>"; // generacion del archivo {0} en progreso

    public static final String EXPORT_EXECUTION_ABEND = "<export_execution_abend>"; // generacion del archivo {0} cancelada

    public static final String EXPORT_EXECUTION_END = "<export_execution_end>"; // generacion del archivo {0} finalizada

    public static final String SELECT_SET_SEARCH_CRITERIA = "<select_set_search_criteria>"; // esta consulta tiene un limite de {0} filas; puede utilizar un criterio o filtro de busqueda para acotar el conjunto de filas resultantes

    public static final String SELECT_ROW_EXCEPTION_1 = "<select_row_exception_1>"; // usuario no autorizado para consultar recursos con esta funcion

    public static final String SELECT_ROW_EXCEPTION_2 = "<select_row_exception_2>"; // usuario no autorizado para consultar el recurso {0}

    public static final String SELECT_ROW_LIMIT_REACHED = "<select_row_limit_reached>"; // se alcanzo el limite de {0} filas; puede utilizar un criterio o filtro de busqueda para acotar el conjunto de filas resultantes

    public static final String SELECT_ROW_EMPTY_SET = "<select_row_empty_set>"; // no existen filas que cumplan con los criterios de busqueda de la consulta

    public static final String INSERT_ROW_EXCEPTION_0 = "<insert_row_exception_0>"; // debe confirmar o descartar los cambios antes de utilizar una nueva funcion para agregar

    public static final String INSERT_ROW_EXCEPTION_1 = "<insert_row_exception_1>"; // usuario no autorizado para agregar recursos con esta funcion

    public static final String INSERT_ROW_EXCEPTION_2 = "<insert_row_exception_2>"; // usuario no autorizado para agregar el recurso {0}

    public static final String INSERT_ROW_EXCEPTION_4 = "<insert_row_exception_4>"; // debe confirmar o descartar los cambios antes de agregar

    public static final String UPDATE_ROW_EXCEPTION_0 = "<update_row_exception_0>"; // debe confirmar o descartar los cambios antes de utilizar una nueva funcion para modificar

    public static final String UPDATE_ROW_EXCEPTION_1 = "<update_row_exception_1>"; // usuario no autorizado para modificar recursos con esta funcion

    public static final String UPDATE_ROW_EXCEPTION_2 = "<update_row_exception_2>"; // usuario no autorizado para modificar el recurso {0}

    public static final String UPDATE_ROW_EXCEPTION_3 = "<update_row_exception_3>"; // no se permite modificar un recurso previamente modificado

    public static final String UPDATE_ROW_EXCEPTION_4 = "<update_row_exception_4>"; // debe confirmar o descartar los cambios antes de modificar

    public static final String UPDATE_NONE = "<update_none>"; // ningun recurso seleccionado para ser modificado

    public static final String DELETE_ROW_EXCEPTION_0 = "<delete_row_exception_0>"; // debe confirmar o descartar los cambios antes de utilizar una nueva funcion para eliminar

    public static final String DELETE_ROW_EXCEPTION_1 = "<delete_row_exception_1>"; // usuario no autorizado para eliminar recursos con esta funcion

    public static final String DELETE_ROW_EXCEPTION_2 = "<delete_row_exception_2>"; // usuario no autorizado para eliminar el recurso {0}

    public static final String DELETE_ROW_EXCEPTION_4 = "<delete_row_exception_4>"; // debe confirmar o descartar los cambios antes de eliminar

    public static final String DELETE_ROW_COUNT_1 = "<delete_row_count_1>"; // un recurso eliminado

    public static final String DELETE_ROW_COUNT_2 = "<delete_row_count_2>"; // {0} recursos eliminados

    public static final String DELETE_NONE = "<delete_none>"; // ningun recurso seleccionado para ser eliminado

    public static final String DELETE_CONFIRM_MESSAGE = "<delete_confirm_message>"; // los recursos seleccionados seran eliminados  desea continuar?

    public static final String CHECK_CHANGES_EXCEPTION_0 = "<check_changes_exception_0>"; // han ocurrido uno o mas errores

    public static final String CHECK_CHANGES_EXCEPTION_1 = "<check_changes_exception_1>"; // no es posible determinar la funcion utilizada para {0}

    public static final String CHECK_CHANGES_EXCEPTION_2 = "<check_changes_exception_2>"; // no es posible {0} el recurso {1}

    public static final String CHECK_CHANGES_EXCEPTION_3 = "<check_changes_exception_3>"; // recurso {0} modificado sin previa autorizacion (se descarta la modificacion)

    public static final String CHECK_CHANGES_EXCEPTION_4 = "<check_changes_exception_4>"; // Error de validacion: Se produjo un error de conversion {0}

    public static final String CHECK_CHANGES_EXCEPTION_5 = "<check_changes_exception_5>"; // Error de validacion: valor fuera del rango {1} : {2}

    public static final String CHECK_CHANGES_1 = "<check_changes_1>"; // procesando el recurso {0}

    public static final String CHECK_CHANGES_2 = "<check_changes_2>"; // recurso {0} editado pero no modificado

    public static final String CHECK_CHANGES_NONE = "<check_changes_none>"; // ningun recurso seleccionado para aplicar los cambios realizados

    public static final String UNDO_CHANGES_NONE = "<undo_changes_none>"; // ningun recurso seleccionado para deshacer los cambios realizados

    public static final String COMMIT_CHANGES_OK = "<commit_changes_ok>"; // cambios confirmados exitosamente

    public static final String COMMIT_CHANGES_EXCEPTION = "<commit_changes_exception>"; // han ocurrido uno o mas errores al intentar confirmar los cambios

    public static final String COMMIT_CHANGES_COMMAND_IGNORED = "<commit_changes_command_ignored>"; // no es posible confirmar uno o mas recursos debido a los errores anteriores

    public static final String COMMIT_CHANGES_COMMAND_IGNORED_EXCEPTION = "<commit_changes_command_ignored_exception>"; // no es posible confirmar el recurso {1} debido a los errores anteriores

    public static final String COMMIT_CHANGES_UNKNOWN_EXCEPTION = "<commit_changes_unknown_exception>"; // {2}; no es posible {0} el recurso {1}

    public static final String NO_CHANGES_TO_COMMIT = "<no_changes_to_commit>"; // sin cambios que confirmar

    public static final String CHANGES_TO_COMMIT = "<changes_to_commit>"; // cambios por confirmar: {0} recurso(s) agregado(s) o modificado(s) y {1} eliminado(s)

    public static final String CHANGES_TO_REVERT = "<changes_to_revert>"; // cambios por descartar: {0} recurso(s) agregado(s) o modificado(s) y {1} eliminado(s)

    public static final String REVERT_CHANGES_OK = "<revert_changes_ok>"; // cambios descartados exitosamente

    public static final String DATABASE_NOT_NULL_CONSTRAINT_VIOLATION = "<database_not_null_constraint_violation>"; // la columna "{2}" no acepta valores nulos

    public static final String HYPERLINK_EXCEPTION_1 = "<hyperlink_exception_1>"; // debe confirmar o descartar los cambios antes de ir a la pagina seleccionada
}
