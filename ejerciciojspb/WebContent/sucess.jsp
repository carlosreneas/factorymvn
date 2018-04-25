<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bienvenido</title>
</head>
<body>
<jsp:useBean id="participante" class="ufps.model.Participante" scope="session">
</jsp:useBean>
<h1>Bienvenido  <jsp:getProperty name="participante" property="nombre" /> </h1>
<% HttpSession s = request.getSession();
	ufps.model.Participante p = (ufps.model.Participante) s.getAttribute("participante"); %>
Telefono: <%= p.getTelefono() %>
</body>
</html>