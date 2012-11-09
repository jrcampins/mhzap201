<#assign licenseFirst = "/*">
<#assign licensePrefix = " * ">
<#assign licenseLast = " */">
<#include "../Licenses/license-${project.license}.txt">
<#if package?? && package != "">
package ${package};

</#if>
<#if name?? && name == "">
/**
 * ${name}.java
 * Creado el ${date}, a las ${time}
 * @author ${user}
 */
</#if>
public class ${name} {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // code application logic here
    }

}
