<%@ include file="/taglib-imports.jspf" %>

<breadcrumbs:resize size="5"/>
<breadcrumbs:add value="user.manager.user.manager.title"/>

<tiles:insert definition="main.layout">

    <tiles:put name="title" type="string">
        <bean:message key="user.manager.user.manager.title"/>
    </tiles:put>

    <tiles:put name="style" type="string">
        <link rel="stylesheet" type="text/css" media="screen" href="<html:rewrite page="/cn/edu/uestc/appstore/web/user-manager.css"/>"></link>
    </tiles:put>

    <%@ include file="/cn/edu/uestc/appstore/web/user-manager-javascript.jspf" %>

    <tiles:put name="body" type="string">

        <div>
            <tiles:insert definition="breadcrumbs.tile" flush="false">
                <tiles:put name="current.page.title" type="string" value="user.manager.user.manager.title"/>
            </tiles:insert>
            <h1><bean:message key="user.manager.user.manager.title"/></h1>
        </div>

        <%@ include file="/cn/edu/uestc/appstore/web/user-manager-vars.jspf" %>

        <%@ include file="/cn/edu/uestc/appstore/web/user-manager-userVOs.jspf" %>

        <div id="pageHelpSection">
            <blockquote>
                <bean:message key="required.fields.asterisk"/>
            </blockquote>
        </div>

    </tiles:put>

</tiles:insert>
