<#assign pound = '#'>
<?xml version="1.0" encoding="${encoding}"?>
<#if name == "">
<!-- 
    Document   : ${name}
    Created on : ${date}, ${time}
    Author     : ${user}
-->
</#if>
<#if j2eePlatformVersion?? && j2eePlatformVersion = "1.5">
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=${encoding}" pageEncoding="${encoding}"/>
    <f:view>
        <webuijsf:page binding="${pound}{${folder}${name}.page1}" id="page1">
            <webuijsf:html binding="${pound}{${folder}${name}.html1}" id="html1">
                <webuijsf:head binding="${pound}{${folder}${name}.head1}" id="head1">
                    <webuijsf:link binding="${pound}{${folder}${name}.link1}" id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body binding="${pound}{${folder}${name}.body1}" id="body1" style="-rave-layout: grid">
                    <webuijsf:form binding="${pound}{${folder}${name}.form1}" id="form1">
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
<#else>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=${encoding}" pageEncoding="${encoding}"/>
    <f:view>    
        <ui:page binding="${pound}{${folder}${name}.page1}" id="page1">
            <ui:html binding="${pound}{${folder}${name}.html1}" id="html1">
                <ui:head binding="${pound}{${folder}${name}.head1}" id="head1">
                    <ui:link binding="${pound}{${folder}${name}.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="${pound}{${folder}${name}.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="${pound}{${folder}${name}.form1}" id="form1">
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
</#if>
