<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
Welcome, to the page
<br>
<a href="/toIndex"> to index page</a>
<br>
<a href="/allUsers">all users page</a>
<br>
<br>
<br>
<%--<%= new Date()%>--%>
<%--<%%>--%>
<c:out value="hello"/>
<br>
<br>
<%--<c:import url="http://owu.com.ua" var="data"/>--%>
<%--<c:out value="${data}"/>--%>
<%--<c:catch var="catchException">--%>
<%--<%int x = 3 / 0;%>--%>
<%--</c:catch>--%>
<%--<c:if test="${catchException!=null}">--%>
<%--&lt;%&ndash;<c:out value="${catchException.message}"/>&ndash;%&gt;--%>
<%--<c:out value="erooooooooooooooooooooooooooor"/>--%>
<%--</c:if>--%>
<%--<c:url var="testURL" value="/registration">--%>
<%--<c:param name="login" value="user1"/>--%>
<%--<c:param name="password" value="qwerty1234"/>--%>
<%--</c:url>--%>
<%--<c:out value="${testURL}"/>--%>
<%--<c:forEach var="a" items="${}">--%>
<%--<c:out value="${a}"/><br>--%>
<%--</c:forEach>--%>

<%--<c:forTokens items="bla-bla-car" delims="-" var="x">--%>
<%--<c:out value="${x}"/><br>--%>
<%--</c:forTokens>--%>
<%--<c:choose>--%>
<%--<c:when test=""/>--%>
<%--<c:when test=""/>--%>
<%--<c:when test=""/>--%>
<%--<c:otherwise>--%>

<%--</c:otherwise>--%>
<%--</c:choose>--%>

<%--<c:set var="setURL" value="0"/>--%>
<%--<c:if test="${setURL<1}">--%>
<%--<c:redirect url="http://owu.com.ua"/>--%>
<%--</c:if>--%>

<form action="/save" method="post">
    <input type="text" name="firstname" placeholder="input firstname" >
    <input type = "text" name="lastname" placeholder="input lastname">
    <input type="submit" value="save">
    <br>
    <c:forEach items="${users}" var="user">
        <c:out value="${user}"/><br>
    </c:forEach>

</form>
</body>
</html>

