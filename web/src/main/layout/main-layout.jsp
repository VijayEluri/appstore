<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ include file="/taglib-imports.jspf" %>

<html:html lang="true">

    <head>
        <title>
            <tiles:insert attribute="title" flush="true"/>
        </title>
        <meta http-equiv="Content-Type" content="text/html; charset:UTF-8" />
<%-- uncomment this to enable the browser 'favorites' icons
        <link rel="shortcut icon" href="my-custom-image.ico"></link>
        <link rel="icon" type="image/gif" href="my-custom-image.gif"></link>
--%>
		<link rel="stylesheet" type="text/css" media="screen" href="<html:rewrite page="/layout/default-application.css"/>"></link>
        <link rel="stylesheet" type="text/css" media="screen" href="<html:rewrite page="/layout/default.css"/>"></link>
        <script type="text/javascript" language="Javascript1.1" src="<html:rewrite page="/layout/layout-common.js"/>"></script>
        <script type="text/javascript" language="Javascript1.1" src="<html:rewrite page="/layout/key-events.js"/>"></script>
       
        <link type="text/css" rel="stylesheet" href="<html:rewrite page="/css/style.css"/>"/>
        <link type="text/css" rel="stylesheet" href="<html:rewrite page="/css/cupertino/jquery-ui-1.8.7.custom.css"/>"/>
        
        <script type="text/javascript" src="<html:rewrite page="/js/jquery-1.4.4.min.js"/>"></script>
        <script type="text/javascript" src="<html:rewrite page="/js/jquery-ui-1.8.7.custom.min.js"/>"></script>
        <script>
        $(function() {
            $( "#accordion" ).accordion({
                collapsible: true,
                autoHeight: false,
                navigation: true
            });
        });
        </script>

        <tiles:insert attribute="style" flush="true"/>
        <tiles:insert attribute="javascript" flush="true"/>

    </head>

    <body>
        <div id="header">
            <div id="nav">
            <ul>
				<li><a href="/">index</a></li>
				<li><a href="/appstore-web/">appstore-web</a></li>
				<li><a href="/certificate/">certificate</a></li>
				<li><a href="/promocode/">promocode</a></li>
	            <li><a href="/signature/">signature</a></li>
				<li><a href="/faq/">faq</a></li>
			</ul>
            </div>
        </div>
        
        <div class="container clearfix">
            <div class="charts_frame clearfix">
            <!-- left -->
            <div class="left_con">
                <div class="left_block" id="accordion">
                        <h3><a href="#">Section 1</a></h3>
                        <div>
                            <p>Mauris mauris ante, blandit et, ultrices a, suscipit eget, quam. Integer ut neque. Vivamus nisi metus, molestie vel, gravida in, condimentum sit amet, nunc. Nam a nibh. Donec suscipit eros. Nam mi. Proin viverra leo ut odio. Curabitur malesuada. Vestibulum a velit eu ante scelerisque vulputate.</p>
                        </div>
                        <h3><a href="#">Section 2</a></h3>
                        <div>
                            <p>Sed non urna. Donec et ante. Phasellus eu ligula. Vestibulum sit amet purus. Vivamus hendrerit, dolor at aliquet laoreet, mauris turpis porttitor velit, faucibus interdum tellus libero ac justo. Vivamus non quam. In suscipit faucibus urna. </p>
                        </div>
                        <h3><a href="#">Section 3</a></h3>
                        <div>
                            <p>Nam enim risus, molestie et, porta ac, aliquam ac, risus. Quisque lobortis. Phasellus pellentesque purus in massa. Aenean in pede. Phasellus ac libero ac tellus pellentesque semper. Sed ac felis. Sed commodo, magna quis lacinia ornare, quam ante aliquam nisi, eu iaculis leo purus venenatis dui. </p>
                            <ul>
                                <li>List item one</li>
                                <li>List item two</li>
                                <li>List item three</li>
                            </ul>
                        </div>
                        <h3><a href="#">Section 4</a></h3>
                        <div>
                            <p>Cras dictum. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Aenean lacinia mauris vel est. </p><p>Suspendisse eu nisl. Nullam ut libero. Integer dignissim consequat lectus. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. </p>
                        </div>

                </div>
            </div>
            
            <!-- right -->
            <div class="right_con">
                <div id="breadcrumb">
                    <p>服务器时间：<span style="float: none;"> </span>2010-12-27 12:25:09</p>
                </div>
                <div class="right_block">
                    <h2 class="blue_title">Details</h2>
                    <h3 class="sub_tab">
                        <div id="tab_4" class="center_btn">
                            <span class="current">Top Paid</span>
                            <span>Top Grossing</span>
                            <span>Top Free</span>
                        </div>
                    </h3>

                    <div class="inner_con">
                        <div class="wraper_con">
                        <%-- --%>
                        <tiles:insert attribute="body" flush="true"/>

                        </div>
                    
                    </div>

                </div>    
                
            </div>
            
            </div>
        </div>
        
        <div class="footer">
        	<span class="align-right"><a href="http://www.cocoachina.com/" target="_blank">CocoaChina首页</a> |<a href="http://www.cocoachina.com/bbs" target="_blank">CocoaChina开发论坛</a> | <a target="_blank" href="http://www.cocoachina.com/contactus/index.html">联系我们</a> | <a href="http://www.cocoachina.com/aboutus/index.html" target="_blank">关于我们</a> |  <a target="_blank" href="http://www.miibeian.gov.cn/">京ICP备08100551号</a></span>&copy;2010 CocoaChina
    	</div>
        
        <%--
        <div id="container">
            <div id="sidebar">
                <tiles:insert attribute="menu" flush="true"/>
            </div>
            <div id="content">
                <tiles:insert attribute="body" flush="true"/>
                <tiles:insert attribute="messages" flush="true"/>
            </div>
        </div>
        --%>
    </body>

</html:html>