<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2/2/2021
  Time: 3:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/convert" method="get">
    <label>
        <input type="text" name="amount">
    </label>
    <label>
        <input type="text" name="rate">
    </label>
    <input type="submit" value="Convert">
</form>
</body>
</html>