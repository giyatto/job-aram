<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

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