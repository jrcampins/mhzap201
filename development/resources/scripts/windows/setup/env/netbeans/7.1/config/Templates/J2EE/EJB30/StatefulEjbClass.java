<#assign licenseFirst = "/*">
<#assign licensePrefix = " * ">
<#assign licenseLast = " */">
<#include "../../Licenses/license-${project.license}.txt">
package ${package};

import javax.ejb.Stateful;

<#if name?? && name == "">
/**
 *
 * @author ${user}
 */
</#if>
@Stateful
public class ${name} {
    
    // Add business logic below. (Right-click in editor and choose
    // "EJB Methods > Add Business Method" or "Web Service > Add Operation")
    
}
