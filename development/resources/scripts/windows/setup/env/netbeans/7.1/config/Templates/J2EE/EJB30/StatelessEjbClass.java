<#assign licenseFirst = "/*">
<#assign licensePrefix = " * ">
<#assign licenseLast = " */">
<#include "../../Licenses/license-${project.license}.txt">
package ${package};

import javax.ejb.Stateless;

<#if name?? && name == "">
/**
 *
 * @author ${user}
 */
</#if>
@Stateless
public class ${name} {
    
    // Add business logic below. (Right-click in editor and choose
    // "EJB Methods > Add Business Method" or "Web Service > Add Operation")
 
}
