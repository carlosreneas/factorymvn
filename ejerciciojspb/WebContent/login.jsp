<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>
<% 
	out.println(request.getParameter("nombre")); 
%>
</h1>
<form action="LoginController" method="post">
	<ul>
		<li><label>Usuario:</label><input type="text" name="usuario"></li>
		<li><label>Clave:</label><input type="password" name="clave"></li>
		<li><input type="submit" value="Iniciar Sesión"> <a href="index.jsp">Volver</a></li>
	</ul>
</form>
</body>
</html>