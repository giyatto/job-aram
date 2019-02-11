<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
  <title>대전여자상업고등학교 취업지원부</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/angular-material/1.1.4/angular-material.min.css">

    <link rel="stylesheet" href="/static/css/global.css">

    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.7/angular.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.7/angular-sanitize.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.7/angular-route.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.7/angular-animate.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.7/angular-aria.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.7/angular-messages.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/angular_material/1.1.4/angular-material.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/angular-ui-bootstrap/2.5.0/ui-bootstrap-tpls.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/js-cookie/2.1.4/js.cookie.min.js"></script>
    <script src="https://angular-file-upload.appspot.com/js/ng-file-upload.min.js"></script>
    <script src="https://angular-file-upload.appspot.com/js/ng-file-upload-shim.js"></script>
    <script src="/static/js/util.js"></script>
</head>
<body>

<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="/">취업지원부 Admin</a>
        </div>
        <ul class="nav navbar-nav">
            <li><a href="/">학생 현황</a></li>
            <li><a href="/">취업처 현황</a></li>
            <li><a href="/">자격증 관리</a></li>
            <li><a href="/">취업순위부</a></li>
        </ul>
       <!--  <ul class="nav navbar-nav navbar-right">
            <li>
                <c:choose>
                    <c:when test="${user.loggedIn}">
                        ${user.name} logged in&nbsp;&nbsp;
                    </c:when>
                    <c:otherwise>
                        Not logged in.
                    </c:otherwise>
                </c:choose>
                <button class="button danger" onclick="deleteAllCookies()">로그아웃</button>
            </li>
        </ul> -->
    </div>
</nav>

<h1><sitemesh:write property='div.contentH1'/></h1>
<h2><sitemesh:write property='div.contentH2'/></h2>

<div id="container">
    <div id="body">
        <sitemesh:write property="body"/>
    </div>
</div>

</body>

</html>
