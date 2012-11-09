<#assign licenseFirst = "/*">
<#assign licensePrefix = " * ">
<#assign licenseLast = " */">
<#include "../../Licenses/license-${project.license}.txt">
package ${package};

import javax.ejb.Remote;

<#if name?? && name == "">
/**
 *
 * @author ${user}
 */
</#if>
@Remote
public interface ${name} {
    
}
