<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<authentication property="principal" var="sgdUsuarioAcegi" />
<%-- 
    Document   : home
    Created on : 03-03-2014, 08:57:55 PM
    Author     : bms641
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <authentication property="principal.fullName" />
    </body>
</html>
