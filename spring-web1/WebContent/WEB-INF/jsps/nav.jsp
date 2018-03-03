<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>


	<!-- This is the nav menu -->
	<security:authorize access="isAuthenticated()">
        <%@ include file="navbar.html" %>
    </security:authorize>
    <security:authorize access="isAnonymous()">
        <%@ include file="nav_login.html" %>
    </security:authorize>
	