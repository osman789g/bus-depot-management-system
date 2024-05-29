<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>Depots</title>
</head>
<body>
<h2>List of Depots</h2>
<c:if test="${!empty depots}">
	<ul>
		<c:forEach var="depot" items="${depots}">
			<li>${depot.location} (${depot.owner})
				<a href="/buses?depot=${depot.id}">View Buses</a>
			</li>
		</c:forEach>
	</ul>
</c:if>
<a href="/depots/newDepot">Add New Depot</a>
</body>
</html>
