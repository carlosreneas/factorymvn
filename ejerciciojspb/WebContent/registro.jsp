<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registro</title>
</head>
<body>
<form action="RegistroServlet" method="POST">
	<ul>
		<li><label>Nombre:</label><input type="text" name="nombre"></li>
		<li><label>Email:</label><input type="email" name="email"></li>
		<li><label>Telefono:</label><input type="text" name="telefono"></li>
		<li><input type="submit" value="Registrar"> <a href="index.jsp">Volver</a></li>
	</ul>
</form>
</body>
</html>