<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
	<title>Buses List</title>
</head>
<body>

<h2>Buses</h2>

<c:if test="${not empty buses}">
	<table border="1">
		<tr>
			<th>Manufacturer</th>
			<th>Driver</th>
			<th>City</th>
			<th>Route</th>
		</tr>
		<c:forEach var="bus" items="${buses}">
			<tr>
				<td>${bus.manufacturer}</td>
				<td>${bus.driver}</td>
				<td>${bus.city}</td>
				<td>${bus.route}</td>
			</tr>
		</c:forEach>
	</table>
</c:if>

<c:if test="${empty buses}">
	<p>No buses available.</p>
</c:if>

<a href="/buses/new?depot=${param.depot}">Add New Bus</a>
<a href="/depots">Depots</a>


</body>
</html>
