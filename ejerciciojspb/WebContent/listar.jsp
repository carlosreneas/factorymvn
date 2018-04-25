<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de Participantes</title>
</head>
<body>
<jsp:useBean id="pd" class="convencion.dao.ParticipanteDaoImp" scope="request">
</jsp:useBean>


<table>
<tr><th>Nombre</th><th>Email</th><th>Telefono</th><th>Estado</th><th>Acciones</th></tr>
<c:forEach var="participante" items="${pd.listar()}">
<tr>
<td><c:out value="${participante.nombre}"/></td>
<td><c:out value="${participante.email}"/></td>
<td><c:out value="${participante.telefono}"/></td>
<td><c:out value="${participante.estado}"/></td> 
<td><a href="EditarServlet?id=<c:out value="${participante.id}&act=editar"/>" >Editar</a></td>           
</tr>
</c:forEach>
</table>


</body>
</html>