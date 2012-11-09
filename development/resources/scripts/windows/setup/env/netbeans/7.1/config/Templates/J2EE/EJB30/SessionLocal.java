<#assign licenseFirst = "/*">
<#assign licensePrefix = " * ">
<#assign licenseLast = " */">
<#include "../../Licenses/license-${project.license}.txt">
package ${package};

import javax.ejb.Local;

<#if name?? && name == "">
/**
 *
 * @author ${user}
 */
</#if>
@Local
public interface ${name} {
    
}
