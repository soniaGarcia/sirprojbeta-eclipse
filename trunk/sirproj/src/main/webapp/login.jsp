<%-- 
    Document   : login
    Created on : 03-02-2014, 06:12:17 PM
    Author     : Sonia Garcia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3c.org/TR/1999/REC-html401-19991224/loose.dtd">
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<html>
    <style type="text/css">
			body{
				background:url(${contextPath}/resources/images/fondo.jpg);
                                background-repeat: no-repeat; 
                                background-position:center top; 
                                background-color: #653015;
				text-align: center;margin:0px;font-family:arial;color: white;
			}
			.marcoLogin{
				width:325px;
				height:202px;
				float: right;
				position: relative;
				margin-top: 25px;
			}
			.x-form-text, textarea.x-form-field {
				background:url(${contextPath}/resources/js/extjs-4.0.1/resources/themes/images/default/form/text-bg.gif)  repeat-x scroll 0 0 white;
			    border: 1px solid #B5B8C8;
			    padding: 1px 3px;
			}
			.tableLogin td{text-align: right;}
			.btnInicioSesion{
			    background: url(${contextPath}/resources/images/marcoSupCen.png) repeat-x scroll 0 1px #F1F1F1;
			    border: 1px solid #C6C6C6;
			    border-radius: 10px 10px 10px 10px;
			    display: block;
			    float: right;
			    height: 22px;
			    padding-top: 1px;
			    text-align: center;
			    text-decoration: none;
			    width: 100%;
		   	    color: #676767;
			}
			.btnInicioSesion:hover{
				background: #f9f9f9;
			}
		</style>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SIRPROJ</title>
    </head>
    <body>
        <form name='f' action='<spring:url value="/j_spring_security_check"></spring:url>'
		method='POST'>
            <c:if test="${not empty param.authfailed}">
                <span id="infomessage">
                Login fallido debido a: <c:out value="${SPRING_SECURITY_LAST_EXCEPTION.message}"/>.
                </span>
            </c:if>
            <c:if test="${not empty param.loggedout}">
                <span id="infomessage">
                Se ha desconectado del sistema correctamente.
                </span>
            </c:if>



		<table class="tableLogin" cellspacing="5" style="margin: 280px auto;">
                    <tr>
								<td colspan="2" style="border-bottom: 2px groove white;">
									<div style="font-weight: bold;">INICIO DE SESI&Oacute;N</div>
								</td>
							</tr>
		  
			<tr>
				<td>Usuario:</td>
				<td><input type='text' name='j_username' value=''>
				</td>
			</tr>
			<tr>
				<td>Contrase&#241;a:</td>
				<td><input type='password' name='j_password' />
				</td>
			</tr>
			<tr>
				<td colspan='2'><input name="submit" type="submit"
					value="Ingresar" />
				</td>
			</tr>
		</table>

	</form>
    </body>
</html>
