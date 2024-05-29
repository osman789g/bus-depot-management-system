<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add New Bus</title>
</head>
<body>

<h2>Add New Bus</h2>

<form:form action="/addBus" method="post" modelAttribute="bus">

    <input type="hidden" name="depot" value="${depotId}"/>
    <p>
        <label for="manufacturer">Manufacturer:</label>
        <form:input path="manufacturer" id="manufacturer" />
        <form:errors path="manufacturer" cssClass="error" />
    </p>
    <p>
        <label for="driver">Driver:</label>
        <form:input path="driver" id="driver" />
        <form:errors path="driver" cssClass="error" />
    </p>
    <p>
        <label for="city">City:</label>
        <form:input path="city" id="city" />
        <form:errors path="city" cssClass="error" />
    </p>
    <p>
        <label for="route">Route:</label>
        <form:input path="route" id="route" />
        <form:errors path="route" cssClass="error" />
    </p>
    <input type="submit" value="Add Bus"/>
</form:form>
<a href="/buses?depot=${param.depot}">View buses</a>
</body>
</html>
