<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  isELIgnored="false"%>  
<%--isELIgnored="false" permet d'interpreter les Expressions Languages, par défaut les EL sont désactivées --%> 

<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>exemple 4</title>
</head>
<body>

Nom : ${nom}<br>
Prénom : ${prenom}<br>
Entreprise : ${entreprise}<br>

	<%-- RQ : pour éviter failles XSS --%>
	Entreprise sans faille XSS : <spring:message text="${entreprise}" htmlEscape="true"/> 



<br>
Equivalent à :<br><br>
Nom : <%=request.getAttribute("nom") %><br>
Prénom : <%=request.getAttribute("prenom") %><br>
Entreprise : <%=session.getAttribute("entreprise") %><br>
</body>
</html>