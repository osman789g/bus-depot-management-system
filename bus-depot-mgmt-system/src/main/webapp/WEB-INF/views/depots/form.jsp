<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
	<title>Add New Depot</title>
</head>
<body>

<h2>Add New Depot</h2>

<form:form action="/depots/addDepot" method="post" modelAttribute="depot">
	<p>
		<label for="id">Depot ID:</label>
		<form:input path="id" id="id" />
		<form:errors path="id" cssClass="error" />
	</p>
	<p>
		<label for="location">Location:</label>
		<form:input path="location" id="location" />
		<form:errors path="location" cssClass="error" />
	</p>
	<p>
		<label for="owner">Owner:</label>
		<form:input path="owner" id="owner" />
		<form:errors path="owner" cssClass="error" />
	</p>
	<input type="submit" value="Add Depot"/>
</form:form>
<a href="/depots">View depots</a>
</body>
</html>
