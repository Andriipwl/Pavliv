<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
users
<br>
<c:forEach items="${users}" var="user">
    <c:out value="${user}"/><br>
</c:forEach>
</body>
</html>
