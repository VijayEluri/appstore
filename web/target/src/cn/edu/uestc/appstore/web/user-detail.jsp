<%@ include file="/taglib-imports.jspf" %>

<breadcrumbs:resize size="5"/>
<breadcrumbs:add value="user.manager.user.detail.title"/>

<tiles:insert definition="main.layout">

    <tiles:put name="title" type="string">
        <bean:message key="user.manager.user.detail.title"/>
    </tiles:put>

    <tiles:put name="style" type="string">
        <link rel="stylesheet" type="text/css" media="screen" href="<html:rewrite page="/cn/edu/uestc/appstore/web/user-detail.css"/>"></link>
    </tiles:put>

    <%@ include file="/cn/edu/uestc/appstore/web/user-detail-javascript.jspf" %>

    <tiles:put name="body" type="string">

        <div>
            <tiles:insert definition="breadcrumbs.tile" flush="false">
                <tiles:put name="current.page.title" type="string" value="user.manager.user.detail.title"/>
            </tiles:insert>
            <h1><bean:message key="user.manager.user.detail.title"/></h1>
        </div>

        <%@ include file="/cn/edu/uestc/appstore/web/user-detail-vars.jspf" %>


        <div id="pageHelpSection">
            <blockquote>
            </blockquote>
        </div>

    </tiles:put>

</tiles:insert>
